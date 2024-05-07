package ru.scuroneko.furniture.carpenter.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockSetType
import net.minecraft.block.BlockState
import net.minecraft.block.DoorBlock
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.sound.SoundCategory
import net.minecraft.state.StateManager
import net.minecraft.state.property.BooleanProperty
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraft.world.event.GameEvent
import ru.scuroneko.furniture.ScuroFurniture

class AirtightDoorBlock(type: BlockSetType, settings: Settings) : DoorBlock(type, settings) {
    companion object {
        @JvmStatic
        val IS_AIRTIGHT: BooleanProperty = BooleanProperty.of("is_airtight")
    }

    init {
        defaultState = defaultState.with(IS_AIRTIGHT, false)
    }

    private fun playOpenCloseSound(entity: Entity?, world: World, pos: BlockPos, open: Boolean) {
        world.playSound(entity, pos, if (open) blockSetType.doorOpen() else blockSetType.doorClose(), SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.1f + 0.9f)
    }

    override fun onUse(state: BlockState, world: World, pos: BlockPos, player: PlayerEntity, hand: Hand, hit: BlockHitResult): ActionResult {
        ScuroFurniture.LOGGER.info(this.isOpen(state.cycle(OPEN)).toString())
        if(player.isSneaky) {
            world.setBlockState(pos, state.with(IS_AIRTIGHT, !state.get(IS_AIRTIGHT)))
            return ActionResult.success(world.isClient)
        } else if(state.get(IS_AIRTIGHT))
            return ActionResult.PASS

        world.setBlockState(pos, state.cycle(OPEN), 10)
        this.playOpenCloseSound(player, world, pos, state.cycle(OPEN).get(OPEN))
        world.emitGameEvent(player, if (this.isOpen(state.cycle(OPEN))) GameEvent.BLOCK_OPEN else GameEvent.BLOCK_CLOSE, pos)
        return ActionResult.success(world.isClient)
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        super.appendProperties(builder)
        builder.add(IS_AIRTIGHT)
    }
}