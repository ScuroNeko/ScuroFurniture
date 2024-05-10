package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.block.Block
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.ModelIds
import net.minecraft.data.client.TextureMap
import net.minecraft.item.Item
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys

class FurnitureItemModelGenerator(private val generator: ItemModelGenerator) {
    fun registerMedicalCase(wood: Block, item: Item) {
        val id = TextureMap.getId(wood)
        ModModels.MEDICAL_CASE.upload(ModelIds.getItemModelId(item), TextureMap.texture(id), generator.writer)
    }

    fun registerMedicalBox(item: Item, material: Block) {
        val id = TextureMap.getId(material)
        val map = TextureMap().put(ModTextureKeys.DRAWER_BOX, id)
        ModModels.MEDICAL_BOX.upload(ModelIds.getItemModelId(item), map, generator.writer)
    }
}