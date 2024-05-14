package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import ru.scuroneko.furniture.api.registry.IBlocksContainer
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.items.KitchenCabinetComponents

object KitchenCabinets : IBlocksContainer {
    val CHERRY_KITCHEN_CABINET = KitchenCabinetBlock(
        KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_CASE, KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_DOOR
    )

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.KITCHEN_CABINETS.add(obj as KitchenCabinetBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}