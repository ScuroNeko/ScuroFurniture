package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object SingleDrawerComponents : IItemContainer {
    val OAK_SINGLE_DRAWER_CASE = CaseItem(Blocks.OAK_PLANKS, Blocks.OAK_SLAB)
    val OAK_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.OAK_LOG, Blocks.OAK_SLAB)
    val STRIPPED_OAK_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_OAK_LOG, Blocks.OAK_SLAB)

    val SPRUCE_SINGLE_DRAWER_CASE = CaseItem(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB)
    val SPRUCE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.SPRUCE_LOG, Blocks.SPRUCE_SLAB)
    val STRIPPED_SPRUCE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_SLAB)

    val BIRCH_SINGLE_DRAWER_CASE = CaseItem(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB)
    val BIRCH_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.BIRCH_LOG, Blocks.BIRCH_SLAB)
    val STRIPPED_BIRCH_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_SLAB)

    val JUNGLE_SINGLE_DRAWER_CASE = CaseItem(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB)
    val JUNGLE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.JUNGLE_LOG, Blocks.JUNGLE_SLAB)
    val STRIPPED_JUNGLE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_SLAB)

    val ACACIA_SINGLE_DRAWER_CASE = CaseItem(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB)
    val ACACIA_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.ACACIA_LOG, Blocks.ACACIA_SLAB)
    val STRIPPED_ACACIA_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_SLAB)

    val DARK_OAK_SINGLE_DRAWER_CASE = CaseItem(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB)
    val DARK_OAK_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)
    val STRIPPED_DARK_OAK_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)

    val MANGROVE_SINGLE_DRAWER_CASE = CaseItem(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB)
    val MANGROVE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.MANGROVE_LOG, Blocks.MANGROVE_SLAB)
    val STRIPPED_MANGROVE_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_SLAB)

    val CHERRY_SINGLE_DRAWER_CASE = CaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)
    val CHERRY_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB)
    val STRIPPED_CHERRY_LOG_SINGLE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.SINGLE_DRAWERS_CASES.add(obj as CaseItem)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}