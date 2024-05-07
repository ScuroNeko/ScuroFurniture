package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import ru.scuroneko.furniture.carpenter.CarpenterBlocks

class LootTableGeneratorProvider(dataOutput: FabricDataOutput) : FabricBlockLootTableProvider(dataOutput) {
    override fun generate() {
//        dropSelf(RoadBlocks.STREET_LAMP_BOTTOM)
//        dropSelf(Blocks.STREET_LAMP_POLE)
//        dropSelf(Blocks.STREET_LAMP_SINGLE)
//        dropSelf(Blocks.STREET_LAMP_DOUBLE)
//
//        dropSelf(Blocks.ROAD_RAIL_STRAIGHT)
//
//        Blocks.asphaltFullBlocks.forEach { dropSelf(it.value) }
//        Blocks.asphalt78Blocks.forEach { dropSelf(it.value) }
//        Blocks.roadSigns.forEach { dropSelf(it.value) }

        CarpenterBlocks.BLOCKS.values.forEach(::dropSelf)
    }

    private fun dropSelf(block: Block) {
        addDrop(block, drops(block))
    }
}