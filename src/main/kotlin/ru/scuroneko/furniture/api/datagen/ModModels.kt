package ru.scuroneko.furniture.api.datagen

import net.minecraft.data.client.Model
import net.minecraft.data.client.TextureKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import java.util.*

object ModModels {
    val MEDICAL_DRAWER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/medical_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val BEDSIDE_DRAWER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/bedside_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val KITCHEN_DRAWER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX, ModTextureKeys.DRAWER_CONCRETE,
        TextureKey.PARTICLE
    )
    val KITCHEN_CABINET = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_cabinet"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val KITCHEN_GLASS_CABINET = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_glass_cabinet"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )

    val SINGLE_DRAWER_SL = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_sl"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_SR = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_sr"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_UL = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_ul"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_UR = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_ur"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_CL = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_cl"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_CR = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_cr"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_DL = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_dl"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )
    val SINGLE_DRAWER_DR = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/single_drawer_dr"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_DOOR,
        TextureKey.PARTICLE
    )

    val SHELF = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/shelf"),
        ModTextureKeys.PLANKS, TextureKey.PARTICLE
    )

    val MEDICAL_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medical_drawer_case"),
        ModTextureKeys.DRAWER_CASE
    )
    val BEDSIDE_DRAWER_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/bedside_drawer_case"),
        ModTextureKeys.DRAWER_CASE
    )
    val KITCHEN_DRAWER_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/kitchen_drawer_case"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_CONCRETE
    )
    val KITCHEN_CABINET_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/kitchen_cabinet_case"),
        ModTextureKeys.DRAWER_CASE
    )
    val SINGLE_DRAWER_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/single_drawer_case"),
        ModTextureKeys.DRAWER_CASE
    )

    val SMALL_DRAWER_BOX = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/small_drawer_box"),
        ModTextureKeys.DRAWER_BOX
    )
    val MEDIUM_DRAWER_BOX = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medium_drawer_box"),
        ModTextureKeys.DRAWER_BOX
    )
    val BIG_DRAWER_BOX = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/big_drawer_box"),
        ModTextureKeys.DRAWER_BOX
    )

    val MEDIUM_DRAWER_DOOR = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medium_drawer_door"),
        ModTextureKeys.CABINET_DOOR
    )
    val MEDIUM_DRAWER_GLASS_DOOR = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medium_drawer_glass_door"),
        ModTextureKeys.CABINET_DOOR
    )
    val BIG_DRAWER_DOOR = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/big_drawer_door"),
        ModTextureKeys.CABINET_DOOR
    )

    private fun item(parent: Identifier, vararg requiredTextureKeys: TextureKey): Model {
        return Model(Optional.of(parent), Optional.empty(), *requiredTextureKeys)
    }

    private fun block(parent: Identifier, vararg requiredTextureKeys: TextureKey): Model {
        return Model(Optional.of(parent), Optional.empty(), *requiredTextureKeys)
    }

    private fun block(parent: Identifier, variant: String, vararg requiredTextureKeys: TextureKey): Model {
        return Model(Optional.of(parent), Optional.of(variant), *requiredTextureKeys)
    }
}