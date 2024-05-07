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


class StreetLampSingle(settings: Settings) : HorizontalFacingBlock(settings) {
    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    val northShape = Stream.of(
        createCuboidShape(7.0, 3.0, 1.0, 9.0, 4.0, 5.0),
        createCuboidShape(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
        createCuboidShape(7.0, 4.0, 0.0, 9.0, 6.0, 9.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()

    fun getShape(state: BlockState): VoxelShape {
        val direction = state.get(Properties.HORIZONTAL_FACING)
        Blocks.GLOWSTONE
        return when (direction) {
            Direction.NORTH -> northShape
//            Direction.EAST -> eastShape
//            Direction.SOUTH -> southShape
//            Direction.WEST -> westShape
            else -> northShape
        }
    }

    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun getCollisionShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)
    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::StreetLampSingle)
}