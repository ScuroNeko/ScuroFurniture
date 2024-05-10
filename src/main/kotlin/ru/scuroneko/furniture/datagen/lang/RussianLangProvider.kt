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


class RussianLangProvider(output: FabricDataOutput) : FabricLanguageProvider(output, "ru_ru") {
    override fun generateTranslations(builder: TranslationBuilder) {
        builder.add(
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group")),
            "Scuro's Furniture Carpenter"
        )

        builder.add(Constants.ScreenNames.MEDICAL_DRAWER, "Аптечный шкафчик")
        builder.add(Constants.ScreenNames.BEDSIDE_DRAWER, "Прикроватная тумба")

        builder.add(ModItems.OAK_MEDICAL_BOX, "Дубовый ящик для медикаментов")
        builder.add(ModItems.OAK_MEDICAL_DRAWER_CASE, "Дубовый корпус аптечного ящика")
        builder.add(ModItems.OAK_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из дубового бревна")
        builder.add(
            ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного дубового бревна"
        )
        builder.add(ModBlocks.OAK_MEDICAL_DRAWER, "Дубовый аптечный шкафчик")
        builder.add(ModBlocks.OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из дубового бревна")
        builder.add(ModBlocks.STRIPPED_OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного дубового бревна")

        builder.add(ModItems.SPRUCE_MEDICAL_BOX, "Еловый ящик для медикаментов")
        builder.add(ModItems.SPRUCE_MEDICAL_DRAWER_CASE, "Еловый корпус аптечного ящика")
        builder.add(ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из елового бревна")
        builder.add(
            ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного елового бревна"
        )
        builder.add(ModBlocks.SPRUCE_MEDICAL_DRAWER, "Еловый аптечный шкаф")
        builder.add(ModBlocks.SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из елового бревна")
        builder.add(ModBlocks.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного елового бревна")

        builder.add(ModItems.BIRCH_MEDICAL_BOX, "Березовый ящик для медикаментов")
        builder.add(ModItems.BIRCH_MEDICAL_DRAWER_CASE, "Березовый корпус аптечного ящика")
        builder.add(ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из березового бревна")
        builder.add(
            ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного березового бревна"
        )
        builder.add(ModBlocks.BIRCH_MEDICAL_DRAWER, "Березовый аптечный шкаф")
        builder.add(ModBlocks.BIRCH_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из березового бревна")
        builder.add(ModBlocks.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного березового бревна")

        builder.add(ModItems.JUNGLE_MEDICAL_BOX, "Тропический ящик для медикаментов")
        builder.add(ModItems.JUNGLE_MEDICAL_DRAWER_CASE, "Тропический корпус аптечного ящика")
        builder.add(ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из тропического бревна")
        builder.add(
            ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного тропического бревна"
        )
        builder.add(ModBlocks.JUNGLE_MEDICAL_DRAWER, "Тропический аптечный шкаф")
        builder.add(ModBlocks.JUNGLE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из тропического бревна")
        builder.add(ModBlocks.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного тропического бревна")

        builder.add(ModItems.ACACIA_MEDICAL_BOX, "Акациевый ящик для медикаментов")
        builder.add(ModItems.ACACIA_MEDICAL_DRAWER_CASE, "Акациевый корпус аптечного ящика")
        builder.add(ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из акациевого бревна")
        builder.add(
            ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного акациевого бревна"
        )
        builder.add(ModBlocks.ACACIA_MEDICAL_DRAWER, "Акациевый аптечный шкаф")
        builder.add(ModBlocks.ACACIA_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из акациевого бревна")
        builder.add(ModBlocks.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного акациевого бревна")

        builder.add(ModItems.DARK_OAK_MEDICAL_BOX, "Ящик для медикаментов из темного дуба")
        builder.add(ModItems.DARK_OAK_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из темного дуба")
        builder.add(ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из бревна темного дуба")
        builder.add(
            ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного бревна темного дуба"
        )
        builder.add(ModBlocks.DARK_OAK_MEDICAL_DRAWER, "Аптечный шкаф из темного дуба")
        builder.add(ModBlocks.DARK_OAK_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из бревна темного дуба")
        builder.add(
            ModBlocks.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER,
            "Аптечный шкафчик из обтесанного бревна темного дуба"
        )

        builder.add(ModItems.MANGROVE_MEDICAL_BOX, "Мангровый ящик для медикаментов")
        builder.add(ModItems.MANGROVE_MEDICAL_DRAWER_CASE, "Мангровый корпус аптечного ящика")
        builder.add(ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из мангрового бревна")
        builder.add(
            ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного мангрового бревна"
        )
        builder.add(ModBlocks.MANGROVE_MEDICAL_DRAWER, "Мангровый аптечный шкаф")
        builder.add(ModBlocks.MANGROVE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из мангрового бревна")
        builder.add(ModBlocks.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного мангрового бревна")

        builder.add(ModItems.CHERRY_MEDICAL_BOX, "Вишневый ящик для медикаментов")
        builder.add(ModItems.CHERRY_MEDICAL_DRAWER_CASE, "Вишневый корпус аптечного ящика")
        builder.add(ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из вишневого бревна")
        builder.add(
            ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного вишневого бревна"
        )
        builder.add(ModBlocks.CHERRY_MEDICAL_DRAWER, "Вишневый аптечный шкафчик")
        builder.add(ModBlocks.CHERRY_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из вишневого бревна")
        builder.add(ModBlocks.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного вишневого бревна")

        builder.add(ModItems.BAMBOO_MEDICAL_BOX, "Бамбуковый ящик для медикаментов")
        builder.add(ModItems.BAMBOO_MEDICAL_DRAWER_CASE, "Бамбуковый корпус аптечного ящика")
        builder.add(ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из бамбукового блока")
        builder.add(
            ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из обтесанного бамбукового блока"
        )
        builder.add(ModBlocks.BAMBOO_MEDICAL_DRAWER, "Бамбуковый аптечный шкафчик")
        builder.add(ModBlocks.BAMBOO_BLOCK_MEDICAL_DRAWER, "Аптечный шкафчик из бамбукового блока")
        builder.add(ModBlocks.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER, "Аптечный шкафчик из обтесанного бамбукового блока")

        builder.add(ModItems.CRIMSON_MEDICAL_BOX, "Багровый ящик для медикаментов")
        builder.add(ModItems.CRIMSON_MEDICAL_DRAWER_CASE, "Багровый корпус аптечного ящика")
        builder.add(ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из багрового стебля")
        builder.add(
            ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из очищенного багрового стебля"
        )
        builder.add(ModBlocks.CRIMSON_MEDICAL_DRAWER, "Багровый аптечный шкафчик")
        builder.add(ModBlocks.CRIMSON_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из багрового стебля")
        builder.add(ModBlocks.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из очищенного багрового стебля")

        builder.add(ModItems.WARPED_MEDICAL_BOX, "Искаженный ящик для медикаментов")
        builder.add(ModItems.WARPED_MEDICAL_DRAWER_CASE, "Искаженный корпус аптечного ящика")
        builder.add(ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE, "Корпус аптечного ящика из искаженного стебля")
        builder.add(
            ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE,
            "Корпус аптечного ящика из очищенного искаженного стебля"
        )
        builder.add(ModBlocks.WARPED_MEDICAL_DRAWER, "Искаженный аптечный шкафчик")
        builder.add(ModBlocks.WARPED_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из искаженного стебля")
        builder.add(ModBlocks.STRIPPED_WARPED_STEM_MEDICAL_DRAWER, "Аптечный шкафчик из очищенного искаженного стебля")

        builder.add(ModBlocks.CHERRY_BEDSIDE_TABLE, "Вишневая прикроватная тумба")

        builder.add(ModBlocks.BLACK_CHERRY_KITCHEN_DRAWER, "Черная вишневая кухонная тумба")
        builder.add(ModBlocks.WHITE_CHERRY_KITCHEN_DRAWER, "Белая вишневая кухонная тумба")

        builder.add(ModBlocks.CHERRY_KITCHEN_CABINET, "Вишневый кухонный ящик")

        builder.add(ModBlocks.WHITE_CHERRY_SOFA, "Белый вишневый диван")
        builder.add(ModBlocks.BLACK_CHERRY_SOFA, "Черный вишневый диван")

        builder.add(ModBlocks.WHITE_OAK_LAMP, "Белая дубовая лампа")
        builder.add(ModBlocks.BLACK_OAK_LAMP, "Черная дубовая лампа")
        builder.add(ModBlocks.WHITE_CHERRY_LAMP, "Белая вишневая лампа")
        builder.add(ModBlocks.BLACK_CHERRY_LAMP, "Черная вишневая лампа")
    }
}