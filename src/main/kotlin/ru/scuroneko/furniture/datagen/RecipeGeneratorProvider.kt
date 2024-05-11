package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import ru.scuroneko.furniture.api.FurnitureRecipeExporter
import ru.scuroneko.furniture.datagen.recipes.KitchenDrawerRecipeGenerator
import ru.scuroneko.furniture.datagen.recipes.MedicalDrawerRecipeGenerator

class RecipeGeneratorProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(recipeExporter: RecipeExporter) {
        val exporter = FurnitureRecipeExporter(recipeExporter)

        MedicalDrawerRecipeGenerator.generate(exporter)
//        KitchenDrawerRecipeGenerator.generate(exporter)
    }
}