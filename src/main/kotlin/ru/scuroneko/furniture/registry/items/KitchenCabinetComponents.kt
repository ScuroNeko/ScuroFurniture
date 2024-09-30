package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.autoregistry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object KitchenCabinetComponents : IItemContainer {
    val CHERRY_KITCHEN_CABINET_DOOR = BoxItem(Blocks.CHERRY_SLAB)
    val CHERRY_KITCHEN_CABINET_GLASS_DOOR = BoxItem(Blocks.CHERRY_SLAB)

    //    val GLASS_CHERRY_KITCHEN_CABINET_DOOR = Block(null)
    val CHERRY_KITCHEN_CABINET_CASE = CaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)

    override fun afterEach(obj: Item) {
        if (obj is BoxItem) RegistryHelper.Items.KITCHEN_CABINET_DOORS.add(obj)
        if (obj is CaseItem) RegistryHelper.Items.KITCHEN_CABINETS_CASES.add(obj)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}