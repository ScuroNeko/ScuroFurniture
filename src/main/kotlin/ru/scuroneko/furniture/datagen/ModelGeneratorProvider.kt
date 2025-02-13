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

        RegistryHelper.Blocks.SINGLE_DRAWERS.forEach(generator::registerStackableDrawer)

        RegistryHelper.Blocks.SHELVES.forEach(generator::registerShelf)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {
        val generator = FurnitureItemModelGenerator(itemModelGenerator)

        RegistryHelper.Items.SMALL_DRAWERS_BOXES.forEach(generator::registerSmallBox)
        RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach(generator::registerMediumDrawerBox)
        RegistryHelper.Items.BIG_DRAWERS_BOXES.forEach(generator::registerBigDrawerBox)

        RegistryHelper.Items.MEDIUM_DRAWERS_DOORS.forEach(generator::registerMediumDoor)
        RegistryHelper.Items.MEDIUM_DRAWERS_GLASS_DOORS.forEach(generator::registerMediumGlassDoor)
        RegistryHelper.Items.BIG_DRAWERS_DOORS.forEach(generator::registerBigDoor)

        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach(generator::registerMedicalCase)
        RegistryHelper.Items.BEDSIDE_DRAWERS_CASES.forEach(generator::registerBedsideDrawerCase)
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach(generator::registerKitchenDrawerCase)
        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach(generator::registerKitchenCabinetCase)

        RegistryHelper.Items.SINGLE_DRAWERS_CASES.forEach(generator::registerSingleDrawerDoorCase)
    }
}