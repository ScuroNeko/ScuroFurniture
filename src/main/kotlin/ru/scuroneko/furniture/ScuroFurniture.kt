package ru.scuroneko.furniture

import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.carpenter.CarpenterModule
import ru.scuroneko.furniture.config.ScuroFurnitureConfig
import ru.scuroneko.furniture.roads.RoadModule

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("scuro_furniture")
	const val MOD_ID = "scuro_furniture"
	const val ROADS_MOD_ID = "scuro_furniture_roads"
	const val CARPENTER_MOD_ID = "scuro_furniture_carpenter"

	override fun onInitialize() {
		AutoConfig.register(ScuroFurnitureConfig::class.java, ::GsonConfigSerializer)
		ModItemGroups.register()

		ModItems.register()

		ModScreenHandlers.register()

		val config = AutoConfig.getConfigHolder(ScuroFurnitureConfig::class.java).config
		if(config.isRoadModuleEnabled)
			RoadModule.init()
		if(config.isCarpenterModuleEnabled)
			CarpenterModule.init()
	}
}