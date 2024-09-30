package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.registry.tag.BlockTags
import ru.scuroneko.furniture.api.registry.tag.ModBlockTags
import ru.scuroneko.furniture.registry.RegistryHelper
import java.util.concurrent.CompletableFuture

class BlockTagGeneratorProvider(output: FabricDataOutput, completableFuture: CompletableFuture<WrapperLookup>) :
    BlockTagProvider(output, completableFuture) {
    override fun configure(wl: WrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(*RegistryHelper.Blocks.MEDICAL_DRAWERS.toTypedArray())
            .add(*RegistryHelper.Blocks.BEDSIDE_DRAWERS.toTypedArray())
            .add(*RegistryHelper.Blocks.KITCHEN_CABINETS.toTypedArray())
            .add(*RegistryHelper.Blocks.KITCHEN_DRAWERS.toTypedArray())
            .add(*RegistryHelper.Blocks.LAMPS.toTypedArray())
            .add(*RegistryHelper.Blocks.SOFAS.toTypedArray())
            .add(*RegistryHelper.Blocks.SHELVES.toTypedArray())


        getOrCreateTagBuilder(ModBlockTags.MEDICAL_DRAWERS).add(*RegistryHelper.Blocks.MEDICAL_DRAWERS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.BEDSIDE_DRAWERS).add(*RegistryHelper.Blocks.BEDSIDE_DRAWERS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.KITCHEN_DRAWERS).add(*RegistryHelper.Blocks.KITCHEN_DRAWERS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.KITCHEN_CABINETS).add(*RegistryHelper.Blocks.KITCHEN_CABINETS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.LAMPS).add(*RegistryHelper.Blocks.LAMPS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.SOFAS).add(*RegistryHelper.Blocks.SOFAS.toTypedArray())
        getOrCreateTagBuilder(ModBlockTags.SHELVES).add(*RegistryHelper.Blocks.SHELVES.toTypedArray())
    }
}