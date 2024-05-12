package ru.scuroneko.furniture.registry.items

import net.minecraft.block.Blocks
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.registry.IItemContainer
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.MedicalDrawerCaseItem
import ru.scuroneko.furniture.registry.RegistryHelper

object MedicalDrawersComponents : IItemContainer {
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
    val BAMBOO_MOSAIC_MEDICAL_DRAWER_CASE = MedicalDrawerCaseItem(Blocks.BAMBOO_MOSAIC, Blocks.BAMBOO_SLAB)
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

    override fun afterEach(obj: Item) {
        if (obj is BoxItem) RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.add(obj)
        if (obj is MedicalDrawerCaseItem) RegistryHelper.Items.MEDICAL_DRAWERS_CASES.add(obj)
        RegistryHelper.Items.ITEMS.add(obj)
    }
}