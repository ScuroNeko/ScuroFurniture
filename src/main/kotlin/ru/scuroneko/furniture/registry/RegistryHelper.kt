package ru.scuroneko.furniture.registry

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.ScuroFurnitureBlocksAPI
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.BedsideTableBlock
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.MedicalDrawerBlock
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.item.MedicalDrawerCaseItem

object RegistryHelper {
    object Blocks {
        val BLOCKS = LinkedHashMap<Identifier, Block>()
        val MEDICAL_DRAWERS = mutableListOf<MedicalDrawerBlock>()
        val BEDSIDE_TABLES = LinkedHashMap<Identifier, AbstractDrawerBlock>()
        val KITCHEN_DRAWERS = mutableListOf<KitchenDrawerBlock>()
        val KITCHEN_CABINETS = LinkedHashMap<Identifier, KitchenCabinetBlock>()

        fun registerMedicalDrawer(path: String, block: MedicalDrawerBlock) {
            val id = Identifier(ScuroFurniture.MOD_ID, path)
            registerBlock(id, block)
        }

        fun registerBedsideTable(path: String, block: BedsideTableBlock) {
            val id = Identifier(ScuroFurniture.MOD_ID, path)
            registerBlock(id, block)
            BEDSIDE_TABLES[id] = block
        }

        private fun registerBlock(id: Identifier, block: Block): BlockItem {
            val blockItem = BlockItem(block, FabricItemSettings())
            Registry.register(Registries.BLOCK, id, block)
            Registry.register(Registries.ITEM, id, blockItem)
            BLOCKS[id] = block
            return blockItem
        }
    }

    object Items {
        val ITEMS = LinkedHashMap<Identifier, Item>()
        val NEW_ITEMS = mutableListOf<Item>()

        val MEDICAL_DRAWERS_BOXES = mutableListOf<BoxItem>()
        val MEDICAL_DRAWERS_CASES = mutableListOf<MedicalDrawerCaseItem>()

        val KITCHEN_DRAWERS_BOXES = mutableListOf<BoxItem>()
        val KITCHEN_DRAWERS_CASES = mutableListOf<KitchenDrawerCaseItem>()

//        fun registerMedicalDrawerBox(path: String, box: BoxItem) {
//            val id = Identifier(ScuroFurniture.MOD_ID, path)
//            Registry.register(Registries.ITEM, id, box)
//            ITEMS[id] = box
//            MEDICAL_DRAWERS_BOXES[id] = box
//        }
//        fun registerMedicalDrawerCase(path: String, case: MedicalDrawerCaseItem) {
//            val id = Identifier(ScuroFurniture.MOD_ID, path)
//            Registry.register(Registries.ITEM, id, case)
//            ITEMS[id] = case
//            MEDICAL_DRAWERS_CASES[id] = case
//        }

//        fun registerKitchenDrawerBox(path: String, box: BoxItem) {
//            val id = Identifier(ScuroFurniture.MOD_ID, path)
//            Registry.register(Registries.ITEM, id, box)
//            ITEMS[id] = box
//            KITCHEN_DRAWERS_BOXES[id] = box
//        }
//        fun registerKitchenDrawerCase(path: String, case: KitchenDrawerCaseItem) {
//            val id = Identifier(ScuroFurniture.MOD_ID, path)
//            Registry.register(Registries.ITEM, id, case)
//            ITEMS[id] = case
//            KITCHEN_DRAWERS_CASES[id] = case
//        }
    }
}