package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.HorizontalFacingBlock

class CoffeeTable(wood: Block): HorizontalFacingBlock(FabricBlockSettings.copy(wood)) {
    private constructor(settings: Settings) : this(Blocks.OAK_PLANKS)

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::CoffeeTable)
}