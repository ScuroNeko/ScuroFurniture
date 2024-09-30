package ru.scuroneko.furniture

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.registry.autoregistry.IBlocksContainer
import ru.scuroneko.furniture.registry.RegistryHelper

object ModBlocks: IBlocksContainer {
    val GLASS_OAK_CABINET = Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}