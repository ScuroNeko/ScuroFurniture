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
import ru.scuroneko.furniture.gui.KitchenCabinetScreenHandler
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.RegistryHelper

class KitchenCabinetBlockEntity(pos: BlockPos, state: BlockState) :
    BlockEntity(ModBlockEntities.KITCHEN_CABINET_BLOCK_ENTITY, pos, state), NamedScreenHandlerFactory, IInventory {
    private var boxIndex = 0
    private val inventory = DefaultedList.ofSize(2 * 18, ItemStack.EMPTY)

    fun setBoxIndex(index: Int) {
        this.boxIndex = index
    }

    override fun supports(state: BlockState): Boolean = RegistryHelper.Blocks.KITCHEN_CABINETS.contains(state.block) || RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.contains(state.block)

    override fun readNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.readNbt(nbt, registryLookup)
        Inventories.readNbt(nbt, inventory, registryLookup)
    }

    override fun writeNbt(nbt: NbtCompound, registryLookup: RegistryWrapper.WrapperLookup) {
        super.writeNbt(nbt, registryLookup)
        Inventories.writeNbt(nbt, inventory, registryLookup)
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return KitchenCabinetScreenHandler(syncId, playerInventory, this, this.boxIndex)
    }

    override fun getDisplayName(): Text = Text.translatable(Constants.Translatable.KITCHEN_CABINET)
    override fun getItems(): DefaultedList<ItemStack> = this.inventory
}