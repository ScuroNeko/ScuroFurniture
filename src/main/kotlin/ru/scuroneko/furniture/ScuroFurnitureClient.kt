package ru.scuroneko.furniture

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
import net.minecraft.client.gui.screen.ingame.HandledScreens
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories
import ru.scuroneko.furniture.client.SofaEntityRenderer
import ru.scuroneko.furniture.client.renderer.MedicalDrawerBlockEntityRenderer
import ru.scuroneko.furniture.gui.BedsideTableScreen
import ru.scuroneko.furniture.gui.KitchenDrawerScreen
import ru.scuroneko.furniture.gui.MedicalDrawerScreen
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.ModEntities
import ru.scuroneko.furniture.registry.ModScreenHandlers
import ru.scuroneko.furniture.registry.blocks.*

@Environment(EnvType.CLIENT)
object ScuroFurnitureClient : ClientModInitializer {
    override fun onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MEDICAL_DRAWER_SCREEN_HANDLER, ::MedicalDrawerScreen)
        HandledScreens.register(ModScreenHandlers.BEDSIDE_TABLE_SCREEN_HANDLER, ::BedsideTableScreen)
        HandledScreens.register(ModScreenHandlers.KITCHEN_DRAWER_SCREEN_HANDLER, ::KitchenDrawerScreen)

        BlockRenderLayerMap.INSTANCE.putBlock(MedicalDrawers.OAK_MEDICAL_DRAWER, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(BedsideDrawers.OAK_BEDSIDE_DRAWER, RenderLayer.getCutout())

        BlockRenderLayerMap.INSTANCE.putBlock(KitchenCabinets.CHERRY_KITCHEN_CABINET, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(KitchenCabinets.CHERRY_KITCHEN_GLASS_CABINET, RenderLayer.getCutout())

        BlockRenderLayerMap.INSTANCE.putBlock(Lamps.WHITE_OAK_LAMP, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(Sofas.WHITE_OAK_SOFA, RenderLayer.getCutout())
        BlockRenderLayerMap.INSTANCE.putBlock(Shelves.OAK_SHELF, RenderLayer.getCutout())

        EntityRendererRegistry.register(ModEntities.SOFA_ENTITY) { context -> SofaEntityRenderer(context) }

        BlockEntityRendererFactories.register(ModBlockEntities.MEDICAL_DRAWER_BLOCK_ENTITY, ::MedicalDrawerBlockEntityRenderer)
    }
}