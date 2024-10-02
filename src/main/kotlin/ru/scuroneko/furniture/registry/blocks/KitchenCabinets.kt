package ru.scuroneko.furniture.registry.blocks

import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenGlassCabinetBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object KitchenCabinets {
    fun register() {
        RegistryHelper.Items.KITCHEN_CABINETS_CASES.forEach { case ->
            RegistryHelper.Items.MEDIUM_DRAWERS_DOORS.forEach { door ->
                register(KitchenCabinetBlock(case, door))
            }
            RegistryHelper.Items.MEDIUM_DRAWERS_GLASS_DOORS.forEach { door ->
                registerGlass(KitchenGlassCabinetBlock(case, door))
            }
        }
    }


    private fun registerGlass(block: KitchenGlassCabinetBlock) {
        val item = BlockItem(block, Item.Settings())
        val id = Identifier.of(ScuroFurniture.MOD_ID, block.getDrawerName())

        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, item)

        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.add(block)
        RegistryHelper.Blocks.BLOCKS.add(block)
    }

    private fun register(block: KitchenCabinetBlock) {
        val item = BlockItem(block, Item.Settings())
        val id = Identifier.of(ScuroFurniture.MOD_ID, block.getDrawerName())

        Registry.register(Registries.BLOCK, id, block)
        Registry.register(Registries.ITEM, id, item)

        RegistryHelper.Blocks.KITCHEN_CABINETS.add(block)
        RegistryHelper.Blocks.BLOCKS.add(block)
    }
}