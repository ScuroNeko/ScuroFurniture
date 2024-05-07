package ru.scuroneko.furniture.carpenter

import ru.scuroneko.furniture.ScuroFurniture

object CarpenterModule {
    fun init() {
        CarpenterBlocks.register()
        CarpenterItems.register()
        CarpenterRecipes.register()

        ScuroFurniture.LOGGER.info("CarpenterModule init")
    }
}