package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.entity.KitchenDrawerBlockEntity

class KitchenDrawerBlock(case: Block, box: Block, val concrete: Block) : AbstractDrawerBlock(case, box) {
    constructor(settings: Settings): this(Blocks.CHERRY_PLANKS, Blocks.CHERRY_PLANKS, Blocks.BLACK_CONCRETE)

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

    init {
        registerBox(boxTop, ::openScreen)
        registerBox(boxBottom, ::openScreen)

        drawerShape = VoxelShapes.combineAndSimplify(
            createCuboidShape(0, 15, 0, 16, 16, 16),
            createCuboidShape(0, 0, 0, 16, 15, 14),
            BooleanBiFunction.OR
        )
        shape = sequenceOf(
            drawerShape, boxTop, boxBottom
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (!world.isClient) {
            val blockEntity = world.getBlockEntity(pos) as KitchenDrawerBlockEntity
            val boxToOpen = when (box) {
                boxTop -> 0
                boxBottom -> 1
                else -> -1
            }
            blockEntity.setBoxIndex(boxToOpen)
            player.openHandledScreen(blockEntity)
        }
    }

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? = null
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::KitchenDrawerBlock)
}