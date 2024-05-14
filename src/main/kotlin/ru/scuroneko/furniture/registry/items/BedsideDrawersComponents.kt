package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.IItemContainer
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object BedsideDrawersComponents : IItemContainer {
    val CHERRY_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)
    val CHERRY_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB)
    val STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER_CASE = CaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB)

    override fun afterEach(obj: Item) {
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.add(obj as CaseItem)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}