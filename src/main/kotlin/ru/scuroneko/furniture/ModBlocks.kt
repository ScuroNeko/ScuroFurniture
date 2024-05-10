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

object ModBlocks {
    val BLOCKS = LinkedHashMap<Identifier, Block>()

    val MEDICAL_DRAWERS = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val MEDICAL_DRAWERS_ITEMS = LinkedHashMap<Identifier, Item>()

    val BEDSIDE_TABLES = LinkedHashMap<Identifier, AbstractDrawerBlock>()
    val BEDSIDE_TABLES_ITEMS = LinkedHashMap<Identifier, Item>()

    val KITCHEN_DRAWERS = LinkedHashMap<Identifier, KitchenDrawerBlock>()
    val KITCHEN_DRAWERS_ITEMS = LinkedHashMap<Identifier, BlockItem>()

    val KITCHEN_CABINETS = LinkedHashMap<Identifier, KitchenCabinetBlock>()
    val KITCHEN_CABINETS_ITEMS = LinkedHashMap<Identifier, Item>()

    val CARPENTER_TABLE = CarpenterTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE))

    val AIRTIGHT_DOOR = AirtightDoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.IRON_DOOR))

    val CHERRY_BED_PURPLE = CustomBedBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_BED))
    val CHERRY_BED_PINK = CustomBedBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_BED))

    val OAK_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.OAK_MEDICAL_DRAWER_CASE, ModItems.OAK_MEDICAL_BOX)
    val OAK_LOG_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.OAK_LOG_MEDICAL_DRAWER_CASE, ModItems.OAK_MEDICAL_BOX)
    val STRIPPED_OAK_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_OAK_LOG_MEDICAL_DRAWER_CASE, ModItems.OAK_MEDICAL_BOX)

    val SPRUCE_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.SPRUCE_MEDICAL_DRAWER_CASE, ModItems.SPRUCE_MEDICAL_BOX)
    val SPRUCE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.SPRUCE_LOG_MEDICAL_DRAWER_CASE, ModItems.SPRUCE_MEDICAL_BOX)
    val STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_SPRUCE_LOG_MEDICAL_DRAWER_CASE, ModItems.SPRUCE_MEDICAL_BOX)

    val BIRCH_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.BIRCH_MEDICAL_DRAWER_CASE, ModItems.BIRCH_MEDICAL_BOX)
    val BIRCH_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.BIRCH_LOG_MEDICAL_DRAWER_CASE, ModItems.BIRCH_MEDICAL_BOX)
    val STRIPPED_BIRCH_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_BIRCH_LOG_MEDICAL_DRAWER_CASE, ModItems.BIRCH_MEDICAL_BOX)

    val JUNGLE_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.JUNGLE_MEDICAL_DRAWER_CASE, ModItems.JUNGLE_MEDICAL_BOX)
    val JUNGLE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.JUNGLE_LOG_MEDICAL_DRAWER_CASE, ModItems.JUNGLE_MEDICAL_BOX)
    val STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_JUNGLE_LOG_MEDICAL_DRAWER_CASE, ModItems.JUNGLE_MEDICAL_BOX)

    val ACACIA_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.ACACIA_MEDICAL_DRAWER_CASE, ModItems.ACACIA_MEDICAL_BOX)
    val ACACIA_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.ACACIA_LOG_MEDICAL_DRAWER_CASE, ModItems.ACACIA_MEDICAL_BOX)
    val STRIPPED_ACACIA_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_ACACIA_LOG_MEDICAL_DRAWER_CASE, ModItems.ACACIA_MEDICAL_BOX)

    val DARK_OAK_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.DARK_OAK_MEDICAL_DRAWER_CASE, ModItems.DARK_OAK_MEDICAL_BOX)
    val DARK_OAK_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.DARK_OAK_LOG_MEDICAL_DRAWER_CASE, ModItems.DARK_OAK_MEDICAL_BOX)
    val STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_DARK_OAK_LOG_MEDICAL_DRAWER_CASE, ModItems.DARK_OAK_MEDICAL_BOX)

    val MANGROVE_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.MANGROVE_MEDICAL_DRAWER_CASE, ModItems.MANGROVE_MEDICAL_BOX)
    val MANGROVE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.MANGROVE_LOG_MEDICAL_DRAWER_CASE, ModItems.MANGROVE_MEDICAL_BOX)
    val STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_MANGROVE_LOG_MEDICAL_DRAWER_CASE, ModItems.MANGROVE_MEDICAL_BOX)

    val CHERRY_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.CHERRY_MEDICAL_DRAWER_CASE, ModItems.CHERRY_MEDICAL_BOX)
    val CHERRY_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.CHERRY_LOG_MEDICAL_DRAWER_CASE, ModItems.CHERRY_MEDICAL_BOX)
    val STRIPPED_CHERRY_LOG_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_CHERRY_LOG_MEDICAL_DRAWER_CASE, ModItems.CHERRY_MEDICAL_BOX)

    val BAMBOO_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.BAMBOO_MEDICAL_DRAWER_CASE, ModItems.BAMBOO_MEDICAL_BOX)
    val BAMBOO_BLOCK_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, ModItems.BAMBOO_MEDICAL_BOX)
    val STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER_CASE, ModItems.BAMBOO_MEDICAL_BOX)

    val CRIMSON_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.CRIMSON_MEDICAL_DRAWER_CASE, ModItems.CRIMSON_MEDICAL_BOX)
    val CRIMSON_STEM_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.CRIMSON_STEM_MEDICAL_DRAWER_CASE, ModItems.CRIMSON_MEDICAL_BOX)
    val STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER_CASE, ModItems.CRIMSON_MEDICAL_BOX)

    val WARPED_MEDICAL_DRAWER = MedicalDrawerBlock(ModItems.WARPED_MEDICAL_DRAWER_CASE, ModItems.WARPED_MEDICAL_BOX)
    val WARPED_STEM_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.WARPED_STEM_MEDICAL_DRAWER_CASE, ModItems.WARPED_MEDICAL_BOX)
    val STRIPPED_WARPED_STEM_MEDICAL_DRAWER =
        MedicalDrawerBlock(ModItems.STRIPPED_WARPED_STEM_MEDICAL_DRAWER_CASE, ModItems.WARPED_MEDICAL_BOX)

    val CHERRY_BEDSIDE_TABLE = BedsideTableBlock(
        ModItems.CHERRY_MEDICAL_DRAWER_CASE, ModItems.CHERRY_MEDICAL_BOX
    )

    val BLACK_CHERRY_KITCHEN_DRAWER = KitchenDrawerBlock(
        ModItems.BLACK_CHERRY_KITCHEN_DRAWER_CASE, ModItems.CHERRY_KITCHEN_DRAWER_BOX
    )
    val WHITE_CHERRY_KITCHEN_DRAWER = KitchenDrawerBlock(
        ModItems.WHITE_CHERRY_KITCHEN_DRAWER_CASE, ModItems.CHERRY_KITCHEN_DRAWER_BOX
    )

    val CHERRY_KITCHEN_CABINET = KitchenCabinetBlock(
        ModItems.CHERRY_MEDICAL_DRAWER_CASE, ModItems.CHERRY_MEDICAL_BOX
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
        BlockEntityType.Builder.create(::MedicalDrawerBlockEntity, OAK_MEDICAL_DRAWER).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY =
        BlockEntityType.Builder.create(::BedsideTableBlockEntity, CHERRY_BEDSIDE_TABLE).build()

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

        registerMedicalDrawer("bamboo_medical_drawer", BAMBOO_MEDICAL_DRAWER)
        registerMedicalDrawer("bamboo_block_medical_drawer", BAMBOO_BLOCK_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_bamboo_block_medical_drawer", STRIPPED_BAMBOO_BLOCK_MEDICAL_DRAWER)

        registerMedicalDrawer("warped_medical_drawer", WARPED_MEDICAL_DRAWER)
        registerMedicalDrawer("warped_stem_medical_drawer", WARPED_STEM_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_warped_stem_medical_drawer", STRIPPED_WARPED_STEM_MEDICAL_DRAWER)

        registerMedicalDrawer("crimson_medical_drawer", CRIMSON_MEDICAL_DRAWER)
        registerMedicalDrawer("crimson_stem_medical_drawer", CRIMSON_STEM_MEDICAL_DRAWER)
        registerMedicalDrawer("stripped_crimson_stem_medical_drawer", STRIPPED_CRIMSON_STEM_MEDICAL_DRAWER)

        registerBedsideTable("cherry_bedside_table", CHERRY_BEDSIDE_TABLE)

        registerKitchenDrawer("black_cherry_kitchen_drawer", BLACK_CHERRY_KITCHEN_DRAWER)
        registerKitchenDrawer("white_cherry_kitchen_drawer", WHITE_CHERRY_KITCHEN_DRAWER)

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

    private fun registerMedicalDrawer(path: String, block: MedicalDrawerBlock) {
        ScuroFurnitureBlocksAPI.registerMedicalDrawer(
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

    private fun registerKitchenDrawer(path: String, block: KitchenDrawerBlock) {
        ScuroFurnitureBlocksAPI.registerKitchenDrawer(
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