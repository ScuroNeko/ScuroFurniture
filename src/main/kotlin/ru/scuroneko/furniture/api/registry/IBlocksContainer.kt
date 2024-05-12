package ru.scuroneko.furniture.api.registry

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

interface IBlocksContainer : IRegistryContainer<Block> {
    override fun getRegistry(): Registry<Block> = Registries.BLOCK
    fun getBlockItem(block: Block): BlockItem = BlockItem(block, FabricItemSettings())
}