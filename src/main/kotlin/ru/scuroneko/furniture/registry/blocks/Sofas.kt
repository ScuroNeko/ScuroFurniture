package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import ru.scuroneko.furniture.api.registry.IBlocksContainer
import ru.scuroneko.furniture.blocks.SofaBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object Sofas : IBlocksContainer {
    val WHITE_CHERRY_SOFA = SofaBlock(
        Blocks.CHERRY_PLANKS, Blocks.STRIPPED_CHERRY_LOG, Blocks.WHITE_WOOL
    )
    val BLACK_CHERRY_SOFA = SofaBlock(
        Blocks.CHERRY_PLANKS, Blocks.STRIPPED_CHERRY_LOG, Blocks.BLACK_WOOL
    )

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.SOFAS.add(obj as SofaBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}