package ru.scuroneko.furniture.registry

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType
import net.minecraft.block.StonecutterBlock
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.codec.PacketCodecs
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.resource.featuretoggle.FeatureFlag
import net.minecraft.resource.featuretoggle.FeatureFlags
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.screen.StonecutterScreenHandler
import ru.scuroneko.furniture.api.registry.autoregistry.IRegistryContainer
import ru.scuroneko.furniture.gui.BedsideTableScreenHandler
import ru.scuroneko.furniture.gui.KitchenDrawerScreenHandler
import ru.scuroneko.furniture.gui.MedicalDrawerScreenHandler


object ModScreenHandlers : IRegistryContainer<ScreenHandlerType<*>> {
    val MEDICAL_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::MedicalDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val BEDSIDE_TABLE_SCREEN_HANDLER = ScreenHandlerType(::BedsideTableScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val KITCHEN_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::KitchenDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)

    override fun getRegistry(): Registry<ScreenHandlerType<*>> = Registries.SCREEN_HANDLER
}