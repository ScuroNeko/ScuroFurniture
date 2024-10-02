package ru.scuroneko.furniture

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModBlocks {

    fun register() {
    }

    fun register(block: Block, name: String): Unit {
        Registry.register(Registries.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, name), block)
        Registry.register(Registries.ITEM, Identifier.of(ScuroFurniture.MOD_ID, name), BlockItem(block, Item.Settings()))
    }
}