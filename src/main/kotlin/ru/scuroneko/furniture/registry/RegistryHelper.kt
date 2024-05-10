package ru.scuroneko.furniture.registry

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

object RegistryHelper {
    object Blocks {
        val MEDICAL_DRAWERS = LinkedHashMap<Identifier, AbstractDrawerBlock>()
        val BEDSIDE_TABLES = LinkedHashMap<Identifier, AbstractDrawerBlock>()
        val KITCHEN_DRAWERS = LinkedHashMap<Identifier, KitchenDrawerBlock>()
        val KITCHEN_CABINETS = LinkedHashMap<Identifier, KitchenCabinetBlock>()
    }

    object Items {
        val ITEMS = LinkedHashMap<Identifier, Item>()

        val KITCHEN_DRAWERS_CASES = LinkedHashMap<Identifier, KitchenDrawerCaseItem>()

        fun registerKitchenDrawerCase(path: String, case: KitchenDrawerCaseItem) {
            val id = Identifier(ScuroFurniture.MOD_ID, path)
            Registry.register(Registries.ITEM, id, case)
            ITEMS[id] = case
            KITCHEN_DRAWERS_CASES[id] = case
        }
    }
}