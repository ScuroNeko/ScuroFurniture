package ru.scuroneko.furniture.carpenter

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture

object CarpenterItems {
    val ITEMS = LinkedHashMap<Identifier, Item>()

    val OAK_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val SPRUCE_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val CHERRY_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())

    fun register() {
        registerItem("oak_medical_drawer_box", OAK_MEDICAL_DRAWER_BOX)
        registerItem("spruce_medical_drawer_box", SPRUCE_MEDICAL_DRAWER_BOX)
        registerItem("cherry_medical_drawer_box", CHERRY_MEDICAL_DRAWER_BOX)
    }

    private fun registerItem(path: String, item: Item) {
        Registry.register(Registries.ITEM, Identifier(ScuroFurniture.CARPENTER_MOD_ID, path), item)
        ITEMS[Identifier(ScuroFurniture.CARPENTER_MOD_ID, path)] = item
    }
}