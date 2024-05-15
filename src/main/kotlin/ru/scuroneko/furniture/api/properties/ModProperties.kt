package ru.scuroneko.furniture.api.properties

import net.minecraft.state.property.EnumProperty

object ModProperties {
    val SOFA_TYPE: EnumProperty<SofaType> = EnumProperty.of("type", SofaType::class.java)
    val COFFEE_TABLE_TYPE: EnumProperty<CoffeeTableType> = EnumProperty.of("type", CoffeeTableType::class.java)
}