package ru.scuroneko.furniture.roads.blocks

import com.mojang.serialization.MapCodec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.HorizontalFacingBlock
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.math.Direction

class AsphaltFullBlock(settings: Settings) : HorizontalFacingBlock(settings) {
    init {
        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(Properties.HORIZONTAL_FACING)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return super.getPlacementState(ctx)?.with(Properties.HORIZONTAL_FACING, ctx.horizontalPlayerFacing.opposite)
    }

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> =  RecordCodecBuilder.mapCodec { instance: RecordCodecBuilder.Instance<AsphaltFullBlock> ->
        instance.group(createSettingsCodec()).apply(instance) { settings: Settings ->
            AsphaltFullBlock(settings)
        }
    }
}