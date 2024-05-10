package ru.scuroneko.furniture.api

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.conditionsFromItem
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.hasItem
import net.minecraft.block.Block
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.MedicalDrawerBlock
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

class FurnitureRecipeExporter(private val exporter: RecipeExporter) {
    fun createMedicalDrawerBoxRecipe(box: Item, slab: Block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 4)
            .pattern("sps").pattern("p p").pattern("sps")
            .input('p', slab)
            .input('s', Items.STICK)
            .criterion(
                hasItem(slab), conditionsFromItem(slab)
            ).criterion(
                hasItem(Items.STICK), conditionsFromItem(Items.STICK)
            ).offerTo(this.exporter)
    }

    fun createMedicalDrawerCaseRecipe(case: Item, wood: Block, slab: Block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case, 4)
            .pattern(" s ").pattern("sws").pattern(" s ")
            .input('s', slab).input('w', wood)
            .criterion(
                hasItem(slab), conditionsFromItem(slab)
            ).criterion(
                hasItem(wood), conditionsFromItem(wood)
            ).offerTo(this.exporter)
    }

    fun createMedicalDrawerRecipe(drawer: MedicalDrawerBlock, box: Item, case: Item) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, drawer)
            .input(box, 4).input(case)
            .criterion(
                hasItem(case), conditionsFromItem(case)
            ).criterion(
                hasItem(box), conditionsFromItem(box)
            ).offerTo(this.exporter)
    }

    fun createKitchenDrawerBoxRecipe(box: Item, slab: Block) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 2)
            .pattern("ppp").pattern("s s").pattern("ppp")
            .input('p', slab).input('s', Items.STICK)
            .criterion(
                hasItem(slab), conditionsFromItem(slab)
            ).criterion(
                hasItem(Items.STICK), conditionsFromItem(Items.STICK)
            ).offerTo(exporter)
    }

    fun createKitchenDrawerCaseRecipe(case: KitchenDrawerCaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case, 4)
            .pattern("ccc").pattern("wsw").pattern("www")
            .input('c', case.concrete).input('w', case.material).input('s', case.slab)
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.concrete), conditionsFromItem(case.concrete))
            .offerTo(exporter)
    }

    fun createKitchenDrawerRecipe(drawer: KitchenDrawerBlock, case: KitchenDrawerCaseItem, box: BoxItem) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, drawer)
            .criterion(hasItem(case), conditionsFromItem(case))
            .criterion(hasItem(box), conditionsFromItem(box))
            .input(box, 4).input(case).offerTo(exporter)
    }
}