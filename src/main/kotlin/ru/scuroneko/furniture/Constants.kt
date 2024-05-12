package ru.scuroneko.furniture

import net.minecraft.util.Identifier

object Constants {
    object ScreenNames {
        const val MEDICAL_DRAWER = "gui.scuro_furniture.medical_drawer"
        const val BEDSIDE_DRAWER = "gui.scuro_furniture.bedside_table"
        const val KITCHEN_DRAWER = "gui.scuro_furniture.kitchen_drawer"
    }

    object ScreenTextures {
        val MEDICAL_DRAWER = Identifier(ScuroFurniture.MOD_ID, "textures/gui/container/medical_drawer.png")
        val BEDSIDE_DRAWER = Identifier(ScuroFurniture.MOD_ID, "textures/gui/container/bedside_table.png")
    }

    object ScreenMaterialTextures {
        val OAK_MEDICAL_DRAWER = Identifier(ScuroFurniture.MOD_ID, "textures/gui/container/oak_medical_drawer.png")
        val SPRUCE_MEDICAL_DRAWER =
            Identifier(ScuroFurniture.MOD_ID, "textures/gui/container/spruce_medical_drawer.png")
        val CHERRY_MEDICAL_DRAWER = Identifier(ScuroFurniture.MOD_ID, "textures/gui/container/oak_medical_drawer.png")
    }
}