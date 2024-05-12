package ru.scuroneko.furniture.api.registry

data class RegistryInfo<T : Any>(
    val obj: T,
    val name: String,
    val namespace: String
)