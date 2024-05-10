package ru.scuroneko.furniture

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.item.MedicalDrawerCaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object ModItems {
    val ITEMS = LinkedHashMap<Identifier, Item>()

    val OAK_MEDICAL_BOX = BoxItem(Blocks.OAK_SLAB)
    val OAK_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.OAK_PLANKS, Blocks.OAK_SLAB)
    val OAK_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.OAK_LOG, Blocks.OAK_SLAB)
    val STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_OAK_LOG, Blocks.OAK_SLAB)

    val SPRUCE_MEDICAL_BOX = BoxItem(Blocks.SPRUCE_SLAB)
    val SPRUCE_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB)
    val SPRUCE_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.SPRUCE_LOG, Blocks.SPRUCE_SLAB)
    val STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_SLAB)

    val BIRCH_MEDICAL_BOX = BoxItem(Blocks.BIRCH_SLAB)
    val BIRCH_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB)
    val BIRCH_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.BIRCH_LOG, Blocks.BIRCH_SLAB)
    val STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_SLAB)

    val JUNGLE_MEDICAL_BOX = BoxItem(Blocks.JUNGLE_SLAB)
    val JUNGLE_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB)
    val JUNGLE_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.JUNGLE_LOG, Blocks.JUNGLE_SLAB)
    val STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_SLAB)

    val ACACIA_MEDICAL_BOX = BoxItem(Blocks.ACACIA_SLAB)
    val ACACIA_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB)
    val ACACIA_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.ACACIA_LOG, Blocks.ACACIA_SLAB)
    val STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_SLAB)

    val DARK_OAK_MEDICAL_BOX = BoxItem(Blocks.DARK_OAK_SLAB)
    val DARK_OAK_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB)
    val DARK_OAK_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)
    val STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE =
        MedicalDrawerCaseItem(Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_SLAB)

    val MANGROVE_MEDICAL_BOX = BoxItem(Blocks.MANGROVE_SLAB)
    val MANGROVE_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB)
    val MANGROVE_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.MANGROVE_LOG, Blocks.MANGROVE_SLAB)
    val STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE =
        MedicalDrawerCaseItem(Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_SLAB)

    val CHERRY_MEDICAL_BOX = BoxItem(Blocks.CHERRY_SLAB)
    val CHERRY_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB)
    val CHERRY_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB)
    val STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB)

    val BAMBOO_MEDICAL_BOX = BoxItem(Blocks.BAMBOO_SLAB)
    val BAMBOO_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB)
    val BAMBOO_BLOCK_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_SLAB)
    val STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE =
        MedicalDrawerCaseItem(Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_SLAB)

    val WARPED_MEDICAL_BOX = BoxItem(Blocks.WARPED_SLAB)
    val WARPED_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB)
    val WARPED_STEM_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.WARPED_STEM, Blocks.WARPED_SLAB)
    val STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE =
        MedicalDrawerCaseItem(Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_SLAB)

    val CRIMSON_MEDICAL_BOX = BoxItem(Blocks.CRIMSON_SLAB)
    val CRIMSON_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB)
    val CRIMSON_STEM_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.CRIMSON_STEM, Blocks.CRIMSON_SLAB)
    val STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE =
        MedicalDrawerCaseItem(Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_SLAB)

    val CHERRY_KITCHEN_DRAWER_BOX = BoxItem(Blocks.CHERRY_SLAB)
    val WHITE_CHERRY_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, Blocks.WHITE_CONCRETE)
    val BLACK_CHERRY_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, Blocks.BLACK_CONCRETE)
    val WHITE_CHERRY_LOG_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB, Blocks.WHITE_CONCRETE)
    val BLACK_CHERRY_LOG_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.CHERRY_LOG, Blocks.CHERRY_SLAB, Blocks.BLACK_CONCRETE)
    val WHITE_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB, Blocks.WHITE_CONCRETE)
    val BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER_CASE =
        KitchenDrawerCaseItem(Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_SLAB, Blocks.BLACK_CONCRETE)

    fun register() {
        registerItem("oak_medical_box", OAK_MEDICAL_BOX)
        registerItem("oak_medical_drawer_case", OAK_MEDICAL_DRAWER_CASE)
        registerItem("oak_log_medical_drawer_case", OAK_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_oak_log_medical_drawer_case", STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE)

        registerItem("spruce_medical_box", SPRUCE_MEDICAL_BOX)
        registerItem("spruce_medical_drawer_case", SPRUCE_MEDICAL_DRAWER_CASE)
        registerItem("spruce_log_medical_drawer_case", SPRUCE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_spruce_log_medical_drawer_case", STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("birch_medical_box", BIRCH_MEDICAL_BOX)
        registerItem("birch_medical_drawer_case", BIRCH_MEDICAL_DRAWER_CASE)
        registerItem("birch_log_medical_drawer_case", BIRCH_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_birch_log_medical_drawer_case", STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE)

        registerItem("jungle_medical_box", JUNGLE_MEDICAL_BOX)
        registerItem("jungle_medical_drawer_case", JUNGLE_MEDICAL_DRAWER_CASE)
        registerItem("jungle_log_medical_drawer_case", JUNGLE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_jungle_log_medical_drawer_case", STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("acacia_medical_box", ACACIA_MEDICAL_BOX)
        registerItem("acacia_medical_drawer_case", ACACIA_MEDICAL_DRAWER_CASE)
        registerItem("acacia_log_medical_drawer_case", ACACIA_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_acacia_log_medical_drawer_case", STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE)

        registerItem("dark_oak_medical_box", DARK_OAK_MEDICAL_BOX)
        registerItem("dark_oak_medical_drawer_case", DARK_OAK_MEDICAL_DRAWER_CASE)
        registerItem("dark_oak_log_medical_drawer_case", DARK_OAK_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_dark_oak_log_medical_drawer_case", STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE)

        registerItem("mangrove_medical_box", MANGROVE_MEDICAL_BOX)
        registerItem("mangrove_medical_drawer_case", MANGROVE_MEDICAL_DRAWER_CASE)
        registerItem("mangrove_log_medical_drawer_case", MANGROVE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_mangrove_log_medical_drawer_case", STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("cherry_medical_box", CHERRY_MEDICAL_BOX)
        registerItem("cherry_medical_drawer_case", CHERRY_MEDICAL_DRAWER_CASE)
        registerItem("cherry_log_medical_drawer_case", CHERRY_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_cherry_log_medical_drawer_case", STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE)

        registerItem("bamboo_medical_box", BAMBOO_MEDICAL_BOX)
        registerItem("bamboo_medical_drawer_case", BAMBOO_MEDICAL_DRAWER_CASE)
        registerItem("bamboo_block_medical_drawer_case", BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)
        registerItem("stripped_bamboo_block_medical_drawer_case", STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)

        registerItem("crimson_medical_box", CRIMSON_MEDICAL_BOX)
        registerItem("crimson_medical_drawer_case", CRIMSON_MEDICAL_DRAWER_CASE)
        registerItem("crimson_block_medical_drawer_case", CRIMSON_STEM_MEDICAL_DRAWER_CASE)
        registerItem("stripped_crimson_block_medical_drawer_case", STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE)

        registerItem("warped_medical_box", WARPED_MEDICAL_BOX)
        registerItem("warped_medical_drawer_case", WARPED_MEDICAL_DRAWER_CASE)
        registerItem("warped_block_medical_drawer_case", WARPED_STEM_MEDICAL_DRAWER_CASE)
        registerItem("stripped_warped_block_medical_drawer_case", STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE)

        registerItem("cherry_kitchen_drawer_box", CHERRY_KITCHEN_DRAWER_BOX)
        RegistryHelper.Items.registerKitchenDrawerCase(
            "white_cherry_kitchen_drawer_case",
            WHITE_CHERRY_KITCHEN_DRAWER_CASE
        )
        RegistryHelper.Items.registerKitchenDrawerCase(
            "black_cherry_kitchen_drawer_case",
            BLACK_CHERRY_KITCHEN_DRAWER_CASE
        )
        RegistryHelper.Items.registerKitchenDrawerCase(
            "white_cherry_log_kitchen_drawer_case",
            WHITE_CHERRY_LOG_KITCHEN_DRAWER_CASE
        )
        RegistryHelper.Items.registerKitchenDrawerCase(
            "black_cherry_log_kitchen_drawer_case",
            BLACK_CHERRY_LOG_KITCHEN_DRAWER_CASE
        )
        RegistryHelper.Items.registerKitchenDrawerCase(
            "white_stripped_cherry_log_kitchen_drawer_case",
            WHITE_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER_CASE
        )
        RegistryHelper.Items.registerKitchenDrawerCase(
            "black_stripped_cherry_log_kitchen_drawer_case",
            BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER_CASE
        )
    }

    private fun registerItem(path: String, item: Item) {
        Registry.register(Registries.ITEM, Identifier(ScuroFurniture.MOD_ID, path), item)
        ITEMS[Identifier(ScuroFurniture.MOD_ID, path)] = item
    }
}