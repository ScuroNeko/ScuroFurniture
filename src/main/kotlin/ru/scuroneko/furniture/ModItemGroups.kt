package ru.scuroneko.furniture

import me.shedaniel.autoconfig.AutoConfig
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.block.Blocks
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.carpenter.CarpenterBlocks
import ru.scuroneko.furniture.carpenter.CarpenterItems
import ru.scuroneko.furniture.config.ScuroFurnitureConfig
import ru.scuroneko.furniture.roads.RoadBlocks

object ModItemGroups {
    private val ROAD_GROUP = FabricItemGroup.builder()
        .icon { ItemStack(RoadBlocks.AsphaltFullSolid) }
        .displayName(Text.translatable("itemGroup.scuro_furniture.road_group"))
        .entries { _, entries ->
            RoadBlocks.asphaltFullBlocks.forEach { entries.add(it.value) }
            RoadBlocks.asphalt78Blocks.forEach { entries.add(it.value) }
            RoadBlocks.asphalt68Blocks.forEach { entries.add(it.value) }
            RoadBlocks.roadSigns.forEach { entries.add(it.value) }

            entries.add(RoadBlocks.STREET_LAMP_SINGLE)
            entries.add(RoadBlocks.STREET_LAMP_DOUBLE)
            entries.add(RoadBlocks.STREET_LAMP_POLE)
            entries.add(RoadBlocks.STREET_LAMP_BOTTOM)
        }.build()

    private val CARPENTER_GROUP = FabricItemGroup.builder()
        .icon { ItemStack(Blocks.CHERRY_PLANKS) }
        .displayName(Text.translatable("itemGroup.scuro_furniture.carpenter_group"))
        .entries { _, entries ->
            CarpenterItems.ITEMS.forEach { (id, item) ->
                entries.add(item)
            }
            CarpenterBlocks.BLOCKS.forEach { (id, block) ->
                entries.add(block)
            }
//            entries.add(CarpenterBlocks.OAK_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.OAK_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_OAK_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.SPRUCE_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.SPRUCE_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.BIRCH_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.BIRCH_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.JUNGLE_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.JUNGLE_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.ACACIA_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.ACACIA_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.DARK_OAK_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.DARK_OAK_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.MANGROVE_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.MANGROVE_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER)
//
//            entries.add(CarpenterBlocks.CHERRY_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.CHERRY_LOG_MEDICAL_DRAWER)
//            entries.add(CarpenterBlocks.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER)
        }.build()

    fun register() {
        val config = AutoConfig.getConfigHolder(ScuroFurnitureConfig::class.java).config
        if(config.isRoadModuleEnabled)
            Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "road_group"), ROAD_GROUP)
        if(config.isCarpenterModuleEnabled)
            Registry.register(Registries.ITEM_GROUP, Identifier(ScuroFurniture.MOD_ID, "carpenter_group"), CARPENTER_GROUP)
    }
}