package ru.scuroneko.furniture.registry

import net.minecraft.item.Item
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.asakusalib.api.registry.IItemContainer

object KitchenDrawersComponents: IItemContainer {
    val BOX_LIST = mutableListOf<BoxItem>()
    val CASE_LIST = mutableListOf<KitchenDrawerCaseItem>()

    override fun onRegistry(item: Item) {
        if(item is BoxItem) BOX_LIST.add(item)
        if(item is KitchenDrawerCaseItem) CASE_LIST.add(item)
    }
}