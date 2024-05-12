package ru.scuroneko.furniture.registry

import net.minecraft.entity.Entity
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.blocks.entity.SofaEntity

object ModEntities {
    val SOFA_ENTITY =
        EntityType.Builder.create({ _, world -> SofaEntity(world) }, SpawnGroup.MISC).setDimensions(1f, 0f).build()

    fun register() {
        register("sofa", SOFA_ENTITY)
    }

    private fun <T : Entity> register(path: String, type: EntityType<T>) {
        Registry.register(Registries.ENTITY_TYPE, Identifier(ScuroFurniture.MOD_ID, path), type)
    }
}