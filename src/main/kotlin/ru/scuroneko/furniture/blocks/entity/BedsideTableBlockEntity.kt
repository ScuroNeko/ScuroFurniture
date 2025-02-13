package ru.scuroneko.furniture.blocks.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandler
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.gui.BedsideTableScreenHandler
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.RegistryHelper

class BedsideTableBlockEntity(pos: BlockPos, state: BlockState) :
    BlockEntity(ModBlockEntities.BEDSIDE_TABLE_BLOCK_ENTITY, pos, state),
    NamedScreenHandlerFactory, IInventory {
    private var boxIndex = 0
    private val inventory = DefaultedList.ofSize(2 * 18, ItemStack.EMPTY)

    fun setBoxIndex(index: Int) {
        this.boxIndex = index
    }

    override fun supports(state: BlockState): Boolean = RegistryHelper.Blocks.BEDSIDE_DRAWERS.contains(state.block)

    override fun readNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.readNbt(nbt, registryLookup)
        Inventories.readNbt(nbt, inventory, registryLookup)
    }

    override fun writeNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.writeNbt(nbt, registryLookup)
        Inventories.writeNbt(nbt, inventory, registryLookup)
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return BedsideTableScreenHandler(syncId, playerInventory, this, this.boxIndex)
    }

    override fun getDisplayName(): Text = Text.translatable(Constants.Translatable.BEDSIDE_DRAWER)
    override fun getItems(): DefaultedList<ItemStack> = this.inventory
}