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
    val MEDICAL_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medical_drawer_case"),
        ModTextureKeys.DRAWER_CASE
    )
    val MEDICAL_BOX = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medical_box"),
        ModTextureKeys.DRAWER_BOX
    )

    val BEDSIDE_DRAWER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/bedside_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val BEDSIDE_DRAWER_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/bedside_drawer_case"),
        ModTextureKeys.DRAWER_CASE
    )

    val KITCHEN_DRAWER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX, ModTextureKeys.DRAWER_CONCRETE,
        TextureKey.PARTICLE
    )
    val KITCHEN_DRAWER_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/kitchen_drawer_case"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_CONCRETE
    )
    val MEDIUM_DRAWER_BOX = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/medium_drawer_box"),
        ModTextureKeys.DRAWER_BOX
    )

    val KITCHEN_CABINET = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_cabinet"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val KITCHEN_GLASS_CABINET = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/kitchen_glass_cabinet"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val KITCHEN_CABINET_CASE = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/kitchen_cabinet_case"),
        ModTextureKeys.DRAWER_CASE
    )
    val KITCHEN_CABINET_DOOR = item(
        Identifier.of(ScuroFurniture.MOD_ID, "item/kitchen_cabinet_door"),
        ModTextureKeys.CABINET_DOOR
    )

    val SOFA_SINGLE = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/sofa"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_LEFT = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/sofa_left"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_CENTER = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/sofa_center"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_RIGHT = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/sofa_right"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )

    val LAMP = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/lamp"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )

    val SHELF = block(
        Identifier.of(ScuroFurniture.MOD_ID, "block/shelf"),
        ModTextureKeys.PLANKS, TextureKey.PARTICLE
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