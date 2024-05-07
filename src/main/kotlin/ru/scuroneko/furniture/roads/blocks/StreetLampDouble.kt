package ru.scuroneko.furniture.roads.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.*
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import java.util.stream.Stream


class StreetLampDouble(settings: Settings) : HorizontalFacingBlock(settings) {
    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    val NORTH_SHAPE = Stream.of(
        createCuboidShape(7.0, 3.0, 1.0, 9.0, 4.0, 5.0),
        createCuboidShape(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
        createCuboidShape(7.0, 4.0, 0.0, 9.0, 6.0, 16.0),
        createCuboidShape(7.0, 3.0, 11.0, 9.0, 4.0, 15.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()

    private fun getShape(state: BlockState): VoxelShape {
        val direction = state.get(Properties.HORIZONTAL_FACING)
        Blocks.GLOWSTONE
        return when (direction) {
            Direction.NORTH -> NORTH_SHAPE
//            Direction.EAST -> eastShape
            Direction.SOUTH -> NORTH_SHAPE
//            Direction.WEST -> westShape
            else -> NORTH_SHAPE
        }
    }

    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun getCollisionShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
    }
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)
    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::StreetLampDouble)
}