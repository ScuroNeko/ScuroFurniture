package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import ru.scuroneko.furniture.api.registry.IBlocksContainer
import ru.scuroneko.furniture.blocks.BedsideDrawerBlock
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes

object BedsideDrawers : IBlocksContainer {
    val CHERRY_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.CHERRY_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX
    )
    val CHERRY_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.CHERRY_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_CHERRY_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX
    )

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.add(obj as BedsideDrawerBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}