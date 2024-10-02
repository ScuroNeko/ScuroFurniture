package ru.scuroneko.furniture.api.state

import net.minecraft.util.StringIdentifiable

enum class StackableDrawerHinge(s: String) : StringIdentifiable {
    LEFT("left"),
    RIGHT("right");

    override fun toString(): String = this.asString().lowercase()
    override fun asString(): String = this.name.lowercase()
}