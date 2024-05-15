package ru.scuroneko.furniture.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes


class RussianLangProvider(output: FabricDataOutput) : FabricLanguageProvider(output, "ru_ru") {
    override fun generateTranslations(builder: TranslationBuilder) {
        builder.add(
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group")),
            "Scuro's Furniture Carpenter"
        )

        builder.add(Constants.ScreenNames.MEDICAL_DRAWER, "Аптечный шкафчик")
        builder.add(Constants.ScreenNames.BEDSIDE_DRAWER, "Прикроватная тумба")
        builder.add(Constants.ScreenNames.KITCHEN_DRAWER, "Кухонная тумба")

        builder.add(MedicalDrawersComponents.OAK_MEDICAL_BOX, "Дубовый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE, "Дубовый корпус аптечного ящика")
        builder.add(MedicalDrawersComponents.OAK_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из дубового бревна")
        builder.add(
            MedicalDrawersComponents.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного дубового бревна"
        )
        builder.add(MedicalDrawers.OAK_MEDICAL_DRAWER, "Дубовый аптечный шкафчик")
        builder.add(MedicalDrawers.OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из дубового бревна")
        builder.add(MedicalDrawers.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного дубового бревна")

        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_BOX, "Еловый ящик для медикаментов")
        builder.add(MedicalDrawersComponents.SPRUCE_MEDICAL_DRAWER_CASE, "Еловый корпус аптечного ящика")
        builder.add(MedicalDrawersComponents.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из елового бревна")
        builder.add(
            MedicalDrawersComponents.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного елового бревна"
        )
        builder.add(MedicalDrawers.SPRUCE_MEDICAL_DRAWER, "Еловый аптечный шкаф")
        builder.add(MedicalDrawers.SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из елового бревна")
        builder.add(MedicalDrawers.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного елового бревна")

        builder.add(MedicalDrawersComponents.BIRCH_MEDICAL_BOX, "Березовый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.JUNGLE_MEDICAL_BOX, "Тропический ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.ACACIA_MEDICAL_BOX, "Акациевый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.DARK_OAK_MEDICAL_BOX, "Ящик для медикаментов из темного дуба")
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

        builder.add(MedicalDrawersComponents.MANGROVE_MEDICAL_BOX, "Мангровый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.CHERRY_MEDICAL_BOX, "Вишневый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.BAMBOO_MEDICAL_BOX, "Бамбуковый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.CRIMSON_MEDICAL_BOX, "Багровый ящик для медикаментов")
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

        builder.add(MedicalDrawersComponents.WARPED_MEDICAL_BOX, "Искаженный ящик для медикаментов")
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
        builder.add(KitchenDrawers.BLACK_CHERRY_KITCHEN_DRAWER, "Черная вишневая кухонная тумба")
        builder.add(KitchenDrawers.WHITE_CHERRY_KITCHEN_DRAWER, "Белая вишневая кухонная тумба")

        builder.add(KitchenCabinets.CHERRY_KITCHEN_CABINET, "Вишневый кухонный ящик")

        builder.add(Lamps.WHITE_OAK_LAMP, "Белая дубовая лампа")
        builder.add(Lamps.BLACK_OAK_LAMP, "Черная дубовая лампа")
        builder.add(Lamps.WHITE_CHERRY_LAMP, "Белая вишневая лампа")
        builder.add(Lamps.BLACK_CHERRY_LAMP, "Черная вишневая лампа")

        builder.add(Sofas.WHITE_CHERRY_SOFA, "Белый вишневый диван")
        builder.add(Sofas.BLACK_CHERRY_SOFA, "Черный вишневый диван")
    }
}