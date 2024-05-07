package ru.scuroneko.furniture.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.ModModels
import ru.scuroneko.furniture.api.ScuroFurnitureBlocksAPI.registerKitchenDrawer
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.carpenter.CarpenterBlocks
import ru.scuroneko.furniture.carpenter.CarpenterItems

class ModelGeneratorProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
        CarpenterBlocks.MEDICAL_DRAWERS.forEach { (_, block) -> registerMedicalDrawer(generator, block) }
        CarpenterBlocks.BEDSIDE_TABLES.forEach { (_, block) -> registerBedsideTable(generator, block) }
        CarpenterBlocks.KITCHEN_DRAWERS.forEach { (_, block) -> registerKitchenDrawer(generator, block) }
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
        CarpenterItems.ITEMS.forEach { (_, item) -> generator.register(item, Models.GENERATED) }

        CarpenterBlocks.MEDICAL_DRAWERS_ITEMS.forEach { (_, item) -> registerMedicalDrawer(generator, item) }
        CarpenterBlocks.BEDSIDE_TABLES_ITEMS.forEach { (_, item) -> registerBedsideTable(generator, item) }
        CarpenterBlocks.KITCHEN_DRAWERS_ITEMS.forEach { (_, item) -> registerKitchenDrawer(generator, item) }
    }

    private fun registerMedicalDrawer(generator: BlockStateModelGenerator, block: AbstractDrawerBlock) {
        val modelFactory = TexturedModel.makeFactory(TextureMap::texture, ModModels.MEDICAL_DRAWER)
        registerFactory(generator, modelFactory, block)
    }
    private fun registerMedicalDrawer(generator: ItemModelGenerator, item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.MEDICAL_DRAWER.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    private fun registerBedsideTable(generator: BlockStateModelGenerator, block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(TextureMap::texture, ModModels.BEDSIDE_TABLE)
        registerFactory(generator, factory, block)
    }
    private fun registerBedsideTable(generator: ItemModelGenerator, item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.BEDSIDE_TABLE.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    private fun registerKitchenDrawer(generator: BlockStateModelGenerator, block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(TextureMap::texture, ModModels.KITCHEN_DRAWER)
        registerFactory(generator, factory, block)
    }
    private fun registerKitchenDrawer(generator: ItemModelGenerator, item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.KITCHEN_DRAWER.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    private fun registerFactory(generator: BlockStateModelGenerator, factory: TexturedModel.Factory, block: Block) {
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(block,
                BlockStateVariant.create().put(VariantSettings.MODEL, factory.upload(block, generator.modelCollector))
            ).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates())
        )
    }
}