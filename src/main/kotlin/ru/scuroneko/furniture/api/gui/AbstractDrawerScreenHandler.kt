package ru.scuroneko.furniture.api.gui

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.screen.slot.Slot
import ru.scuroneko.furniture.registry.ModScreenHandlers

abstract class AbstractDrawerScreenHandler(
    syncId: Int,
    playerInventory: PlayerInventory,
    val inventory: Inventory,
    type: ScreenHandlerType<*>,
    boxIndex: Int,
    private val boxCount: Int,
    private val boxSlotCount: Int
) : ScreenHandler(type, syncId) {
    private constructor(
        syncId: Int, playerInventory: PlayerInventory, inventory: Inventory,
        type: ScreenHandlerType<*>,
        boxIndex: Int,
    ) : this(
        syncId, playerInventory,
        inventory, type, boxIndex,
        4, 9
    )

    constructor(syncId: Int, playerInventory: PlayerInventory) : this(
        syncId,
        playerInventory,
        SimpleInventory(4 * 9),
        ModScreenHandlers.MEDICAL_DRAWER_SCREEN_HANDLER,
        0, 4, 9
    )

    init {
        checkSize(inventory, boxCount * boxSlotCount)
        inventory.onOpen(playerInventory.player)

        for (line in 0 until boxSlotCount / 9)
            for (m in 0 until boxSlotCount)
                this.addSlot(Slot(inventory, (boxIndex * 2) * 9 + (9 * line) + m, 8 + m * 18, 26 + (line * 18)))

        for (m in 0 until 3)
            for (l in 0 until 9)
                this.addSlot(Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18))

        for (m in 0 until 9)
            this.addSlot(Slot(playerInventory, m, 8 + m * 18, 142))
    }

    override fun quickMove(player: PlayerEntity, slotIndex: Int): ItemStack {
        var newStack = ItemStack.EMPTY
        val slot = slots[slotIndex]
        if (slot.hasStack()) {
            val originalStack = slot.stack
            newStack = originalStack.copy()
            if (slotIndex < inventory.size() / boxCount) {
                if (!this.insertItem(originalStack, inventory.size() / boxCount, slots.size, true))
                    return ItemStack.EMPTY
            } else if (!this.insertItem(originalStack, 0, inventory.size() / boxCount, false))
                return ItemStack.EMPTY

            if (originalStack.isEmpty) slot.stack = ItemStack.EMPTY
            else slot.markDirty()
        }

        return newStack
    }

    override fun canUse(player: PlayerEntity): Boolean = this.inventory.canPlayerUse(player)
}