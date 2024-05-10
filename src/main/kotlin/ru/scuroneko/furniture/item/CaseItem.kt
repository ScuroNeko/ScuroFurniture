package ru.scuroneko.furniture.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.item.Item

open class CaseItem(
    val material: Block,
    val slab: Block
) : Item(FabricItemSettings())