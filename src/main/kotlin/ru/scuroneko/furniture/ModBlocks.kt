package ru.scuroneko.furniture

import net.minecraft.block.Block
import ru.scuroneko.furniture.api.registry.autoregistry.IBlocksContainer
import ru.scuroneko.furniture.registry.RegistryHelper

object ModBlocks: IBlocksContainer {
    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}