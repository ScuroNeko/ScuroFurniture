package ru.scuroneko.furniture.api.datagen

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.conditionsFromItem
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.hasItem
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.RecipeProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import ru.scuroneko.furniture.blocks.*
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.item.MedicalDrawerCaseItem

class FurnitureRecipeExporter(private val exporter: RecipeExporter) {
    fun createMedicalDrawerBoxRecipe(box: BoxItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 4)
            .pattern("sps").pattern("p p").pattern("sps")
            .input('p', box.slab)
            .input('s', Items.STICK)
            .criterion(hasItem(box.slab), conditionsFromItem(box.slab))
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .offerTo(this.exporter)
    }

    fun createMediumDrawerBoxRecipe(box: BoxItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 2)
            .pattern("ppp").pattern("s s").pattern("ppp")
            .input('p', box.slab).input('s', Items.STICK)
            .criterion(
                hasItem(box.slab), conditionsFromItem(box.slab)
            ).criterion(
                hasItem(Items.STICK), conditionsFromItem(Items.STICK)
            ).offerTo(exporter)
    }

    fun createMedicalDrawerCaseRecipe(case: MedicalDrawerCaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case, 4)
            .pattern(" s ").pattern("sws").pattern(" s ")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .offerTo(this.exporter)
    }

    fun createMedicalDrawerRecipe(drawer: MedicalDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 4).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .offerTo(exporter)
    }

    fun createBedsideDrawerCaseRecipe(case: CaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case)
            .pattern("sss").pattern("wsw").pattern("www")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .offerTo(exporter)
    }

    fun createBedsideDrawerRecipe(drawer: BedsideDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 2).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .offerTo(exporter)
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

    fun createKitchenDrawerRecipe(drawer: KitchenDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 2).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .offerTo(exporter)
    }

    fun createKitchenCabinetCaseRecipe(case: CaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case)
            .pattern("sws").pattern("wsw").pattern("www")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .offerTo(exporter)
    }

    fun createLampRecipe(lamp: LampBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, lamp)
            .pattern("www").pattern("wgw").pattern("sfs")
            .input('w', lamp.wool).input('g', Blocks.GLOWSTONE)
            .input('s', lamp.slab).input('f', lamp.fence)
            .criterion(hasItem(lamp.wool), conditionsFromItem(lamp.wool))
            .criterion(hasItem(Blocks.GLOWSTONE), conditionsFromItem(Blocks.GLOWSTONE))
            .criterion(hasItem(lamp.slab), conditionsFromItem(lamp.slab))
            .criterion(hasItem(lamp.fence), conditionsFromItem(lamp.fence))
            .offerTo(exporter)
    }

    fun createSofaRecipe(sofa: SofaBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, sofa)
            .pattern(" p ").pattern("pwp").pattern("l l")
            .input('p', sofa.base).input('w', sofa.wool).input('l', sofa.leg)
            .criterion(hasItem(sofa.base), conditionsFromItem(sofa.base))
            .criterion(hasItem(sofa.wool), conditionsFromItem(sofa.wool))
            .criterion(hasItem(sofa.leg), conditionsFromItem(sofa.leg))
            .offerTo(exporter)
    }
}