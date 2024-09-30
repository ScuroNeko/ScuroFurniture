package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import ru.scuroneko.furniture.api.registry.tag.ModItemTags
import ru.scuroneko.furniture.registry.RegistryHelper
import java.util.concurrent.CompletableFuture

class ItemTagGeneratorProvider(output: FabricDataOutput, completableFuture: CompletableFuture<WrapperLookup>) :
    ItemTagProvider(output, completableFuture) {
    override fun configure(wl: WrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.MEDIUM_BOXES).add(*RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.toTypedArray())
        getOrCreateTagBuilder(ModItemTags.MEDICAL_BOXES).add(*RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.toTypedArray())

        getOrCreateTagBuilder(ModItemTags.MEDICAL_DRAWERS_CASES).add(*RegistryHelper.Items.MEDICAL_DRAWERS_CASES.toTypedArray())
        getOrCreateTagBuilder(ModItemTags.BEDSIDE_DRAWERS_CASES).add(*RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.toTypedArray())
        getOrCreateTagBuilder(ModItemTags.KITCHEN_DRAWERS_CASES).add(*RegistryHelper.Items.KITCHEN_DRAWERS_CASES.toTypedArray())
        getOrCreateTagBuilder(ModItemTags.KITCHEN_CABINETS_CASES).add(*RegistryHelper.Items.KITCHEN_CABINETS_CASES.toTypedArray())
    }
}