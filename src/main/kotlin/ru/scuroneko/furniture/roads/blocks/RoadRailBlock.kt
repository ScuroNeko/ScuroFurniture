package ru.scuroneko.furniture.roads.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.HorizontalFacingBlock
import net.minecraft.block.ShapeContext
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

class RoadRailBlock(settings: Settings) : HorizontalFacingBlock(settings) {
    val SHAPE = Stream.of(
        createCuboidShape(2.0, 0.0, 7.0, 4.0, 6.0, 9.0),
        createCuboidShape(12.0, 0.0, 7.0, 14.0, 6.0, 9.0),
        Stream.of(
            createCuboidShape(0.0, 3.0, 6.0, 16.0, 8.0, 7.0),
            createCuboidShape(0.0, 3.0, 5.5, 16.0, 4.0, 6.0),
            createCuboidShape(0.0, 5.0, 5.5, 16.0, 6.0, 6.0),
            createCuboidShape(0.0, 7.0, 5.5, 16.0, 8.0, 6.0)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()

    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)
    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = SHAPE
    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::RoadRailBlock)
}