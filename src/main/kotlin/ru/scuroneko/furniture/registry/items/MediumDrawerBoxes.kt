package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.registry.RegistryHelper

object MediumDrawerBoxes : IItemContainer {
    val OAK_MEDIUM_DRAWER_BOX = BoxItem(Blocks.OAK_SLAB)
    val SPRUCE_MEDIUM_DRAWER_BOX = BoxItem(Blocks.SPRUCE_SLAB)
    val BIRCH_MEDIUM_DRAWER_BOX = BoxItem(Blocks.BIRCH_SLAB)
    val JUNGLE_MEDIUM_DRAWER_BOX = BoxItem(Blocks.JUNGLE_SLAB)
    val ACACIA_MEDIUM_DRAWER_BOX = BoxItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_MEDIUM_DRAWER_BOX = BoxItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_MEDIUM_DRAWER_BOX = BoxItem(Blocks.MANGROVE_SLAB)
    val CHERRY_MEDIUM_DRAWER_BOX = BoxItem(Blocks.CHERRY_SLAB)
    val BAMBOO_MEDIUM_DRAWER_BOX = BoxItem(Blocks.BAMBOO_SLAB)

    override fun afterEach(obj: Item) {
        if (obj is BoxItem) RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.add(obj)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}