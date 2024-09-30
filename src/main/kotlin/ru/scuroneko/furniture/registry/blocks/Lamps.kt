package ru.scuroneko.furniture.registry.blocks

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import ru.scuroneko.furniture.api.registry.autoregistry.IBlocksContainer
import ru.scuroneko.furniture.blocks.LampBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object Lamps : IBlocksContainer {
    val WHITE_OAK_LAMP = LampBlock(
        Blocks.OAK_SLAB, Blocks.OAK_FENCE, Blocks.WHITE_WOOL, Blocks.STRIPPED_OAK_LOG
    )
    val BLACK_OAK_LAMP = LampBlock(
        Blocks.OAK_SLAB, Blocks.OAK_FENCE, Blocks.BLACK_WOOL, Blocks.STRIPPED_OAK_LOG
    )

    val WHITE_CHERRY_LAMP = LampBlock(
        Blocks.CHERRY_SLAB, Blocks.CHERRY_FENCE, Blocks.WHITE_WOOL, Blocks.STRIPPED_CHERRY_LOG
    )
    val BLACK_CHERRY_LAMP = LampBlock(
        Blocks.CHERRY_SLAB, Blocks.CHERRY_FENCE, Blocks.BLACK_WOOL, Blocks.STRIPPED_CHERRY_LOG
    )

    override fun afterEach(obj: Block) {
        RegistryHelper.Blocks.LAMPS.add(obj as LampBlock)
        RegistryHelper.Blocks.BLOCKS.add(obj)
    }
}