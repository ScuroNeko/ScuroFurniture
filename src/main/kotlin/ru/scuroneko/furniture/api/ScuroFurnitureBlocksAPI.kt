package ru.scuroneko.furniture.api

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.BEDSIDE_TABLES
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.BEDSIDE_TABLES_ITEMS
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.KITCHEN_DRAWERS
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.KITCHEN_DRAWERS_ITEMS
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.MEDICAL_DRAWERS
import ru.scuroneko.furniture.carpenter.CarpenterBlocks.MEDICAL_DRAWERS_ITEMS
import ru.scuroneko.furniture.carpenter.blocks.BedsideTableBlock
import ru.scuroneko.furniture.carpenter.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.carpenter.blocks.MedicalDrawerBlock

object ScuroFurnitureBlocksAPI {
    fun registerBlock(id: Identifier, block: Block): BlockItem {
        val blockItem = BlockItem(block, FabricItemSettings())
        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, blockItem)
        return blockItem
    }

    fun registerMedicalDrawer(id: Identifier, block: MedicalDrawerBlock) {
        val item = registerBlock(id, block)
        MEDICAL_DRAWERS[id] = block
        MEDICAL_DRAWERS_ITEMS[id] = item
    }

    fun registerBedsideTable(id: Identifier, block: BedsideTableBlock) {
        val item = registerBlock(id, block)
        BEDSIDE_TABLES[id] = block
        BEDSIDE_TABLES_ITEMS[id] = item
    }

    fun registerKitchenDrawer(id: Identifier, block: KitchenDrawerBlock) {
        val item = registerBlock(id, block)
        KITCHEN_DRAWERS[id] = block
        KITCHEN_DRAWERS_ITEMS[id] = item
    }
}