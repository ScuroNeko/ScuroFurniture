package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.api.FurnitureRecipeExporter

class RecipeGeneratorProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(recipeExporter: RecipeExporter) {
        val exporter = FurnitureRecipeExporter(recipeExporter)

        // Oak medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.OAK_MEDICAL_DRAWER_BOX, Blocks.OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.OAK_MEDICAL_DRAWER_CASE, Blocks.OAK_PLANKS, Blocks.OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.OAK_LOG_MEDICAL_DRAWER_CASE, Blocks.OAK_LOG, Blocks.OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_OAK_LOG, Blocks.OAK_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.OAK_MEDICAL_DRAWER,
            ModItems.OAK_MEDICAL_DRAWER_BOX, ModItems.OAK_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.OAK_LOG_MEDICAL_DRAWER,
            ModItems.OAK_MEDICAL_DRAWER_BOX, ModItems.OAK_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_OAK_LOG_MEDICAL_DRAWER,
            ModItems.OAK_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE
        )

        // Spruce medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.SPRUCE_MEDICAL_DRAWER_BOX, Blocks.SPRUCE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.SPRUCE_MEDICAL_DRAWER_CASE, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE, Blocks.SPRUCE_LOG, Blocks.SPRUCE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.SPRUCE_MEDICAL_DRAWER,
            ModItems.SPRUCE_MEDICAL_DRAWER_BOX, ModItems.SPRUCE_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.SPRUCE_LOG_MEDICAL_DRAWER,
            ModItems.SPRUCE_MEDICAL_DRAWER_BOX, ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER,
            ModItems.SPRUCE_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE
        )

        // Birch medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.BIRCH_MEDICAL_DRAWER_BOX, Blocks.BIRCH_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.BIRCH_MEDICAL_DRAWER_CASE, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE, Blocks.BIRCH_LOG, Blocks.BIRCH_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.BIRCH_MEDICAL_DRAWER,
            ModItems.BIRCH_MEDICAL_DRAWER_BOX, ModItems.BIRCH_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.BIRCH_LOG_MEDICAL_DRAWER,
            ModItems.BIRCH_MEDICAL_DRAWER_BOX, ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER,
            ModItems.BIRCH_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE
        )

        // Jungle medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.JUNGLE_MEDICAL_DRAWER_BOX, Blocks.JUNGLE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.JUNGLE_MEDICAL_DRAWER_CASE, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE, Blocks.JUNGLE_LOG, Blocks.JUNGLE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.JUNGLE_MEDICAL_DRAWER,
            ModItems.JUNGLE_MEDICAL_DRAWER_BOX, ModItems.JUNGLE_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.JUNGLE_LOG_MEDICAL_DRAWER,
            ModItems.JUNGLE_MEDICAL_DRAWER_BOX, ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER,
            ModItems.JUNGLE_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE
        )

        // Acacia medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.ACACIA_MEDICAL_DRAWER_BOX, Blocks.ACACIA_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.ACACIA_MEDICAL_DRAWER_CASE, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE, Blocks.ACACIA_LOG, Blocks.ACACIA_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.ACACIA_MEDICAL_DRAWER,
            ModItems.ACACIA_MEDICAL_DRAWER_BOX, ModItems.ACACIA_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.ACACIA_LOG_MEDICAL_DRAWER,
            ModItems.ACACIA_MEDICAL_DRAWER_BOX, ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER,
            ModItems.ACACIA_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE
        )

        // Dark oak medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.DARK_OAK_MEDICAL_DRAWER_BOX, Blocks.DARK_OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.DARK_OAK_MEDICAL_DRAWER_CASE, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.DARK_OAK_MEDICAL_DRAWER,
            ModItems.DARK_OAK_MEDICAL_DRAWER_BOX, ModItems.DARK_OAK_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.DARK_OAK_LOG_MEDICAL_DRAWER,
            ModItems.DARK_OAK_MEDICAL_DRAWER_BOX, ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER,
            ModItems.DARK_OAK_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE
        )

        // Mangrove medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.MANGROVE_MEDICAL_DRAWER_BOX, Blocks.MANGROVE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.MANGROVE_MEDICAL_DRAWER_CASE, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE, Blocks.MANGROVE_LOG, Blocks.MANGROVE_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.MANGROVE_MEDICAL_DRAWER,
            ModItems.MANGROVE_MEDICAL_DRAWER_BOX, ModItems.MANGROVE_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.MANGROVE_LOG_MEDICAL_DRAWER,
            ModItems.MANGROVE_MEDICAL_DRAWER_BOX, ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER,
            ModItems.MANGROVE_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE
        )

        // Cherry medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.CHERRY_MEDICAL_DRAWER_BOX, Blocks.CHERRY_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.CHERRY_MEDICAL_DRAWER_CASE, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE, Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.CHERRY_MEDICAL_DRAWER,
            ModItems.CHERRY_MEDICAL_DRAWER_BOX, ModItems.CHERRY_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.CHERRY_LOG_MEDICAL_DRAWER,
            ModItems.CHERRY_MEDICAL_DRAWER_BOX, ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER,
            ModItems.CHERRY_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE
        )

        // Bamboo medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.BAMBOO_MEDICAL_DRAWER_BOX, Blocks.BAMBOO_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.BAMBOO_MEDICAL_DRAWER_CASE, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.BAMBOO_MEDICAL_DRAWER,
            ModItems.BAMBOO_MEDICAL_DRAWER_BOX, ModItems.BAMBOO_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.BAMBOO_BLOCK_MEDICAL_DRAWER,
            ModItems.BAMBOO_MEDICAL_DRAWER_BOX, ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER,
            ModItems.BAMBOO_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE
        )

        // Crimson medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.CRIMSON_MEDICAL_DRAWER_BOX, Blocks.CRIMSON_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.CRIMSON_MEDICAL_DRAWER_CASE, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE, Blocks.CRIMSON_STEM, Blocks.CRIMSON_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.CRIMSON_MEDICAL_DRAWER,
            ModItems.CRIMSON_MEDICAL_DRAWER_BOX, ModItems.CRIMSON_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.CRIMSON_STEM_MEDICAL_DRAWER,
            ModItems.CRIMSON_MEDICAL_DRAWER_BOX, ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER,
            ModItems.CRIMSON_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE
        )

        // Warped medical drawer
        exporter.createMedicalDrawerBoxRecipe(
            ModItems.WARPED_MEDICAL_DRAWER_BOX, Blocks.WARPED_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.WARPED_MEDICAL_DRAWER_CASE, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE, Blocks.WARPED_STEM, Blocks.WARPED_SLAB
        )
        exporter.createMedicalDrawerCaseRecipe(
            ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE, Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_SLAB
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.WARPED_MEDICAL_DRAWER,
            ModItems.WARPED_MEDICAL_DRAWER_BOX, ModItems.WARPED_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.WARPED_STEM_MEDICAL_DRAWER,
            ModItems.WARPED_MEDICAL_DRAWER_BOX, ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE
        )
        exporter.createMedicalDrawerRecipe(
            ModBlocks.STRIPPED_WARPED_STEM_MEDICAL_DRAWER,
            ModItems.WARPED_MEDICAL_DRAWER_BOX, ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE
        )
    }
}