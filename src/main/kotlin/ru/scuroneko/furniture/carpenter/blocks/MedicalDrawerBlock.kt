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

class MedicalDrawerBlock(settings: Settings) : AbstractDrawerBlock(settings.nonOpaque()) {
    private val drawer = createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0)
    private val boxTopLeft = VoxelShapes.combineAndSimplify(
        createCuboidShape(3.0, 11.0, 9.0, 5.0, 13.0, 9.5),
        createCuboidShape(1.0, 9.0, 8.0, 7.0, 15.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxTopRight = VoxelShapes.combineAndSimplify(
        createCuboidShape(11.0, 11.0, 9.0, 13.0, 13.0, 9.5),
        createCuboidShape(9.0, 9.0, 8.0, 15.0, 15.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxBottomLeft = VoxelShapes.combineAndSimplify(
        createCuboidShape(3.0, 3.0, 9.0, 5.0, 5.0, 9.5),
        createCuboidShape(1.0, 1.0, 8.0, 7.0, 7.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxBottomRight = VoxelShapes.combineAndSimplify(
        createCuboidShape(11.0, 3.0, 9.0, 13.0, 5.0, 9.5),
        createCuboidShape(9.0, 1.0, 8.0, 15.0, 7.0, 9.0),
        BooleanBiFunction.OR
    )

    private val shape = sequenceOf(
        drawer, boxTopLeft, boxTopRight, boxBottomLeft, boxBottomRight
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }

    init {
        registerBox(boxTopLeft, ::openScreen)
        registerBox(boxTopRight, ::openScreen)
        registerBox(boxBottomLeft, ::openScreen)
        registerBox(boxBottomRight, ::openScreen)
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (!world.isClient) {
            val blockEntity = world.getBlockEntity(pos) as MedicalDrawerBlockEntity
            val boxToOpen = when (box) {
                boxTopLeft -> 0
                boxTopRight -> 1
                boxBottomLeft -> 2
                boxBottomRight -> 3
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

    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity = MedicalDrawerBlockEntity(pos, state)
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::MedicalDrawerBlock)
}