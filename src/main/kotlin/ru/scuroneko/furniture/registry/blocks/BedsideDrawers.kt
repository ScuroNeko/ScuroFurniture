package ru.scuroneko.furniture.registry.blocks

import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.blocks.BedsideDrawerBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object BedsideDrawers {
    fun register() {
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.forEach { case ->
            RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach { box ->
                register(BedsideDrawerBlock(case, box))
            }
        }
    }

    private fun register(block: BedsideDrawerBlock) {
        val item = BlockItem(block, Item.Settings())
        val id = Identifier.of(ScuroFurniture.MOD_ID, block.getDrawerName())

        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, item)

        RegistryHelper.Blocks.BEDSIDE_DRAWERS.add(block)
        RegistryHelper.Blocks.BLOCKS.add(block)
    }
}