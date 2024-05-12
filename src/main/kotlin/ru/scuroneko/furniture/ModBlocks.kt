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
import ru.scuroneko.furniture.registry.blocks.BedsideDrawers.CHERRY_BEDSIDE_DRAWER
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers
import ru.scuroneko.furniture.registry.items.BedsideDrawersComponents
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes

object ModBlocks {
    val BLOCKS = LinkedHashMap<Identifier, Block>()

    val BEDSIDE_TABLES = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val BEDSIDE_TABLES_ITEMS = LinkedHashMap<Identifier, Item>()

    val KITCHEN_CABINETS = LinkedHashMap<Identifier, KitchenCabinetBlock>()
    val KITCHEN_CABINETS_ITEMS = LinkedHashMap<Identifier, Item>()

    val CARPENTER_TABLE = CarpenterTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE))

    val AIRTIGHT_DOOR = AirtightDoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.IRON_DOOR))

    val CHERRY_BED_PURPLE = CustomBedBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_BED))
    val CHERRY_BED_PINK = CustomBedBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_BED))

    val WHITE_CHERRY_SOFA = SofaBlock(
        Blocks.CHERRY_PLANKS, Blocks.STRIPPED_CHERRY_LOG, Blocks.WHITE_WOOL
    )
    val BLACK_CHERRY_SOFA = SofaBlock(
        Blocks.CHERRY_PLANKS, Blocks.STRIPPED_CHERRY_LOG, Blocks.BLACK_WOOL
    )

    val WHITE_OAK_LAMP = LampBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL))
    val BLACK_OAK_LAMP = LampBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL))

    val WHITE_CHERRY_LAMP = LampBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL))
    val BLACK_CHERRY_LAMP = LampBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL))

    val CARPENTER_TABLE_BLOCK_ENTITY =
        BlockEntityType.Builder.create(::CarpenterTableBlockEntity, CARPENTER_TABLE).build()
    val MEDICAL_DRAWER_BLOCK_ENTITY =
        BlockEntityType.Builder.create(::MedicalDrawerBlockEntity, MedicalDrawers.OAK_MEDICAL_DRAWER).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY =
        BlockEntityType.Builder.create(::BedsideTableBlockEntity, CHERRY_BEDSIDE_DRAWER).build()

    fun register() {
        registerBlock("carpenter_table", CARPENTER_TABLE)

        registerBlock("airtight_door", AIRTIGHT_DOOR)

        registerBlock("purple_cherry_bed", CHERRY_BED_PURPLE)
        registerBlock("pink_cherry_bed", CHERRY_BED_PINK)

        registerBlock("white_cherry_sofa", WHITE_CHERRY_SOFA)
        registerBlock("black_cherry_sofa", BLACK_CHERRY_SOFA)

        registerBlock("white_oak_lamp", WHITE_OAK_LAMP)
        registerBlock("black_oak_lamp", BLACK_OAK_LAMP)

        registerBlock("white_cherry_lamp", WHITE_CHERRY_LAMP)
        registerBlock("black_cherry_lamp", BLACK_CHERRY_LAMP)

        registerBlockEntity("carpenter_table_be", CARPENTER_TABLE_BLOCK_ENTITY)
        registerBlockEntity("medical_drawer_be", MEDICAL_DRAWER_BLOCK_ENTITY)
        registerBlockEntity("bedside_table_be", BEDSIDE_TABLE_BLOCK_ENTITY)
    }

    private fun registerBlock(path: String, block: Block) {
        ScuroFurnitureBlocksAPI.registerBlock(
            Identifier(ScuroFurniture.MOD_ID, path), block
        )
        BLOCKS[Identifier(ScuroFurniture.MOD_ID, path)] = block
    }

    private fun <T : BlockEntity> registerBlockEntity(path: String, blockEntity: BlockEntityType<T>) {
        Registry.register(
            Registries.BLOCK_ENTITY_TYPE, Identifier(ScuroFurniture.MOD_ID, path), blockEntity
        )
    }
}