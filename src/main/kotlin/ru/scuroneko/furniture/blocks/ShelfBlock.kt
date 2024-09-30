package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.block.*
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import ru.scuroneko.furniture.utils.MathUtils


class ShelfBlock(val slab: Block) : HorizontalFacingBlock(Settings.copy(slab).nonOpaque()) {
    private constructor(settings: Settings) : this(Blocks.OAK_PLANKS)

    val shape: VoxelShape = createCuboidShape(0.0, 14.0, 0.0, 16.0, 16.0, 12.0)

    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun getCollisionShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape = MathUtils.rotateShape(state.get(HORIZONTAL_FACING), shape)

    @Environment(EnvType.CLIENT)
    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape = MathUtils.rotateShape(state.get(HORIZONTAL_FACING), shape)

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return super.getPlacementState(ctx)?.with(HORIZONTAL_FACING, ctx.horizontalPlayerFacing)
    }

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::ShelfBlock)
}