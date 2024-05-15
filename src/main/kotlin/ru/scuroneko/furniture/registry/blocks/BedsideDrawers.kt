package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import ru.scuroneko.furniture.api.registry.IBlocksContainer
import ru.scuroneko.furniture.blocks.BedsideDrawerBlock
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes

object BedsideDrawers : IBlocksContainer {
    val OAK_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.OAK_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.OAK_MEDIUM_DRAWER_BOX
    )
    val OAK_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.OAK_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.OAK_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_OAK_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_OAK_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.OAK_MEDIUM_DRAWER_BOX
    )

    val SPRUCE_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.SPRUCE_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.SPRUCE_MEDIUM_DRAWER_BOX
    )
    val SPRUCE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.SPRUCE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.SPRUCE_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_SPRUCE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.SPRUCE_MEDIUM_DRAWER_BOX
    )

    val BIRCH_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.BIRCH_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.BIRCH_MEDIUM_DRAWER_BOX
    )
    val BIRCH_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.BIRCH_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.BIRCH_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_BIRCH_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.BIRCH_MEDIUM_DRAWER_BOX
    )

    val JUNGLE_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.JUNGLE_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.JUNGLE_MEDIUM_DRAWER_BOX
    )
    val JUNGLE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.JUNGLE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.JUNGLE_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_JUNGLE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.JUNGLE_MEDIUM_DRAWER_BOX
    )

    val ACACIA_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.ACACIA_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.ACACIA_MEDIUM_DRAWER_BOX
    )
    val ACACIA_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.ACACIA_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.ACACIA_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_ACACIA_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.ACACIA_MEDIUM_DRAWER_BOX
    )

    val DARK_OAK_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.DARK_OAK_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.DARK_OAK_MEDIUM_DRAWER_BOX
    )
    val DARK_OAK_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.DARK_OAK_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.DARK_OAK_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_DARK_OAK_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.DARK_OAK_MEDIUM_DRAWER_BOX
    )

    val MANGROVE_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.MANGROVE_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.MANGROVE_MEDIUM_DRAWER_BOX
    )
    val MANGROVE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.MANGROVE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.MANGROVE_MEDIUM_DRAWER_BOX
    )
    val STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER = BedsideDrawerBlock(
        BedsideDrawersComponents.STRIPPED_MANGROVE_LOG_BEDSIDE_DRAWER_CASE, MediumDrawerBoxes.MANGROVE_MEDIUM_DRAWER_BOX
    )

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