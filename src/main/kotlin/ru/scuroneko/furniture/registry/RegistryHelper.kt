package ru.scuroneko.furniture.registry

import net.minecraft.block.Block
import net.minecraft.item.Item
import ru.scuroneko.furniture.blocks.*
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

object RegistryHelper {
    object Blocks {
        val BLOCKS = ArrayList<Block>()

        val MEDICAL_DRAWERS = ArrayList<MedicalDrawerBlock>()
        val BEDSIDE_DRAWERS = ArrayList<BedsideDrawerBlock>()
        val KITCHEN_DRAWERS = ArrayList<KitchenDrawerBlock>()
        val KITCHEN_CABINETS = ArrayList<KitchenCabinetBlock>()
        val KITCHEN_GLASS_CABINETS = ArrayList<KitchenGlassCabinetBlock>()

        val SINGLE_DRAWERS = ArrayList<SingleDrawerBlock>()

        val SHELVES = ArrayList<ShelfBlock>()
    }

    object Items {
        val ITEMS = ArrayList<Item>()

        val SMALL_DRAWERS_BOXES = ArrayList<BoxItem>()
        val MEDIUM_DRAWERS_BOXES = ArrayList<BoxItem>()
        val BIG_DRAWERS_BOXES = ArrayList<BoxItem>()

        val SMALL_DRAWERS_DOORS = ArrayList<DoorItem>()
        val MEDIUM_DRAWERS_DOORS = ArrayList<DoorItem>()
        val MEDIUM_DRAWERS_GLASS_DOORS = ArrayList<DoorItem>()
        val BIG_DRAWERS_DOORS = ArrayList<DoorItem>()

        val MEDICAL_DRAWERS_CASES = ArrayList<CaseItem>()
        val BEDSIDE_DRAWERS_CASES = ArrayList<CaseItem>()
        val KITCHEN_DRAWERS_CASES = ArrayList<KitchenDrawerCaseItem>()
        val KITCHEN_CABINETS_CASES = ArrayList<CaseItem>()

        val SINGLE_DRAWERS_CASES = ArrayList<CaseItem>()
    }
}