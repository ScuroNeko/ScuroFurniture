package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Blocks
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.api.FurnitureBlockStateModelGenerator
import ru.scuroneko.furniture.api.FurnitureItemModelGenerator

class ModelGeneratorProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockGenerator: BlockStateModelGenerator) {
        val generator = FurnitureBlockStateModelGenerator(blockGenerator)

        ModBlocks.MEDICAL_DRAWERS.forEach { (_, block) -> generator.registerMedicalDrawer(block) }
        ModBlocks.BEDSIDE_TABLES.forEach { (_, block) -> generator.registerBedsideTable(block) }
        ModBlocks.KITCHEN_DRAWERS.forEach { (_, block) -> generator.registerKitchenDrawer(block) }
        ModBlocks.KITCHEN_CABINETS.forEach { (_, block) -> generator.registerKitchenCabinet(block) }
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        val generator = FurnitureItemModelGenerator(itemModelGenerator)
        
        generator.registerMedicalBox(ModItems.OAK_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.OAK_PLANKS, ModItems.OAK_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.OAK_LOG, ModItems.OAK_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_OAK_LOG, ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.SPRUCE_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.SPRUCE_PLANKS, ModItems.SPRUCE_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.SPRUCE_LOG, ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_SPRUCE_LOG, ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.BIRCH_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.BIRCH_PLANKS, ModItems.BIRCH_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.BIRCH_LOG, ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_BIRCH_LOG, ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.JUNGLE_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.JUNGLE_PLANKS, ModItems.JUNGLE_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.JUNGLE_LOG, ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_JUNGLE_LOG, ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.ACACIA_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.ACACIA_PLANKS, ModItems.ACACIA_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.ACACIA_LOG, ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_ACACIA_LOG, ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.DARK_OAK_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.DARK_OAK_PLANKS, ModItems.DARK_OAK_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.DARK_OAK_LOG, ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_DARK_OAK_LOG, ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.MANGROVE_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.MANGROVE_PLANKS, ModItems.MANGROVE_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.MANGROVE_LOG, ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_MANGROVE_LOG, ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.CHERRY_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.CHERRY_PLANKS, ModItems.CHERRY_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.CHERRY_LOG, ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_CHERRY_LOG, ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.BAMBOO_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.BAMBOO_PLANKS, ModItems.BAMBOO_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.BAMBOO_BLOCK, ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_BAMBOO_BLOCK, ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.CRIMSON_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.CRIMSON_PLANKS, ModItems.CRIMSON_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.CRIMSON_STEM, ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_CRIMSON_STEM, ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE)

        generator.registerMedicalBox(ModItems.WARPED_MEDICAL_DRAWER_BOX)
        generator.registerMedicalCase(Blocks.WARPED_PLANKS, ModItems.WARPED_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.WARPED_STEM, ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE)
        generator.registerMedicalCase(Blocks.STRIPPED_WARPED_STEM, ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE)

        ModBlocks.MEDICAL_DRAWERS_ITEMS.forEach { (_, item) -> generator.registerMedicalDrawer(item) }
        ModBlocks.BEDSIDE_TABLES_ITEMS.forEach { (_, item) -> generator.registerBedsideTable(item) }
        ModBlocks.KITCHEN_DRAWERS_ITEMS.forEach { (_, item) -> generator.registerKitchenDrawer(item) }
        ModBlocks.KITCHEN_CABINETS_ITEMS.forEach { (_, item) -> generator.registerKitchenCabinet(item) }
    }
}