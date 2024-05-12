package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.gui.AbstractDrawerScreen

class BedsideTableScreen(handler: BedsideTableScreenHandler, inventory: PlayerInventory, title: Text) :
    AbstractDrawerScreen<BedsideTableScreenHandler>(handler, inventory, title, Constants.ScreenTextures.BEDSIDE_DRAWER)