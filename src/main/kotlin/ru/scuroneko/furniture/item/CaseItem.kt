package ru.scuroneko.furniture.item

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import ru.scuroneko.furniture.Constants

open class CaseItem(
    val material: Block,
    val slab: Block
) : Item(Settings()) {
    override fun appendTooltip(
        stack: ItemStack,
        context: TooltipContext,
        tooltip: MutableList<Text>,
        type: TooltipType
    ) {
        tooltip.add(Text.translatable(Constants.Translatable.CASE_MATERIAL_TOOLTIP))
        tooltip.add(
            Text.literal("  ").append(Text.translatable(this.material.translationKey).formatted(Formatting.BLUE))
        )
    }
}