package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.IItemContainer
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object BedsideDrawersComponents : IItemContainer {
    val OAK_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.OAK_PLANKS, Blocks.OAK_SLAB)
    val OAK_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.OAK_LOG, Blocks.OAK_SLAB)
    val STRIPPED_OAK_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_OAK_LOG, Blocks.OAK_SLAB)

    val SPRUCE_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB)
    val SPRUCE_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.SPRUCE_LOG, Blocks.SPRUCE_SLAB)
    val STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_SLAB)

    val BIRCH_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB)
    val BIRCH_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.BIRCH_LOG, Blocks.BIRCH_SLAB)
    val STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_SLAB)

    val CHERRY_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)
    val CHERRY_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB)
    val STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.add(obj as CaseItem)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}