package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import ru.scuroneko.furniture.ModScreenHandlers
import ru.scuroneko.furniture.api.gui.AbstractDrawerScreenHandler

class KitchenDrawerScreenHandler(syncId: Int, playerInventory: PlayerInventory, inventory: Inventory, boxIndex: Int) :
    AbstractDrawerScreenHandler(
        syncId,
        playerInventory,
        inventory,
        ModScreenHandlers.KITCHEN_DRAWER_SCREEN_HANDLER,
        boxIndex,
        2,
        18
    ) {
    constructor(syncId: Int, playerInventory: PlayerInventory) : this(
        syncId,
        playerInventory,
        SimpleInventory(2 * 18),
        0
    )
}