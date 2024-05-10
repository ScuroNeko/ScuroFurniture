package ru.scuroneko.furniture

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.resource.featuretoggle.FeatureFlags
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.gui.BedsideTableScreenHandler
import ru.scuroneko.furniture.gui.CarpenterTableScreenHandler
import ru.scuroneko.furniture.gui.KitchenDrawerScreenHandler
import ru.scuroneko.furniture.gui.MedicalDrawerScreenHandler

object ModScreenHandlers {
//    lateinit var ROAD_WORKER_STATION_SCREEN_HANDLER: ScreenHandlerType<RoadWorkerStationScreenHandler>

    lateinit var CARPENTER_TABLE_SCREEN_HANDLER: ScreenHandlerType<CarpenterTableScreenHandler>
    lateinit var MEDICAL_DRAWER_SCREEN_HANDLER: ScreenHandlerType<MedicalDrawerScreenHandler>
    lateinit var BEDSIDE_TABLE_SCREEN_HANDLER: ScreenHandlerType<BedsideTableScreenHandler>
    lateinit var KITCHEN_DRAWER_SCREEN_HANDLER: ScreenHandlerType<KitchenDrawerScreenHandler>

    fun register() {
//        ROAD_WORKER_STATION_SCREEN_HANDLER = register(Identifier(ScuroFurniture.ROADS_MOD_ID, "road_worker_station"), ::RoadWorkerStationScreenHandler)

        CARPENTER_TABLE_SCREEN_HANDLER =
            register(Identifier(ScuroFurniture.MOD_ID, "carpenter_table"), ::CarpenterTableScreenHandler)
        MEDICAL_DRAWER_SCREEN_HANDLER =
            register(Identifier(ScuroFurniture.MOD_ID, "medical_drawer"), ::MedicalDrawerScreenHandler)
        BEDSIDE_TABLE_SCREEN_HANDLER =
            register(Identifier(ScuroFurniture.MOD_ID, "bedside_table"), ::BedsideTableScreenHandler)
        KITCHEN_DRAWER_SCREEN_HANDLER =
            register(Identifier(ScuroFurniture.MOD_ID, "kitchen_drawer"), ::KitchenDrawerScreenHandler)
    }

    private fun <T : ScreenHandler> register(
        id: Identifier,
        factory: ScreenHandlerType.Factory<T>
    ): ScreenHandlerType<T> {
        return Registry.register(
            Registries.SCREEN_HANDLER,
            id,
            ScreenHandlerType(factory, FeatureFlags.VANILLA_FEATURES)
        )
    }
}