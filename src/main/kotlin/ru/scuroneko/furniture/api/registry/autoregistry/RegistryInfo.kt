package ru.scuroneko.furniture.api.registry.autoregistry

data class RegistryInfo<T : Any>(
    val obj: T,
    val name: String,
    val namespace: String
)