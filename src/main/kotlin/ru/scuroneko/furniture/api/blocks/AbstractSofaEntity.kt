package ru.scuroneko.furniture.api.blocks

import net.minecraft.entity.Entity
import net.minecraft.entity.EntityType
import net.minecraft.world.World

abstract class AbstractSofaEntity<T : Entity>(world: World, type: EntityType<T>) : Entity(type, world) {
    override fun shouldRender(cameraX: Double, cameraY: Double, cameraZ: Double): Boolean = false
    override fun shouldRender(distance: Double): Boolean = false
}