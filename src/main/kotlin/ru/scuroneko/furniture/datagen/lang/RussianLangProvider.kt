package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.blocks.Shelves
import java.util.concurrent.CompletableFuture

class RussianLangProvider(output: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricLanguageProvider(output, "ru_ru", lookup) {
    override fun generateTranslations(registryLookup: RegistryWrapper.WrapperLookup, builder: TranslationBuilder) {
        builder.add(Constants.Translatable.MEDICAL_DRAWER, "Аптечный шкафчик")
        builder.add(Constants.Translatable.BEDSIDE_DRAWER, "Прикроватная тумба")
        builder.add(Constants.Translatable.KITCHEN_DRAWER, "Кухонная тумба")

        builder.add(Constants.Translatable.CASE_MATERIAL_TOOLTIP, "Материал корпуса")
        builder.add(Constants.Translatable.BOX_MATERIAL_TOOLTIP, "Материал ящика")
        builder.add(Constants.Translatable.DOOR_MATERIAL_TOOLTIP, "Материал двери")

        RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.forEach { box -> builder.add(box, "Ящик для медикаментов") }
        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach { case -> builder.add(case, "Корпус аптечного ящика") }

        RegistryHelper.Items.MEDIUM_DRAWERS_BOXES.forEach { box -> builder.add(box, "Средний ящик") }
        RegistryHelper.Items.BIG_DRAWERS_DOORS.forEach { door -> builder.add(door, "Большая дверь") }

        RegistryHelper.Items.KITCHEN_DRAWERS_CASES.forEach { case -> builder.add(case, "Корпус кухонной тумбы") }
        RegistryHelper.Items.SINGLE_DRAWERS_CASES.forEach { case -> builder.add(case, "Корпус большого ящика") }
        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach { case -> builder.add(case, "Корпус кухонного шкафчика") }
        RegistryHelper.Items.KITCHEN_CABINET_DOORS.forEach { door -> builder.add(door, "Дверца кухонного шкафчика") }
        RegistryHelper.Items.KITCHEN_CABINET_GLASS_DOORS.forEach { door -> builder.add(door, "Стеклянная дверца кухонного шкафчика") }

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach { drawer -> builder.add(drawer, "Аптечный ящик") }
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach { drawer -> builder.add(drawer, "Прикроватная тумба") }
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach { drawer -> builder.add(drawer, "Кухонная тумба") }
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach { drawer -> builder.add(drawer, "Кухонный шкафчик") }
        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.forEach { drawer -> builder.add(drawer, "Стеклянный кухонный ящик") }

        RegistryHelper.Blocks.SINGLE_DRAWERS.forEach { drawer -> builder.add(drawer, "Большой ящик") }

        builder.add(Shelves.OAK_SHELF, "Дубовая полка")
        builder.add(Shelves.SPRUCE_SHELF, "Еловая полка")
        builder.add(Shelves.BIRCH_SHELF, "Березовая полка")
        builder.add(Shelves.JUNGLE_SHELF, "Тропическая полка")
        builder.add(Shelves.ACACIA_SHELF, "Акациевая полка")
        builder.add(Shelves.DARK_OAK_SHELF, "Полка из темного дуба")
        builder.add(Shelves.MANGROVE_SHELF, "Мангровая полка")
        builder.add(Shelves.CHERRY_SHELF, "Вишневая полка")
        builder.add(Shelves.CRIMSON_SHELF, "Багровая полка")
        builder.add(Shelves.WARPED_SHELF, "Искаженная полка")
    }
}