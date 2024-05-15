package ru.scuroneko.furniture.registry

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents

object ModItemGroups {
    private val BLOCKS_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER) }
        .displayName(Text.translatable(Constants.Translatable.CARPENTER_GROUP))
        .entries { _, entries ->
            RegistryHelper.Blocks.BLOCKS.forEach(entries::add)
        }.build()

    private val ITEMS_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE) }
        .displayName(Text.translatable(Constants.Translatable.CARPENTER_ITEM_GROUP))
        .entries { _, entries ->
            RegistryHelper.Items.ITEMS.forEach(entries::add)
        }.build()

    fun register() {
        Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "blocks_group"), BLOCKS_GROUP)
        Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "items_group"), ITEMS_GROUP)
    }
}