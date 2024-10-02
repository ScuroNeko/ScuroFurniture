package ru.scuroneko.furniture.api.registry.tag

import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture

object ModItemTags {
    val SMALL_BOXES: TagKey<Item> = TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "medical_boxes"))
    val MEDIUM_BOXES: TagKey<Item> = TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "medium_boxes"))

    val MEDIUM_DRAWER_DOORS: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "medium_drawer_doors"))
    val MEDIUM_DRAWER_GLASS_DOORS: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "medium_drawer_glass_doors"))
    val BIG_DRAWER_DOORS: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "big_drawer_doors"))

    val MEDICAL_DRAWERS_CASES: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "medical_drawers_cases"))
    val BEDSIDE_DRAWERS_CASES: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "bedside_drawers_cases"))
    val KITCHEN_DRAWERS_CASES: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "kitchen_drawers_cases"))
    val KITCHEN_CABINETS_CASES: TagKey<Item> =
        TagKey.of(RegistryKeys.ITEM, Identifier.of(ScuroFurniture.MOD_ID, "kitchen_cabinets_cases"))
}