package ru.scuroneko.furniture.blocks.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.client.MinecraftClient
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.network.listener.ClientPlayPacketListener
import net.minecraft.network.packet.Packet
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket
import net.minecraft.registry.RegistryWrapper
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandler
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.gui.MedicalDrawerScreenHandler
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.RegistryHelper

class MedicalDrawerBlockEntity(pos: BlockPos, state: BlockState) :
    BlockEntity(ModBlockEntities.MEDICAL_DRAWER_BLOCK_ENTITY, pos, state), NamedScreenHandlerFactory, IInventory {
    private var boxIndex = 0
    private val inventory = DefaultedList.ofSize(4 * 9, ItemStack.EMPTY)

    fun setBoxIndex(index: Int) {
        this.boxIndex = index
    }

    override fun supports(state: BlockState): Boolean = RegistryHelper.Blocks.MEDICAL_DRAWERS.contains(state.block)

    override fun readNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.readNbt(nbt, registryLookup)
        Inventories.readNbt(nbt, inventory, registryLookup)
    }

    override fun writeNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.writeNbt(nbt, registryLookup)
        Inventories.writeNbt(nbt, inventory, registryLookup)
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return MedicalDrawerScreenHandler(syncId, playerInventory, this, this.boxIndex)
    }

    override fun toUpdatePacket(): Packet<ClientPlayPacketListener> = BlockEntityUpdateS2CPacket.create(this)
    override fun toInitialChunkDataNbt(registryLookup: RegistryWrapper.WrapperLookup): NbtCompound = createNbt(registryLookup)

    override fun getDisplayName(): Text = Text.translatable(Constants.Translatable.MEDICAL_DRAWER)

    override fun getItems(): DefaultedList<ItemStack> = this.inventory

    override fun markDirty() {
        super.markDirty()
        val player = MinecraftClient.getInstance().player ?: return
        if(player.world.isClient) return
        if(player is ServerPlayerEntity)
            (player as ServerPlayerEntity).networkHandler.sendPacket(toUpdatePacket())
    }
}