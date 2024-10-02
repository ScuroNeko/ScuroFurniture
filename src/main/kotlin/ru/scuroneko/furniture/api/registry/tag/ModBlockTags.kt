package ru.scuroneko.furniture.api.registry.tag

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture

object ModBlockTags {
    val MEDICAL_DRAWERS: TagKey<Block> =
        TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "medical_drawers"))
    val BEDSIDE_DRAWERS: TagKey<Block> =
        TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "bedside_drawers"))
    val KITCHEN_DRAWERS: TagKey<Block> =
        TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "kitchen_drawers"))
    val KITCHEN_CABINETS: TagKey<Block> =
        TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "kitchen_cabinets"))
    val SINGLE_DRAWERS: TagKey<Block> =
        TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "single_drawers"))

    val SHELVES: TagKey<Block> = TagKey.of(RegistryKeys.BLOCK, Identifier.of(ScuroFurniture.MOD_ID, "shelves"))
}