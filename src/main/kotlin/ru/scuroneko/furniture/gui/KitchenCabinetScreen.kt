package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.gui.AbstractDrawerScreen

class KitchenCabinetScreen(
    handler: KitchenCabinetScreenHandler,
    inventory: PlayerInventory, title: Text
) : AbstractDrawerScreen<KitchenCabinetScreenHandler>(handler, inventory, title, Constants.ScreenTextures.BEDSIDE_DRAWER)