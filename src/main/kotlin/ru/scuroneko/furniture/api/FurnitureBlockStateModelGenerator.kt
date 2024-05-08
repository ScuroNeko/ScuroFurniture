package ru.scuroneko.furniture.api

import net.minecraft.block.Block
import net.minecraft.data.client.*
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock

class FurnitureBlockStateModelGenerator(private val generator: BlockStateModelGenerator) {
    fun registerMedicalDrawer(block: AbstractDrawerBlock) {
        val modelFactory = TexturedModel.makeFactory(TextureMap::texture, ModModels.MEDICAL_DRAWER)
        registerFactory(modelFactory, block)
    }

    fun registerBedsideTable(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(TextureMap::texture, ModModels.BEDSIDE_TABLE)
        registerFactory(factory, block)
    }

    fun registerKitchenDrawer(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(TextureMap::texture, ModModels.KITCHEN_DRAWER)
        registerFactory(factory, block)
    }

    fun registerKitchenCabinet(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(TextureMap::texture, ModModels.KITCHEN_CABINET)
        registerFactory(factory, block)
    }

    private fun registerFactory(factory: TexturedModel.Factory, block: Block) {
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(block,
                BlockStateVariant.create().put(VariantSettings.MODEL, factory.upload(block, generator.modelCollector))
            ).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates())
        )
    }
}