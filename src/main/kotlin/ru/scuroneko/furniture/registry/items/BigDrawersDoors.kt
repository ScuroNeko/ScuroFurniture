package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.registry.RegistryHelper

object BigDrawersDoors : IItemContainer {
    val OAK_BIG_DRAWER_DOOR = DoorItem(Blocks.OAK_SLAB)
    val SPRUCE_BIG_DRAWER_DOOR = DoorItem(Blocks.SPRUCE_SLAB)
    val BIRCH_BIG_DRAWER_DOOR = DoorItem(Blocks.BIRCH_SLAB)
    val JUNGLE_BIG_DRAWER_DOOR = DoorItem(Blocks.JUNGLE_SLAB)
    val ACACIA_BIG_DRAWER_DOOR = DoorItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_BIG_DRAWER_DOOR = DoorItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_BIG_DRAWER_DOOR = DoorItem(Blocks.MANGROVE_SLAB)
    val CHERRY_BIG_DRAWER_DOOR = DoorItem(Blocks.CHERRY_SLAB)
    val BAMBOO_BIG_DRAWER_DOOR = DoorItem(Blocks.BAMBOO_SLAB)
    val CRIMSON_BIG_DRAWER_DOOR = DoorItem(Blocks.CRIMSON_SLAB)
    val WARPED_BIG_DRAWER_DOOR = DoorItem(Blocks.WARPED_SLAB)

    override fun afterEach(obj: Item) {
        if (obj is DoorItem) RegistryHelper.Items.BIG_DRAWERS_DOORS.add(obj)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}