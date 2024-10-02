package ru.scuroneko.furniture.api.state

import net.minecraft.state.property.EnumProperty

object ModProperties {
    val STACKABLE_DRAWER_PART: EnumProperty<StackableDrawerPart> = EnumProperty.of("part", StackableDrawerPart::class.java)
}