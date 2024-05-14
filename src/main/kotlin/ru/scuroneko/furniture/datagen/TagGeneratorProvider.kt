package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.registry.RegistryHelper
import java.util.concurrent.CompletableFuture

class TagGeneratorProvider(output: FabricDataOutput, completableFuture: CompletableFuture<WrapperLookup>): ItemTagProvider(output, completableFuture) {
    val MEDIUM_BOXES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medium_boxes"))
    val MEDICAL_DRAWERS_CASES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_drawers_cases"))
    val MEDICAL_BOXES = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_boxes"))
    val MEDICAL_DRAWERS = TagKey.of(RegistryKeys.ITEM, Identifier(ScuroFurniture.MOD_ID, "medical_drawers"))

    override fun configure(wl: WrapperLookup) {
        getOrCreateTagBuilder(MEDIUM_BOXES).add(*RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.toTypedArray())
        getOrCreateTagBuilder(MEDICAL_BOXES).add(*RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.toTypedArray())

        getOrCreateTagBuilder(MEDICAL_DRAWERS_CASES).add(*RegistryHelper.Items.MEDICAL_DRAWERS_CASES.toTypedArray())

        getOrCreateTagBuilder(MEDICAL_DRAWERS).add(*RegistryHelper.Items.MEDICAL_DRAWERS.toTypedArray())
    }
}