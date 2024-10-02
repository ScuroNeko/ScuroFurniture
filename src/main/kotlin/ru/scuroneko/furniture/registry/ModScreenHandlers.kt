package ru.scuroneko.furniture.registry

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.resource.featuretoggle.FeatureFlags
import net.minecraft.screen.ScreenHandlerType
import ru.scuroneko.furniture.api.registry.autoregistry.IRegistryContainer
import ru.scuroneko.furniture.gui.*

object ModScreenHandlers : IRegistryContainer<ScreenHandlerType<*>> {
    val MEDICAL_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::MedicalDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val BEDSIDE_TABLE_SCREEN_HANDLER = ScreenHandlerType(::BedsideTableScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val KITCHEN_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::KitchenDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val KITCHEN_CABINET_SCREEN_HANDLER = ScreenHandlerType(::KitchenCabinetScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val SINGLE_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::SingleDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)

    override fun getRegistry(): Registry<ScreenHandlerType<*>> = Registries.SCREEN_HANDLER
}