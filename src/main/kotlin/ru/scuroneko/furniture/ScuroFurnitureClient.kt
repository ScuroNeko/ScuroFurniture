package ru.scuroneko.furniture

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
import net.minecraft.client.gui.screen.ingame.HandledScreens
import net.minecraft.client.render.RenderLayer
import ru.scuroneko.furniture.client.SofaEntityRenderer
import ru.scuroneko.furniture.gui.BedsideTableScreen
import ru.scuroneko.furniture.gui.CarpenterTableScreen
import ru.scuroneko.furniture.gui.MedicalDrawerScreen

@Environment(EnvType.CLIENT)
object ScuroFurnitureClient : ClientModInitializer {
	override fun onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.CARPENTER_TABLE_SCREEN_HANDLER, ::CarpenterTableScreen)
		HandledScreens.register(ModScreenHandlers.MEDICAL_DRAWER_SCREEN_HANDLER, ::MedicalDrawerScreen)
		HandledScreens.register(ModScreenHandlers.BEDSIDE_TABLE_SCREEN_HANDLER, ::BedsideTableScreen)

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_MEDICAL_DRAWER, RenderLayer.getCutout())
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BEDSIDE_TABLE, RenderLayer.getCutout())

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_OAK_LAMP, RenderLayer.getCutout())

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_CHERRY_SOFA, RenderLayer.getCutout())

		EntityRendererRegistry.register(ModEntities.SOFA_ENTITY) { context -> SofaEntityRenderer(context) }
	}
}