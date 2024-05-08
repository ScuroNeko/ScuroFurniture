package ru.scuroneko.furniture

import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.config.ScuroFurnitureConfig

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Scuro's Furniture")
	const val MOD_ID = "scuro_furniture"

	override fun onInitialize() {
		AutoConfig.register(ScuroFurnitureConfig::class.java, ::GsonConfigSerializer)
		ModItemGroups.register()

        ModBlocks.register()
		ModItems.register()
        ModRecipes.register()

		ModScreenHandlers.register()
	}
}