package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.api.blocks.AbstractStackableDrawerBlock
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys
import ru.scuroneko.furniture.api.datagen.ModTextureMap
import ru.scuroneko.furniture.api.state.ModProperties
import ru.scuroneko.furniture.api.state.StackableDrawerPart
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenGlassCabinetBlock
import ru.scuroneko.furniture.blocks.ShelfBlock
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

    fun registerKitchenCabinet(block: KitchenCabinetBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::drawerWithDoor, ModModels.KITCHEN_CABINET)
        registerFactory(factory, block)
    }

    fun registerKitchenGlassCabinet(block: KitchenGlassCabinetBlock) {
        val factory = TexturedModel.makeFactory(ModTextureMap::drawerWithDoor, ModModels.KITCHEN_GLASS_CABINET)
        registerFactory(factory, block)
    }

    fun registerStackableDrawer(block: AbstractStackableDrawerBlock) {
        generator.blockStateCollector.accept(createStackableDrawerBlockState(block))
    }

    fun registerShelf(shelf: ShelfBlock) {
        val map = TextureMap()
            .put(ModTextureKeys.PLANKS, ModTextureMap.slabToPlanks(shelf.slab))
            .put(TextureKey.PARTICLE, ModTextureMap.slabToPlanks(shelf.slab))
        val factory = TexturedModel.makeFactory({ _ -> map }, ModModels.SHELF)
        registerFactory(factory, shelf)
    }

    fun createStackableDrawerBlockState(block: Block): BlockStateSupplier {
        val singleModelId = TexturedModel.makeFactory(ModTextureMap::drawerWithDoor, ModModels.SINGLE_DRAWER_S)
            .upload(block, generator.modelCollector)
        val upModelId = this.createSubModel(block, "_u", ModModels.SINGLE_DRAWER_U) { _ -> ModTextureMap.drawerWithDoor(block) }
        val centerModelId = this.createSubModel(block, "_c", ModModels.SINGLE_DRAWER_C) { _ -> ModTextureMap.drawerWithDoor(block) }
        val downModelId = this.createSubModel(block, "_d", ModModels.SINGLE_DRAWER_D) { _ -> ModTextureMap.drawerWithDoor(block) }

        return VariantsBlockStateSupplier.create(block).coordinate(
            BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()
        ).coordinate(
            BlockStateVariantMap.create(ModProperties.STACKABLE_DRAWER_PART)
                .register(StackableDrawerPart.SINGLE, BlockStateVariant.create().put(VariantSettings.MODEL, singleModelId))
                .register(StackableDrawerPart.UP, BlockStateVariant.create().put(VariantSettings.MODEL, upModelId))
                .register(StackableDrawerPart.CENTER, BlockStateVariant.create().put(VariantSettings.MODEL, centerModelId))
                .register(StackableDrawerPart.DOWN, BlockStateVariant.create().put(VariantSettings.MODEL, downModelId))
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