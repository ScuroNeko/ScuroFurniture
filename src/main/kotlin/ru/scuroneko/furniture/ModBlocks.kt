package ru.scuroneko.furniture

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockSetType
import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.DyeColor
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.ScuroFurnitureBlocksAPI
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.*
import ru.scuroneko.furniture.blocks.entity.BedsideTableBlockEntity
import ru.scuroneko.furniture.blocks.entity.CarpenterTableBlockEntity
import ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.registry.RegistryHelper
import ru.scuroneko.furniture.registry.blocks.BedsideDrawers.CHERRY_BEDSIDE_DRAWER
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers

object ModBlocks {
    val CARPENTER_TABLE = CarpenterTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE))

    val AIRTIGHT_DOOR = AirtightDoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.IRON_DOOR))

    val CHERRY_BED_PURPLE = CustomBedBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_BED))
    val CHERRY_BED_PINK = CustomBedBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_BED))

    val CARPENTER_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::CarpenterTableBlockEntity, CARPENTER_TABLE
    ).build()
    val MEDICAL_DRAWER_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::MedicalDrawerBlockEntity, MedicalDrawers.OAK_MEDICAL_DRAWER
    ).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::BedsideTableBlockEntity, CHERRY_BEDSIDE_DRAWER
    ).build()

    fun register() {
        registerBlock("carpenter_table", CARPENTER_TABLE)

        registerBlock("airtight_door", AIRTIGHT_DOOR)

        registerBlock("purple_cherry_bed", CHERRY_BED_PURPLE)
        registerBlock("pink_cherry_bed", CHERRY_BED_PINK)

        registerBlockEntity("carpenter_table_be", CARPENTER_TABLE_BLOCK_ENTITY)
        registerBlockEntity("medical_drawer_be", MEDICAL_DRAWER_BLOCK_ENTITY)
        registerBlockEntity("bedside_table_be", BEDSIDE_TABLE_BLOCK_ENTITY)
    }

    private fun registerBlock(path: String, block: Block) {
        ScuroFurnitureBlocksAPI.registerBlock(
            Identifier(ScuroFurniture.MOD_ID, path), block
        )
        RegistryHelper.Blocks.BLOCKS.add(block)
    }

    private fun <T : BlockEntity> registerBlockEntity(path: String, blockEntity: BlockEntityType<T>) {
        Registry.register(
            Registries.BLOCK_ENTITY_TYPE, Identifier(ScuroFurniture.MOD_ID, path), blockEntity
        )
    }
}