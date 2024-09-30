package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import ru.scuroneko.furniture.api.registry.autoregistry.IBlocksContainer
import ru.scuroneko.furniture.blocks.KitchenGlassCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.items.KitchenCabinetComponents

object KitchenCabinets : IBlocksContainer {
    val CHERRY_KITCHEN_CABINET = KitchenCabinetBlock(
        KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_CASE, KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_DOOR
    )

    val CHERRY_KITCHEN_GLASS_CABINET = KitchenGlassCabinetBlock(
        KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_CASE, KitchenCabinetComponents.CHERRY_KITCHEN_CABINET_GLASS_DOOR
    )

    override fun afterEach(obj: Block) {
        if(obj is KitchenCabinetBlock)
            RegistryHelper.Blocks.KITCHEN_CABINETS.add(obj)
        if(obj is KitchenGlassCabinetBlock)
            RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.add(obj)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}