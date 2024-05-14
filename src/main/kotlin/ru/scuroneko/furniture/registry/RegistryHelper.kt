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
        val BLOCKS = mutableListOf<Block>()
        val MEDICAL_DRAWERS = mutableListOf<MedicalDrawerBlock>()
        val BEDSIDE_DRAWERS = mutableListOf<BedsideDrawerBlock>()
        val KITCHEN_DRAWERS = mutableListOf<KitchenDrawerBlock>()
        val KITCHEN_CABINETS = mutableListOf<KitchenCabinetBlock>()
        val LAMPS = mutableListOf<LampBlock>()
        val SOFAS = mutableListOf<SofaBlock>()

        val COFFEE_TABLES = mutableListOf<CoffeeTableBlock>()
    }

    object Items {
        val ITEMS = mutableListOf<Item>()

        val MEDICAL_DRAWERS_BOXES = mutableListOf<BoxItem>()
        val MEDIUM_DRAWERS_BOXES = mutableListOf<BoxItem>()
        val KITCHEN_CABINET_DOORS = mutableListOf<BoxItem>()

        val MEDICAL_DRAWERS_CASES = mutableListOf<MedicalDrawerCaseItem>()
        val BEDSIDE_DRAWERS_CASES = mutableListOf<CaseItem>()
        val KITCHEN_DRAWERS_CASES = mutableListOf<KitchenDrawerCaseItem>()
        val KITCHEN_CABINETS_CASES = mutableListOf<CaseItem>()

        val MEDICAL_DRAWERS = mutableListOf<BlockItem>()
    }
}