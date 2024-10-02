package ru.scuroneko.furniture.registry.blocks

import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.blocks.MedicalDrawerBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object MedicalDrawers {
    fun register() {
        RegistryHelper.Items.MEDICAL_DRAWERS_CASES.forEach { case ->
            RegistryHelper.Items.MEDICAL_DRAWERS_BOXES.forEach { box ->
                register(MedicalDrawerBlock(case, box))
            }
        }
    }

    private fun register(block: MedicalDrawerBlock) {
        val item = BlockItem(block, Item.Settings())
        val id = Identifier.of(ScuroFurniture.MOD_ID, block.getDrawerName())

        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, item)

        RegistryHelper.Blocks.MEDICAL_DRAWERS.add(block)
        RegistryHelper.Blocks.BLOCKS.add(block)
    }
}