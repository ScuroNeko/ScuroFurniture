package ru.scuroneko.furniture.api.registry.autoregistry

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

@FunctionalInterface
interface IRegistryContainer<T : Any> {
    /**
     * Should return a [Registry], i.e. [Registries.ITEM]
     */
    fun getRegistry(): Registry<T>

    /**
     * Called before [Registry.register]
     */
    fun beforeEach(obj: T) {}

    /**
     * Called after [Registry.register]
     */
    fun afterEach(obj: T) {}

    /**
     * Called before processing fields
     */
    fun beforeRegistry() {}

    /**
     * Called after processing fields
     */
    fun afterRegistry() {}
}