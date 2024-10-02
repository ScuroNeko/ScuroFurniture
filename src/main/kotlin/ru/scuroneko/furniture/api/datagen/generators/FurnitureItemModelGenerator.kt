package ru.scuroneko.furniture.api.datagen.generators

import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.ModelIds
import net.minecraft.data.client.TextureMap
import ru.scuroneko.furniture.api.datagen.ModModels
import ru.scuroneko.furniture.api.datagen.ModTextureKeys
import ru.scuroneko.furniture.api.datagen.ModTextureMap
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

class FurnitureItemModelGenerator(private val generator: ItemModelGenerator) {
    fun registerSmallBox(box: BoxItem) {
        val id = ModTextureMap.slabToPlanks(box.slab)
        val map = TextureMap().put(ModTextureKeys.DRAWER_BOX, id)
        ModModels.SMALL_DRAWER_BOX.upload(ModelIds.getItemModelId(box), map, generator.writer)
    }

    fun registerMediumDrawerBox(box: BoxItem) {
        val id = ModTextureMap.slabToPlanks(box.slab)
        val map = TextureMap().put(ModTextureKeys.DRAWER_BOX, id)
        ModModels.MEDIUM_DRAWER_BOX.upload(ModelIds.getItemModelId(box), map, generator.writer)
    }

    fun registerBigDrawerBox(box: BoxItem) {
        val id = ModTextureMap.slabToPlanks(box.slab)
        val map = TextureMap().put(ModTextureKeys.DRAWER_BOX, id)
        ModModels.BIG_DRAWER_BOX.upload(ModelIds.getItemModelId(box), map, generator.writer)
    }

    fun registerMediumDoor(door: DoorItem) {
        val id = ModTextureMap.slabToPlanks(door.slab)
        val map = TextureMap().put(ModTextureKeys.CABINET_DOOR, id)
        ModModels.MEDIUM_DRAWER_DOOR.upload(ModelIds.getItemModelId(door), map, generator.writer)
    }

    fun registerMediumGlassDoor(door: DoorItem) {
        val id = ModTextureMap.slabToPlanks(door.slab)
        val map = TextureMap().put(ModTextureKeys.CABINET_DOOR, id)
        ModModels.MEDIUM_DRAWER_GLASS_DOOR.upload(ModelIds.getItemModelId(door), map, generator.writer)
    }

    fun registerBigDoor(door: DoorItem) {
        val id = ModTextureMap.slabToPlanks(door.slab)
        val map = TextureMap().put(ModTextureKeys.CABINET_DOOR, id)
        ModModels.BIG_DRAWER_DOOR.upload(ModelIds.getItemModelId(door), map, generator.writer)
    }

    fun registerMedicalCase(case: CaseItem) {
        val map = ModTextureMap.drawerCase(case)
        ModModels.MEDICAL_CASE.upload(ModelIds.getItemModelId(case), map, generator.writer)
    }

    fun registerBedsideDrawerCase(case: CaseItem) {
        val map = ModTextureMap.drawerCase(case)
        ModModels.BEDSIDE_DRAWER_CASE.upload(ModelIds.getItemModelId(case), map, generator.writer)
    }

    fun registerKitchenDrawerCase(caseItem: KitchenDrawerCaseItem) {
        val map = TextureMap()
            .put(ModTextureKeys.DRAWER_CASE, ModTextureMap.slabToPlanks(caseItem.material))
            .put(ModTextureKeys.DRAWER_CONCRETE, TextureMap.getId(caseItem.concrete))
        ModModels.KITCHEN_DRAWER_CASE.upload(ModelIds.getItemModelId(caseItem), map, generator.writer)
    }

    fun registerKitchenCabinetCase(case: CaseItem) {
        val map = ModTextureMap.drawerCase(case)
        ModModels.KITCHEN_CABINET_CASE.upload(ModelIds.getItemModelId(case), map, generator.writer)
    }

    fun registerSingleDrawerDoorCase(case: CaseItem) {
        val map = ModTextureMap.drawerCase(case)
        ModModels.SINGLE_DRAWER_CASE.upload(ModelIds.getItemModelId(case), map, generator.writer)
    }
}