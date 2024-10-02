package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.data.client.BlockStateVariantMap.TripleProperty
import net.minecraft.data.client.VariantSettings.Rotation
import net.minecraft.state.property.Properties
import net.minecraft.util.Identifier
import net.minecraft.util.math.Direction
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.api.blocks.AbstractStackableDrawerBlock
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys
import ru.scuroneko.furniture.api.datagen.ModTextureMap
import ru.scuroneko.furniture.api.state.ModProperties
import ru.scuroneko.furniture.api.state.StackableDrawerHinge
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
        val singleLeftModelId = TexturedModel.makeFactory(ModTextureMap::drawerWithDoor, ModModels.SINGLE_DRAWER_SL)
            .upload(block, generator.modelCollector)

//        val singleLeftModelId = this.createSubModel(block, "_sl", ModModels.SINGLE_DRAWER_SL) { _ -> ModTextureMap.drawerWithDoor(block) }
        val singleRightModelId =
            this.createSubModel(block, "_sr", ModModels.SINGLE_DRAWER_SR) { _ -> ModTextureMap.drawerWithDoor(block) }
        val upLeftModelId =
            this.createSubModel(block, "_ul", ModModels.SINGLE_DRAWER_UL) { _ -> ModTextureMap.drawerWithDoor(block) }
        val upRightModelId =
            this.createSubModel(block, "_ur", ModModels.SINGLE_DRAWER_UR) { _ -> ModTextureMap.drawerWithDoor(block) }
        val centerLeftModelId =
            this.createSubModel(block, "_cl", ModModels.SINGLE_DRAWER_CL) { _ -> ModTextureMap.drawerWithDoor(block) }
        val centerRightModelId =
            this.createSubModel(block, "_cr", ModModels.SINGLE_DRAWER_CR) { _ -> ModTextureMap.drawerWithDoor(block) }
        val downLeftModelId =
            this.createSubModel(block, "_dl", ModModels.SINGLE_DRAWER_DL) { _ -> ModTextureMap.drawerWithDoor(block) }
        val downRightModelId =
            this.createSubModel(block, "_dr", ModModels.SINGLE_DRAWER_DR) { _ -> ModTextureMap.drawerWithDoor(block) }

        val variantMap = BlockStateVariantMap.create(
            Properties.HORIZONTAL_FACING,
            ModProperties.STACKABLE_DRAWER_PART,
            ModProperties.STACKABLE_DRAWER_HINGE
        )

        return VariantsBlockStateSupplier.create(block).coordinate(
            fillStackableDrawerVariantMap(
                fillStackableDrawerVariantMap(
                    fillStackableDrawerVariantMap(
                        fillStackableDrawerVariantMap(
                            variantMap, StackableDrawerPart.SINGLE, singleLeftModelId, singleRightModelId
                        ), StackableDrawerPart.UP, upLeftModelId, upRightModelId
                    ), StackableDrawerPart.CENTER, centerLeftModelId, centerRightModelId
                ), StackableDrawerPart.DOWN, downLeftModelId, downRightModelId
            )
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

    private fun fillStackableDrawerVariantMap(
        variantMap: TripleProperty<Direction, StackableDrawerPart, StackableDrawerHinge>,
        targetPart: StackableDrawerPart,
        leftHingeModelId: Identifier,
        rightHingeModelId: Identifier,
    ): TripleProperty<Direction, StackableDrawerPart, StackableDrawerHinge> {
        return variantMap.register(
            Direction.EAST, targetPart, StackableDrawerHinge.LEFT,
            BlockStateVariant.create().put(VariantSettings.MODEL, leftHingeModelId).put(VariantSettings.Y, Rotation.R90)
        ).register(
            Direction.SOUTH, targetPart, StackableDrawerHinge.LEFT,
            BlockStateVariant.create().put(VariantSettings.MODEL, leftHingeModelId)
                .put(VariantSettings.Y, Rotation.R180)
        ).register(
            Direction.WEST, targetPart, StackableDrawerHinge.LEFT,
            BlockStateVariant.create().put(VariantSettings.MODEL, leftHingeModelId)
                .put(VariantSettings.Y, Rotation.R270)
        ).register(
            Direction.NORTH, targetPart, StackableDrawerHinge.LEFT,
            BlockStateVariant.create().put(VariantSettings.MODEL, leftHingeModelId)
        ).register(
            Direction.EAST, targetPart, StackableDrawerHinge.RIGHT,
            BlockStateVariant.create().put(VariantSettings.MODEL, rightHingeModelId)
                .put(VariantSettings.Y, Rotation.R90)
        ).register(
            Direction.SOUTH, targetPart, StackableDrawerHinge.RIGHT,
            BlockStateVariant.create().put(VariantSettings.MODEL, rightHingeModelId)
                .put(VariantSettings.Y, Rotation.R180)
        ).register(
            Direction.WEST, targetPart, StackableDrawerHinge.RIGHT,
            BlockStateVariant.create().put(VariantSettings.MODEL, rightHingeModelId)
                .put(VariantSettings.Y, Rotation.R270)
        ).register(
            Direction.NORTH, targetPart, StackableDrawerHinge.RIGHT,
            BlockStateVariant.create().put(VariantSettings.MODEL, rightHingeModelId)
        )
    }
}