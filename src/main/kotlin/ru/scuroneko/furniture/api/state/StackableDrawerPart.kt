package ru.scuroneko.furniture.api.state

import net.minecraft.util.StringIdentifiable

enum class StackableDrawerPart(s: String) : StringIdentifiable {
    SINGLE("single"),
    UP("up"),
    DOWN("down"),
    CENTER("center");

    override fun toString(): String = this.asString().lowercase()
    override fun asString(): String = this.name.lowercase()
}