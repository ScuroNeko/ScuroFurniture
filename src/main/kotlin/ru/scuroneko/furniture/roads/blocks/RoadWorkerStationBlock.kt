package ru.scuroneko.furniture.roads.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.Block
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.screen.SimpleNamedScreenHandlerFactory
import net.minecraft.state.property.Properties
import net.minecraft.text.Text
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.roads.gui.RoadWorkerStationScreenHandler

class RoadWorkerStationBlock(settings: Settings) : Block(settings.nonOpaque()) {
    val FACING = Properties.HORIZONTAL_FACING
    // TODO direction property
//    init {
//        defaultState = defaultState.with(Properties.HORIZONTAL_FACING, Direction.NORTH)
//    }

    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape {
        return super.getOutlineShape(state, world, pos, context)
    }

    override fun onUse(state: BlockState, world: World, pos: BlockPos, player: PlayerEntity, hand: Hand, hit: BlockHitResult): ActionResult {
        if(!world.isClient)
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos))
        return ActionResult.SUCCESS
    }

    override fun createScreenHandlerFactory(state: BlockState, world: World, pos: BlockPos): NamedScreenHandlerFactory {
        return SimpleNamedScreenHandlerFactory({ syncId: Int, playerInventory: PlayerInventory, _: PlayerEntity ->
            RoadWorkerStationScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(world, pos))
        }, Text.translatable("container.stonecutter"))
    }

    override fun getRenderType(state: BlockState): BlockRenderType = BlockRenderType.MODEL
    override fun getCodec(): MapCodec<out Block> = createCodec(::RoadWorkerStationBlock)
}