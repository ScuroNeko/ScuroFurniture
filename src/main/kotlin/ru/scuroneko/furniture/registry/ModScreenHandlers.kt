package ru.scuroneko.furniture.registry

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType
import net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.BOX
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.resource.featuretoggle.FeatureFlags
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.gui.BedsideTableScreenHandler
import ru.scuroneko.furniture.gui.KitchenDrawerScreenHandler
import ru.scuroneko.furniture.gui.MedicalDrawerScreenHandler


object ModScreenHandlers {
    val MEDICAL_DRAWER_SCREEN_HANDLER = ExtendedScreenHandlerType(::MedicalDrawerScreenHandler)
    val BEDSIDE_TABLE_SCREEN_HANDLER = ScreenHandlerType(::BedsideTableScreenHandler, FeatureFlags.VANILLA_FEATURES)
    val KITCHEN_DRAWER_SCREEN_HANDLER = ScreenHandlerType(::KitchenDrawerScreenHandler, FeatureFlags.VANILLA_FEATURES)

    fun register() {
        register("medical_drawer", MEDICAL_DRAWER_SCREEN_HANDLER)
        register("bedside_table", BEDSIDE_TABLE_SCREEN_HANDLER)
        register("kitchen_drawer", KITCHEN_DRAWER_SCREEN_HANDLER)
    }

    private fun <T : ScreenHandler> register(
        path: String,
        factory: ScreenHandlerType<T>
    ): ScreenHandlerType<T> {
        return Registry.register(
            Registries.SCREEN_HANDLER, Identifier(ScuroFurniture.MOD_ID, path), factory
        )
    }
}