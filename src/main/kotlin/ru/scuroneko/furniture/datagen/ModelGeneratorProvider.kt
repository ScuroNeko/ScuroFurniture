package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Blocks
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.api.datagen.generators.FurnitureBlockStateModelGenerator
import ru.scuroneko.furniture.api.datagen.generators.FurnitureItemModelGenerator
import ru.scuroneko.furniture.registry.RegistryHelper

class ModelGeneratorProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(blockGenerator: BlockStateModelGenerator) {
        val generator = FurnitureBlockStateModelGenerator(blockGenerator)

        generator.registerSofa(ModBlocks.WHITE_CHERRY_SOFA)
        generator.registerSofa(ModBlocks.BLACK_CHERRY_SOFA)

        generator.registerLamp(
            ModBlocks.WHITE_OAK_LAMP,
            Blocks.WHITE_WOOL,
            Blocks.OAK_PLANKS,
            Blocks.STRIPPED_OAK_LOG
        )
        generator.registerLamp(
            ModBlocks.BLACK_OAK_LAMP,
            Blocks.BLACK_WOOL,
            Blocks.OAK_PLANKS,
            Blocks.STRIPPED_OAK_LOG
        )

        generator.registerLamp(
            ModBlocks.WHITE_CHERRY_LAMP,
            Blocks.WHITE_WOOL,
            Blocks.CHERRY_PLANKS,
            Blocks.STRIPPED_CHERRY_LOG
        )
        generator.registerLamp(
            ModBlocks.BLACK_CHERRY_LAMP,
            Blocks.BLACK_WOOL,
            Blocks.CHERRY_PLANKS,
            Blocks.STRIPPED_CHERRY_LOG
        )

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach(generator::registerMedicalDrawer)
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach(generator::registerBedsideTable)
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach(generator::registerKitchenDrawer)
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach(generator::registerKitchenCabinet)
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