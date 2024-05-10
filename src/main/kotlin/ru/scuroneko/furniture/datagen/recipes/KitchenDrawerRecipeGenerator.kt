package ru.scuroneko.furniture.datagen.recipes

import net.minecraft.block.Blocks
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.api.FurnitureRecipeExporter
import ru.scuroneko.furniture.registry.RegistryHelper

object KitchenDrawerRecipeGenerator {
    fun generate(exporter: FurnitureRecipeExporter) {
        // Cherry kitchen drawers
        exporter.createKitchenDrawerBoxRecipe(ModItems.CHERRY_KITCHEN_DRAWER_BOX, Blocks.CHERRY_SLAB)
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach { (_, case) ->
            exporter.createKitchenDrawerCaseRecipe(case)
        }
        exporter.createKitchenDrawerRecipe(
            ModBlocks.WHITE_CHERRY_KITCHEN_DRAWER,
            ModItems.WHITE_CHERRY_KITCHEN_DRAWER_CASE,
            ModItems.CHERRY_KITCHEN_DRAWER_BOX
        )
        exporter.createKitchenDrawerRecipe(
            ModBlocks.BLACK_CHERRY_KITCHEN_DRAWER,
            ModItems.BLACK_CHERRY_KITCHEN_DRAWER_CASE,
            ModItems.CHERRY_KITCHEN_DRAWER_BOX
        )
    }
}