package ru.scuroneko.furniture.api.registry.autoregistry

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item.Settings
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

interface IBlocksContainer : IRegistryContainer<Block> {
    override fun getRegistry(): Registry<Block> = Registries.BLOCK
    fun getBlockItem(block: Block): BlockItem = BlockItem(block, Settings())
    fun afterBlockItem(item: BlockItem) {}
}