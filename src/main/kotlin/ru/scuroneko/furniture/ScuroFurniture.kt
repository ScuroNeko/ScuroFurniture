package ru.scuroneko.furniture

import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.config.ScuroFurnitureConfig
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.asakusalib.api.registry.BlocksRegistry
import ru.scuroneko.asakusalib.api.registry.ItemsRegistry

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Scuro's Furniture")
    const val MOD_ID = "scuro_furniture"

    override fun onInitialize() {
        AutoConfig.register(ScuroFurnitureConfig::class.java, ::GsonConfigSerializer)
        ModItemGroups.register()

        ModBlocks.register()
//        ModItems.register()
        BlocksRegistry.registerContainer(MedicalDrawers, MOD_ID)
        BlocksRegistry.registerContainer(KitchenDrawers, MOD_ID)
        ItemsRegistry.registerContainer(ModItems, MOD_ID)
        ItemsRegistry.registerContainer(MedicalDrawersComponents, MOD_ID)
        ModRecipes.register()
        ModEntities.register()

        ModScreenHandlers.register()

        LOGGER.info("Initializing Furniture")
    }
}