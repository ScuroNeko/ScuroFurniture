package ru.scuroneko.furniture

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.ScuroFurnitureBlocksAPI
import ru.scuroneko.furniture.blocks.CarpenterTableBlock
import ru.scuroneko.furniture.registry.RegistryHelper

object ModBlocks {
    val CARPENTER_TABLE = CarpenterTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE))

    fun register() {
        registerBlock("carpenter_table", CARPENTER_TABLE)
    }

    private fun registerBlock(path: String, block: Block) {
        ScuroFurnitureBlocksAPI.registerBlock(
            Identifier(ScuroFurniture.MOD_ID, path), block
        )
        RegistryHelper.Blocks.BLOCKS.add(block)
    }
}