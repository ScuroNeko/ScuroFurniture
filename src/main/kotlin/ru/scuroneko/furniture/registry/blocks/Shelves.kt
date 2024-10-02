package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import ru.scuroneko.furniture.api.registry.autoregistry.IBlocksContainer
import ru.scuroneko.furniture.blocks.ShelfBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object Shelves : IBlocksContainer {
    val OAK_SHELF = ShelfBlock(Blocks.OAK_SLAB)
    val SPRUCE_SHELF = ShelfBlock(Blocks.SPRUCE_SLAB)
    val BIRCH_SHELF = ShelfBlock(Blocks.BIRCH_SLAB)
    val JUNGLE_SHELF = ShelfBlock(Blocks.JUNGLE_SLAB)
    val ACACIA_SHELF = ShelfBlock(Blocks.ACACIA_SLAB)
    val DARK_OAK_SHELF = ShelfBlock(Blocks.DARK_OAK_SLAB)
    val MANGROVE_SHELF = ShelfBlock(Blocks.MANGROVE_SLAB)
    val CHERRY_SHELF = ShelfBlock(Blocks.CHERRY_SLAB)
    val CRIMSON_SHELF = ShelfBlock(Blocks.CRIMSON_SLAB)
    val WARPED_SHELF = ShelfBlock(Blocks.WARPED_SLAB)

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.SHELVES.add(obj as ShelfBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}