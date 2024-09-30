package ru.scuroneko.furniture.registry

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import ru.scuroneko.furniture.blocks.*
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.item.MedicalDrawerCaseItem

object RegistryHelper {
    object Blocks {
        val BLOCKS = ArrayList<Block>()

        val MEDICAL_DRAWERS = ArrayList<MedicalDrawerBlock>()
        val BEDSIDE_DRAWERS = ArrayList<BedsideDrawerBlock>()
        val KITCHEN_DRAWERS = ArrayList<KitchenDrawerBlock>()
        val KITCHEN_CABINETS = ArrayList<KitchenCabinetBlock>()
        val KITCHEN_GLASS_CABINETS = ArrayList<KitchenGlassCabinetBlock>()
        val LAMPS = ArrayList<LampBlock>()
        val SOFAS = ArrayList<SofaBlock>()

        val SHELVES = ArrayList<ShelfBlock>()
    }

    object Items {
        val ITEMS = ArrayList<Item>()

        val MEDICAL_DRAWERS_BOXES = ArrayList<BoxItem>()
        val MEDIUM_DRAWERS_BOXES = ArrayList<BoxItem>()
        val KITCHEN_CABINET_DOORS = ArrayList<BoxItem>()

        val MEDICAL_DRAWERS_CASES = ArrayList<MedicalDrawerCaseItem>()
        val BEDSIDE_DRAWERS_CASES = ArrayList<CaseItem>()
        val KITCHEN_DRAWERS_CASES = ArrayList<KitchenDrawerCaseItem>()
        val KITCHEN_CABINETS_CASES = ArrayList<CaseItem>()

        val MEDICAL_DRAWERS = ArrayList<BlockItem>()
    }
}