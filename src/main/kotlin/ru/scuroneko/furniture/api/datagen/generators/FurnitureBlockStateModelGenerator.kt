package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.entity.Entity
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.CoffeeTableType
import ru.scuroneko.furniture.api.SofaType
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.api.blocks.AbstractSofaBlock
import ru.scuroneko.furniture.api.blocks.AbstractTableBlock
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys
import ru.scuroneko.furniture.api.datagen.ModTextureMap
import ru.scuroneko.furniture.blocks.CoffeeTableBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.LampBlock
import java.util.function.Function

class FurnitureBlockStateModelGenerator(private val generator: BlockStateModelGenerator) {
    fun registerMedicalDrawer(block: AbstractDrawerBlock) {
        val modelFactory = TexturedModel.makeFactory(ModTextureMap::drawer, ModModels.MEDICAL_DRAWER)
        registerFactory(modelFactory, block)
    }

    fun registerBedsideTable(block: AbstractDrawerBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::drawer, ModModels.BEDSIDE_DRAWER)
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

    fun registerLamp(lamp: LampBlock) {
        val map = TextureMap()
            .put(ModTextureKeys.WOOL, TextureMap.getId(lamp.wool))
            .put(TextureKey.PARTICLE, TextureMap.getId(lamp.wool))
            .put(ModTextureKeys.PLANKS, ModTextureMap.slabToPlanks(lamp.slab))
            .put(ModTextureKeys.LOG, TextureMap.getId(lamp.log))
        val factory = TexturedModel.makeFactory({ _ -> map }, ModModels.LAMP)
        registerFactory(factory, lamp)
    }

    fun registerCoffeeTable(table: CoffeeTableBlock) {
        generator.blockStateCollector.accept(createCoffeeTableBlockState(table))
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

    fun createCoffeeTableBlockState(block: CoffeeTableBlock): BlockStateSupplier {
        val single = TexturedModel.makeFactory({ _ -> TextureMap.texture(block.wood) }, ModModels.COFFEE_TABLE_SINGLE)
            .upload(block, generator.modelCollector)
        val leftModelId =
            createSubModel(block, "_left", ModModels.COFFEE_TABLE_LEFT) { _ -> ModTextureMap.coffeeTable(block) }
        val centerModelId =
            createSubModel(block, "_center", ModModels.COFFEE_TABLE_CENTER) { _ -> ModTextureMap.coffeeTable(block) }
        val rightModelId =
            createSubModel(block, "_right", ModModels.COFFEE_TABLE_RIGHT) { _ -> ModTextureMap.coffeeTable(block) }

        return VariantsBlockStateSupplier.create(block).coordinate(
            BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()
        ).coordinate(
            BlockStateVariantMap.create(AbstractTableBlock.TYPE)
                .register(CoffeeTableType.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, single))
                .register(CoffeeTableType.LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, leftModelId))
                .register(CoffeeTableType.CENTER, BlockStateVariant.create().put(VariantSettings.MODEL, centerModelId))
                .register(CoffeeTableType.RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, rightModelId))
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