package ru.scuroneko.furniture.carpenter.blocks.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandler
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.carpenter.CarpenterBlocks
import ru.scuroneko.furniture.carpenter.gui.MedicalDrawerScreenHandler

class MedicalDrawerBlockEntity(pos: BlockPos, state: BlockState) : BlockEntity(CarpenterBlocks.MEDICAL_DRAWER_BLOCK_ENTITY, pos, state), NamedScreenHandlerFactory, IInventory {
    private var boxIndex = 0
    private val inventory = DefaultedList.ofSize(4*9, ItemStack.EMPTY)

    fun setBoxIndex(index: Int) {
        this.boxIndex = index
    }

    override fun readNbt(nbt: NbtCompound) {
        super.readNbt(nbt)
        Inventories.readNbt(nbt, inventory)
    }

    override fun writeNbt(nbt: NbtCompound) {
        super.writeNbt(nbt)
        Inventories.writeNbt(nbt, inventory)
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return MedicalDrawerScreenHandler(syncId, playerInventory, this, this.boxIndex)
    }

    override fun getDisplayName(): Text = Text.literal("Medical drawer")
    override fun getItems(): DefaultedList<ItemStack> = this.inventory
}