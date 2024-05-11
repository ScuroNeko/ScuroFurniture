package ru.scuroneko.furniture

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers
import ru.scuroneko.furniture.registry.RegistryHelper

object ModItemGroups {
    val CARPENTER_GROUP = FabricItemGroup.builder()
        .icon { ItemStack(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER) }
        .displayName(Text.translatable("itemGroup.scuro_furniture.carpenter_group"))
        .entries { _, entries ->
            RegistryHelper.Items.ITEMS.values.forEach(entries::add)
            RegistryHelper.Blocks.BLOCKS.values.forEach(entries::add)
        }.build()

    fun register() {
        Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group"), CARPENTER_GROUP)
    }
}