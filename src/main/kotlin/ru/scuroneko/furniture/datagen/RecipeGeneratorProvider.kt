package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.recipe.book.RecipeCategory
import ru.scuroneko.furniture.carpenter.CarpenterBlocks
import ru.scuroneko.furniture.carpenter.CarpenterItems

class RecipeGeneratorProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: RecipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, CarpenterBlocks.CHERRY_MEDICAL_DRAWER)
            .pattern("bpb").pattern("ppp").pattern("bpb")
            .input('p', Blocks.CHERRY_PLANKS)
            .input('b', CarpenterItems.CHERRY_MEDICAL_DRAWER_BOX)
            .criterion(
                hasItem(CarpenterItems.CHERRY_MEDICAL_DRAWER_BOX),
                conditionsFromItem(CarpenterItems.CHERRY_MEDICAL_DRAWER_BOX)
            )
            .criterion(
                hasItem(Blocks.CHERRY_PLANKS),
                conditionsFromItem(Blocks.CHERRY_PLANKS)
            ).offerTo(exporter)
    }
}