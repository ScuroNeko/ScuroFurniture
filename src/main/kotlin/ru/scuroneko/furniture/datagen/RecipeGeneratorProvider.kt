package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.api.datagen.FurnitureRecipeExporter
import ru.scuroneko.furniture.registry.RegistryHelper
import java.util.concurrent.CompletableFuture

class RecipeGeneratorProvider(output: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricRecipeProvider(output, lookup) {
    override fun generate(recipeExporter: RecipeExporter) {
        val exporter = FurnitureRecipeExporter(recipeExporter)

        RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.forEach(exporter::createMedicalDrawerBoxRecipe)
        RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach(exporter::createMediumDrawerBoxRecipe)
        RegistryHelper.Items.KITCHEN_CABINET_DOORS.forEach(exporter::createKitchenCabinetDoorRecipe)
        RegistryHelper.Items.KITCHEN_CABINET_GLASS_DOORS.forEach(exporter::createKitchenCabinetGlassDoorRecipe)

        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach(exporter::createMedicalDrawerCaseRecipe)
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.forEach(exporter::createBedsideDrawerCaseRecipe)
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach(exporter::createKitchenDrawerCaseRecipe)
        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach(exporter::createKitchenCabinetCaseRecipe)

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach(exporter::createMedicalDrawerRecipe)
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach(exporter::createBedsideDrawerRecipe)
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach(exporter::createKitchenDrawerRecipe)
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach(exporter::createKitchenCabinetRecipe)
        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.forEach(exporter::createKitchenGlassCabinetRecipe)
        RegistryHelper.Blocks.SHELVES.forEach(exporter::createShelfRecipe)
    }
}