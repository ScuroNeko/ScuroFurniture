package ru.scuroneko.furniture.carpenter

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
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.ScuroFurnitureBlocksAPI
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.carpenter.blocks.*
import ru.scuroneko.furniture.carpenter.blocks.entity.BedsideTableBlockEntity
import ru.scuroneko.furniture.carpenter.blocks.entity.CarpenterTableBlockEntity
import ru.scuroneko.furniture.carpenter.blocks.entity.MedicalDrawerBlockEntity

object CarpenterBlocks {
    val BLOCKS = LinkedHashMap<Identifier, Block>()

    val MEDICAL_DRAWERS = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val MEDICAL_DRAWERS_ITEMS = LinkedHashMap<Identifier, Item>()
    val BEDSIDE_TABLES = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val BEDSIDE_TABLES_ITEMS = LinkedHashMap<Identifier, Item>()
    val KITCHEN_DRAWERS = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val KITCHEN_DRAWERS_ITEMS = LinkedHashMap<Identifier, Item>()

    val CARPENTER_TABLE = CarpenterTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE))

    val AIRTIGHT_DOOR = AirtightDoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.IRON_DOOR))

    val CHERRY_BED_PURPLE = CustomBedBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_BED))
    val CHERRY_BED_PINK = CustomBedBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_BED))

    val OAK_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS))
    val OAK_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS))
    val STRIPPED_OAK_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS))

    val SPRUCE_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS))
    val SPRUCE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS))
    val STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS))

    val BIRCH_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS))
    val BIRCH_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS))
    val STRIPPED_BIRCH_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS))

    val JUNGLE_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS))
    val JUNGLE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS))
    val STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS))

    val ACACIA_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS))
    val ACACIA_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS))
    val STRIPPED_ACACIA_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS))

    val DARK_OAK_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS))
    val DARK_OAK_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS))
    val STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS))

    val MANGROVE_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS))
    val MANGROVE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS))
    val STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS))

    val CHERRY_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS))
    val CHERRY_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS))
    val STRIPPED_CHERRY_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS))

    val CHERRY_BEDSIDE_TABLE = BedsideTableBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS))

    val BLACK_CHERRY_KITCHEN_DRAWER = KitchenDrawerBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS))

    val CARPENTER_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(::CarpenterTableBlockEntity, CARPENTER_TABLE).build()
    val MEDICAL_DRAWER_BLOCK_ENTITY = BlockEntityType.Builder.create(::MedicalDrawerBlockEntity, OAK_MEDICAL_DRAWER).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(::BedsideTableBlockEntity, CHERRY_BEDSIDE_TABLE).build()

    fun register() {
        registerBlock("carpenter_table", CARPENTER_TABLE)

        registerBlock("airtight_door", AIRTIGHT_DOOR)

        registerBlock("purple_cherry_bed", CHERRY_BED_PURPLE)
        registerBlock("pink_cherry_bed", CHERRY_BED_PINK)

        registerMedicalDrawer("oak_medical_drawer", OAK_MEDICAL_DRAWER)
        registerMedicalDrawer("oak_log_medical_drawer", OAK_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_oak_log_medical_drawer", STRIPPED_OAK_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("spruce_medical_drawer", SPRUCE_MEDICAL_DRAWER)
        registerMedicalDrawer("spruce_log_medical_drawer", SPRUCE_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_spruce_log_medical_drawer", STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("birch_medical_drawer", BIRCH_MEDICAL_DRAWER)
        registerMedicalDrawer("birch_log_medical_drawer", BIRCH_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_birch_log_medical_drawer", STRIPPED_BIRCH_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("jungle_medical_drawer", JUNGLE_MEDICAL_DRAWER)
        registerMedicalDrawer("jungle_log_medical_drawer", JUNGLE_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_jungle_log_medical_drawer", STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("acacia_medical_drawer", ACACIA_MEDICAL_DRAWER)
        registerMedicalDrawer("acacia_log_medical_drawer", ACACIA_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_acacia_log_medical_drawer", STRIPPED_ACACIA_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("dark_oak_medical_drawer", DARK_OAK_MEDICAL_DRAWER)
        registerMedicalDrawer("dark_oak_log_medical_drawer", DARK_OAK_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_dark_oak_log_medical_drawer", STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("mangrove_medical_drawer", MANGROVE_MEDICAL_DRAWER)
        registerMedicalDrawer("mangrove_log_medical_drawer", MANGROVE_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_mangrove_log_medical_drawer", STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER)

        registerMedicalDrawer("cherry_medical_drawer", CHERRY_MEDICAL_DRAWER)
        registerMedicalDrawer("cherry_log_medical_drawer", CHERRY_LOG_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_cherry_log_medical_drawer", STRIPPED_CHERRY_LOG_MEDICAL_DRAWER)

        registerBedsideTable("cherry_bedside_table", CHERRY_BEDSIDE_TABLE)

        registerKitchenDrawer("black_cherry_kitchen_drawer", BLACK_CHERRY_KITCHEN_DRAWER)

        registerBlockEntity("carpenter_table_be", CARPENTER_TABLE_BLOCK_ENTITY)
        registerBlockEntity("medical_drawer_be", MEDICAL_DRAWER_BLOCK_ENTITY)
        registerBlockEntity("bedside_table_be", BEDSIDE_TABLE_BLOCK_ENTITY)
    }

    private fun registerBlock(path: String, block: Block) {
        ScuroFurnitureBlocksAPI.registerBlock(
            Identifier(ScuroFurniture.CARPENTER_MOD_ID, path), block
        )
        BLOCKS[Identifier(ScuroFurniture.CARPENTER_MOD_ID, path)] = block
    }
    private fun registerMedicalDrawer(path: String, block: MedicalDrawerBlock) {
        ScuroFurnitureBlocksAPI.registerMedicalDrawer(
            Identifier(ScuroFurniture.CARPENTER_MOD_ID, path), block
        )
        BLOCKS[Identifier(ScuroFurniture.CARPENTER_MOD_ID, path)] = block
    }
    private fun registerBedsideTable(path: String, block: BedsideTableBlock) {
        ScuroFurnitureBlocksAPI.registerBedsideTable(
            Identifier(ScuroFurniture.CARPENTER_MOD_ID, path), block
        )
        BLOCKS[Identifier(ScuroFurniture.CARPENTER_MOD_ID, path)] = block
    }
    private fun registerKitchenDrawer(path: String, block: KitchenDrawerBlock) {
        ScuroFurnitureBlocksAPI.registerKitchenDrawer(
            Identifier(ScuroFurniture.CARPENTER_MOD_ID, path),
            block
        )
        BLOCKS[Identifier(ScuroFurniture.CARPENTER_MOD_ID, path)] = block
    }

    private fun <T: BlockEntity> registerBlockEntity(path: String, blockEntity: BlockEntityType<T>) {
        Registry.register(
            Registries.BLOCK_ENTITY_TYPE, Identifier(ScuroFurniture.CARPENTER_MOD_ID, path),
            blockEntity
        )
    }
}