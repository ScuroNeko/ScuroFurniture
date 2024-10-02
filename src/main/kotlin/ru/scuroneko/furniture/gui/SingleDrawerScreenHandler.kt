package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import ru.scuroneko.furniture.registry.ModScreenHandlers

class SingleDrawerScreenHandler(
    syncId: Int,
    playerInventory: PlayerInventory,
    val inventory: Inventory,
    boxIndex: Int
) : ScreenHandler(ModScreenHandlers.SINGLE_DRAWER_SCREEN_HANDLER, syncId) {
    constructor(syncId: Int, playerInventory: PlayerInventory) : this(
        syncId,
        playerInventory,
        SimpleInventory(4 * 9),
        0
    )

    init {
        checkSize(inventory, 4 * 9)
        inventory.onOpen(playerInventory.player)

        for (j in 0 until 4)
            for (k in 0..8)
                this.addSlot(Slot(inventory, k + j * 9, 8 + k * 18, 18 + j * 18))

        for (j in 0..2)
            for (k in 0..8)
                this.addSlot(Slot(playerInventory, k + j * 9 + 9, 8 + k * 18, 103 + j * 18))

        for (j in 0..8)
            this.addSlot(Slot(playerInventory, j, 8 + j * 18, 161))
    }

    override fun quickMove(player: PlayerEntity, invSlot: Int): ItemStack {
        var newStack = ItemStack.EMPTY
        val slot = slots[invSlot]
        if (slot.hasStack()) {
            val originalStack = slot.stack
            newStack = originalStack.copy()
            if (invSlot < inventory.size()) {
                if (!this.insertItem(originalStack, inventory.size(), slots.size, true))
                    return ItemStack.EMPTY
            } else if (!this.insertItem(originalStack, 0, inventory.size(), false))
                return ItemStack.EMPTY

            if (originalStack.isEmpty)
                slot.stack = ItemStack.EMPTY
            else
                slot.markDirty()
        }

        return newStack
    }

    override fun canUse(player: PlayerEntity): Boolean = this.inventory.canPlayerUse(player)
}