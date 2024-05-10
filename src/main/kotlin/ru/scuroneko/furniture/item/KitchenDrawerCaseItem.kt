package ru.scuroneko.furniture.item

import net.minecraft.block.Block

class KitchenDrawerCaseItem(
    case: Block,
    slab: Block,
    val concrete: Block
) : CaseItem(case, slab)