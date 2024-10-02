package ru.scuroneko.furniture.api.blocks

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.block.*
import net.minecraft.client.MinecraftClient
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.registry.Registries
import net.minecraft.screen.ScreenHandler
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.AXIS
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.text.Text
import net.minecraft.util.*
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.math.Vec3d
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.furniture.utils.MathUtils

abstract class AbstractDrawerBlock(settings: Settings) : BlockWithEntity(settings) {
    var drawerShape: VoxelShape = VoxelShapes.empty()
    var shape: VoxelShape = VoxelShapes.empty()

    var case: CaseItem = MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE
    var box: BoxItem? = null
    var door: DoorItem? = null
    var name = "drawer"

    constructor(case: CaseItem, box: BoxItem?, door: DoorItem?) : this(Settings.copy(case.material)) {
        this.case = case
        if(box == null && door == null) throw IllegalArgumentException("Both box and door can't be null!")
        this.box = box
        this.door = door
    }

    constructor(case: CaseItem, box: BoxItem?, door: DoorItem?, name: String): this(case, box, door) {
        this.name = name
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
        hit: BlockHitResult
    ): ActionResult {
        this.boxList.keys.forEach { box ->
            if (this.isRayInBox(MathUtils.rotateShape(state.get(HORIZONTAL_FACING), box), pos, hit.pos)) {
                this.boxList[box]?.invoke(box, player, state, world, pos)
                // TODO play sound on close
                if (world.isClient)
                    world.playSoundAtBlockCenter(
                        pos, SoundEvents.BLOCK_BARREL_OPEN, SoundCategory.BLOCKS,
                        1f, 0.9f + world.random.nextFloat() * .1f, true
                    )
                return ActionResult.SUCCESS
            }
        }

        return ActionResult.FAIL
    }

    override fun appendTooltip(
        stack: ItemStack,
        context: Item.TooltipContext,
        tooltip: MutableList<Text>,
        options: TooltipType
    ) {
        tooltip.add(Text.translatable(Constants.Translatable.CASE_MATERIAL_TOOLTIP))
        tooltip.add(Text.literal("  ").append(Text.translatable(this.case.material.translationKey).formatted(Formatting.BLUE)))
        if(this.box != null) {
            tooltip.add(Text.translatable(Constants.Translatable.BOX_MATERIAL_TOOLTIP))
            tooltip.add(
                Text.literal("  ").append(Text.translatable(this.box!!.slab.translationKey).formatted(Formatting.BLUE))
            )
        }
        if(this.door != null) {
            tooltip.add(Text.translatable(Constants.Translatable.DOOR_MATERIAL_TOOLTIP))
            tooltip.add(
                Text.literal("  ").append(Text.translatable(this.door!!.slab.translationKey).formatted(Formatting.BLUE))
            )
        }
    }

    fun getRayCast(state: BlockState, pos: BlockPos, hit: BlockHitResult): VoxelShape? {
        this.boxList.keys.forEach { box ->
            if (this.isRayInBox(MathUtils.rotateShape(state.get(HORIZONTAL_FACING), box), pos, hit.pos)) return box
        }
        return null
    }

    private fun isRayInBox(box: VoxelShape, blockPos: BlockPos, pos: Vec3d): Boolean {
        val bound = box.boundingBox
        return this.isInX(bound, blockPos.x, pos.x) &&
                this.isInY(bound, blockPos.y, pos.y) &&
                this.isInZ(bound, blockPos.z, pos.z)
    }

    private fun isInX(box: Box, posX: Int, x: Double): Boolean = posX + box.minX <= x && posX + box.maxX >= x
    private fun isInY(box: Box, posY: Int, y: Double): Boolean = posY + box.minY <= y && posY + box.maxY >= y
    private fun isInZ(box: Box, posZ: Int, z: Double): Boolean = posZ + box.minZ <= z && posZ + box.maxZ >= z

    private fun getShape(state: BlockState): VoxelShape =
        MathUtils.rotateShape(state.get(HORIZONTAL_FACING), shape)

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
            VoxelShapes.combineAndSimplify(drawerShape, rayCastShape, BooleanBiFunction.OR)
        )
    }

    override fun onStateReplaced(state: BlockState, world: World, pos: BlockPos, newState: BlockState, moved: Boolean) {
        if (state.block === newState.block) return
        val blockEntity = world.getBlockEntity(pos)
        if (blockEntity is IInventory) {
            ItemScatterer.spawn(world, pos, blockEntity)
            world.updateComparators(pos, this)
        }
        super.onStateReplaced(state, world, pos, newState, moved)
    }


    override fun getTranslationKey(): String = "item.${ScuroFurniture.MOD_ID}.${getDrawerName()}"
    open fun getDrawerName(): String {
        val case = Util.createTranslationKey("block", Registries.BLOCK.getId(this.case.material)).split(".")[2]
        val box = if (this.box != null)
            Util.createTranslationKey("block", Registries.BLOCK.getId(this.box!!.slab)).split(".")[2]
        else
            Util.createTranslationKey("block", Registries.BLOCK.getId(this.door!!.slab)).split(".")[2]
        return "${name}_${case}_${box}"
    }

    // Facing
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(
        HORIZONTAL_FACING, ctx.horizontalPlayerFacing
    )

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
        builder.add(AXIS)
    }

    override fun rotate(state: BlockState, rotation: BlockRotation): BlockState = state.with(
        HORIZONTAL_FACING,
        rotation.rotate(state.get(HORIZONTAL_FACING))
    )

    override fun mirror(state: BlockState, mirror: BlockMirror): BlockState =
        state.rotate(mirror.getRotation(state.get(HORIZONTAL_FACING)))

    override fun getRenderType(state: BlockState): BlockRenderType = BlockRenderType.MODEL
    override fun hasComparatorOutput(state: BlockState): Boolean = true
    override fun getComparatorOutput(state: BlockState, world: World, pos: BlockPos): Int =
        ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos))
}