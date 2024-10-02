package ru.scuroneko.furniture.api.datagen

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.conditionsFromItem
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider.hasItem
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import ru.scuroneko.furniture.blocks.*
import ru.scuroneko.furniture.item.*

class FurnitureRecipeExporter(private val exporter: RecipeExporter) {
    fun createMedicalDrawerBoxRecipe(box: BoxItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 4)
            .pattern("sps").pattern("p p").pattern("sps")
            .input('p', box.slab)
            .input('s', Items.STICK)
            .criterion(hasItem(box.slab), conditionsFromItem(box.slab))
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .group("medical_boxes")
            .offerTo(this.exporter)
    }

    fun createMediumDrawerBoxRecipe(box: BoxItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, box, 2)
            .pattern("ppp").pattern("s s").pattern("ppp")
            .input('p', box.slab).input('s', Items.STICK)
            .criterion(hasItem(box.slab), conditionsFromItem(box.slab))
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .group("medium_boxes")
            .offerTo(exporter)
    }

    fun createKitchenCabinetDoorRecipe(door: DoorItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, door, 2)
            .pattern("ss ").pattern("ss ").pattern("ss ")
            .input('s', door.slab)
            .criterion(hasItem(door.slab), conditionsFromItem(door.slab))
            .group("kitchen_cabinet_door")
            .offerTo(exporter)
    }

    fun createKitchenCabinetGlassDoorRecipe(door: DoorItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, door, 2)
            .pattern("ss ").pattern("sg ").pattern("ss ")
            .input('s', door.slab).input('g', Blocks.GLASS_PANE)
            .criterion(hasItem(door.slab), conditionsFromItem(door.slab))
            .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
            .group("kitchen_cabinet_door")
            .offerTo(exporter)
    }

    fun createMedicalDrawerCaseRecipe(case: MedicalDrawerCaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case, 4)
            .pattern(" s ").pattern("sws").pattern(" s ")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .group("medical_drawer_cases")
            .offerTo(this.exporter)
    }

    fun createMedicalDrawerRecipe(drawer: MedicalDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 4).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .group("medical_drawers")
            .offerTo(exporter)
    }

    fun createBedsideDrawerCaseRecipe(case: CaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case)
            .pattern("sss").pattern("wsw").pattern("www")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .group("bedside_drawer_cases")
            .offerTo(exporter)
    }

    fun createBedsideDrawerRecipe(drawer: BedsideDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 2).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .group("bedside_drawer")
            .offerTo(exporter)
    }

    fun createKitchenDrawerCaseRecipe(case: KitchenDrawerCaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case, 4)
            .pattern("ccc").pattern("wsw").pattern("www")
            .input('c', case.concrete).input('w', case.material).input('s', case.slab)
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.concrete), conditionsFromItem(case.concrete))
            .group("kitchen_drawer_cases")
            .offerTo(exporter)
    }

    fun createKitchenDrawerRecipe(drawer: KitchenDrawerBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, drawer)
            .input(drawer.box, 2).input(drawer.case)
            .criterion(hasItem(drawer.case), conditionsFromItem(drawer.case))
            .criterion(hasItem(drawer.box), conditionsFromItem(drawer.box))
            .group("kitchen_drawer")
            .offerTo(exporter)
    }

    fun createKitchenCabinetRecipe(cabinet: KitchenCabinetBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, cabinet)
            .input(cabinet.box, 2).input(cabinet.case)
            .criterion(hasItem(cabinet.case), conditionsFromItem(cabinet.case))
            .criterion(hasItem(cabinet.box), conditionsFromItem(cabinet.box))
            .group("kitchen_cabinet")
            .offerTo(exporter)
    }
    fun createKitchenGlassCabinetRecipe(cabinet: KitchenGlassCabinetBlock) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, cabinet)
            .input(cabinet.box, 2).input(cabinet.case)
            .criterion(hasItem(cabinet.case), conditionsFromItem(cabinet.case))
            .criterion(hasItem(cabinet.box), conditionsFromItem(cabinet.box))
            .group("kitchen_glass_cabinet")
            .offerTo(exporter)
    }
    fun createKitchenCabinetCaseRecipe(case: CaseItem) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, case)
            .pattern("sws").pattern("wsw").pattern("www")
            .input('s', case.slab).input('w', case.material)
            .criterion(hasItem(case.slab), conditionsFromItem(case.slab))
            .criterion(hasItem(case.material), conditionsFromItem(case.material))
            .group("kitchen_cabinet_case")
            .offerTo(exporter)
    }

    fun createShelfRecipe(shelf: ShelfBlock) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, shelf)
            .pattern("ppp").pattern("s s")
            .input('p', shelf.slab).input('s', Items.STICK)
            .criterion(hasItem(shelf.slab), conditionsFromItem(shelf.slab))
            .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
            .group("shelves")
            .offerTo(exporter)
    }
}