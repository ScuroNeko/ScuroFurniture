package ru.scuroneko.furniture.blocks

import net.minecraft.block.*
import net.minecraft.util.DyeColor
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView

class CustomBedBlock(color: DyeColor, settings: Settings) : BedBlock(color, settings) {
    val TOP_SHAPE = Block.createCuboidShape(0.0, 3.0, 0.0, 16.0, 9.0, 16.0)

    val LEG_1_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 3.0, 3.0, 3.0)
    val LEG_2_SHAPE = Block.createCuboidShape(0.0, 0.0, 13.0, 3.0, 3.0, 16.0)
    val LEG_3_SHAPE = Block.createCuboidShape(13.0, 0.0, 0.0, 16.0, 3.0, 3.0)
    val LEG_4_SHAPE = Block.createCuboidShape(13.0, 0.0, 13.0, 16.0, 3.0, 16.0)

    val NORTH_SHAPE = VoxelShapes.union(TOP_SHAPE, *arrayOf(LEG_1_SHAPE, LEG_3_SHAPE))
    val SOUTH_SHAPE = VoxelShapes.union(TOP_SHAPE, *arrayOf(LEG_2_SHAPE, LEG_4_SHAPE))
    val WEST_SHAPE = VoxelShapes.union(TOP_SHAPE, *arrayOf(LEG_1_SHAPE, LEG_2_SHAPE))
    val EAST_SHAPE = VoxelShapes.union(TOP_SHAPE, *arrayOf(LEG_3_SHAPE, LEG_4_SHAPE))

    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape {
        val direction = getOppositePartDirection(state).opposite
        return when (direction) {
            Direction.NORTH -> NORTH_SHAPE
            Direction.SOUTH -> SOUTH_SHAPE
            Direction.WEST -> WEST_SHAPE
            else -> EAST_SHAPE
        }
    }

    override fun getRenderType(state: BlockState): BlockRenderType = BlockRenderType.MODEL
//    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity = CustomBedBlockEntity(pos, state, this.color)
}