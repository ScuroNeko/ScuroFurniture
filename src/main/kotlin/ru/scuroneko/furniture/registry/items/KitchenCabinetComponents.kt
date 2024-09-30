package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object KitchenCabinetComponents : IItemContainer {
    val OAK_KITCHEN_CABINET_DOOR = BoxItem(Blocks.OAK_SLAB)
    val SPRUCE_KITCHEN_CABINET_DOOR = BoxItem(Blocks.SPRUCE_SLAB)
    val BIRCH_KITCHEN_CABINET_DOOR = BoxItem(Blocks.BIRCH_SLAB)
    val JUNGLE_KITCHEN_CABINET_DOOR = BoxItem(Blocks.JUNGLE_SLAB)
    val ACACIA_KITCHEN_CABINET_DOOR = BoxItem(Blocks.ACACIA_SLAB)
    val DARK_OAK_KITCHEN_CABINET_DOOR = BoxItem(Blocks.DARK_OAK_SLAB)
    val MANGROVE_KITCHEN_CABINET_DOOR = BoxItem(Blocks.MANGROVE_SLAB)
    val BAMBOO_KITCHEN_CABINET_DOOR = BoxItem(Blocks.BAMBOO_SLAB)

    val CHERRY_KITCHEN_CABINET_DOOR = BoxItem(Blocks.CHERRY_SLAB)

    val CHERRY_KITCHEN_CABINET_GLASS_DOOR = BoxItem(Blocks.CHERRY_SLAB)

    // Cabinet cases
    val OAK_KITCHEN_CABINET_CASE = CaseItem(Blocks.OAK_PLANKS, Blocks.OAK_SLAB)
    val OAK_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.OAK_LOG, Blocks.OAK_SLAB)
    val STRIPPED_OAK_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_OAK_LOG, Blocks.OAK_SLAB)

    val SPRUCE_KITCHEN_CABINET_CASE = CaseItem(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB)
    val SPRUCE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.SPRUCE_LOG, Blocks.SPRUCE_SLAB)
    val STRIPPED_SPRUCE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_SLAB)

    val BIRCH_KITCHEN_CABINET_CASE = CaseItem(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB)
    val BIRCH_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.BIRCH_LOG, Blocks.BIRCH_SLAB)
    val STRIPPED_BIRCH_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_SLAB)

    val JUNGLE_KITCHEN_CABINET_CASE = CaseItem(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB)
    val JUNGLE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.JUNGLE_LOG, Blocks.JUNGLE_SLAB)
    val STRIPPED_JUNGLE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_SLAB)

    val ACACIA_KITCHEN_CABINET_CASE = CaseItem(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB)
    val ACACIA_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.ACACIA_LOG, Blocks.ACACIA_SLAB)
    val STRIPPED_ACACIA_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_SLAB)

    val DARK_OAK_KITCHEN_CABINET_CASE = CaseItem(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB)
    val DARK_OAK_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)
    val STRIPPED_DARK_OAK_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)

    val MANGROVE_KITCHEN_CABINET_CASE = CaseItem(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB)
    val MANGROVE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.MANGROVE_LOG, Blocks.MANGROVE_SLAB)
    val STRIPPED_MANGROVE_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_SLAB)

    val CHERRY_KITCHEN_CABINET_CASE = CaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)
    val CHERRY_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB)
    val STRIPPED_CHERRY_LOG_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB)

    val BAMBOO_KITCHEN_CABINET_CASE = CaseItem(Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB)
    val BAMBOO_BLOCK_KITCHEN_CABINET_CASE = CaseItem(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_SLAB)
    val STRIPPED_BAMBOO_BLOCK_KITCHEN_CABINET_CASE = CaseItem(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_SLAB)
    val BAMBOO_MOSAIC_KITCHEN_CABINET_CASE = CaseItem(Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_SLAB)

    override fun afterEach(obj: Item) {
        if (obj is BoxItem) RegistryHelper.Items.KITCHEN_CABINET_DOORS.add(obj)
        if (obj is CaseItem) RegistryHelper.Items.KITCHEN_CABINETS_CASES.add(obj)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}