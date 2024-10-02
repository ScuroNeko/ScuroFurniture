package ru.scuroneko.furniture.registry

import net.minecraft.entity.EntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import ru.scuroneko.furniture.api.registry.autoregistry.IRegistryContainer

object ModEntities : IRegistryContainer<EntityType<*>> {

    override fun getRegistry(): Registry<EntityType<*>> = Registries.ENTITY_TYPE
}