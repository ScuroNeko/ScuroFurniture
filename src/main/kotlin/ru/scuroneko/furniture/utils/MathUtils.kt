package ru.scuroneko.furniture.utils

import net.minecraft.util.function.BooleanBiFunction
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
            buffer[0].forEachBox { minX: Double, minY: Double, minZ: Double, maxX: Double, maxY: Double, maxZ: Double ->
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
}