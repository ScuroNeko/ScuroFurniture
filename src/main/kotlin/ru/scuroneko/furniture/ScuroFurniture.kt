package ru.scuroneko.furniture

import net.fabricmc.api.ModInitializer
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.entity.EntityType
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.api.registry.AutoRegistry
import ru.scuroneko.furniture.api.registry.BlocksRegistry
import ru.scuroneko.furniture.api.registry.ItemsRegistry
import ru.scuroneko.furniture.registry.*
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.*

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Scuro's Furniture")
    const val MOD_ID = "scuro_furniture"

    override fun onInitialize() {
        ModItemGroups.register()

        ModBlocks.register()

        BlocksRegistry.registerContainer(MedicalDrawers, MOD_ID)
        BlocksRegistry.registerContainer(BedsideDrawers, MOD_ID)
        BlocksRegistry.registerContainer(KitchenDrawers, MOD_ID)
        BlocksRegistry.registerContainer(KitchenCabinets, MOD_ID)
        BlocksRegistry.registerContainer(Lamps, MOD_ID)
        BlocksRegistry.registerContainer(Sofas, MOD_ID)
        BlocksRegistry.registerContainer(Tables, MOD_ID)

        ItemsRegistry.registerContainer(MediumDrawerBoxes, MOD_ID)
        ItemsRegistry.registerContainer(MedicalDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(BedsideDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(KitchenDrawersComponents, MOD_ID)
        ItemsRegistry.registerContainer(KitchenCabinetComponents, MOD_ID)

        AutoRegistry<EntityType<*>>().processContainer(ModEntities, MOD_ID)
        AutoRegistry<BlockEntityType<*>>().processContainer(ModBlockEntities, MOD_ID)

        ModRecipes.register()

        ModScreenHandlers.register()

        LOGGER.info("Initializing Furniture")
    }
}