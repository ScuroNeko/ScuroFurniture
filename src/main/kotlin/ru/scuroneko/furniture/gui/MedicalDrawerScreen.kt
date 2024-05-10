package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.gui.AbstractDrawerScreen

class MedicalDrawerScreen(handler: MedicalDrawerScreenHandler, inventory: PlayerInventory, title: Text) :
    AbstractDrawerScreen<MedicalDrawerScreenHandler>(handler, inventory, title, Constants.ScreenTextures.MEDICAL_DRAWER)