package ru.scuroneko.furniture

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.gui.screen.ingame.HandledScreens
import net.minecraft.client.render.RenderLayer
import ru.scuroneko.furniture.gui.*
import ru.scuroneko.furniture.registry.ModScreenHandlers
import ru.scuroneko.furniture.registry.RegistryHelper

@Environment(EnvType.CLIENT)
object ScuroFurnitureClient : ClientModInitializer {
    override fun onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MEDICAL_DRAWER_SCREEN_HANDLER, ::MedicalDrawerScreen)
        HandledScreens.register(ModScreenHandlers.BEDSIDE_TABLE_SCREEN_HANDLER, ::BedsideTableScreen)
        HandledScreens.register(ModScreenHandlers.KITCHEN_DRAWER_SCREEN_HANDLER, ::KitchenDrawerScreen)
        HandledScreens.register(ModScreenHandlers.KITCHEN_CABINET_SCREEN_HANDLER, ::KitchenCabinetScreen)
        HandledScreens.register(ModScreenHandlers.SINGLE_DRAWER_SCREEN_HANDLER, ::SingleDrawerScreen)

        RegistryHelper.Blocks.MEDICAL_DRAWERS.forEach { drawer ->
            BlockRenderLayerMap.INSTANCE.putBlock(drawer, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.BEDSIDE_DRAWERS.forEach { drawer ->
            BlockRenderLayerMap.INSTANCE.putBlock(drawer, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.KITCHEN_DRAWERS.forEach { drawer ->
            BlockRenderLayerMap.INSTANCE.putBlock(drawer, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.KITCHEN_CABINETS.forEach { cabinet ->
            BlockRenderLayerMap.INSTANCE.putBlock(cabinet, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.KITCHEN_GLASS_CABINETS.forEach { cabinet ->
            BlockRenderLayerMap.INSTANCE.putBlock(cabinet, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.SINGLE_DRAWERS.forEach { drawer ->
            BlockRenderLayerMap.INSTANCE.putBlock(drawer, RenderLayer.getCutout())
        }
        RegistryHelper.Blocks.SHELVES.forEach { shelf ->
            BlockRenderLayerMap.INSTANCE.putBlock(shelf, RenderLayer.getCutout())
        }
    }
}