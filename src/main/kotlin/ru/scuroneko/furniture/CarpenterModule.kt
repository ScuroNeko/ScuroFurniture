package ru.scuroneko.furniture

object CarpenterModule {
    fun init() {
        ModBlocks.register()
        ModItems.register()
        ModRecipes.register()

        ScuroFurniture.LOGGER.info("CarpenterModule init")
    }
}