package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.KitchenCabinetComponents
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes
import java.util.concurrent.CompletableFuture

class EnglishLangProvider(output: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricLanguageProvider(output, lookup) {
    override fun generateTranslations(registryLookup: RegistryWrapper.WrapperLookup, builder: TranslationBuilder) {
        builder.add(
            Constants.Translatable.CARPENTER_GROUP, "Scuro's Furniture"
        )
        builder.add(
            Constants.Translatable.CARPENTER_ITEM_GROUP, "Scuro's Furniture Items"
        )

        builder.add(Constants.Translatable.MEDICAL_DRAWER, "Medical drawer")
        builder.add(Constants.Translatable.BEDSIDE_DRAWER, "Bedside drawer")
        builder.add(Constants.Translatable.KITCHEN_DRAWER, "Kitchen drawer")

        // Medical boxes
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_BOX, "Oak medical box")
        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_BOX, "Spruce medical box")
        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_BOX, "Birch medical box")
        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_BOX, "Jungle medical box")
        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_BOX, "Acacia medical box")
        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_BOX, "Dark oak medical box")
        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_BOX, "Mangrove medical box")
        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_BOX, "Cherry medical box")
        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_BOX, "Bamboo medical box")
        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_BOX, "Crimson medical box")
        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_BOX, "Warped medical box")

        // Medical drawers
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE, "Oak medical drawer case")
        builder.add(MedicalDrawersComponents.OAK_LOG_MEDICAL_DRAWER_CASE, "Oak log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE, "Stripped oak log medical drawer case"
        )
        builder.add(MedicalDrawers.OAK_MEDICAL_DRAWER, "Oak medical drawer")
        builder.add(MedicalDrawers.OAK_LOG_MEDICAL_DRAWER, "Oak log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Stripped oak log medical drawer")

        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_DRAWER_CASE, "Spruce medical drawer case")
        builder.add(MedicalDrawersComponents.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Spruce log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Stripped spruce log medical drawer case"
        )
        builder.add(MedicalDrawers.SPRUCE_MEDICAL_DRAWER, "Spruce medical drawer")
        builder.add(MedicalDrawers.SPRUCE_LOG_MEDICAL_DRAWER, "Spruce log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Stripped spruce log medical drawer")

        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_DRAWER_CASE, "Birch medical drawer case")
        builder.add(MedicalDrawersComponents.BIRCH_LOG_MEDICAL_DRAWER_CASE, "Birch log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE, "Stripped birch log medical drawer case"
        )
        builder.add(MedicalDrawers.BIRCH_MEDICAL_DRAWER, "Birch medical drawer")
        builder.add(MedicalDrawers.BIRCH_LOG_MEDICAL_DRAWER, "Birch log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER, "Stripped birch log medical drawer")


        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_DRAWER_CASE, "Jungle medical drawer case")
        builder.add(MedicalDrawersComponents.JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Jungle log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Stripped jungle log medical drawer case"
        )
        builder.add(MedicalDrawers.JUNGLE_MEDICAL_DRAWER, "Jungle medical drawer")
        builder.add(MedicalDrawers.JUNGLE_LOG_MEDICAL_DRAWER, "Jungle log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER, "Stripped jungle log medical drawer")

        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_DRAWER_CASE, "Acacia medical drawer case")
        builder.add(MedicalDrawersComponents.ACACIA_LOG_MEDICAL_DRAWER_CASE, "Acacia log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE, "Stripped acacia log medical drawer case"
        )
        builder.add(MedicalDrawers.ACACIA_MEDICAL_DRAWER, "Acacia medical drawer")
        builder.add(MedicalDrawers.ACACIA_LOG_MEDICAL_DRAWER, "Acacia log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER, "Stripped acacia log medical drawer")

        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_DRAWER_CASE, "Dark oak medical drawer case")
        builder.add(MedicalDrawersComponents.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Dark oak log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Stripped dark oak log medical drawer case"
        )
        builder.add(MedicalDrawers.DARK_OAK_MEDICAL_DRAWER, "Dark oak medical drawer")
        builder.add(MedicalDrawers.DARK_OAK_LOG_MEDICAL_DRAWER, "Dark oak log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER, "Stripped dark oak log medical drawer")

        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_DRAWER_CASE, "Mangrove medical drawer case")
        builder.add(MedicalDrawersComponents.MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Mangrove log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE,
            "Stripped mangrove log medical drawer case"
        )
        builder.add(MedicalDrawers.MANGROVE_MEDICAL_DRAWER, "Mangrove medical drawer")
        builder.add(MedicalDrawers.MANGROVE_LOG_MEDICAL_DRAWER, "Mangrove log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER, "Stripped mangrove log medical drawer")

        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE, "Cherry medical drawer case")
        builder.add(MedicalDrawersComponents.CHERRY_LOG_MEDICAL_DRAWER_CASE, "Cherry log medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE, "Stripped cherry log medical drawer case"
        )
        builder.add(MedicalDrawers.CHERRY_MEDICAL_DRAWER, "Cherry medical drawer")
        builder.add(MedicalDrawers.CHERRY_LOG_MEDICAL_DRAWER, "Cherry log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER, "Stripped cherry log medical drawer")

        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_DRAWER_CASE, "Bamboo medical drawer case")
        builder.add(MedicalDrawersComponents.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Bamboo block medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE,
            "Stripped bamboo block medical drawer case"
        )
        builder.add(MedicalDrawers.BAMBOO_MEDICAL_DRAWER, "Bamboo medical drawer")
        builder.add(MedicalDrawers.BAMBOO_BLOCK_MEDICAL_DRAWER, "Bamboo block medical drawer")
        builder.add(MedicalDrawers.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER, "Stripped bamboo block medical drawer")

        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_DRAWER_CASE, "Crimson medical drawer case")
        builder.add(MedicalDrawersComponents.CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Crimson stem medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE,
            "Stripped crimson stem medical drawer case"
        )
        builder.add(MedicalDrawers.CRIMSON_MEDICAL_DRAWER, "Crimson medical drawer")
        builder.add(MedicalDrawers.CRIMSON_STEM_MEDICAL_DRAWER, "Crimson stem medical drawer")
        builder.add(MedicalDrawers.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER, "Stripped crimson stem medical drawer")

        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_DRAWER_CASE, "Warped medical drawer case")
        builder.add(MedicalDrawersComponents.WARPED_STEM_MEDICAL_DRAWER_CASE, "Warped stem medical drawer case")
        builder.add(
            MedicalDrawersComponents.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE,
            "Stripped warped stem medical drawer case"
        )
        builder.add(MedicalDrawers.WARPED_MEDICAL_DRAWER, "Warped medical drawer")
        builder.add(MedicalDrawers.WARPED_STEM_MEDICAL_DRAWER, "Warped stem medical drawer")
        builder.add(MedicalDrawers.STRIPPED_WARPED_STEM_MEDICAL_DRAWER, "Stripped warped stem medical drawer")

        // Medium boxes
        builder.add(MediumDrawerBoxes.OAK_MEDIUM_DRAWER_BOX, "Oak medium box")
        builder.add(MediumDrawerBoxes.BIRCH_MEDIUM_DRAWER_BOX, "Birch medium box")
        builder.add(MediumDrawerBoxes.SPRUCE_MEDIUM_DRAWER_BOX, "Spruce medium box")
        builder.add(MediumDrawerBoxes.JUNGLE_MEDIUM_DRAWER_BOX, "Jungle medium box")
        builder.add(MediumDrawerBoxes.ACACIA_MEDIUM_DRAWER_BOX, "Acacia medium box")
        builder.add(MediumDrawerBoxes.DARK_OAK_MEDIUM_DRAWER_BOX, "Dark oak medium box")
        builder.add(MediumDrawerBoxes.MANGROVE_MEDIUM_DRAWER_BOX, "Mangrove medium box")
        builder.add(MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX, "Cherry medium box")
        builder.add(MediumDrawerBoxes.BAMBOO_MEDIUM_DRAWER_BOX, "Bamboo medium box")
        builder.add(MediumDrawerBoxes.CRIMSON_MEDIUM_DRAWER_BOX, "Crimson medium box")
        builder.add(MediumDrawerBoxes.WARPED_MEDIUM_DRAWER_BOX, "Warped medium box")

        // Bedside drawers
        builder.add(BedsideDrawersComponents.OAK_BEDSIDE_DRAWER_CASE, "Oak bedside drawer case")
        builder.add(
            BedsideDrawersComponents.OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Oak log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped oak log bedside drawer case"
        )
        builder.add(BedsideDrawers.OAK_BEDSIDE_DRAWER, "Oak bedside drawer")
        builder.add(BedsideDrawers.OAK_LOG_BEDSIDE_DRAWER, "Oak log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_OAK_LOG_BEDSIDE_DRAWER, "Stripped oak log bedside drawer")

        builder.add(BedsideDrawersComponents.SPRUCE_BEDSIDE_DRAWER_CASE, "Spruce bedside drawer case")
        builder.add(
            BedsideDrawersComponents.SPRUCE_LOG_BEDSIDE_DRAWER_CASE,
            "Spruce log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped spruce log bedside drawer case"
        )
        builder.add(BedsideDrawers.SPRUCE_BEDSIDE_DRAWER, "Spruce bedside drawer")
        builder.add(BedsideDrawers.SPRUCE_LOG_BEDSIDE_DRAWER, "Spruce log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER, "Stripped spruce log bedside drawer")

        builder.add(BedsideDrawersComponents.BIRCH_BEDSIDE_DRAWER_CASE, "Birch bedside drawer case")
        builder.add(
            BedsideDrawersComponents.BIRCH_LOG_BEDSIDE_DRAWER_CASE,
            "Birch log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped birch log bedside drawer case"
        )
        builder.add(BedsideDrawers.BIRCH_BEDSIDE_DRAWER, "Birch bedside drawer")
        builder.add(BedsideDrawers.BIRCH_LOG_BEDSIDE_DRAWER, "Birch log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER, "Stripped birch log bedside drawer")


        builder.add(BedsideDrawersComponents.JUNGLE_BEDSIDE_DRAWER_CASE, "Jungle bedside drawer case")
        builder.add(
            BedsideDrawersComponents.JUNGLE_LOG_BEDSIDE_DRAWER_CASE,
            "Jungle log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped jungle log bedside drawer case"
        )
        builder.add(BedsideDrawers.JUNGLE_BEDSIDE_DRAWER, "Jungle bedside drawer")
        builder.add(BedsideDrawers.JUNGLE_LOG_BEDSIDE_DRAWER, "Jungle log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER, "Stripped jungle log bedside drawer")


        builder.add(BedsideDrawersComponents.ACACIA_BEDSIDE_DRAWER_CASE, "Acacia bedside drawer case")
        builder.add(
            BedsideDrawersComponents.ACACIA_LOG_BEDSIDE_DRAWER_CASE,
            "Acacia log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped acacia log bedside drawer case"
        )
        builder.add(BedsideDrawers.ACACIA_BEDSIDE_DRAWER, "Acacia bedside drawer")
        builder.add(BedsideDrawers.ACACIA_LOG_BEDSIDE_DRAWER, "Acacia log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER, "Stripped acacia log bedside drawer")


        builder.add(BedsideDrawersComponents.DARK_OAK_BEDSIDE_DRAWER_CASE, "Dark oak bedside drawer case")
        builder.add(
            BedsideDrawersComponents.DARK_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Dark oak log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped dark oak log bedside drawer case"
        )
        builder.add(BedsideDrawers.DARK_OAK_BEDSIDE_DRAWER, "Dark oak bedside drawer")
        builder.add(BedsideDrawers.DARK_OAK_LOG_BEDSIDE_DRAWER, "Dark oak log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER, "Stripped dark oak log bedside drawer")

        builder.add(BedsideDrawersComponents.MANGROVE_BEDSIDE_DRAWER_CASE, "Mangrove bedside drawer case")
        builder.add(
            BedsideDrawersComponents.MANGROVE_LOG_BEDSIDE_DRAWER_CASE,
            "Mangrove log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped mangrove log bedside drawer case"
        )
        builder.add(BedsideDrawers.MANGROVE_BEDSIDE_DRAWER, "Mangrove bedside drawer")
        builder.add(BedsideDrawers.MANGROVE_LOG_BEDSIDE_DRAWER, "Mangrove log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER, "Stripped mangrove log bedside drawer")

        builder.add(BedsideDrawersComponents.CHERRY_BEDSIDE_DRAWER_CASE, "Cherry bedside drawer case")
        builder.add(
            BedsideDrawersComponents.CHERRY_LOG_BEDSIDE_DRAWER_CASE,
            "Cherry log bedside drawer case"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER_CASE,
            "Stripped cherry log bedside drawer case"
        )
        builder.add(BedsideDrawers.CHERRY_BEDSIDE_DRAWER, "Cherry bedside drawer")
        builder.add(BedsideDrawers.CHERRY_LOG_BEDSIDE_DRAWER, "Cherry log bedside drawer")
        builder.add(BedsideDrawers.STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER, "Stripped cherry log bedside drawer")

        // Kitchen drawers
        builder.add(KitchenDrawers.BLACK_OAK_KITCHEN_DRAWER, "Black oak kitchen drawer")
        builder.add(KitchenDrawers.WHITE_OAK_KITCHEN_DRAWER, "White oak kitchen drawer")
        builder.add(KitchenDrawers.BLACK_OAK_LOG_KITCHEN_DRAWER, "Black oak log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_OAK_LOG_KITCHEN_DRAWER, "White oak log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_OAK_LOG_KITCHEN_DRAWER, "Black stripped oak log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_OAK_LOG_KITCHEN_DRAWER, "White stripped oak log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_SPRUCE_KITCHEN_DRAWER, "Black spruce kitchen drawer")
        builder.add(KitchenDrawers.WHITE_SPRUCE_KITCHEN_DRAWER, "White spruce kitchen drawer")
        builder.add(KitchenDrawers.BLACK_SPRUCE_LOG_KITCHEN_DRAWER, "Black spruce log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_SPRUCE_LOG_KITCHEN_DRAWER, "White spruce log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER, "Black stripped spruce log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER, "White stripped spruce log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_BIRCH_KITCHEN_DRAWER, "Black birch kitchen drawer")
        builder.add(KitchenDrawers.WHITE_BIRCH_KITCHEN_DRAWER, "White birch kitchen drawer")
        builder.add(KitchenDrawers.BLACK_BIRCH_LOG_KITCHEN_DRAWER, "Black birch log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_BIRCH_LOG_KITCHEN_DRAWER, "White birch log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER, "Black stripped birch log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER, "White stripped birch log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_JUNGLE_KITCHEN_DRAWER, "Black jungle kitchen drawer")
        builder.add(KitchenDrawers.WHITE_JUNGLE_KITCHEN_DRAWER, "White jungle kitchen drawer")
        builder.add(KitchenDrawers.BLACK_JUNGLE_LOG_KITCHEN_DRAWER, "Black jungle log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_JUNGLE_LOG_KITCHEN_DRAWER, "White jungle log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER, "Black stripped jungle log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER, "White stripped jungle log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_ACACIA_KITCHEN_DRAWER, "Black acacia kitchen drawer")
        builder.add(KitchenDrawers.WHITE_ACACIA_KITCHEN_DRAWER, "White acacia kitchen drawer")
        builder.add(KitchenDrawers.BLACK_ACACIA_LOG_KITCHEN_DRAWER, "Black acacia log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_ACACIA_LOG_KITCHEN_DRAWER, "White acacia log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER, "Black stripped acacia log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER, "White stripped acacia log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_DARK_OAK_KITCHEN_DRAWER, "Black dark oak kitchen drawer")
        builder.add(KitchenDrawers.WHITE_DARK_OAK_KITCHEN_DRAWER, "White dark oak kitchen drawer")
        builder.add(KitchenDrawers.BLACK_DARK_OAK_LOG_KITCHEN_DRAWER, "Black dark oak log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_DARK_OAK_LOG_KITCHEN_DRAWER, "White dark oak log kitchen drawer")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER,
            "Black stripped dark oak log kitchen drawer"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER,
            "White stripped dark oak log kitchen drawer"
        )

        builder.add(KitchenDrawers.BLACK_MANGROVE_KITCHEN_DRAWER, "Black mangrove kitchen drawer")
        builder.add(KitchenDrawers.WHITE_MANGROVE_KITCHEN_DRAWER, "White mangrove kitchen drawer")
        builder.add(KitchenDrawers.BLACK_MANGROVE_LOG_KITCHEN_DRAWER, "Black mangrove log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_MANGROVE_LOG_KITCHEN_DRAWER, "White mangrove log kitchen drawer")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER,
            "Black stripped mangrove log kitchen drawer"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER,
            "White stripped mangrove log kitchen drawer"
        )

        builder.add(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER, "Black cherry kitchen drawer")
        builder.add(KitchenDrawers.WHITE_CHERRY_KITCHEN_DRAWER, "White cherry kitchen drawer")
        builder.add(KitchenDrawers.BLACK_CHERRY_LOG_KITCHEN_DRAWER, "Black cherry log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_CHERRY_LOG_KITCHEN_DRAWER, "White cherry log kitchen drawer")
        builder.add(KitchenDrawers.BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER, "Black stripped cherry log kitchen drawer")
        builder.add(KitchenDrawers.WHITE_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER, "White stripped cherry log kitchen drawer")

        builder.add(KitchenDrawers.BLACK_BAMBOO_KITCHEN_DRAWER, "Black bamboo kitchen drawer")
        builder.add(KitchenDrawers.WHITE_BAMBOO_KITCHEN_DRAWER, "White bamboo kitchen drawer")
        builder.add(KitchenDrawers.BLACK_BAMBOO_MOSAIC_KITCHEN_DRAWER, "Black bamboo mosaic kitchen drawer")
        builder.add(KitchenDrawers.WHITE_BAMBOO_MOSAIC_KITCHEN_DRAWER, "White bamboo mosaic kitchen drawer")
        builder.add(KitchenDrawers.BLACK_BAMBOO_BLOCK_KITCHEN_DRAWER, "Black bamboo block kitchen drawer")
        builder.add(KitchenDrawers.WHITE_BAMBOO_BLOCK_KITCHEN_DRAWER, "White bamboo block kitchen drawer")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_BAMBOO_BLOCK_KITCHEN_DRAWER,
            "Black stripped bamboo block kitchen drawer"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_BAMBOO_BLOCK_KITCHEN_DRAWER,
            "White stripped bamboo block kitchen drawer"
        )

        // Kitchen cabinets
        builder.add(KitchenCabinets.OAK_KITCHEN_CABINET, "Oak kitchen cabinet")
        builder.add(KitchenCabinets.OAK_LOG_KITCHEN_CABINET, "Oak log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_OAK_LOG_KITCHEN_CABINET, "Stripped oak log kitchen cabinet")

        builder.add(KitchenCabinets.SPRUCE_KITCHEN_CABINET, "Spruce kitchen cabinet")
        builder.add(KitchenCabinets.SPRUCE_LOG_KITCHEN_CABINET, "Spruce log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_SPRUCE_LOG_KITCHEN_CABINET, "Stripped spruce log kitchen cabinet")

        builder.add(KitchenCabinets.BIRCH_KITCHEN_CABINET, "Birch kitchen cabinet")
        builder.add(KitchenCabinets.BIRCH_LOG_KITCHEN_CABINET, "Birch log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_BIRCH_LOG_KITCHEN_CABINET, "Stripped birch log kitchen cabinet")

        builder.add(KitchenCabinets.JUNGLE_KITCHEN_CABINET, "Jungle kitchen cabinet")
        builder.add(KitchenCabinets.JUNGLE_LOG_KITCHEN_CABINET, "Jungle log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_JUNGLE_LOG_KITCHEN_CABINET, "Stripped jungle log kitchen cabinet")

        builder.add(KitchenCabinets.ACACIA_KITCHEN_CABINET, "Acacia kitchen cabinet")
        builder.add(KitchenCabinets.ACACIA_LOG_KITCHEN_CABINET, "Acacia log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_ACACIA_LOG_KITCHEN_CABINET, "Stripped acacia log kitchen cabinet")

        builder.add(KitchenCabinets.DARK_OAK_KITCHEN_CABINET, "Dark oak kitchen cabinet")
        builder.add(KitchenCabinets.DARK_OAK_LOG_KITCHEN_CABINET, "Dark oak log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_DARK_OAK_LOG_KITCHEN_CABINET, "Stripped dark oak log kitchen cabinet")

        builder.add(KitchenCabinets.MANGROVE_KITCHEN_CABINET, "Mangrove kitchen cabinet")
        builder.add(KitchenCabinets.MANGROVE_LOG_KITCHEN_CABINET, "Mangrove log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_MANGROVE_LOG_KITCHEN_CABINET, "Stripped mangrove log kitchen cabinet")

        builder.add(KitchenCabinets.CHERRY_KITCHEN_CABINET, "Cherry kitchen cabinet")
        builder.add(KitchenCabinets.CHERRY_LOG_KITCHEN_CABINET, "Cherry log kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_CHERRY_LOG_KITCHEN_CABINET, "Stripped cherry log kitchen cabinet")

        builder.add(KitchenCabinets.BAMBOO_KITCHEN_CABINET, "Bamboo kitchen cabinet")
        builder.add(KitchenCabinets.BAMBOO_BLOCK_KITCHEN_CABINET, "Bamboo block kitchen cabinet")
        builder.add(KitchenCabinets.STRIPPED_BAMBOO_BLOCK_KITCHEN_CABINET, "Stripped bamboo block kitchen cabinet")
        builder.add(KitchenCabinets.BAMBOO_MOSAIC_KITCHEN_CABINET, "Bamboo mosaic kitchen cabinet")

        builder.add(KitchenCabinetComponents.OAK_KITCHEN_CABINET_CASE, "Oak kitchen cabinet case")
        builder.add(KitchenCabinetComponents.OAK_LOG_KITCHEN_CABINET_CASE, "Oak log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_OAK_LOG_KITCHEN_CABINET_CASE, "Stripped oak log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.SPRUCE_KITCHEN_CABINET_CASE, "Spruce kitchen cabinet case")
        builder.add(KitchenCabinetComponents.SPRUCE_LOG_KITCHEN_CABINET_CASE, "Spruce log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_SPRUCE_LOG_KITCHEN_CABINET_CASE, "Stripped spruce log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.BIRCH_KITCHEN_CABINET_CASE, "Birch kitchen cabinet case")
        builder.add(KitchenCabinetComponents.BIRCH_LOG_KITCHEN_CABINET_CASE, "Birch log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_BIRCH_LOG_KITCHEN_CABINET_CASE, "Stripped birch log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.JUNGLE_KITCHEN_CABINET_CASE, "Jungle kitchen cabinet case")
        builder.add(KitchenCabinetComponents.JUNGLE_LOG_KITCHEN_CABINET_CASE, "Jungle log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_JUNGLE_LOG_KITCHEN_CABINET_CASE, "Stripped jungle log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.ACACIA_KITCHEN_CABINET_CASE, "Acacia kitchen cabinet case")
        builder.add(KitchenCabinetComponents.ACACIA_LOG_KITCHEN_CABINET_CASE, "Acacia log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_ACACIA_LOG_KITCHEN_CABINET_CASE, "Stripped acacia log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.DARK_OAK_KITCHEN_CABINET_CASE, "Dark oak kitchen cabinet case")
        builder.add(KitchenCabinetComponents.DARK_OAK_LOG_KITCHEN_CABINET_CASE, "Dark oak log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_DARK_OAK_LOG_KITCHEN_CABINET_CASE, "Stripped dark oak log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.MANGROVE_KITCHEN_CABINET_CASE, "Mangrove kitchen cabinet case")
        builder.add(KitchenCabinetComponents.MANGROVE_LOG_KITCHEN_CABINET_CASE, "Mangrove log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_MANGROVE_LOG_KITCHEN_CABINET_CASE, "Stripped mangrove log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_CASE, "Cherry kitchen cabinet case")
        builder.add(KitchenCabinetComponents.CHERRY_LOG_KITCHEN_CABINET_CASE, "Cherry log kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_CHERRY_LOG_KITCHEN_CABINET_CASE, "Stripped cherry log kitchen cabinet case")

        builder.add(KitchenCabinetComponents.BAMBOO_KITCHEN_CABINET_CASE, "Bamboo kitchen cabinet case")
        builder.add(KitchenCabinetComponents.BAMBOO_BLOCK_KITCHEN_CABINET_CASE, "Bamboo block kitchen cabinet case")
        builder.add(KitchenCabinetComponents.STRIPPED_BAMBOO_BLOCK_KITCHEN_CABINET_CASE, "Stripped bamboo block kitchen cabinet case")
        builder.add(KitchenCabinetComponents.BAMBOO_MOSAIC_KITCHEN_CABINET_CASE, "Bamboo mosaic kitchen cabinet case")

        builder.add(KitchenCabinetComponents.OAK_KITCHEN_CABINET_DOOR, "Oak kitchen cabinet door")
        builder.add(KitchenCabinetComponents.SPRUCE_KITCHEN_CABINET_DOOR, "Spruce kitchen cabinet door")
        builder.add(KitchenCabinetComponents.BIRCH_KITCHEN_CABINET_DOOR, "Birch kitchen cabinet door")
        builder.add(KitchenCabinetComponents.JUNGLE_KITCHEN_CABINET_DOOR, "Jungle kitchen cabinet door")
        builder.add(KitchenCabinetComponents.ACACIA_KITCHEN_CABINET_DOOR, "Acacia kitchen cabinet door")
        builder.add(KitchenCabinetComponents.DARK_OAK_KITCHEN_CABINET_DOOR, "Dark oak kitchen cabinet door")
        builder.add(KitchenCabinetComponents.MANGROVE_KITCHEN_CABINET_DOOR, "Mangrove kitchen cabinet door")
        builder.add(KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_DOOR, "Cherry kitchen cabinet door")
        builder.add(KitchenCabinetComponents.BAMBOO_KITCHEN_CABINET_DOOR, "Bamboo kitchen cabinet door")

        // Lamps
        builder.add(Lamps.WHITE_OAK_LAMP, "White oak lamp")
        builder.add(Lamps.BLACK_OAK_LAMP, "Black oak lamp")
        builder.add(Lamps.WHITE_CHERRY_LAMP, "White cherry lamp")
        builder.add(Lamps.BLACK_CHERRY_LAMP, "Black cherry lamp")

        // Sofas
        builder.add(Sofas.WHITE_OAK_SOFA, "White oak sofa")
        builder.add(Sofas.LIGHT_GRAY_OAK_SOFA, "Light gray oak sofa")
        builder.add(Sofas.GRAY_OAK_SOFA, "Gray oak sofa")
        builder.add(Sofas.BLACK_OAK_SOFA, "Black oak sofa")
        builder.add(Sofas.BROWN_OAK_SOFA, "Brown oak sofa")
        builder.add(Sofas.RED_OAK_SOFA, "Red oak sofa")
        builder.add(Sofas.ORANGE_OAK_SOFA, "Orange oak sofa")
        builder.add(Sofas.YELLOW_OAK_SOFA, "Yellow oak sofa")
        builder.add(Sofas.LIME_OAK_SOFA, "Lime oak sofa")
        builder.add(Sofas.GREEN_OAK_SOFA, "Green oak sofa")
        builder.add(Sofas.CYAN_OAK_SOFA, "Cyan oak sofa")
        builder.add(Sofas.LIGHT_BLUE_OAK_SOFA, "Light blue oak sofa")
        builder.add(Sofas.BLUE_OAK_SOFA, "Blue oak sofa")
        builder.add(Sofas.PURPLE_OAK_SOFA, "Purple oak sofa")
        builder.add(Sofas.MAGENTA_OAK_SOFA, "Magenta oak sofa")
        builder.add(Sofas.PINK_OAK_SOFA, "Pink oak sofa")

        builder.add(Sofas.WHITE_SPRUCE_SOFA, "White spruce sofa")
        builder.add(Sofas.LIGHT_GRAY_SPRUCE_SOFA, "Light gray spruce sofa")
        builder.add(Sofas.GRAY_SPRUCE_SOFA, "Gray spruce sofa")
        builder.add(Sofas.BLACK_SPRUCE_SOFA, "Black spruce sofa")
        builder.add(Sofas.BROWN_SPRUCE_SOFA, "Brown spruce sofa")
        builder.add(Sofas.RED_SPRUCE_SOFA, "Red spruce sofa")
        builder.add(Sofas.ORANGE_SPRUCE_SOFA, "Orange spruce sofa")
        builder.add(Sofas.YELLOW_SPRUCE_SOFA, "Yellow spruce sofa")
        builder.add(Sofas.LIME_SPRUCE_SOFA, "Lime spruce sofa")
        builder.add(Sofas.GREEN_SPRUCE_SOFA, "Green spruce sofa")
        builder.add(Sofas.CYAN_SPRUCE_SOFA, "Cyan spruce sofa")
        builder.add(Sofas.LIGHT_BLUE_SPRUCE_SOFA, "Light blue spruce sofa")
        builder.add(Sofas.BLUE_SPRUCE_SOFA, "Blue spruce sofa")
        builder.add(Sofas.PURPLE_SPRUCE_SOFA, "Purple spruce sofa")
        builder.add(Sofas.MAGENTA_SPRUCE_SOFA, "Magenta spruce sofa")
        builder.add(Sofas.PINK_SPRUCE_SOFA, "Pink spruce sofa")

        builder.add(Sofas.WHITE_BIRCH_SOFA, "White birch sofa")
        builder.add(Sofas.LIGHT_GRAY_BIRCH_SOFA, "Light gray birch sofa")
        builder.add(Sofas.GRAY_BIRCH_SOFA, "Gray birch sofa")
        builder.add(Sofas.BLACK_BIRCH_SOFA, "Black birch sofa")
        builder.add(Sofas.BROWN_BIRCH_SOFA, "Brown birch sofa")
        builder.add(Sofas.RED_BIRCH_SOFA, "Red birch sofa")
        builder.add(Sofas.ORANGE_BIRCH_SOFA, "Orange birch sofa")
        builder.add(Sofas.YELLOW_BIRCH_SOFA, "Yellow birch sofa")
        builder.add(Sofas.LIME_BIRCH_SOFA, "Lime birch sofa")
        builder.add(Sofas.GREEN_BIRCH_SOFA, "Green birch sofa")
        builder.add(Sofas.CYAN_BIRCH_SOFA, "Cyan birch sofa")
        builder.add(Sofas.LIGHT_BLUE_BIRCH_SOFA, "Light blue birch sofa")
        builder.add(Sofas.BLUE_BIRCH_SOFA, "Blue birch sofa")
        builder.add(Sofas.PURPLE_BIRCH_SOFA, "Purple birch sofa")
        builder.add(Sofas.MAGENTA_BIRCH_SOFA, "Magenta birch sofa")
        builder.add(Sofas.PINK_BIRCH_SOFA, "Pink birch sofa")

        builder.add(Sofas.WHITE_JUNGLE_SOFA, "White jungle sofa")
        builder.add(Sofas.LIGHT_GRAY_JUNGLE_SOFA, "Light gray jungle sofa")
        builder.add(Sofas.GRAY_JUNGLE_SOFA, "Gray jungle sofa")
        builder.add(Sofas.BLACK_JUNGLE_SOFA, "Black jungle sofa")
        builder.add(Sofas.BROWN_JUNGLE_SOFA, "Brown jungle sofa")
        builder.add(Sofas.RED_JUNGLE_SOFA, "Red jungle sofa")
        builder.add(Sofas.ORANGE_JUNGLE_SOFA, "Orange jungle sofa")
        builder.add(Sofas.YELLOW_JUNGLE_SOFA, "Yellow jungle sofa")
        builder.add(Sofas.LIME_JUNGLE_SOFA, "Lime jungle sofa")
        builder.add(Sofas.GREEN_JUNGLE_SOFA, "Green jungle sofa")
        builder.add(Sofas.CYAN_JUNGLE_SOFA, "Cyan jungle sofa")
        builder.add(Sofas.LIGHT_BLUE_JUNGLE_SOFA, "Light blue jungle sofa")
        builder.add(Sofas.BLUE_JUNGLE_SOFA, "Blue jungle sofa")
        builder.add(Sofas.PURPLE_JUNGLE_SOFA, "Purple jungle sofa")
        builder.add(Sofas.MAGENTA_JUNGLE_SOFA, "Magenta jungle sofa")
        builder.add(Sofas.PINK_JUNGLE_SOFA, "Pink jungle sofa")

        builder.add(Sofas.WHITE_ACACIA_SOFA, "White acacia sofa")
        builder.add(Sofas.LIGHT_GRAY_ACACIA_SOFA, "Light gray acacia sofa")
        builder.add(Sofas.GRAY_ACACIA_SOFA, "Gray acacia sofa")
        builder.add(Sofas.BLACK_ACACIA_SOFA, "Black acacia sofa")
        builder.add(Sofas.BROWN_ACACIA_SOFA, "Brown acacia sofa")
        builder.add(Sofas.RED_ACACIA_SOFA, "Red acacia sofa")
        builder.add(Sofas.ORANGE_ACACIA_SOFA, "Orange acacia sofa")
        builder.add(Sofas.YELLOW_ACACIA_SOFA, "Yellow acacia sofa")
        builder.add(Sofas.LIME_ACACIA_SOFA, "Lime acacia sofa")
        builder.add(Sofas.GREEN_ACACIA_SOFA, "Green acacia sofa")
        builder.add(Sofas.CYAN_ACACIA_SOFA, "Cyan acacia sofa")
        builder.add(Sofas.LIGHT_BLUE_ACACIA_SOFA, "Light blue acacia sofa")
        builder.add(Sofas.BLUE_ACACIA_SOFA, "Blue acacia sofa")
        builder.add(Sofas.PURPLE_ACACIA_SOFA, "Purple acacia sofa")
        builder.add(Sofas.MAGENTA_ACACIA_SOFA, "Magenta acacia sofa")
        builder.add(Sofas.PINK_ACACIA_SOFA, "Pink acacia sofa")

        builder.add(Sofas.WHITE_DARK_OAK_SOFA, "White dark oak sofa")
        builder.add(Sofas.LIGHT_GRAY_DARK_OAK_SOFA, "Light gray dark oak sofa")
        builder.add(Sofas.GRAY_DARK_OAK_SOFA, "Gray dark oak sofa")
        builder.add(Sofas.BLACK_DARK_OAK_SOFA, "Black dark oak sofa")
        builder.add(Sofas.BROWN_DARK_OAK_SOFA, "Brown dark oak sofa")
        builder.add(Sofas.RED_DARK_OAK_SOFA, "Red dark oak sofa")
        builder.add(Sofas.ORANGE_DARK_OAK_SOFA, "Orange dark oak sofa")
        builder.add(Sofas.YELLOW_DARK_OAK_SOFA, "Yellow dark oak sofa")
        builder.add(Sofas.LIME_DARK_OAK_SOFA, "Lime dark oak sofa")
        builder.add(Sofas.GREEN_DARK_OAK_SOFA, "Green dark oak sofa")
        builder.add(Sofas.CYAN_DARK_OAK_SOFA, "Cyan dark oak sofa")
        builder.add(Sofas.LIGHT_BLUE_DARK_OAK_SOFA, "Light blue dark oak sofa")
        builder.add(Sofas.BLUE_DARK_OAK_SOFA, "Blue dark oak sofa")
        builder.add(Sofas.PURPLE_DARK_OAK_SOFA, "Purple dark oak sofa")
        builder.add(Sofas.MAGENTA_DARK_OAK_SOFA, "Magenta dark oak sofa")
        builder.add(Sofas.PINK_DARK_OAK_SOFA, "Pink dark oak sofa")

        builder.add(Sofas.WHITE_MANGROVE_SOFA, "White mangrove sofa")
        builder.add(Sofas.LIGHT_GRAY_MANGROVE_SOFA, "Light gray mangrove sofa")
        builder.add(Sofas.GRAY_MANGROVE_SOFA, "Gray mangrove sofa")
        builder.add(Sofas.BLACK_MANGROVE_SOFA, "Black mangrove sofa")
        builder.add(Sofas.BROWN_MANGROVE_SOFA, "Brown mangrove sofa")
        builder.add(Sofas.RED_MANGROVE_SOFA, "Red mangrove sofa")
        builder.add(Sofas.ORANGE_MANGROVE_SOFA, "Orange mangrove sofa")
        builder.add(Sofas.YELLOW_MANGROVE_SOFA, "Yellow mangrove sofa")
        builder.add(Sofas.LIME_MANGROVE_SOFA, "Lime mangrove sofa")
        builder.add(Sofas.GREEN_MANGROVE_SOFA, "Green mangrove sofa")
        builder.add(Sofas.CYAN_MANGROVE_SOFA, "Cyan mangrove sofa")
        builder.add(Sofas.LIGHT_BLUE_MANGROVE_SOFA, "Light blue mangrove sofa")
        builder.add(Sofas.BLUE_MANGROVE_SOFA, "Blue mangrove sofa")
        builder.add(Sofas.PURPLE_MANGROVE_SOFA, "Purple mangrove sofa")
        builder.add(Sofas.MAGENTA_MANGROVE_SOFA, "Magenta mangrove sofa")
        builder.add(Sofas.PINK_MANGROVE_SOFA, "Pink mangrove sofa")

        builder.add(Sofas.WHITE_CHERRY_SOFA, "White cherry sofa")
        builder.add(Sofas.LIGHT_GRAY_CHERRY_SOFA, "Light gray cherry sofa")
        builder.add(Sofas.GRAY_CHERRY_SOFA, "Gray cherry sofa")
        builder.add(Sofas.BLACK_CHERRY_SOFA, "Black cherry sofa")
        builder.add(Sofas.BROWN_CHERRY_SOFA, "Brown cherry sofa")
        builder.add(Sofas.RED_CHERRY_SOFA, "Red cherry sofa")
        builder.add(Sofas.ORANGE_CHERRY_SOFA, "Orange cherry sofa")
        builder.add(Sofas.YELLOW_CHERRY_SOFA, "Yellow cherry sofa")
        builder.add(Sofas.LIME_CHERRY_SOFA, "Lime cherry sofa")
        builder.add(Sofas.GREEN_CHERRY_SOFA, "Green cherry sofa")
        builder.add(Sofas.CYAN_CHERRY_SOFA, "Cyan cherry sofa")
        builder.add(Sofas.LIGHT_BLUE_CHERRY_SOFA, "Light blue cherry sofa")
        builder.add(Sofas.BLUE_CHERRY_SOFA, "Blue cherry sofa")
        builder.add(Sofas.PURPLE_CHERRY_SOFA, "Purple cherry sofa")
        builder.add(Sofas.MAGENTA_CHERRY_SOFA, "Magenta cherry sofa")
        builder.add(Sofas.PINK_CHERRY_SOFA, "Pink cherry sofa")

        builder.add(Shelves.OAK_SHELF, "Oak shelf")
        builder.add(Shelves.SPRUCE_SHELF, "Spruce shelf")
        builder.add(Shelves.BIRCH_SHELF, "Birch shelf")
        builder.add(Shelves.JUNGLE_SHELF, "Jungle shelf")
        builder.add(Shelves.ACACIA_SHELF, "Acacia shelf")
        builder.add(Shelves.DARK_OAK_SHELF, "Dark oak shelf")
        builder.add(Shelves.MANGROVE_SHELF, "Mangrove shelf")
        builder.add(Shelves.CHERRY_SHELF, "Cherry shelf")
    }
}