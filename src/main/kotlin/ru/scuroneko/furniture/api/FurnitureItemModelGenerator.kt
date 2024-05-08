package ru.scuroneko.furniture.api

import net.minecraft.block.Block
import net.minecraft.data.client.*
import net.minecraft.item.BlockItem
import net.minecraft.item.Item

class FurnitureItemModelGenerator(private val generator: ItemModelGenerator) {
    fun registerMedicalDrawer(item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.MEDICAL_DRAWER.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerMedicalCase(wood: Block, item: Item) {
        val id = TextureMap.getId(wood)
        ModModels.MEDICAL_CASE.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerMedicalBox(item: Item) {
        val id = TextureMap.getId(item)
        ModModels.MEDICAL_BOX.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerBedsideTable(item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.BEDSIDE_TABLE.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerKitchenDrawer(item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.KITCHEN_DRAWER.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerKitchenCabinet(item: Item) {
        val id = if(item is BlockItem) TextureMap.getId(item.block) else TextureMap.getId(item)
        ModModels.KITCHEN_CABINET.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }
}