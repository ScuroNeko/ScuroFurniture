package ru.scuroneko.furniture.carpenter.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.ShapeContext
import net.minecraft.block.entity.BlockEntity
import net.minecraft.client.MinecraftClient
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.carpenter.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.utils.MathUtils

class KitchenDrawerBlock(settings: Settings) : AbstractDrawerBlock(settings) {
    val drawer = VoxelShapes.combineAndSimplify(
        createCuboidShape(0, 15, 0, 16, 16, 16),
        createCuboidShape(0, 0, 0, 16, 15, 14),
        BooleanBiFunction.OR
    )
    private val boxTop = VoxelShapes.combineAndSimplify(
        createCuboidShape(1, 9, 14, 15, 15, 15),
        createCuboidShape(5.0, 11.0, 15.0, 11.0, 13.0, 15.5),
        BooleanBiFunction.OR
    )
    private val boxBottom = VoxelShapes.combineAndSimplify(
        createCuboidShape(1, 2, 14, 15, 8, 15),
        createCuboidShape(5.0, 4.0, 15.0, 11.0, 6.0, 15.5),
        BooleanBiFunction.OR
    )

    private val shape = sequenceOf(
        drawer, boxTop, boxBottom
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }

    init {
        registerBox(boxTop, ::openScreen)
        registerBox(boxBottom, ::openScreen)
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (!world.isClient) {
            val blockEntity = world.getBlockEntity(pos) as MedicalDrawerBlockEntity
            val boxToOpen = when (box) {
                boxTop -> 0
                boxBottom -> 1
                else -> -1
            }
            blockEntity.setBoxIndex(boxToOpen)
            player.openHandledScreen(blockEntity)
        }
    }

    fun getShape(state: BlockState): VoxelShape = MathUtils.rotateShape(state.get(HORIZONTAL_FACING), shape)

    override fun getCollisionShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape {
        val hit = MinecraftClient.getInstance().crosshairTarget ?: return getShape(state)
        if (hit.type != HitResult.Type.BLOCK) return getShape(state)
        val rayCastShape = this.getRayCast(state, pos, hit as BlockHitResult) ?: return getShape(state)
        return MathUtils.rotateShape(
            state.get(HORIZONTAL_FACING),
            VoxelShapes.combineAndSimplify(drawer, rayCastShape, BooleanBiFunction.OR)
        )
    }

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? = null
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::KitchenDrawerBlock)
}