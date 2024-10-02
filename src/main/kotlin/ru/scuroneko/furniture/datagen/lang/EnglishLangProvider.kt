package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.blocks.Shelves
import java.util.concurrent.CompletableFuture

class EnglishLangProvider(output: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup>) :
    FabricLanguageProvider(output, lookup) {
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
        builder.add(Constants.Translatable.KITCHEN_CABINET, "Kitchen cabinet")
        builder.add(Constants.Translatable.SINGLE_DRAWER, "Single drawer")

        builder.add(Constants.Translatable.CASE_MATERIAL_TOOLTIP, "Case material")
        builder.add(Constants.Translatable.BOX_MATERIAL_TOOLTIP, "Box material")
        builder.add(Constants.Translatable.DOOR_MATERIAL_TOOLTIP, "Door material")

        RegistryHelper.Items.SMALL_DRAWERS_BOXES.forEach { box -> builder.add(box, "Medical drawer box") }
        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach { case -> builder.add(case, "Medical drawer case") }

        RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach { box -> builder.add(box, "Medium drawer box") }
        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach { case -> builder.add(case, "Kitchen drawer case") }

        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach { case -> builder.add(case, "Kitchen cabinet case") }
        RegistryHelper.Items.MEDIUM_DRAWERS_DOORS.forEach { door -> builder.add(door, "Kitchen cabinet door") }
        RegistryHelper.Items.MEDIUM_DRAWERS_GLASS_DOORS.forEach { door ->
            builder.add(
                door,
                "Kitchen cabinet glass door"
            )
        }

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach { drawer -> builder.add(drawer, "Medical drawer") }
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach { drawer -> builder.add(drawer, "Bedside drawer") }
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach { drawer -> builder.add(drawer, "Kitchen drawer") }
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach { drawer -> builder.add(drawer, "Kitchen cabinet") }
        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.forEach { drawer -> builder.add(drawer, "Glass kitchen cabinet") }

        builder.add(Shelves.OAK_SHELF, "Oak shelf")
        builder.add(Shelves.SPRUCE_SHELF, "Spruce shelf")
        builder.add(Shelves.BIRCH_SHELF, "Birch shelf")
        builder.add(Shelves.JUNGLE_SHELF, "Jungle shelf")
        builder.add(Shelves.ACACIA_SHELF, "Acacia shelf")
        builder.add(Shelves.DARK_OAK_SHELF, "Dark oak shelf")
        builder.add(Shelves.MANGROVE_SHELF, "Mangrove shelf")
        builder.add(Shelves.CHERRY_SHELF, "Cherry shelf")
        builder.add(Shelves.CRIMSON_SHELF, "Crimson shelf")
        builder.add(Shelves.WARPED_SHELF, "Warped shelf")
    }
}