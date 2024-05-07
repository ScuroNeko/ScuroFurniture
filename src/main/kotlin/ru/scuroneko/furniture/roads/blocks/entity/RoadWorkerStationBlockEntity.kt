package ru.scuroneko.furniture.roads.blocks.entity

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.network.PacketByteBuf
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.roads.RoadBlockEntities
import ru.scuroneko.furniture.roads.gui.RoadWorkerStationScreenHandler

class RoadWorkerStationBlockEntity(pos: BlockPos, state: BlockState) : BlockEntity(RoadBlockEntities.ROAD_WORKER_STATION_BLOCK_ENTITY, pos, state), ExtendedScreenHandlerFactory, IInventory {
    private val inventory = DefaultedList.ofSize(2, ItemStack.EMPTY)

    override fun getItems(): DefaultedList<ItemStack> = inventory

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler = RoadWorkerStationScreenHandler(syncId, playerInventory, ScreenHandlerContext.EMPTY)

    override fun getDisplayName(): Text = Text.translatable(cachedState.block.translationKey)
    override fun writeScreenOpeningData(player: ServerPlayerEntity, buf: PacketByteBuf) {
        buf.writeBlockPos(this.pos)
    }

    override fun writeNbt(nbt: NbtCompound) {
        super.writeNbt(nbt)
        Inventories.writeNbt(nbt, this.inventory)
    }
    override fun readNbt(nbt: NbtCompound) {
        super.readNbt(nbt)
        Inventories.readNbt(nbt, this.inventory)
    }
}