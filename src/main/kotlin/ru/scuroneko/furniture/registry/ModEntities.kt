package ru.scuroneko.furniture.registry

import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import ru.scuroneko.furniture.api.registry.IRegistryContainer
import ru.scuroneko.furniture.blocks.entity.SofaEntity

object ModEntities : IRegistryContainer<EntityType<*>> {
    val SOFA_ENTITY = EntityType.Builder.create({ _, world -> SofaEntity(world) }, SpawnGroup.MISC)
        .setDimensions(1f, 0f).build(null)

    override fun getRegistry(): Registry<EntityType<*>> = Registries.ENTITY_TYPE
}