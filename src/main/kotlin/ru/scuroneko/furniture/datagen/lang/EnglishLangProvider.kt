package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents

class EnglishLangProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        builder.add(
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group")),
            "Scuro's Furniture Carpenter"
        )

        builder.add(Constants.ScreenNames.MEDICAL_DRAWER, "Medical drawer")
        builder.add(Constants.ScreenNames.BEDSIDE_DRAWER, "Bedside drawer")
        builder.add(Constants.ScreenNames.KITCHEN_DRAWER, "Kitchen drawer")

        builder.add(MedicalDrawersComponents.OAK_MEDICAL_BOX, "Oak medical box")
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE, "Oak medical drawer case")
        builder.add(MedicalDrawersComponents.OAK_LOG_MEDICAL_DRAWER_CASE, "Oak log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE, "Stripped oak log medical drawer case")
        builder.add(MedicalDrawers.OAK_MEDICAL_DRAWER, "Oak medical drawer")
        builder.add(MedicalDrawers.OAK_LOG_MEDICAL_DRAWER, "Oak log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Stripped oak log medical drawer")

        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_BOX, "Spruce medical box")
        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_DRAWER_CASE, "Spruce medical drawer case")
        builder.add(MedicalDrawersComponents.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Spruce log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Stripped spruce log medical drawer case")
        builder.add(MedicalDrawers.SPRUCE_MEDICAL_DRAWER, "Spruce medical drawer")
        builder.add(MedicalDrawers.SPRUCE_LOG_MEDICAL_DRAWER, "Spruce log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Stripped spruce log medical drawer")

        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_BOX, "Birch medical box")
        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_DRAWER_CASE, "Birch medical drawer case")
        builder.add(MedicalDrawersComponents.BIRCH_LOG_MEDICAL_DRAWER_CASE, "Birch log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE, "Stripped birch log medical drawer case")
        builder.add(MedicalDrawers.BIRCH_MEDICAL_DRAWER, "Birch medical drawer")
        builder.add(MedicalDrawers.BIRCH_LOG_MEDICAL_DRAWER, "Birch log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER, "Stripped birch log medical drawer")

        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_BOX, "Jungle medical box")
        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_DRAWER_CASE, "Jungle medical drawer case")
        builder.add(MedicalDrawersComponents.JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Jungle log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Stripped jungle log medical drawer case")
        builder.add(MedicalDrawers.JUNGLE_MEDICAL_DRAWER, "Jungle medical drawer")
        builder.add(MedicalDrawers.JUNGLE_LOG_MEDICAL_DRAWER, "Jungle log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER, "Stripped jungle log medical drawer")

        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_BOX, "Acacia medical box")
        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_DRAWER_CASE, "Acacia medical drawer case")
        builder.add(MedicalDrawersComponents.ACACIA_LOG_MEDICAL_DRAWER_CASE, "Acacia log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE, "Stripped acacia log medical drawer case")
        builder.add(MedicalDrawers.ACACIA_MEDICAL_DRAWER, "Acacia medical drawer")
        builder.add(MedicalDrawers.ACACIA_LOG_MEDICAL_DRAWER, "Acacia log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER, "Stripped acacia log medical drawer")

        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_BOX, "Dark oak medical box")
        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_DRAWER_CASE, "Dark oak medical drawer case")
        builder.add(MedicalDrawersComponents.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Dark oak log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Stripped dark oak log medical drawer case")
        builder.add(MedicalDrawers.DARK_OAK_MEDICAL_DRAWER, "Dark oak medical drawer")
        builder.add(MedicalDrawers.DARK_OAK_LOG_MEDICAL_DRAWER, "Dark oak log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER, "Stripped dark oak log medical drawer")

        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_BOX, "Mangrove medical box")
        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_DRAWER_CASE, "Mangrove medical drawer case")
        builder.add(MedicalDrawersComponents.MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Mangrove log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Stripped mangrove log medical drawer case")
        builder.add(MedicalDrawers.MANGROVE_MEDICAL_DRAWER, "Mangrove medical drawer")
        builder.add(MedicalDrawers.MANGROVE_LOG_MEDICAL_DRAWER, "Mangrove log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER, "Stripped mangrove log medical drawer")

        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_BOX, "Cherry medical box")
        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE, "Cherry medical drawer case")
        builder.add(MedicalDrawersComponents.CHERRY_LOG_MEDICAL_DRAWER_CASE, "Cherry log medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE, "Stripped cherry log medical drawer case")
        builder.add(MedicalDrawers.CHERRY_MEDICAL_DRAWER, "Cherry medical drawer")
        builder.add(MedicalDrawers.CHERRY_LOG_MEDICAL_DRAWER, "Cherry log medical drawer")
        builder.add(MedicalDrawers.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER, "Stripped cherry log medical drawer")

        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_BOX, "Bamboo medical box")
        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_DRAWER_CASE, "Bamboo medical drawer case")
        builder.add(MedicalDrawersComponents.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Bamboo block medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Stripped bamboo block medical drawer case")
        builder.add(MedicalDrawers.BAMBOO_MEDICAL_DRAWER, "Bamboo medical drawer")
        builder.add(MedicalDrawers.BAMBOO_BLOCK_MEDICAL_DRAWER, "Bamboo block medical drawer")
        builder.add(MedicalDrawers.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER, "Stripped bamboo block medical drawer")

        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_BOX, "Crimson medical box")
        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_DRAWER_CASE, "Crimson medical drawer case")
        builder.add(MedicalDrawersComponents.CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Crimson stem medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Stripped crimson stem medical drawer case")
        builder.add(MedicalDrawers.CRIMSON_MEDICAL_DRAWER, "Crimson medical drawer")
        builder.add(MedicalDrawers.CRIMSON_STEM_MEDICAL_DRAWER, "Crimson stem medical drawer")
        builder.add(MedicalDrawers.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER, "Stripped crimson stem medical drawer")

        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_BOX, "Warped medical box")
        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_DRAWER_CASE, "Warped medical drawer case")
        builder.add(MedicalDrawersComponents.WARPED_STEM_MEDICAL_DRAWER_CASE, "Warped stem medical drawer case")
        builder.add(MedicalDrawersComponents.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE, "Stripped warped stem medical drawer case")
        builder.add(MedicalDrawers.WARPED_MEDICAL_DRAWER, "Warped medical drawer")
        builder.add(MedicalDrawers.WARPED_STEM_MEDICAL_DRAWER, "Warped stem medical drawer")
        builder.add(MedicalDrawers.STRIPPED_WARPED_STEM_MEDICAL_DRAWER, "Stripped warped stem medical drawer")

        builder.add(ModBlocks.CHERRY_BEDSIDE_TABLE, "Cherry bedside drawer")

        builder.add(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER, "Black cherry kitchen drawer")
        builder.add(KitchenDrawers.WHITE_CHERRY_KITCHEN_DRAWER, "White cherry kitchen drawer")

        builder.add(ModBlocks.CHERRY_KITCHEN_CABINET, "Cherry kitchen cabinet")

        builder.add(ModBlocks.WHITE_CHERRY_SOFA, "White cherry sofa")
        builder.add(ModBlocks.BLACK_CHERRY_SOFA, "Black cherry sofa")

        builder.add(ModBlocks.WHITE_OAK_LAMP, "White oak lamp")
        builder.add(ModBlocks.BLACK_OAK_LAMP, "Black oak lamp")
        builder.add(ModBlocks.WHITE_CHERRY_LAMP, "White cherry lamp")
        builder.add(ModBlocks.BLACK_CHERRY_LAMP, "Black cherry lamp")
    }
}