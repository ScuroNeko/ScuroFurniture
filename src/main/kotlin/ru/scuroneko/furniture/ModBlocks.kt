package ru.scuroneko.furniture

import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.registry.RegistryHelper

object ModBlocks {
    fun register() {}

    private fun registerBlock(path: String, block: Block) {
        Registry.register(
            Registries.BLOCK, Identifier(ScuroFurniture.MOD_ID, path), block
        )
        RegistryHelper.Blocks.BLOCKS.add(block)
    }
}