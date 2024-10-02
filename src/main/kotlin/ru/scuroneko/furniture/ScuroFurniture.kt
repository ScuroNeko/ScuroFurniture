package ru.scuroneko.furniture

import net.fabricmc.api.ModInitializer
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.entity.EntityType
import net.minecraft.item.ItemGroup
import net.minecraft.screen.ScreenHandlerType
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ru.scuroneko.furniture.api.registry.autoregistry.AutoRegistry
import ru.scuroneko.furniture.api.registry.autoregistry.BlocksRegistry
import ru.scuroneko.furniture.api.registry.autoregistry.ItemsRegistry
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.ModEntities
import ru.scuroneko.furniture.registry.ModItemGroups
import ru.scuroneko.furniture.registry.ModScreenHandlers
import ru.scuroneko.furniture.registry.blocks.*
import ru.scuroneko.furniture.registry.items.*
import ru.scuroneko.furniture.registry.items.cases.*

object ScuroFurniture : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Scuro's Furniture")
    const val MOD_ID = "scuro_furniture"

    override fun onInitialize() {
        BlocksRegistry.registerContainer(Shelves, MOD_ID)

        ItemsRegistry.registerContainer(MediumDrawersDoors, MOD_ID)
        ItemsRegistry.registerContainer(MediumDrawersGlassDoors, MOD_ID)
        ItemsRegistry.registerContainer(BigDrawersDoors, MOD_ID)

        ItemsRegistry.registerContainer(SmallDrawersBoxes, MOD_ID)
        ItemsRegistry.registerContainer(MediumDrawerBoxes, MOD_ID)
        ItemsRegistry.registerContainer(BigDrawersBoxes, MOD_ID)

        ItemsRegistry.registerContainer(MedicalDrawersCases, MOD_ID)
        ItemsRegistry.registerContainer(BedsideDrawersCases, MOD_ID)
        ItemsRegistry.registerContainer(KitchenDrawersCases, MOD_ID)
        ItemsRegistry.registerContainer(KitchenCabinetCases, MOD_ID)

        ItemsRegistry.registerContainer(SingleDrawerCases, MOD_ID)

        ModBlocks.register()
        MedicalDrawers.register()
        BedsideDrawers.register()
        KitchenDrawers.register()
        KitchenCabinets.register()
        SingleDrawers.register()

        AutoRegistry<EntityType<*>>().processContainer(ModEntities, MOD_ID)
        AutoRegistry<BlockEntityType<*>>().processContainer(ModBlockEntities, MOD_ID)
        AutoRegistry<ScreenHandlerType<*>>().processContainer(ModScreenHandlers, MOD_ID)
        AutoRegistry<ItemGroup>().processContainer(ModItemGroups, MOD_ID)

        LOGGER.info("Foxes make 40 different sounds")
    }
}