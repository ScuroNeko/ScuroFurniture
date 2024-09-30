package ru.scuroneko.furniture.api.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.HorizontalFacingBlock
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World
import ru.scuroneko.furniture.api.properties.ModProperties
import ru.scuroneko.furniture.api.properties.TableType
import ru.scuroneko.furniture.utils.MathUtils

abstract class AbstractTableBlock(val wood: Block) : HorizontalFacingBlock(Settings.copy(wood).nonOpaque()) {
    companion object {
        inline fun <reified T : AbstractTableBlock> checkSide(world: World, pos: BlockPos, state: BlockState) {
            val (leftPos, rightPos) = MathUtils.getSideBlocks(state, pos)
            val (nextLeftPos, nextRightPos) = MathUtils.getNextSideBlocks(state, pos)
            val leftState = world.getBlockState(leftPos)
            val rightState = world.getBlockState(rightPos)
            var newProperty = TableType.CENTER
            if (leftState.block is T) {
                val next = world.getBlockState(nextLeftPos)
                val leftProperty = if (next.block is T) TableType.CENTER else TableType.LEFT
                if (rightState.block !is T) newProperty = TableType.RIGHT
                world.setBlockState(leftPos, leftState.with(ModProperties.COFFEE_TABLE_TYPE, leftProperty))
            }
            if (rightState.block is T) {
                val next = world.getBlockState(nextRightPos)
                val rightProperty = if (next.block is T) TableType.CENTER else TableType.RIGHT
                if (leftState.block !is T) newProperty = TableType.LEFT
                world.setBlockState(rightPos, rightState.with(ModProperties.COFFEE_TABLE_TYPE, rightProperty))
            }
            if (rightState.block is T || leftState.block is T)
                world.setBlockState(pos, state.with(ModProperties.COFFEE_TABLE_TYPE, newProperty))
        }
    }

    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
        builder.add(ModProperties.COFFEE_TABLE_TYPE)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)
        ?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing)
        ?.with(ModProperties.COFFEE_TABLE_TYPE, TableType.SINGLE)
}