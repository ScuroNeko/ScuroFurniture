package ru.scuroneko.furniture.datagen.recipes

import net.minecraft.block.Blocks
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.api.FurnitureRecipeExporter
import ru.scuroneko.furniture.registry.RegistryHelper

object MedicalDrawerRecipeGenerator {
    fun generate(exporter: FurnitureRecipeExporter) {
        RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.forEach { box ->
            exporter.createMedicalDrawerBoxRecipe(box)
        }
        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach { case ->
            exporter.createMedicalDrawerCaseRecipe(case)
        }
        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach { drawer ->
            println("$drawer(${drawer.case}, ${drawer.box})")
            exporter.createMedicalDrawerRecipe(drawer)
        }
    }
}