package ru.scuroneko.furniture.utils

import net.minecraft.block.BlockState
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes


object MathUtils {
    /**
     * Return rotated [shape] from NORTH to [shape]
     */
    fun rotateShape(to: Direction, shape: VoxelShape): VoxelShape = rotateShape(Direction.NORTH, to, shape)

    /**
     * Return rotated [shape] [from] direction [to] direction
     */
    fun rotateShape(from: Direction, to: Direction, shape: VoxelShape): VoxelShape {
        if (to == Direction.UP || to == Direction.DOWN) return shape
        val buffer = arrayOf(shape, VoxelShapes.empty())

        val times = (to.horizontal - from.ordinal + 4) % 4
        for (i in 0 until times) {
            buffer[0].forEachBox { minX, minY, minZ, maxX, maxY, maxZ ->
                buffer[1] = VoxelShapes.combine(
                    buffer[1],
                    VoxelShapes.cuboid(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX),
                    BooleanBiFunction.OR
                )
            }
            buffer[0] = buffer[1]
            buffer[1] = VoxelShapes.empty()
        }

        return buffer[0]
    }

    fun add(pos: BlockPos, state: BlockState, i: Int): BlockPos {
        return when (state.get(HORIZONTAL_FACING)) {
            Direction.NORTH -> pos.add(i, 0, 0)
            Direction.WEST -> pos.add(0, 0, i)
            Direction.SOUTH -> pos.add(-i, 0, 0)
            Direction.EAST -> pos.add(0, 0, -i)
            else -> pos
        }
    }

    fun getSideBlocks(state: BlockState, pos: BlockPos): Pair<BlockPos, BlockPos> {
        return when (state.get(HORIZONTAL_FACING)) {
            Direction.NORTH -> Pair(pos.add(-1, 0, 0), pos.add(1, 0, 0))
            Direction.WEST -> Pair(pos.add(0, 0, 1), pos.add(0, 0, -1))
            Direction.SOUTH -> Pair(pos.add(1, 0, 0), pos.add(-1, 0, 0))
            Direction.EAST -> Pair(pos.add(0, 0, -1), pos.add(0, 0, 1))
            else -> Pair(pos, pos)
        }
    }

    fun getNextSideBlocks(state: BlockState, pos: BlockPos): Pair<BlockPos, BlockPos> {
        val (left, right) = getSideBlocks(state, pos)
        return Pair(
            getSideBlocks(state, left).first,
            getSideBlocks(state, right).second
        )
    }
}