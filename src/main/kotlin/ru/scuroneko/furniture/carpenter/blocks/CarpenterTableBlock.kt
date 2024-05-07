package ru.scuroneko.furniture.carpenter.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.Block
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemPlacementContext
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.ActionResult
import net.minecraft.util.BlockMirror
import net.minecraft.util.BlockRotation
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.World
import ru.scuroneko.furniture.carpenter.blocks.entity.CarpenterTableBlockEntity

class CarpenterTableBlock(settings: Settings) : BlockWithEntity(settings) {
    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH)
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        val blockEntity = world.getBlockEntity(pos) ?: return ActionResult.PASS
        player.openHandledScreen(blockEntity as CarpenterTableBlockEntity)
        return super.onUse(state, world, pos, player, hand, hit)
    }
    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity = CarpenterTableBlockEntity(pos, state)
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::CarpenterTableBlock)

    // Facing
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(
        HORIZONTAL_FACING, ctx.horizontalPlayerFacing
    )
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
    }
    override fun rotate(state: BlockState, rotation: BlockRotation): BlockState = state.with(
        HORIZONTAL_FACING,
        rotation.rotate(state.get(HORIZONTAL_FACING))
    )
    override fun mirror(state: BlockState, mirror: BlockMirror): BlockState = state.rotate(mirror.getRotation(state.get(HORIZONTAL_FACING)))


    override fun getRenderType(state: BlockState): BlockRenderType = BlockRenderType.MODEL
}