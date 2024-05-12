package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.slot.Slot
import ru.scuroneko.furniture.registry.ModScreenHandlers

class BedsideTableScreenHandler(
    syncId: Int,
    playerInventory: PlayerInventory,
    private val inventory: Inventory,
    boxIndex: Int
) : ScreenHandler(
    ModScreenHandlers.BEDSIDE_TABLE_SCREEN_HANDLER, syncId
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

    override fun quickMove(player: PlayerEntity, slot: Int): ItemStack {
        return ItemStack.EMPTY
    }

    override fun canUse(player: PlayerEntity): Boolean = this.inventory.canPlayerUse(player)
}