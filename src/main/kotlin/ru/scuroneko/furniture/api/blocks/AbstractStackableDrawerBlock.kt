package ru.scuroneko.furniture.api.blocks

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.client.MinecraftClient
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.api.state.ModProperties
import ru.scuroneko.furniture.api.state.StackableDrawerHinge
import ru.scuroneko.furniture.api.state.StackableDrawerPart
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.utils.MathUtils

abstract class AbstractStackableDrawerBlock(settings: Settings) : AbstractDrawerBlock(settings) {
    init {
        defaultState = defaultState
            .with(ModProperties.STACKABLE_DRAWER_PART, StackableDrawerPart.SINGLE)
            .with(ModProperties.STACKABLE_DRAWER_HINGE, StackableDrawerHinge.LEFT)
    }

    constructor(case: CaseItem, box: BoxItem?, door: DoorItem?) : this(Settings.copy(case.material)) {
        this.case = case
        this.box = box
        this.door = door
    }

    constructor(case: CaseItem, box: BoxItem?, door: DoorItem?, name: String) : this(case, box, door) {
        this.name = name
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return super.getPlacementState(ctx)
            ?.with(ModProperties.STACKABLE_DRAWER_PART, StackableDrawerPart.SINGLE)
            ?.with(ModProperties.STACKABLE_DRAWER_HINGE, this.getHinge(ctx))
    }

    override fun onPlaced(world: World, pos: BlockPos, state: BlockState, placer: LivingEntity?, itemStack: ItemStack) {
        if (world.isClient) return
        val (upPos, downPos) = MathUtils.getSideBlocksV(state, pos)
        val (nextUpPos, nextDownPos) = MathUtils.getNextSideBlocksV(state, pos)

        val upState = world.getBlockState(upPos)
        val downState = world.getBlockState(downPos)

        if (upState.block is AbstractStackableDrawerBlock && upState.get(ModProperties.STACKABLE_DRAWER_HINGE) == state.get(
                ModProperties.STACKABLE_DRAWER_HINGE
            )
        ) {
            val next = world.getBlockState(nextUpPos)
            val property =
                if (downState.block is AbstractStackableDrawerBlock) StackableDrawerPart.CENTER else StackableDrawerPart.DOWN
            val nextProperty =
                if (next.block is AbstractStackableDrawerBlock) StackableDrawerPart.CENTER else StackableDrawerPart.UP
            if (!upState.isAir) world.setBlockState(
                upPos,
                upState.with(ModProperties.STACKABLE_DRAWER_PART, nextProperty)
            )
            world.setBlockState(pos, state.with(ModProperties.STACKABLE_DRAWER_PART, property))
        }
        if (downState.block is AbstractStackableDrawerBlock && downState.get(ModProperties.STACKABLE_DRAWER_HINGE) == state.get(
                ModProperties.STACKABLE_DRAWER_HINGE
            )
        ) {
            val next = world.getBlockState(nextDownPos)
            val property =
                if (upState.block is AbstractStackableDrawerBlock) StackableDrawerPart.CENTER else StackableDrawerPart.UP
            val downProp =
                if (next.block is AbstractStackableDrawerBlock) StackableDrawerPart.CENTER else StackableDrawerPart.DOWN
            if (!downState.isAir) world.setBlockState(
                downPos,
                downState.with(ModProperties.STACKABLE_DRAWER_PART, downProp)
            )
            world.setBlockState(pos, state.with(ModProperties.STACKABLE_DRAWER_PART, property))
        }
    }

    override fun onBreak(world: World, pos: BlockPos, state: BlockState, player: PlayerEntity?): BlockState {
        if (!world.isClient) {
            val (upPos, downPos) = MathUtils.getSideBlocksV(state, pos)
            val (nextUpPos, nextDownPos) = MathUtils.getNextSideBlocksV(state, pos)

            val upState = world.getBlockState(upPos)
            val downState = world.getBlockState(downPos)

            if (upState.block is AbstractStackableDrawerBlock) {
                val nextProperty =
                    if (world.getBlockState(nextUpPos).block is AbstractStackableDrawerBlock) StackableDrawerPart.DOWN else StackableDrawerPart.SINGLE
                if (!upState.isAir) world.setBlockState(
                    upPos,
                    upState.with(ModProperties.STACKABLE_DRAWER_PART, nextProperty)
                )
            }
            if (downState.block is AbstractStackableDrawerBlock) {
                val downProp =
                    if (world.getBlockState(nextDownPos).block is AbstractStackableDrawerBlock) StackableDrawerPart.UP else StackableDrawerPart.SINGLE
                if (!downState.isAir) world.setBlockState(
                    downPos,
                    downState.with(ModProperties.STACKABLE_DRAWER_PART, downProp)
                )
            }
        }

        return super.onBreak(world, pos, state, player)
    }

    private fun getHinge(ctx: ItemPlacementContext): StackableDrawerHinge {
        val blockPos = ctx.blockPos
        val direction = ctx.horizontalPlayerFacing

        val offsetX = direction.offsetX
        val offsetZ = direction.offsetZ
        val vec3d = ctx.hitPos
        val x = vec3d.x - blockPos.x.toDouble()
        val z = vec3d.z - blockPos.z.toDouble()
        return if ((offsetX >= 0 || !(z < 0.5)) && (offsetX <= 0 || !(z > 0.5)) && (offsetZ >= 0 || !(x > 0.5)) && (offsetZ <= 0 || !(x < 0.5)))
            StackableDrawerHinge.LEFT else StackableDrawerHinge.RIGHT
    }

    open fun getShape(state: BlockState): VoxelShape =
        MathUtils.rotateShape(state.get(HORIZONTAL_FACING), fullShape)

    override fun getCollisionShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape = getShape(state)

    @Environment(EnvType.CLIENT)
    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape {
        val hit = MinecraftClient.getInstance().crosshairTarget ?: return getShape(state)
        if (hit.type != HitResult.Type.BLOCK) return getShape(state)
        val rayCastShape = getRayCast(state, pos, hit as BlockHitResult) ?: return getShape(state)
        return MathUtils.rotateShape(
            state.get(HORIZONTAL_FACING),
            VoxelShapes.combineAndSimplify(caseShape, rayCastShape, BooleanBiFunction.OR)
        )
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        super.appendProperties(builder)
        builder.add(ModProperties.STACKABLE_DRAWER_PART)
        builder.add(ModProperties.STACKABLE_DRAWER_HINGE)
    }
}