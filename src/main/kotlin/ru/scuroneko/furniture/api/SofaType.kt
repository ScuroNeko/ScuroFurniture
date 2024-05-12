package ru.scuroneko.furniture.api

import net.minecraft.util.StringIdentifiable

enum class SofaType : StringIdentifiable {
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