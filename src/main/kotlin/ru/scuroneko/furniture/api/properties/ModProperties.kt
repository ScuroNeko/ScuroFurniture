package ru.scuroneko.furniture.api.properties

import net.minecraft.state.property.EnumProperty

object ModProperties {
    val SOFA_TYPE: EnumProperty<SofaType> = EnumProperty.of("type", SofaType::class.java)
    val COFFEE_TABLE_TYPE: EnumProperty<TableType> = EnumProperty.of("type", TableType::class.java)
}