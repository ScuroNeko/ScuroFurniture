package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.registry.RegistryHelper

object SmallDrawersBoxes : IItemContainer {
    val OAK_SMALL_BOX = BoxItem(Blocks.OAK_SLAB)
    val SPRUCE_SMALL_BOX = BoxItem(Blocks.SPRUCE_SLAB)
    val BIRCH_SMALL_BOX = BoxItem(Blocks.BIRCH_SLAB)
    val JUNGLE_SMALL_BOX = BoxItem(Blocks.JUNGLE_SLAB)
    val ACACIA_SMALL_BOX = BoxItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_SMALL_BOX = BoxItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_SMALL_BOX = BoxItem(Blocks.MANGROVE_SLAB)
    val CHERRY_SMALL_BOX = BoxItem(Blocks.CHERRY_SLAB)
    val BAMBOO_SMALL_BOX = BoxItem(Blocks.BAMBOO_SLAB)
    val WARPED_SMALL_BOX = BoxItem(Blocks.WARPED_SLAB)
    val CRIMSON_SMALL_BOX = BoxItem(Blocks.CRIMSON_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.SMALL_DRAWERS_BOXES.add(obj as BoxItem)
    }
}