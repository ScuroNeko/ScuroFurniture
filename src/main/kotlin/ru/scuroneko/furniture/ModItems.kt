package ru.scuroneko.furniture

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    val ITEMS = LinkedHashMap<Identifier, Item>()

    val OAK_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val OAK_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val OAK_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val SPRUCE_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val SPRUCE_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val SPRUCE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val BIRCH_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val BIRCH_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val BIRCH_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val JUNGLE_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val JUNGLE_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val JUNGLE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val ACACIA_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val ACACIA_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val ACACIA_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val DARK_OAK_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val DARK_OAK_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val DARK_OAK_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val MANGROVE_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val MANGROVE_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val MANGROVE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val CHERRY_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val CHERRY_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val CHERRY_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val BAMBOO_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val BAMBOO_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val BAMBOO_BLOCK_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val WARPED_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val WARPED_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val WARPED_STEM_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    val CRIMSON_MEDICAL_DRAWER_BOX = Item(FabricItemSettings())
    val CRIMSON_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val CRIMSON_STEM_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())
    val STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE = Item(FabricItemSettings())

    fun register() {
        registerItem("oak_medical_box", OAK_MEDICAL_DRAWER_BOX)
        registerItem("oak_medical_drawer_case", OAK_MEDICAL_DRAWER_CASE)
        registerItem("oak_log_medical_drawer_case", OAK_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_oak_log_medical_drawer_case", STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE)

        registerItem("spruce_medical_box", SPRUCE_MEDICAL_DRAWER_BOX)
        registerItem("spruce_medical_drawer_case", SPRUCE_MEDICAL_DRAWER_CASE)
        registerItem("spruce_log_medical_drawer_case", SPRUCE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_spruce_log_medical_drawer_case", STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("birch_medical_box", BIRCH_MEDICAL_DRAWER_BOX)
        registerItem("birch_medical_drawer_case", BIRCH_MEDICAL_DRAWER_CASE)
        registerItem("birch_log_medical_drawer_case", BIRCH_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_birch_log_medical_drawer_case", STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE)

        registerItem("jungle_medical_box", JUNGLE_MEDICAL_DRAWER_BOX)
        registerItem("jungle_medical_drawer_case", JUNGLE_MEDICAL_DRAWER_CASE)
        registerItem("jungle_log_medical_drawer_case", JUNGLE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_jungle_log_medical_drawer_case", STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("acacia_medical_box", ACACIA_MEDICAL_DRAWER_BOX)
        registerItem("acacia_medical_drawer_case", ACACIA_MEDICAL_DRAWER_CASE)
        registerItem("acacia_log_medical_drawer_case", ACACIA_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_acacia_log_medical_drawer_case", STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE)

        registerItem("dark_oak_medical_box", DARK_OAK_MEDICAL_DRAWER_BOX)
        registerItem("dark_oak_medical_drawer_case", DARK_OAK_MEDICAL_DRAWER_CASE)
        registerItem("dark_oak_log_medical_drawer_case", DARK_OAK_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_dark_oak_log_medical_drawer_case", STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE)

        registerItem("mangrove_medical_box", MANGROVE_MEDICAL_DRAWER_BOX)
        registerItem("mangrove_medical_drawer_case", MANGROVE_MEDICAL_DRAWER_CASE)
        registerItem("mangrove_log_medical_drawer_case", MANGROVE_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_mangrove_log_medical_drawer_case", STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE)

        registerItem("cherry_medical_box", CHERRY_MEDICAL_DRAWER_BOX)
        registerItem("cherry_medical_drawer_case", CHERRY_MEDICAL_DRAWER_CASE)
        registerItem("cherry_log_medical_drawer_case", CHERRY_LOG_MEDICAL_DRAWER_CASE)
        registerItem("stripped_cherry_log_medical_drawer_case", STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE)

        registerItem("bamboo_medical_box", BAMBOO_MEDICAL_DRAWER_BOX)
        registerItem("bamboo_medical_drawer_case", BAMBOO_MEDICAL_DRAWER_CASE)
        registerItem("bamboo_block_medical_drawer_case", BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)
        registerItem("stripped_bamboo_block_medical_drawer_case", STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE)

        registerItem("crimson_medical_box", CRIMSON_MEDICAL_DRAWER_BOX)
        registerItem("crimson_medical_drawer_case", CRIMSON_MEDICAL_DRAWER_CASE)
        registerItem("crimson_block_medical_drawer_case", CRIMSON_STEM_MEDICAL_DRAWER_CASE)
        registerItem("stripped_crimson_block_medical_drawer_case", STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE)

        registerItem("warped_medical_box", WARPED_MEDICAL_DRAWER_BOX)
        registerItem("warped_medical_drawer_case", WARPED_MEDICAL_DRAWER_CASE)
        registerItem("warped_block_medical_drawer_case", WARPED_STEM_MEDICAL_DRAWER_CASE)
        registerItem("stripped_warped_block_medical_drawer_case", STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE)
    }

    private fun registerItem(path: String, item: Item) {
        Registry.register(Registries.ITEM, Identifier(ScuroFurniture.MOD_ID, path), item)
        ITEMS[Identifier(ScuroFurniture.MOD_ID, path)] = item
    }
}