package ru.scuroneko.furniture.api

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ScuroFurnitureBlocksAPI {
    fun registerBlock(id: Identifier, block: Block): BlockItem {
        val blockItem = BlockItem(block, FabricItemSettings())
        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, blockItem)
        return blockItem
    }
}