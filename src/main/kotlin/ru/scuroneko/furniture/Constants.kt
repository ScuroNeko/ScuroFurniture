package ru.scuroneko.furniture

import net.minecraft.util.Identifier

object Constants {
    object Translatable {
        const val MEDICAL_DRAWER = "gui.scuro_furniture.medical_drawer"
        const val BEDSIDE_DRAWER = "gui.scuro_furniture.bedside_table"
        const val KITCHEN_DRAWER = "gui.scuro_furniture.kitchen_drawer"
        const val KITCHEN_CABINET = "gui.scuro_furniture.kitchen_cabinet"
        const val SINGLE_DRAWER = "gui.scuro_furniture.single_drawer"

        const val CARPENTER_GROUP = "itemGroup.scuro_furniture.blocks_group"
        const val CARPENTER_ITEM_GROUP = "itemGroup.scuro_furniture.items_group"

        const val CASE_MATERIAL_TOOLTIP = "text.scuro_furniture.case_material"
        const val BOX_MATERIAL_TOOLTIP = "text.scuro_furniture.box_material"
        const val DOOR_MATERIAL_TOOLTIP = "text.scuro_furniture.door_material"
    }

    object ScreenTextures {
        val MEDICAL_DRAWER: Identifier =
            Identifier.of(ScuroFurniture.MOD_ID, "textures/gui/container/medical_drawer.png")
        val BEDSIDE_DRAWER: Identifier =
            Identifier.of(ScuroFurniture.MOD_ID, "textures/gui/container/bedside_drawer.png")
        val SINGLE_DRAWER: Identifier = Identifier.of(ScuroFurniture.MOD_ID, "textures/gui/container/single_drawer.png")
    }
}