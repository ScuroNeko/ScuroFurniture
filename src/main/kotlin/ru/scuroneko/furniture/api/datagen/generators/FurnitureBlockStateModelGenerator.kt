package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.entity.Entity
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.SofaType
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.api.blocks.AbstractSofaBlock
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys
import ru.scuroneko.furniture.api.datagen.ModTextureMap
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.LampBlock
import java.util.function.Function

class FurnitureBlockStateModelGenerator(private val generator: BlockStateModelGenerator) {
    fun registerMedicalDrawer(block: AbstractDrawerBlock) {
        val modelFactory = TexturedModel.makeFactory(ModTextureMap::drawer, ModModels.MEDICAL_DRAWER)
        registerFactory(modelFactory, block)
    }

    fun registerBedsideTable(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::drawer, ModModels.BEDSIDE_TABLE)
        registerFactory(factory, block)
    }

    fun registerKitchenDrawer(block: KitchenDrawerBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::kitchenDrawer, ModModels.KITCHEN_DRAWER)
        registerFactory(factory, block)
    }

    fun registerKitchenCabinet(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::drawer, ModModels.KITCHEN_CABINET)
        registerFactory(factory, block)
    }

    fun <T : Entity> registerSofa(block: AbstractSofaBlock<T>) {
        generator.blockStateCollector.accept(createSofaBlockState(block))
    }

    fun registerLamp(lamp: LampBlock, wool: Block, planks: Block, log: Block) {
        val map = TextureMap()
            .put(ModTextureKeys.WOOL, TextureMap.getId(wool))
            .put(TextureKey.PARTICLE, TextureMap.getId(wool))
            .put(ModTextureKeys.PLANKS, TextureMap.getId(planks))
            .put(ModTextureKeys.LOG, TextureMap.getId(log))
        val factory = TexturedModel.makeFactory({ _ -> map }, ModModels.LAMP)
        registerFactory(factory, lamp)
    }

    fun createSofaBlockState(block: Block): BlockStateSupplier {
        val singleModelId = TexturedModel.makeFactory(ModTextureMap::sofa, ModModels.SOFA_SINGLE)
            .upload(block, generator.modelCollector)
        val leftModelId = this.createSubModel(block, "_left", ModModels.SOFA_LEFT) { _ -> ModTextureMap.sofa(block) }
        val centerModelId =
            this.createSubModel(block, "_center", ModModels.SOFA_CENTER) { _ -> ModTextureMap.sofa(block) }
        val rightModelId = this.createSubModel(block, "_right", ModModels.SOFA_RIGHT) { _ -> ModTextureMap.sofa(block) }

        return VariantsBlockStateSupplier.create(block).coordinate(
            BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()
        ).coordinate(
            BlockStateVariantMap.create(AbstractSofaBlock.TYPE_PROPERTY)
                .register(SofaType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, singleModelId))
                .register(SofaType.LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, leftModelId))
                .register(SofaType.CENTER, BlockStateVariant.create().put(VariantSettings.MODEL, centerModelId))
                .register(SofaType.RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, rightModelId))
        )
    }

    private fun registerFactory(factory: TexturedModel.Factory, block: Block) {
        generator.blockStateCollector.accept(
            VariantsBlockStateSupplier.create(
                block,
                BlockStateVariant.create().put(VariantSettings.MODEL, factory.upload(block, generator.modelCollector))
            ).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates())
        )
    }

    fun createSubModel(
        block: Block,
        suffix: String,
        model: Model,
        texturesFactory: Function<Identifier, TextureMap>
    ): Identifier =
        model.upload(block, suffix, texturesFactory.apply(TextureMap.getId(block)), this.generator.modelCollector)
}