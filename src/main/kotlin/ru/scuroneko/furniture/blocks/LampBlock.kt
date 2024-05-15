package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView

class LampBlock(val slab: Block, val fence: Block, val wool: Block, val log: Block) :
    HorizontalFacingBlock(FabricBlockSettings.copy(slab).luminance { _ -> 15 }) {
    private constructor(settings: Settings) : this(
        Blocks.OAK_SLAB,
        Blocks.OAK_FENCE,
        Blocks.WHITE_WOOL,
        Blocks.STRIPPED_OAK_LOG
    )

    val shape: VoxelShape = sequenceOf(
        sequenceOf(
            createCuboidShape(4.0, 13.0, 4.0, 12.0, 14.0, 12.0),
            createCuboidShape(12.0, 6.0, 4.0, 13.0, 14.0, 13.0),
            createCuboidShape(3.0, 6.0, 12.0, 12.0, 14.0, 13.0),
            createCuboidShape(3.0, 6.0, 3.0, 4.0, 14.0, 12.0),
            createCuboidShape(4.0, 6.0, 3.0, 13.0, 14.0, 4.0)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        sequenceOf(
            createCuboidShape(7.0, 8.0, 7.0, 9.0, 10.0, 9.0),
            createCuboidShape(4.0, 7.0, 7.0, 12.0, 8.0, 9.0),
            createCuboidShape(7.0, 7.0, 4.0, 9.0, 8.0, 12.0)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        VoxelShapes.combineAndSimplify(
            createCuboidShape(4.0, 0.0, 4.0, 12.0, 1.0, 12.0),
            createCuboidShape(7.0, 1.0, 7.0, 9.0, 7.0, 9.0),
            BooleanBiFunction.OR
        )
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }

    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun getCollisionShape(
        state: BlockState?,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape = shape

    override fun getOutlineShape(
        state: BlockState?,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape = shape

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? =
        super.getPlacementState(ctx)?.with(HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::LampBlock)
}