package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.registry.RegistryHelper

object BigDrawersBoxes : IItemContainer {
    val OAK_BIG_BOX = BoxItem(Blocks.OAK_SLAB)
    val SPRUCE_BIG_BOX = BoxItem(Blocks.SPRUCE_SLAB)
    val BIRCH_BIG_BOX = BoxItem(Blocks.BIRCH_SLAB)
    val JUNGLE_BIG_BOX = BoxItem(Blocks.JUNGLE_SLAB)
    val ACACIA_BIG_BOX = BoxItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_BIG_BOX = BoxItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_BIG_BOX = BoxItem(Blocks.MANGROVE_SLAB)
    val CHERRY_BIG_BOX = BoxItem(Blocks.CHERRY_SLAB)
    val BAMBOO_BIG_BOX = BoxItem(Blocks.BAMBOO_SLAB)
    val WARPED_BIG_BOX = BoxItem(Blocks.WARPED_SLAB)
    val CRIMSON_BIG_BOX = BoxItem(Blocks.CRIMSON_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.BIG_DRAWERS_BOXES.add(obj as BoxItem)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}