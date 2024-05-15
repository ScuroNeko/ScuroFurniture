package ru.scuroneko.furniture.api.registry.tag

import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture

object ModItemTags {
    val MEDICAL_BOXES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_boxes"))
    val MEDIUM_BOXES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medium_boxes"))

    val MEDICAL_DRAWERS_CASES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_drawers_cases"))

    val MEDICAL_DRAWERS = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_drawers"))
}