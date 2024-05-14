package ru.scuroneko.furniture

import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ModInitializer
import net.minecraft.entity.EntityType
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.api.registry.AutoRegistry
import ru.scuroneko.furniture.api.registry.BlocksRegistry
import ru.scuroneko.furniture.api.registry.ItemsRegistry
import ru.scuroneko.furniture.config.ScuroFurnitureConfig
import ru.scuroneko.furniture.registry.ModEntities
import ru.scuroneko.furniture.registry.ModItemGroups
import ru.scuroneko.furniture.registry.ModRecipes
import ru.scuroneko.furniture.registry.ModScreenHandlers
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.*

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Scuro's Furniture")
    const val MOD_ID = "scuro_furniture"

    override fun onInitialize() {
        AutoConfig.register(ScuroFurnitureConfig::class.java, ::GsonConfigSerializer)
        ModItemGroups.register()

        ModBlocks.register()

        BlocksRegistry.registerContainer(MedicalDrawers, MOD_ID)
        BlocksRegistry.registerContainer(BedsideDrawers, MOD_ID)
        BlocksRegistry.registerContainer(KitchenDrawers, MOD_ID)
        BlocksRegistry.registerContainer(KitchenCabinets, MOD_ID)
        BlocksRegistry.registerContainer(Lamps, MOD_ID)
        BlocksRegistry.registerContainer(Sofas, MOD_ID)

        ItemsRegistry.registerContainer(MediumDrawerBoxes, MOD_ID)
        ItemsRegistry.registerContainer(MedicalDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(BedsideDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(KitchenDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(KitchenCabinetComponents, MOD_ID)

        AutoRegistry<EntityType<*>>().processContainer(ModEntities, MOD_ID)

        ModRecipes.register()

        ModScreenHandlers.register()

        LOGGER.info("Initializing Furniture")
    }
}