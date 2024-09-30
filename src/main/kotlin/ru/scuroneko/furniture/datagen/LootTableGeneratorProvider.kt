package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import net.minecraft.registry.RegistryWrapper
import ru.scuroneko.furniture.registry.RegistryHelper
import java.util.concurrent.CompletableFuture

class LootTableGeneratorProvider(dataOutput: FabricDataOutput, lookup: CompletableFuture<RegistryWrapper.WrapperLookup> ) : FabricBlockLootTableProvider(dataOutput, lookup) {
    override fun generate() {
        RegistryHelper.Blocks.BLOCKS.forEach(::dropSelf)
    }

    private fun dropSelf(block: Block) {
        addDrop(block, drops(block))
    }
}