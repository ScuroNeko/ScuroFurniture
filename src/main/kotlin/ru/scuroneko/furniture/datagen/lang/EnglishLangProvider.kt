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

class EnglishLangProvider(output: FabricDataOutput): FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        builder.add(
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group")),
            "Scuro's Furniture Carpenter"
        )

        builder.add(Constants.ScreenNames.MEDICAL_DRAWER, "Medical drawer")
        builder.add(Constants.ScreenNames.BEDSIDE_DRAWER, "Bedside drawer")

        builder.add(ModItems.OAK_MEDICAL_DRAWER_BOX, "Oak medical drawer box")
        builder.add(ModItems.OAK_MEDICAL_DRAWER_CASE, "Oak medical drawer case")
        builder.add(ModItems.OAK_LOG_MEDICAL_DRAWER_CASE, "Oak log medical drawer case")
        builder.add(ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE, "Stripped oak log medical drawer case")
        builder.add(ModBlocks.OAK_MEDICAL_DRAWER, "Oak medical drawer")
        builder.add(ModBlocks.OAK_LOG_MEDICAL_DRAWER, "Oak log medical drawer")
        builder.add(ModBlocks.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Stripped oak log medical drawer")

        builder.add(ModItems.SPRUCE_MEDICAL_DRAWER_BOX, "Spruce medical drawer box")
        builder.add(ModItems.SPRUCE_MEDICAL_DRAWER_CASE, "Spruce medical drawer case")
        builder.add(ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Spruce log medical drawer case")
        builder.add(ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Stripped spruce log medical drawer case")
        builder.add(ModBlocks.SPRUCE_MEDICAL_DRAWER, "Spruce medical drawer")
        builder.add(ModBlocks.SPRUCE_LOG_MEDICAL_DRAWER, "Spruce log medical drawer")
        builder.add(ModBlocks.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Stripped spruce log medical drawer")

        builder.add(ModItems.BIRCH_MEDICAL_DRAWER_BOX, "Birch medical drawer box")
        builder.add(ModItems.BIRCH_MEDICAL_DRAWER_CASE, "Birch medical drawer case")
        builder.add(ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE, "Birch log medical drawer case")
        builder.add(ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE, "Stripped birch log medical drawer case")
        builder.add(ModBlocks.BIRCH_MEDICAL_DRAWER, "Birch medical drawer")
        builder.add(ModBlocks.BIRCH_LOG_MEDICAL_DRAWER, "Birch log medical drawer")
        builder.add(ModBlocks.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER, "Stripped birch log medical drawer")

        builder.add(ModItems.JUNGLE_MEDICAL_DRAWER_BOX, "Jungle medical drawer box")
        builder.add(ModItems.JUNGLE_MEDICAL_DRAWER_CASE, "Jungle medical drawer case")
        builder.add(ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Jungle log medical drawer case")
        builder.add(ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Stripped jungle log medical drawer case")
        builder.add(ModBlocks.JUNGLE_MEDICAL_DRAWER, "Jungle medical drawer")
        builder.add(ModBlocks.JUNGLE_LOG_MEDICAL_DRAWER, "Jungle log medical drawer")
        builder.add(ModBlocks.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER, "Stripped jungle log medical drawer")

        builder.add(ModItems.ACACIA_MEDICAL_DRAWER_BOX, "Acacia medical drawer box")
        builder.add(ModItems.ACACIA_MEDICAL_DRAWER_CASE, "Acacia medical drawer case")
        builder.add(ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE, "Acacia log medical drawer case")
        builder.add(ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE, "Stripped acacia log medical drawer case")
        builder.add(ModBlocks.ACACIA_MEDICAL_DRAWER, "Acacia medical drawer")
        builder.add(ModBlocks.ACACIA_LOG_MEDICAL_DRAWER, "Acacia log medical drawer")
        builder.add(ModBlocks.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER, "Stripped acacia log medical drawer")

        builder.add(ModItems.DARK_OAK_MEDICAL_DRAWER_BOX, "Dark oak medical drawer box")
        builder.add(ModItems.DARK_OAK_MEDICAL_DRAWER_CASE, "Dark oak medical drawer case")
        builder.add(ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Dark oak log medical drawer case")
        builder.add(ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Stripped dark oak log medical drawer case")
        builder.add(ModBlocks.DARK_OAK_MEDICAL_DRAWER, "Dark oak medical drawer")
        builder.add(ModBlocks.DARK_OAK_LOG_MEDICAL_DRAWER, "Dark oak log medical drawer")
        builder.add(ModBlocks.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER, "Stripped dark oak log medical drawer")

        builder.add(ModItems.MANGROVE_MEDICAL_DRAWER_BOX, "Mangrove medical drawer box")
        builder.add(ModItems.MANGROVE_MEDICAL_DRAWER_CASE, "Mangrove medical drawer case")
        builder.add(ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Mangrove log medical drawer case")
        builder.add(ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Stripped mangrove log medical drawer case")
        builder.add(ModBlocks.MANGROVE_MEDICAL_DRAWER, "Mangrove medical drawer")
        builder.add(ModBlocks.MANGROVE_LOG_MEDICAL_DRAWER, "Mangrove log medical drawer")
        builder.add(ModBlocks.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER, "Stripped mangrove log medical drawer")

        builder.add(ModItems.CHERRY_MEDICAL_DRAWER_BOX, "Cherry medical drawer box")
        builder.add(ModItems.CHERRY_MEDICAL_DRAWER_CASE, "Cherry medical drawer case")
        builder.add(ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE, "Cherry log medical drawer case")
        builder.add(ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE, "Stripped cherry log medical drawer case")
        builder.add(ModBlocks.CHERRY_MEDICAL_DRAWER, "Cherry medical drawer")
        builder.add(ModBlocks.CHERRY_LOG_MEDICAL_DRAWER, "Cherry log medical drawer")
        builder.add(ModBlocks.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER, "Stripped cherry log medical drawer")

        builder.add(ModItems.BAMBOO_MEDICAL_DRAWER_BOX, "Bamboo medical drawer box")
        builder.add(ModItems.BAMBOO_MEDICAL_DRAWER_CASE, "Bamboo medical drawer case")
        builder.add(ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Bamboo block medical drawer case")
        builder.add(ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Stripped bamboo block medical drawer case")
        builder.add(ModBlocks.BAMBOO_MEDICAL_DRAWER, "Bamboo medical drawer")
        builder.add(ModBlocks.BAMBOO_BLOCK_MEDICAL_DRAWER, "Bamboo block medical drawer")
        builder.add(ModBlocks.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER, "Stripped bamboo block medical drawer")

        builder.add(ModItems.CRIMSON_MEDICAL_DRAWER_BOX, "Crimson medical drawer box")
        builder.add(ModItems.CRIMSON_MEDICAL_DRAWER_CASE, "Crimson medical drawer case")
        builder.add(ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Crimson stem medical drawer case")
        builder.add(ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Stripped crimson stem medical drawer case")
        builder.add(ModBlocks.CRIMSON_MEDICAL_DRAWER, "Crimson medical drawer")
        builder.add(ModBlocks.CRIMSON_STEM_MEDICAL_DRAWER, "Crimson stem medical drawer")
        builder.add(ModBlocks.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER, "Stripped crimson stem medical drawer")

        builder.add(ModItems.WARPED_MEDICAL_DRAWER_BOX, "Warped medical drawer box")
        builder.add(ModItems.WARPED_MEDICAL_DRAWER_CASE, "Warped medical drawer case")
        builder.add(ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE, "Warped stem medical drawer case")
        builder.add(ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE, "Stripped warped stem medical drawer case")
        builder.add(ModBlocks.WARPED_MEDICAL_DRAWER, "Warped medical drawer")
        builder.add(ModBlocks.WARPED_STEM_MEDICAL_DRAWER, "Warped stem medical drawer")
        builder.add(ModBlocks.STRIPPED_WARPED_STEM_MEDICAL_DRAWER, "Stripped warped stem medical drawer")


        builder.add(ModBlocks.CHERRY_BEDSIDE_TABLE, "Cherry Bedside Drawer")
        builder.add(ModBlocks.BLACK_CHERRY_KITCHEN_DRAWER, "Black Cherry Kitchen Drawer")
        builder.add(ModBlocks.CHERRY_KITCHEN_CABINET, "Cherry Kitchen Cabinet")
    }
}