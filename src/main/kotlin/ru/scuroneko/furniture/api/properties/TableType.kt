package ru.scuroneko.furniture.api.properties

import net.minecraft.util.StringIdentifiable

enum class TableType : StringIdentifiable {
    SINGLE {
        override fun asString(): String = "single"
    },
    LEFT {
        override fun asString(): String = "left"
    },
    CENTER {
        override fun asString(): String = "center"
    },
    RIGHT {
        override fun asString(): String = "right"
    }
}