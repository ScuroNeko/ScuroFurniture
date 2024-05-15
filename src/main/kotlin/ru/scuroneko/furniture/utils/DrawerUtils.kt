package ru.scuroneko.furniture.utils

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.Constants

object DrawerUtils {
    fun blockToMaterial(block: Block): String = when(block) {
        Blocks.OAK_PLANKS, Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG -> "oak"
        Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG -> "spruce"
        Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG -> "birch"
        Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG -> "air"
        Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG -> "cherry"
        else -> "air"
    }

    fun materialToId(holder: Constants.ScreenMaterialTextures.DrawerIdHolder, material: String): Identifier = when(material) {
        "oak" -> holder.OAK
        "spruce" -> holder.SPRUCE
        "cherry" -> holder.CHERRY
        else -> holder.DEFAULT
    }
}