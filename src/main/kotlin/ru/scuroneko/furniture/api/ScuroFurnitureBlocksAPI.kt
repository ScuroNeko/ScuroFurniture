package ru.scuroneko.furniture.api

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ModBlocks.BEDSIDE_TABLES
import ru.scuroneko.furniture.ModBlocks.BEDSIDE_TABLES_ITEMS
import ru.scuroneko.furniture.ModBlocks.KITCHEN_CABINETS
import ru.scuroneko.furniture.ModBlocks.KITCHEN_CABINETS_ITEMS
import ru.scuroneko.furniture.blocks.BedsideDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock

object ScuroFurnitureBlocksAPI {
    fun registerBlock(id: Identifier, block: Block): BlockItem {
        val blockItem = BlockItem(block, FabricItemSettings())
        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, blockItem)
        return blockItem
    }

    fun registerBedsideTable(id: Identifier, block: BedsideDrawerBlock) {
        val item = registerBlock(id, block)
        BEDSIDE_TABLES[id] = block
        BEDSIDE_TABLES_ITEMS[id] = item
    }

    fun registerKitchenCabinet(id: Identifier, block: KitchenCabinetBlock) {
        val item = registerBlock(id, block)
        KITCHEN_CABINETS[id] = block
        KITCHEN_CABINETS_ITEMS[id] = item
    }
}