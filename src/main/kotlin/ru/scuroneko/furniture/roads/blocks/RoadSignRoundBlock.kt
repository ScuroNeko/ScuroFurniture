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


class RoadSignRoundBlock(settings: Settings) : HorizontalFacingBlock(settings) {
    private val poleShape = Block.createCuboidShape(7.0, 0.0, 7.0, 9.0, 25.0, 9.0)
    private val signShape1 = Stream.of(
        createCuboidShape(13.0, 21.0, 6.0, 14.0, 27.0, 7.0),
        createCuboidShape(12.0, 20.0, 6.0, 13.0, 28.0, 7.0),
        createCuboidShape(11.0, 19.0, 6.0, 12.0, 29.0, 7.0),
        createCuboidShape(10.0, 18.0, 6.0, 11.0, 30.0, 7.0),
        createCuboidShape(6.0, 18.0, 6.0, 10.0, 30.0, 7.0),
        createCuboidShape(5.0, 18.0, 6.0, 6.0, 30.0, 7.0),
        createCuboidShape(4.0, 19.0, 6.0, 5.0, 29.0, 7.0),
        createCuboidShape(3.0, 20.0, 6.0, 4.0, 28.0, 7.0),
        createCuboidShape(2.0, 21.0, 6.0, 3.0, 27.0, 7.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()
    private val signShape2 = Stream.of(
        createCuboidShape(6.0, 21.0, 2.0, 7.0, 27.0, 3.0),
        createCuboidShape(6.0, 20.0, 3.0, 7.0, 28.0, 4.0),
        createCuboidShape(6.0, 19.0, 4.0, 7.0, 29.0, 5.0),
        createCuboidShape(6.0, 18.0, 5.0, 7.0, 30.0, 6.0),
        createCuboidShape(6.0, 18.0, 6.0, 7.0, 30.0, 10.0),
        createCuboidShape(6.0, 18.0, 10.0, 7.0, 30.0, 11.0),
        createCuboidShape(6.0, 19.0, 11.0, 7.0, 29.0, 12.0),
        createCuboidShape(6.0, 20.0, 12.0, 7.0, 28.0, 13.0),
        createCuboidShape(6.0, 21.0, 13.0, 7.0, 27.0, 14.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()
    private val signShape3 = Stream.of(
        createCuboidShape(13.0, 21.0, 9.0, 14.0, 27.0, 10.0),
        createCuboidShape(12.0, 20.0, 9.0, 13.0, 28.0, 10.0),
        createCuboidShape(11.0, 19.0, 9.0, 12.0, 29.0, 10.0),
        createCuboidShape(10.0, 18.0, 9.0, 11.0, 30.0, 10.0),
        createCuboidShape(6.0, 18.0, 9.0, 10.0, 30.0, 10.0),
        createCuboidShape(5.0, 18.0, 9.0, 6.0, 30.0, 10.0),
        createCuboidShape(4.0, 19.0, 9.0, 5.0, 29.0, 10.0),
        createCuboidShape(3.0, 20.0, 9.0, 4.0, 28.0, 10.0),
        createCuboidShape(2.0, 21.0, 9.0, 3.0, 27.0, 10.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get()
    private val signShape4 = Stream.of(
        createCuboidShape(9.0, 21.0, 13.0, 10.0, 27.0, 14.0),
        createCuboidShape(9.0, 20.0, 12.0, 10.0, 28.0, 13.0),
        createCuboidShape(9.0, 19.0, 11.0, 10.0, 29.0, 12.0),
        createCuboidShape(9.0, 18.0, 10.0, 10.0, 30.0, 11.0),
        createCuboidShape(9.0, 18.0, 6.0, 10.0, 30.0, 10.0),
        createCuboidShape(9.0, 18.0, 5.0, 10.0, 30.0, 6.0),
        createCuboidShape(9.0, 19.0, 4.0, 10.0, 29.0, 5.0),
        createCuboidShape(9.0, 20.0, 3.0, 10.0, 28.0, 4.0),
        createCuboidShape(9.0, 21.0, 2.0, 10.0, 27.0, 3.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }.get();

    private val northShape = VoxelShapes.union(poleShape, signShape1)
    private val westShape = VoxelShapes.union(poleShape, signShape2)
    private val southShape = VoxelShapes.union(poleShape, signShape3)
    private val eastShape = VoxelShapes.union(poleShape, signShape4)

    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    fun getShape(state: BlockState): VoxelShape {
        val direction = state.get(Properties.HORIZONTAL_FACING)
        return when (direction) {
            Direction.NORTH -> northShape
            Direction.EAST -> eastShape
            Direction.SOUTH -> southShape
            Direction.WEST -> westShape
            else -> northShape
        }
    }

    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun getCollisionShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = getShape(state)
    override fun getRaycastShape(state: BlockState, world: BlockView, pos: BlockPos): VoxelShape = getShape(state)
    override fun getCullingShape(state: BlockState, world: BlockView, pos: BlockPos): VoxelShape = getShape(state)

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return super.getPlacementState(ctx)?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)
    }

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::RoadSignRoundBlock)
}