package ru.scuroneko.furniture

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {
    val CARPENTER_GROUP = FabricItemGroup.builder()
        .icon { ItemStack(ModBlocks.BLACK_CHERRY_KITCHEN_DRAWER) }
        .displayName(Text.translatable("itemGroup.scuro_furniture.carpenter_group"))
        .entries { _, entries ->
            ModItems.ITEMS.forEach { (_, item) ->
                entries.add(item)
            }
            ModBlocks.BLOCKS.forEach { (_, block) ->
                entries.add(block)
            }
        }.build()

    fun register() {
        Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group"), CARPENTER_GROUP)
    }
}