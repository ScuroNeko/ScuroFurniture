package ru.scuroneko.furniture.registry

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers

object ModItemGroups {
    val CARPENTER_GROUP = FabricItemGroup.builder()
        .icon { ItemStack(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER) }
        .displayName(Text.translatable("itemGroup.scuro_furniture.carpenter_group"))
        .entries { _, entries ->
            RegistryHelper.Items.ITEMS.forEach(entries::add)
            RegistryHelper.Blocks.BLOCKS.forEach(entries::add)
        }.build()

    fun register() {
        Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group"), CARPENTER_GROUP)
    }
}