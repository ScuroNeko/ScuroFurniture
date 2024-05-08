package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import ru.scuroneko.furniture.ModBlocks

class LootTableGeneratorProvider(dataOutput: FabricDataOutput) : FabricBlockLootTableProvider(dataOutput) {
    override fun generate() {
        ModBlocks.BLOCKS.values.forEach(::dropSelf)
    }

    private fun dropSelf(block: Block) {
        addDrop(block, drops(block))
    }
}