package ru.scuroneko.furniture

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockSetType
import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.item.BlockItem
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
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents

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

    val CHERRY_BEDSIDE_TABLE = BedsideTableBlock(
        MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE, MedicalDrawersComponents.CHERRY_MEDICAL_BOX
    )

    val CHERRY_KITCHEN_CABINET = KitchenCabinetBlock(
        MedicalDrawersComponents.CHERRY_MEDICAL_DRAWER_CASE, MedicalDrawersComponents.CHERRY_MEDICAL_BOX
    )

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
        BlockEntityType.Builder.create(::BedsideTableBlockEntity, CHERRY_BEDSIDE_TABLE).build()

    fun register() {
        registerBlock("carpenter_table", CARPENTER_TABLE)

        registerBlock("airtight_door", AIRTIGHT_DOOR)

        registerBlock("purple_cherry_bed", CHERRY_BED_PURPLE)
        registerBlock("pink_cherry_bed", CHERRY_BED_PINK)

//        RegistryHelper.Blocks.registerMedicalDrawer("oak_medical_drawer", OAK_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("oak_log_medical_drawer", OAK_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_oak_log_medical_drawer", STRIPPED_OAK_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("spruce_medical_drawer", SPRUCE_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("spruce_log_medical_drawer", SPRUCE_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_spruce_log_medical_drawer", STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("birch_medical_drawer", BIRCH_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("birch_log_medical_drawer", BIRCH_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_birch_log_medical_drawer", STRIPPED_BIRCH_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("jungle_medical_drawer", JUNGLE_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("jungle_log_medical_drawer", JUNGLE_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_jungle_log_medical_drawer", STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("acacia_medical_drawer", ACACIA_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("acacia_log_medical_drawer", ACACIA_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_acacia_log_medical_drawer", STRIPPED_ACACIA_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("dark_oak_medical_drawer", DARK_OAK_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("dark_oak_log_medical_drawer", DARK_OAK_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_dark_oak_log_medical_drawer", STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("mangrove_medical_drawer", MANGROVE_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("mangrove_log_medical_drawer", MANGROVE_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_mangrove_log_medical_drawer", STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("cherry_medical_drawer", CHERRY_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("cherry_log_medical_drawer", CHERRY_LOG_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_cherry_log_medical_drawer", STRIPPED_CHERRY_LOG_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("bamboo_medical_drawer", BAMBOO_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("bamboo_block_medical_drawer", BAMBOO_BLOCK_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_bamboo_block_medical_drawer", STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("warped_medical_drawer", WARPED_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("warped_stem_medical_drawer", WARPED_STEM_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_warped_stem_medical_drawer", STRIPPED_WARPED_STEM_MEDICAL_DRAWER)
//
//        RegistryHelper.Blocks.registerMedicalDrawer("crimson_medical_drawer", CRIMSON_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("crimson_stem_medical_drawer", CRIMSON_STEM_MEDICAL_DRAWER)
//        RegistryHelper.Blocks.registerMedicalDrawer("stripped_crimson_stem_medical_drawer", STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER)

        registerBedsideTable("cherry_bedside_table", CHERRY_BEDSIDE_TABLE)

//        RegistryHelper.Blocks.registerKitchenDrawer("black_oak_kitchen_drawer", BLACK_OAK_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_oak_kitchen_drawer", WHITE_OAK_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_oak_log_kitchen_drawer", BLACK_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_oak_log_kitchen_drawer", WHITE_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_oak_log_kitchen_drawer", BLACK_STRIPPED_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_oak_log_kitchen_drawer", WHITE_STRIPPED_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_spruce_kitchen_drawer", BLACK_SPRUCE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_spruce_kitchen_drawer", WHITE_SPRUCE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_spruce_log_kitchen_drawer", BLACK_SPRUCE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_spruce_log_kitchen_drawer", WHITE_SPRUCE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_spruce_log_kitchen_drawer", BLACK_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_spruce_log_kitchen_drawer", WHITE_STRIPPED_SPRUCE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_birch_kitchen_drawer", BLACK_BIRCH_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_birch_kitchen_drawer", WHITE_BIRCH_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_birch_log_kitchen_drawer", BLACK_BIRCH_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_birch_log_kitchen_drawer", WHITE_BIRCH_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_birch_log_kitchen_drawer", BLACK_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_birch_log_kitchen_drawer", WHITE_STRIPPED_BIRCH_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_jungle_kitchen_drawer", BLACK_JUNGLE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_jungle_kitchen_drawer", WHITE_JUNGLE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_jungle_log_kitchen_drawer", BLACK_JUNGLE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_jungle_log_kitchen_drawer", WHITE_JUNGLE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_jungle_log_kitchen_drawer", BLACK_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_jungle_log_kitchen_drawer", WHITE_STRIPPED_JUNGLE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_acacia_kitchen_drawer", BLACK_ACACIA_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_acacia_kitchen_drawer", WHITE_ACACIA_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_acacia_log_kitchen_drawer", BLACK_ACACIA_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_acacia_log_kitchen_drawer", WHITE_ACACIA_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_acacia_log_kitchen_drawer", BLACK_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_acacia_log_kitchen_drawer", WHITE_STRIPPED_ACACIA_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_dark_oak_kitchen_drawer", BLACK_DARK_OAK_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_dark_oak_kitchen_drawer", WHITE_DARK_OAK_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_dark_oak_log_kitchen_drawer", BLACK_DARK_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_dark_oak_log_kitchen_drawer", WHITE_DARK_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_dark_oak_log_kitchen_drawer", BLACK_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_dark_oak_log_kitchen_drawer", WHITE_STRIPPED_DARK_OAK_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_mangrove_kitchen_drawer", BLACK_MANGROVE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_mangrove_kitchen_drawer", WHITE_MANGROVE_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_mangrove_log_kitchen_drawer", BLACK_MANGROVE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_mangrove_log_kitchen_drawer", WHITE_MANGROVE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_mangrove_log_kitchen_drawer", BLACK_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_mangrove_log_kitchen_drawer", WHITE_STRIPPED_MANGROVE_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_cherry_kitchen_drawer", BLACK_CHERRY_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_cherry_kitchen_drawer", WHITE_CHERRY_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_cherry_log_kitchen_drawer", BLACK_CHERRY_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_cherry_log_kitchen_drawer", WHITE_CHERRY_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("black_stripped_cherry_log_kitchen_drawer", BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER)
//        RegistryHelper.Blocks.registerKitchenDrawer("white_stripped_cherry_log_kitchen_drawer", WHITE_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER)

        registerKitchenCabinet("cherry_kitchen_cabinet", CHERRY_KITCHEN_CABINET)

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

    private fun registerBedsideTable(path: String, block: BedsideTableBlock) {
        ScuroFurnitureBlocksAPI.registerBedsideTable(
            Identifier(ScuroFurniture.MOD_ID, path), block
        )
        BLOCKS[Identifier(ScuroFurniture.MOD_ID, path)] = block
    }

    private fun registerKitchenCabinet(path: String, block: KitchenCabinetBlock) {
        ScuroFurnitureBlocksAPI.registerKitchenCabinet(
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