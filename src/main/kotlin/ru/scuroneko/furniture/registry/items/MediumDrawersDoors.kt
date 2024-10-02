package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.registry.RegistryHelper

object MediumDrawersDoors : IItemContainer {
    val OAK_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.OAK_SLAB)
    val SPRUCE_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.SPRUCE_SLAB)
    val BIRCH_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.BIRCH_SLAB)
    val JUNGLE_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.JUNGLE_SLAB)
    val ACACIA_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.MANGROVE_SLAB)
    val BAMBOO_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.BAMBOO_SLAB)
    val CHERRY_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.CHERRY_SLAB)
    val CRIMSON_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.CRIMSON_SLAB)
    val WARPED_MEDIUM_DRAWER_DOOR = DoorItem(Blocks.WARPED_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.MEDIUM_DRAWERS_DOORS.add(obj as DoorItem)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}