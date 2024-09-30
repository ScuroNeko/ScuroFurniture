package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes
import java.lang.foreign.SymbolLookup
import java.util.concurrent.CompletableFuture


class RussianLangProvider(output: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricLanguageProvider(output, "ru_ru", lookup) {
    override fun generateTranslations(registryLookup: RegistryWrapper.WrapperLookup, builder: TranslationBuilder) {
        builder.add(Constants.Translatable.MEDICAL_DRAWER, "Аптечный шкафчик")
        builder.add(Constants.Translatable.BEDSIDE_DRAWER, "Прикроватная тумба")
        builder.add(Constants.Translatable.KITCHEN_DRAWER, "Кухонная тумба")

        // Ящики для медикаментов
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_BOX, "Дубовый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_BOX, "Еловый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_BOX, "Березовый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_BOX, "Тропический ящик для медикаментов")
        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_BOX, "Акациевый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_BOX, "Ящик для медикаментов из темного дуба")
        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_BOX, "Мангровый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_BOX, "Вишневый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_BOX, "Бамбуковый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_BOX, "Багровый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_BOX, "Искаженный ящик для медикаментов")

        // Аптечные ящики
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE, "Дубовый корпус аптечного ящика")
        builder.add(MedicalDrawersComponents.OAK_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из дубового бревна")
        builder.add(
            MedicalDrawersComponents.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного дубового бревна"
        )
        builder.add(MedicalDrawers.OAK_MEDICAL_DRAWER, "Дубовый аптечный шкафчик")
        builder.add(MedicalDrawers.OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из дубового бревна")
        builder.add(MedicalDrawers.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного дубового бревна")

        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_DRAWER_CASE, "Еловый корпус аптечного ящика")
        builder.add(MedicalDrawersComponents.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из елового бревна")
        builder.add(
            MedicalDrawersComponents.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного елового бревна"
        )
        builder.add(MedicalDrawers.SPRUCE_MEDICAL_DRAWER, "Еловый аптечный шкаф")
        builder.add(MedicalDrawers.SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из елового бревна")
        builder.add(MedicalDrawers.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного елового бревна")

        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_DRAWER_CASE, "Березовый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.BIRCH_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из березового бревна"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного березового бревна"
        )
        builder.add(MedicalDrawers.BIRCH_MEDICAL_DRAWER, "Березовый аптечный шкаф")
        builder.add(MedicalDrawers.BIRCH_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из березового бревна")
        builder.add(
            MedicalDrawers.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного березового бревна"
        )

        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_DRAWER_CASE, "Тропический корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.JUNGLE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из тропического бревна"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного тропического бревна"
        )
        builder.add(MedicalDrawers.JUNGLE_MEDICAL_DRAWER, "Тропический аптечный шкаф")
        builder.add(MedicalDrawers.JUNGLE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из тропического бревна")
        builder.add(
            MedicalDrawers.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного тропического бревна"
        )

        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_DRAWER_CASE, "Акациевый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.ACACIA_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из акациевого бревна"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного акациевого бревна"
        )
        builder.add(MedicalDrawers.ACACIA_MEDICAL_DRAWER, "Акациевый аптечный шкаф")
        builder.add(MedicalDrawers.ACACIA_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из акациевого бревна")
        builder.add(
            MedicalDrawers.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного акациевого бревна"
        )

        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из темного дуба")
        builder.add(
            MedicalDrawersComponents.DARK_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из бревна темного дуба"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного бревна темного дуба"
        )
        builder.add(MedicalDrawers.DARK_OAK_MEDICAL_DRAWER, "Аптечный шкаф из темного дуба")
        builder.add(MedicalDrawers.DARK_OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из бревна темного дуба")
        builder.add(
            MedicalDrawers.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного бревна темного дуба"
        )

        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_DRAWER_CASE, "Мангровый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.MANGROVE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из мангрового бревна"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного мангрового бревна"
        )
        builder.add(MedicalDrawers.MANGROVE_MEDICAL_DRAWER, "Мангровый аптечный шкаф")
        builder.add(MedicalDrawers.MANGROVE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из мангрового бревна")
        builder.add(
            MedicalDrawers.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного мангрового бревна"
        )

        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE, "Вишневый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.CHERRY_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из вишневого бревна"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного вишневого бревна"
        )
        builder.add(MedicalDrawers.CHERRY_MEDICAL_DRAWER, "Вишневый аптечный шкафчик")
        builder.add(MedicalDrawers.CHERRY_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из вишневого бревна")
        builder.add(
            MedicalDrawers.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного вишневого бревна"
        )

        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_DRAWER_CASE, "Бамбуковый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из бамбукового блока"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного бамбукового блока"
        )
        builder.add(MedicalDrawers.BAMBOO_MEDICAL_DRAWER, "Бамбуковый аптечный шкафчик")
        builder.add(MedicalDrawers.BAMBOO_BLOCK_MEDICAL_DRAWER, "Аптечный шкафчик из бамбукового блока")
        builder.add(
            MedicalDrawers.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного бамбукового блока"
        )

        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_DRAWER_CASE, "Багровый корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.CRIMSON_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из багрового стебля"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из очищенного багрового стебля"
        )
        builder.add(MedicalDrawers.CRIMSON_MEDICAL_DRAWER, "Багровый аптечный шкафчик")
        builder.add(MedicalDrawers.CRIMSON_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из багрового стебля")
        builder.add(
            MedicalDrawers.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER,
            "Аптечный шкафчик из очищенного багрового стебля"
        )

        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_DRAWER_CASE, "Искаженный корпус аптечного ящика")
        builder.add(
            MedicalDrawersComponents.WARPED_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из искаженного стебля"
        )
        builder.add(
            MedicalDrawersComponents.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из очищенного искаженного стебля"
        )
        builder.add(MedicalDrawers.WARPED_MEDICAL_DRAWER, "Искаженный аптечный шкафчик")
        builder.add(MedicalDrawers.WARPED_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из искаженного стебля")
        builder.add(
            MedicalDrawers.STRIPPED_WARPED_STEM_MEDICAL_DRAWER,
            "Аптечный шкафчик из очищенного искаженного стебля"
        )

        // Средние ящики
        builder.add(MediumDrawerBoxes.OAK_MEDIUM_DRAWER_BOX, "Дубовый средний ящик")
        builder.add(MediumDrawerBoxes.BIRCH_MEDIUM_DRAWER_BOX, "Березовый средний ящик")
        builder.add(MediumDrawerBoxes.SPRUCE_MEDIUM_DRAWER_BOX, "Еловый средний ящик")
        builder.add(MediumDrawerBoxes.JUNGLE_MEDIUM_DRAWER_BOX, "Тропический средний ящик")
        builder.add(MediumDrawerBoxes.ACACIA_MEDIUM_DRAWER_BOX, "Акациевый средний ящик")
        builder.add(MediumDrawerBoxes.DARK_OAK_MEDIUM_DRAWER_BOX, "Средний ящик из темного дуба")
        builder.add(MediumDrawerBoxes.MANGROVE_MEDIUM_DRAWER_BOX, "Мангровый средний ящик")
        builder.add(MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX, "Вишневый средний ящик")
        builder.add(MediumDrawerBoxes.BAMBOO_MEDIUM_DRAWER_BOX, "Бамбуковый средний ящик")
        builder.add(MediumDrawerBoxes.CRIMSON_MEDIUM_DRAWER_BOX, "Багровый средний ящик")
        builder.add(MediumDrawerBoxes.WARPED_MEDIUM_DRAWER_BOX, "Искаженный средний ящик")

        // Прикроватные тумбы
        builder.add(BedsideDrawersComponents.OAK_BEDSIDE_DRAWER_CASE, "Дубовый корпус прикроватной тумбы")
        builder.add(BedsideDrawersComponents.OAK_LOG_BEDSIDE_DRAWER_CASE, "Корпус прикроватной тумбы из бревна дуба")
        builder.add(
            BedsideDrawersComponents.STRIPPED_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна дуба"
        )
        builder.add(BedsideDrawers.OAK_BEDSIDE_DRAWER, "Дубовая прикроватная тумба")
        builder.add(BedsideDrawers.OAK_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна дуба")
        builder.add(BedsideDrawers.STRIPPED_OAK_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из обтесанного бревна дуба")

        builder.add(BedsideDrawersComponents.SPRUCE_BEDSIDE_DRAWER_CASE, "Еловый корпус прикроватной тумбы")
        builder.add(BedsideDrawersComponents.SPRUCE_LOG_BEDSIDE_DRAWER_CASE, "Корпус прикроватной тумбы из бревна ели")
        builder.add(
            BedsideDrawersComponents.STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна ели"
        )
        builder.add(BedsideDrawers.SPRUCE_BEDSIDE_DRAWER, "Еловая прикроватная тумба")
        builder.add(BedsideDrawers.SPRUCE_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна ели")
        builder.add(BedsideDrawers.STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из обтесанного бревна ели")

        builder.add(BedsideDrawersComponents.BIRCH_BEDSIDE_DRAWER_CASE, "Березовый корпус прикроватной тумбы")
        builder.add(
            BedsideDrawersComponents.BIRCH_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из бревна березы"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна березы"
        )
        builder.add(BedsideDrawers.BIRCH_BEDSIDE_DRAWER, "Березовая прикроватная тумба")
        builder.add(BedsideDrawers.BIRCH_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна березы")
        builder.add(BedsideDrawers.STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из обтесанного бревна березы")

        builder.add(BedsideDrawersComponents.JUNGLE_BEDSIDE_DRAWER_CASE, "Тропический корпус прикроватной тумбы")
        builder.add(
            BedsideDrawersComponents.JUNGLE_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из тропического бревна"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного тропического бревна"
        )
        builder.add(BedsideDrawers.JUNGLE_BEDSIDE_DRAWER, "Тропическая прикроватная тумба")
        builder.add(BedsideDrawers.JUNGLE_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из тропического бревна")
        builder.add(
            BedsideDrawers.STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER,
            "Прикроватная тумба из обтесанного тропического бревна"
        )

        builder.add(BedsideDrawersComponents.ACACIA_BEDSIDE_DRAWER_CASE, "Акациевый корпус прикроватной тумбы")
        builder.add(
            BedsideDrawersComponents.ACACIA_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из бревна акации"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна акации"
        )
        builder.add(BedsideDrawers.ACACIA_BEDSIDE_DRAWER, "Акациевая прикроватная тумба")
        builder.add(BedsideDrawers.ACACIA_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна акации")
        builder.add(
            BedsideDrawers.STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER,
            "Прикроватная тумба из обтесанного бревна акации"
        )

        builder.add(BedsideDrawersComponents.DARK_OAK_BEDSIDE_DRAWER_CASE, "Корпус прикроватной тумбы из темного дуба")
        builder.add(
            BedsideDrawersComponents.DARK_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из бревна темного дуба"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна темного дуба"
        )
        builder.add(BedsideDrawers.DARK_OAK_BEDSIDE_DRAWER, "Прикроватная тумба из темного дуба")
        builder.add(BedsideDrawers.DARK_OAK_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна темного дуба")
        builder.add(
            BedsideDrawers.STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER,
            "Прикроватная тумба из обтесанного бревна темного дуба"
        )

        builder.add(BedsideDrawersComponents.MANGROVE_BEDSIDE_DRAWER_CASE, "Мангровый корпус прикроватной тумбы")
        builder.add(
            BedsideDrawersComponents.MANGROVE_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из мангрового бревна"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного мангрового бревна"
        )
        builder.add(BedsideDrawers.MANGROVE_BEDSIDE_DRAWER, "Мангровая прикроватная тумба")
        builder.add(BedsideDrawers.MANGROVE_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из мангрового бревна")
        builder.add(
            BedsideDrawers.STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER,
            "Прикроватная тумба из обтесанного мангрового бревна"
        )

        builder.add(BedsideDrawersComponents.CHERRY_BEDSIDE_DRAWER_CASE, "Вишневый корпус прикроватной тумбы")
        builder.add(
            BedsideDrawersComponents.CHERRY_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из бревна вишни"
        )
        builder.add(
            BedsideDrawersComponents.STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER_CASE,
            "Корпус прикроватной тумбы из обтесанного бревна вишни"
        )
        builder.add(BedsideDrawers.CHERRY_BEDSIDE_DRAWER, "Вишневая прикроватная тумба")
        builder.add(BedsideDrawers.CHERRY_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из бревна вишни")
        builder.add(BedsideDrawers.STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER, "Прикроватная тумба из обтесанного бревна вишни")

        // Кухонные тумбы
        builder.add(KitchenDrawers.BLACK_OAK_KITCHEN_DRAWER, "Черная дубовая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_OAK_KITCHEN_DRAWER, "Белая дубовая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_OAK_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из бревна дуба")
        builder.add(KitchenDrawers.WHITE_OAK_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из бревна дуба")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_OAK_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бревна дуба"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_OAK_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бревна дуба"
        )

        builder.add(KitchenDrawers.BLACK_SPRUCE_KITCHEN_DRAWER, "Черная еловая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_SPRUCE_KITCHEN_DRAWER, "Белая еловая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_SPRUCE_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из бревна ели")
        builder.add(KitchenDrawers.WHITE_SPRUCE_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из бревна ели")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бревна ели"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бревна ели"
        )

        builder.add(KitchenDrawers.BLACK_BIRCH_KITCHEN_DRAWER, "Черная березовая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_BIRCH_KITCHEN_DRAWER, "Белая березовая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_BIRCH_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из бревна березы")
        builder.add(KitchenDrawers.WHITE_BIRCH_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из бревна березы")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бревна березы"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бревна березы"
        )

        builder.add(KitchenDrawers.BLACK_JUNGLE_KITCHEN_DRAWER, "Черная тропическая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_JUNGLE_KITCHEN_DRAWER, "Белая тропическая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_JUNGLE_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из тропического бревна")
        builder.add(KitchenDrawers.WHITE_JUNGLE_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из тропического бревна")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного тропического бревна"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного тропического бревна"
        )

        builder.add(KitchenDrawers.BLACK_MANGROVE_KITCHEN_DRAWER, "Черная мангровая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_MANGROVE_KITCHEN_DRAWER, "Белая мангровая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_MANGROVE_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из мангрового бревна")
        builder.add(KitchenDrawers.WHITE_MANGROVE_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из мангрового бревна")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного мангрового бревна"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного мангрового бревна"
        )

        builder.add(KitchenDrawers.BLACK_ACACIA_KITCHEN_DRAWER, "Черная акациевая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_ACACIA_KITCHEN_DRAWER, "Белая акациевая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_ACACIA_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из бревна акации")
        builder.add(KitchenDrawers.WHITE_ACACIA_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из бревна акации")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бревна акации"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бревна акации"
        )

        builder.add(KitchenDrawers.BLACK_DARK_OAK_KITCHEN_DRAWER, "Черная кухонная тумба из темного дуба")
        builder.add(KitchenDrawers.WHITE_DARK_OAK_KITCHEN_DRAWER, "Белая кухонная тумба из темного дуба")
        builder.add(KitchenDrawers.BLACK_DARK_OAK_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из бревна темного дуба")
        builder.add(KitchenDrawers.WHITE_DARK_OAK_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из бревна темного дуба")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бревна темного дуба"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бревна темного дуба"
        )

        builder.add(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER, "Черная вишневая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_CHERRY_KITCHEN_DRAWER, "Белая вишневая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_CHERRY_LOG_KITCHEN_DRAWER, "Черная кухонная тумба из вишневого бревна")
        builder.add(KitchenDrawers.WHITE_CHERRY_LOG_KITCHEN_DRAWER, "Белая кухонная тумба из вишневого бревна")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного вишневого бревна"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного вишневого бревна"
        )

        builder.add(KitchenDrawers.BLACK_BAMBOO_KITCHEN_DRAWER, "Черная бамбуковая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_BAMBOO_KITCHEN_DRAWER, "Белая бамбуковая кухонная тумба")
        builder.add(KitchenDrawers.BLACK_BAMBOO_MOSAIC_KITCHEN_DRAWER, "Черная кухонная тумба из бамбуковой мозаики")
        builder.add(KitchenDrawers.WHITE_BAMBOO_MOSAIC_KITCHEN_DRAWER, "Белая кухонная тумба из бамбуковой мозаики")
        builder.add(KitchenDrawers.BLACK_BAMBOO_BLOCK_KITCHEN_DRAWER, "Черная кухонная тумба из бамбукового блока")
        builder.add(KitchenDrawers.WHITE_BAMBOO_BLOCK_KITCHEN_DRAWER, "Белая кухонная тумба из бамбукового блока")
        builder.add(
            KitchenDrawers.BLACK_STRIPPED_BAMBOO_BLOCK_KITCHEN_DRAWER,
            "Черная кухонная тумба из обтесанного бамбукового блока"
        )
        builder.add(
            KitchenDrawers.WHITE_STRIPPED_BAMBOO_BLOCK_KITCHEN_DRAWER,
            "Белая кухонная тумба из обтесанного бамбукового блока"
        )

        //
        builder.add(KitchenCabinets.CHERRY_KITCHEN_CABINET, "Вишневый кухонный ящик")

        builder.add(Lamps.WHITE_OAK_LAMP, "Белая дубовая лампа")
        builder.add(Lamps.BLACK_OAK_LAMP, "Черная дубовая лампа")
        builder.add(Lamps.WHITE_CHERRY_LAMP, "Белая вишневая лампа")
        builder.add(Lamps.BLACK_CHERRY_LAMP, "Черная вишневая лампа")

        // Диваны
        builder.add(Sofas.WHITE_OAK_SOFA, "Белый дубовый диван")
        builder.add(Sofas.LIGHT_GRAY_OAK_SOFA, "Светло-серый дубовый диван")
        builder.add(Sofas.GRAY_OAK_SOFA, "Серый дубовый диван")
        builder.add(Sofas.BLACK_OAK_SOFA, "Черный дубовый диван")
        builder.add(Sofas.BROWN_OAK_SOFA, "Коричневый дубовый диван")
        builder.add(Sofas.RED_OAK_SOFA, "Красный дубовый диван")
        builder.add(Sofas.ORANGE_OAK_SOFA, "Оранжевый дубовый диван")
        builder.add(Sofas.YELLOW_OAK_SOFA, "Жёлтый дубовый диван")
        builder.add(Sofas.LIME_OAK_SOFA, "Лаймовый дубовый диван")
        builder.add(Sofas.GREEN_OAK_SOFA, "Зеленый дубовый диван")
        builder.add(Sofas.CYAN_OAK_SOFA, "Бирюзовый дубовый диван")
        builder.add(Sofas.LIGHT_BLUE_OAK_SOFA, "Голубой дубовый диван")
        builder.add(Sofas.BLUE_OAK_SOFA, "Синий дубовый диван")
        builder.add(Sofas.PURPLE_OAK_SOFA, "Фиолетовый дубовый диван")
        builder.add(Sofas.MAGENTA_OAK_SOFA, "Пурпурный дубовый диван")
        builder.add(Sofas.PINK_OAK_SOFA, "Розовый дубовый диван")

        builder.add(Sofas.WHITE_SPRUCE_SOFA, "Белый еловый диван")
        builder.add(Sofas.LIGHT_GRAY_SPRUCE_SOFA, "Светло-серый еловый диван")
        builder.add(Sofas.GRAY_SPRUCE_SOFA, "Серый еловый диван")
        builder.add(Sofas.BLACK_SPRUCE_SOFA, "Черный еловый диван")
        builder.add(Sofas.BROWN_SPRUCE_SOFA, "Коричневый еловый диван")
        builder.add(Sofas.RED_SPRUCE_SOFA, "Красный еловый диван")
        builder.add(Sofas.ORANGE_SPRUCE_SOFA, "Оранжевый еловый диван")
        builder.add(Sofas.YELLOW_SPRUCE_SOFA, "Желтый еловый диван")
        builder.add(Sofas.LIME_SPRUCE_SOFA, "Диван из лаймовой ели")
        builder.add(Sofas.GREEN_SPRUCE_SOFA, "Диван из зеленой ели")
        builder.add(Sofas.CYAN_SPRUCE_SOFA, "Бирюзовый еловый диван")
        builder.add(Sofas.LIGHT_BLUE_SPRUCE_SOFA, "Голубой еловый диван")
        builder.add(Sofas.BLUE_SPRUCE_SOFA, "Синий еловый диван")
        builder.add(Sofas.PURPLE_SPRUCE_SOFA, "Фиолетовый еловый диван")
        builder.add(Sofas.MAGENTA_SPRUCE_SOFA, "Пурпурный еловый диван")
        builder.add(Sofas.PINK_SPRUCE_SOFA, "Розовый еловый диван")

        builder.add(Sofas.WHITE_BIRCH_SOFA, "Белый березовый диван")
        builder.add(Sofas.LIGHT_GRAY_BIRCH_SOFA, "Светло-серый березовый диван")
        builder.add(Sofas.GRAY_BIRCH_SOFA, "Серый березовый диван")
        builder.add(Sofas.BLACK_BIRCH_SOFA, "Черный березовый диван")
        builder.add(Sofas.BROWN_BIRCH_SOFA, "Коричневый березовый диван")
        builder.add(Sofas.RED_BIRCH_SOFA, "Красный березовый диван")
        builder.add(Sofas.ORANGE_BIRCH_SOFA, "Оранжевый березовый диван")
        builder.add(Sofas.YELLOW_BIRCH_SOFA, "Желтый березовый диван")
        builder.add(Sofas.LIME_BIRCH_SOFA, "Лаймовый березовый диван")
        builder.add(Sofas.GREEN_BIRCH_SOFA, "Зеленый березовый диван")
        builder.add(Sofas.CYAN_BIRCH_SOFA, "Бирюзовый березовый диван")
        builder.add(Sofas.LIGHT_BLUE_BIRCH_SOFA, "Светло-голубой березовый диван")
        builder.add(Sofas.BLUE_BIRCH_SOFA, "Голубой березовый диван")
        builder.add(Sofas.PURPLE_BIRCH_SOFA, "Фиолетовый березовый диван")
        builder.add(Sofas.MAGENTA_BIRCH_SOFA, "Пурпурный березовый диван")
        builder.add(Sofas.PINK_BIRCH_SOFA, "Розовый березовый диван")

        builder.add(Sofas.WHITE_JUNGLE_SOFA, "Белый тропический диван")
        builder.add(Sofas.LIGHT_GRAY_JUNGLE_SOFA, "Светло-серый тропический диван")
        builder.add(Sofas.GRAY_JUNGLE_SOFA, "Серый тропический диван")
        builder.add(Sofas.BLACK_JUNGLE_SOFA, "Черный тропический диван")
        builder.add(Sofas.BROWN_JUNGLE_SOFA, "Коричневый тропический диван")
        builder.add(Sofas.RED_JUNGLE_SOFA, "Красный тропический диван")
        builder.add(Sofas.ORANGE_JUNGLE_SOFA, "Оранжевый тропический диван")
        builder.add(Sofas.YELLOW_JUNGLE_SOFA, "Желтый тропический диван")
        builder.add(Sofas.LIME_JUNGLE_SOFA, "Лаймовый тропический диван")
        builder.add(Sofas.GREEN_JUNGLE_SOFA, "Зеленый тропический диван")
        builder.add(Sofas.CYAN_JUNGLE_SOFA, "Бирюзовый тропический диван")
        builder.add(Sofas.LIGHT_BLUE_JUNGLE_SOFA, "Голубой тропический диван")
        builder.add(Sofas.BLUE_JUNGLE_SOFA, "Синий тропический диван")
        builder.add(Sofas.PURPLE_JUNGLE_SOFA, "Фиолетовый тропический диван")
        builder.add(Sofas.MAGENTA_JUNGLE_SOFA, "Пурпурный тропический диван")
        builder.add(Sofas.PINK_JUNGLE_SOFA, "Розовый тропический диван")

        builder.add(Sofas.WHITE_ACACIA_SOFA, "Белый акациевый диван")
        builder.add(Sofas.LIGHT_GRAY_ACACIA_SOFA, "Светло-серый акациевый диван")
        builder.add(Sofas.GRAY_ACACIA_SOFA, "Серый акациевый диван")
        builder.add(Sofas.BLACK_ACACIA_SOFA, "Черный акациевый диван")
        builder.add(Sofas.BROWN_ACACIA_SOFA, "Коричневый акациевый диван")
        builder.add(Sofas.RED_ACACIA_SOFA, "Красный акациевый диван")
        builder.add(Sofas.ORANGE_ACACIA_SOFA, "Оранжевый акациевый диван")
        builder.add(Sofas.YELLOW_ACACIA_SOFA, "Желтый акациевый диван")
        builder.add(Sofas.LIME_ACACIA_SOFA, "Лаймовый акациевый диван")
        builder.add(Sofas.GREEN_ACACIA_SOFA, "Зеленый акациевый диван")
        builder.add(Sofas.CYAN_ACACIA_SOFA, "Бирюзовый акациевый диван")
        builder.add(Sofas.LIGHT_BLUE_ACACIA_SOFA, "Голубой акациевый диван")
        builder.add(Sofas.BLUE_ACACIA_SOFA, "Синий акациевый диван")
        builder.add(Sofas.PURPLE_ACACIA_SOFA, "Фиолетовый акациевый диван")
        builder.add(Sofas.MAGENTA_ACACIA_SOFA, "Пурпурный акациевый диван")
        builder.add(Sofas.PINK_ACACIA_SOFA, "Розовый акациевый диван")

        builder.add(Sofas.WHITE_DARK_OAK_SOFA, "Белый диван из темного дуба")
        builder.add(Sofas.LIGHT_GRAY_DARK_OAK_SOFA, "Светло-серый диван из темного дуба")
        builder.add(Sofas.GRAY_DARK_OAK_SOFA, "Серый диван из темного дуба")
        builder.add(Sofas.BLACK_DARK_OAK_SOFA, "Черный диван из темного дуба")
        builder.add(Sofas.BROWN_DARK_OAK_SOFA, "Коричневый диван из темного дуба")
        builder.add(Sofas.RED_DARK_OAK_SOFA, "Красный диван из темного дуба")
        builder.add(Sofas.ORANGE_DARK_OAK_SOFA, "Оранжевый диван из темного дуба")
        builder.add(Sofas.YELLOW_DARK_OAK_SOFA, "Желтый диван из темного дуба")
        builder.add(Sofas.LIME_DARK_OAK_SOFA, "Лаймовый диван из темного дуба")
        builder.add(Sofas.GREEN_DARK_OAK_SOFA, "Зеленый диван из темного дуба")
        builder.add(Sofas.CYAN_DARK_OAK_SOFA, "Бирюзовый диван из темного дуба")
        builder.add(Sofas.LIGHT_BLUE_DARK_OAK_SOFA, "Голубой диван из темного дуба")
        builder.add(Sofas.BLUE_DARK_OAK_SOFA, "Синий диван из темного дуба")
        builder.add(Sofas.PURPLE_DARK_OAK_SOFA, "Фиолетовый диван из темного дуба")
        builder.add(Sofas.MAGENTA_DARK_OAK_SOFA, "Пурпурный диван из темного дуба")
        builder.add(Sofas.PINK_DARK_OAK_SOFA, "Розовый диван из темного дуба")

        builder.add(Sofas.WHITE_MANGROVE_SOFA, "Белый мангровый диван")
        builder.add(Sofas.LIGHT_GRAY_MANGROVE_SOFA, "Светло-серый мангровый диван")
        builder.add(Sofas.GRAY_MANGROVE_SOFA, "Серый мангровый диван")
        builder.add(Sofas.BLACK_MANGROVE_SOFA, "Черный мангровый диван")
        builder.add(Sofas.BROWN_MANGROVE_SOFA, "Коричневый мангровый диван")
        builder.add(Sofas.RED_MANGROVE_SOFA, "Красный мангровый диван")
        builder.add(Sofas.ORANGE_MANGROVE_SOFA, "Оранжевый мангровый диван")
        builder.add(Sofas.YELLOW_MANGROVE_SOFA, "Желтый мангровый диван")
        builder.add(Sofas.LIME_MANGROVE_SOFA, "Лаймовый мангровый диван")
        builder.add(Sofas.GREEN_MANGROVE_SOFA, "Зеленый мангровый диван")
        builder.add(Sofas.CYAN_MANGROVE_SOFA, "Голубой мангровый диван")
        builder.add(Sofas.LIGHT_BLUE_MANGROVE_SOFA, "Светло-голубой мангровый диван")
        builder.add(Sofas.BLUE_MANGROVE_SOFA, "Синий мангровый диван")
        builder.add(Sofas.PURPLE_MANGROVE_SOFA, "Фиолетовый мангровый диван")
        builder.add(Sofas.MAGENTA_MANGROVE_SOFA, "Пурпурный мангровый диван")
        builder.add(Sofas.PINK_MANGROVE_SOFA, "Розовый мангровый диван")

        builder.add(Sofas.WHITE_CHERRY_SOFA, "Белый вишневый диван")
        builder.add(Sofas.LIGHT_GRAY_CHERRY_SOFA, "Светло-серый вишневый диван")
        builder.add(Sofas.GRAY_CHERRY_SOFA, "Серый вишневый диван")
        builder.add(Sofas.BLACK_CHERRY_SOFA, "Черный вишневый диван")
        builder.add(Sofas.BROWN_CHERRY_SOFA, "Коричневый вишневый диван")
        builder.add(Sofas.RED_CHERRY_SOFA, "Красный вишневый диван")
        builder.add(Sofas.ORANGE_CHERRY_SOFA, "Оранжевый вишневый диван")
        builder.add(Sofas.YELLOW_CHERRY_SOFA, "Желтый вишневый диван")
        builder.add(Sofas.LIME_CHERRY_SOFA, "Лаймовый вишневый диван")
        builder.add(Sofas.GREEN_CHERRY_SOFA, "Зеленый вишневый диван")
        builder.add(Sofas.CYAN_CHERRY_SOFA, "Голубой вишневый диван")
        builder.add(Sofas.LIGHT_BLUE_CHERRY_SOFA, "Светло-голубой вишневый диван")
        builder.add(Sofas.BLUE_CHERRY_SOFA, "Синий вишневый диван")
        builder.add(Sofas.PURPLE_CHERRY_SOFA, "Фиолетовый вишневый диван")
        builder.add(Sofas.MAGENTA_CHERRY_SOFA, "Пурпурный вишневый диван")
        builder.add(Sofas.PINK_CHERRY_SOFA, "Розовый вишневый диван")

        builder.add(Shelves.OAK_SHELF, "Дубовая полка")
        builder.add(Shelves.SPRUCE_SHELF, "Еловая полка")
        builder.add(Shelves.BIRCH_SHELF, "Березовая полка")
        builder.add(Shelves.JUNGLE_SHELF, "Тропическая полка")
        builder.add(Shelves.ACACIA_SHELF, "Акациевая полка")
        builder.add(Shelves.DARK_OAK_SHELF, "Полка из темного дуба")
        builder.add(Shelves.MANGROVE_SHELF, "Мангровая полка")
        builder.add(Shelves.CHERRY_SHELF, "Вишневая полка")
    }
}