package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import ru.scuroneko.furniture.api.registry.IBlocksContainer
import ru.scuroneko.furniture.blocks.CoffeeTableBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object Tables: IBlocksContainer {
    val CHERRY_COFFEE_TABLE = CoffeeTableBlock(Blocks.CHERRY_PLANKS)

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.COFFEE_TABLES.add(obj as CoffeeTableBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}