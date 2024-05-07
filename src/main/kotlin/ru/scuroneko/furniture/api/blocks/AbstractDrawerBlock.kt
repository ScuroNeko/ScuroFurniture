package ru.scuroneko.furniture.api.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemPlacementContext
import net.minecraft.screen.ScreenHandler
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.*
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Direction
import net.minecraft.util.math.Vec3d
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.carpenter.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.utils.MathUtils

abstract class AbstractDrawerBlock(settings: Settings) : BlockWithEntity(settings.hardness(.5f)) {
    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH)
    }

    private val boxList = hashMapOf<VoxelShape, (VoxelShape, PlayerEntity, BlockState, World, BlockPos) -> Unit>()

    fun registerBox(box: VoxelShape, handler: (VoxelShape, PlayerEntity, BlockState, World, BlockPos) -> Unit) {
        this.boxList[box] = handler
    }

    fun createCuboidShape(
        minX: Int,
        minY: Int,
        minZ: Int,
        maxX: Int,
        maxY: Int,
        maxZ: Int
    ): VoxelShape {
        return VoxelShapes.cuboid(minX / 16.0, minY / 16.0, minZ / 16.0, maxX / 16.0, maxY / 16.0, maxZ / 16.0)
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        this.boxList.keys.forEach { box ->
            if (this.isRayInBox(MathUtils.rotateShape(state.get(HORIZONTAL_FACING), box), pos, hit.pos)) {
                this.boxList[box]?.invoke(box, player, state, world, pos)
                return ActionResult.SUCCESS
            }
        }

        return ActionResult.FAIL
    }

    fun getRayCast(state: BlockState, pos: BlockPos, hit: BlockHitResult): VoxelShape? {
        this.boxList.keys.forEach { box ->
            if(this.isRayInBox(MathUtils.rotateShape(state.get(HORIZONTAL_FACING), box), pos, hit.pos))
                return box
        }
        return null
    }

    private fun isRayInBox(box: VoxelShape, blockPos: BlockPos, pos: Vec3d): Boolean {
        val bound = box.boundingBox
        return this.isInX(bound, blockPos.x, pos.x) && this.isInY(bound, blockPos.y, pos.y) && this.isInZ(bound, blockPos.z, pos.z)
    }

    fun isInX(box: Box, posX: Int, x: Double): Boolean = posX + box.minX <= x && posX + box.maxX >= x
    fun isInY(box: Box, posY: Int, y: Double): Boolean = posY + box.minY <= y && posY + box.maxY >= y
    fun isInZ(box: Box, posZ: Int, z: Double): Boolean = posZ + box.minZ <= z && posZ + box.maxZ >= z

    override fun onStateReplaced(state: BlockState, world: World, pos: BlockPos, newState: BlockState, moved: Boolean) {
        if(state.block === newState.block) return
        val blockEntity = world.getBlockEntity(pos)
        if (blockEntity is MedicalDrawerBlockEntity) {
            ItemScatterer.spawn(world, pos, blockEntity)
            world.updateComparators(pos, this)
        }
        super.onStateReplaced(state, world, pos, newState, moved)
    }

    // Facing
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(
        HORIZONTAL_FACING, ctx.horizontalPlayerFacing
    )
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
    }
    override fun rotate(state: BlockState, rotation: BlockRotation): BlockState = state.with(
        HORIZONTAL_FACING,
        rotation.rotate(state.get(HORIZONTAL_FACING))
    )
    override fun mirror(state: BlockState, mirror: BlockMirror): BlockState = state.rotate(mirror.getRotation(state.get(HORIZONTAL_FACING)))


    override fun getRenderType(state: BlockState): BlockRenderType = BlockRenderType.MODEL
    override fun hasComparatorOutput(state: BlockState): Boolean = true
    override fun getComparatorOutput(state: BlockState, world: World, pos: BlockPos): Int = ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos))
}