package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import ru.scuroneko.furniture.api.datagen.generators.FurnitureBlockStateModelGenerator
import ru.scuroneko.furniture.api.datagen.generators.FurnitureItemModelGenerator
import ru.scuroneko.furniture.registry.RegistryHelper

class ModelGeneratorProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockGenerator: BlockStateModelGenerator) {
        val generator = FurnitureBlockStateModelGenerator(blockGenerator)

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach(generator::registerMedicalDrawer)
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach(generator::registerBedsideTable)
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach(generator::registerKitchenDrawer)
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach(generator::registerKitchenCabinet)
        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.forEach(generator::registerKitchenGlassCabinet)
        RegistryHelper.Blocks.LAMPS.forEach(generator::registerLamp)
        RegistryHelper.Blocks.SOFAS.forEach(generator::registerSofa)

        RegistryHelper.Blocks.SHELVES.forEach(generator::registerShelf)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        val generator = FurnitureItemModelGenerator(itemModelGenerator)

        RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.forEach(generator::registerMedicalBox)
        RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach(generator::registerKitchenDrawerBox)
        RegistryHelper.Items.KITCHEN_CABINET_DOORS.forEach(generator::registerCabinetDoor)

        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach(generator::registerMedicalCase)
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.forEach(generator::registerBedsideDrawerCase)
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach(generator::registerKitchenDrawerCase)
        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach(generator::registerKitchenCabinetCase)
    }
}