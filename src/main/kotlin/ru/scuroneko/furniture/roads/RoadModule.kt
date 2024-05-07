package ru.scuroneko.furniture.roads

import ru.scuroneko.furniture.ScuroFurniture

object RoadModule {
    fun init() {
		RoadBlocks.register()
		RoadBlockEntities.register()
		RoadRecipes.register()

        ScuroFurniture.LOGGER.info("RoadModule init")
    }
}