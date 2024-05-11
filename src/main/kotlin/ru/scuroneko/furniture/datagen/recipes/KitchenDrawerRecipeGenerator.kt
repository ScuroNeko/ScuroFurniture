package ru.scuroneko.furniture.datagen.recipes

import ru.scuroneko.furniture.api.FurnitureRecipeExporter
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object KitchenDrawerRecipeGenerator {
    fun generate(exporter: FurnitureRecipeExporter) {
        // Cherry kitchen drawers
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach { case ->
            exporter.createKitchenDrawerCaseRecipe(case)
        }
        RegistryHelper.Items.KITCHEN_DRAWERS_BOXES.forEach { box ->
            exporter.createKitchenDrawerBoxRecipe(box, box.slab)
        }
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach { drawer ->
            exporter.createKitchenDrawerRecipe(drawer, drawer.case as KitchenDrawerCaseItem, drawer.box)
        }
    }
}