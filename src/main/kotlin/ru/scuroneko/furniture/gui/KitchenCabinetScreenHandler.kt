package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import ru.scuroneko.furniture.registry.ModScreenHandlers

class KitchenCabinetScreenHandler(
    syncId: Int,
    playerInventory: PlayerInventory,
    private val inventory: Inventory,
    boxIndex: Int
) : ScreenHandler(
    ModScreenHandlers.KITCHEN_DRAWER_SCREEN_HANDLER, syncId
) {
    constructor(syncId: Int, playerInventory: PlayerInventory) : this(
        syncId,
        playerInventory,
        SimpleInventory(2 * 18),
        0
    )

    init {
        checkSize(inventory, 2 * 18)
        inventory.onOpen(playerInventory.player)

        for (line in 0 until 2)
            for (m in 0 until 9)
                this.addSlot(Slot(inventory, (boxIndex * 2) * 9 + (9 * line) + m, 8 + m * 18, 26 + (line * 18)))

        for (m in 0 until 3)
            for (l in 0 until 9)
                this.addSlot(Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18))

        for (m in 0 until 9)
            this.addSlot(Slot(playerInventory, m, 8 + m * 18, 142))
    }

    override fun quickMove(player: PlayerEntity, invSlot: Int): ItemStack {
        var newStack = ItemStack.EMPTY
        val slot = slots[invSlot]
        if (slot.hasStack()) {
            val originalStack = slot.stack
            newStack = originalStack.copy()
            if (invSlot < inventory.size() / 2) {
                if (!this.insertItem(originalStack, inventory.size() / 2, slots.size, true))
                    return ItemStack.EMPTY
            } else if (!this.insertItem(originalStack, 0, inventory.size() / 2, false))
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