package ru.scuroneko.furniture.api.registry

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

interface IItemContainer : IRegistryContainer<Item> {
    override fun getRegistry(): Registry<Item> = Registries.ITEM
}