package ru.scuroneko.furniture.api.datagen

import net.minecraft.data.client.Model
import net.minecraft.data.client.TextureKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import java.util.*

object ModModels {
    val MEDICAL_DRAWER = block(
        Identifier(ScuroFurniture.MOD_ID, "block/medical_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val MEDICAL_CASE = block(
        Identifier(ScuroFurniture.MOD_ID, "item/medical_case"),
        TextureKey.TEXTURE
    )
    val MEDICAL_BOX = item(
        Identifier(ScuroFurniture.MOD_ID, "item/medical_box"),
        ModTextureKeys.DRAWER_BOX
    )
    val BEDSIDE_TABLE = block(
        Identifier(ScuroFurniture.MOD_ID, "block/bedside_table"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )
    val KITCHEN_DRAWER = block(
        Identifier(ScuroFurniture.MOD_ID, "block/kitchen_drawer"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX, ModTextureKeys.DRAWER_CONCRETE,
        TextureKey.PARTICLE
    )
    val KITCHEN_CABINET = block(
        Identifier(ScuroFurniture.MOD_ID, "block/kitchen_cabinet"),
        ModTextureKeys.DRAWER_CASE, ModTextureKeys.DRAWER_BOX,
        TextureKey.PARTICLE
    )

    val SOFA_SINGLE = block(
        Identifier(ScuroFurniture.MOD_ID, "block/sofa"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_LEFT = block(
        Identifier(ScuroFurniture.MOD_ID, "block/sofa_left"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_CENTER = block(
        Identifier(ScuroFurniture.MOD_ID, "block/sofa_center"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )
    val SOFA_RIGHT = block(
        Identifier(ScuroFurniture.MOD_ID, "block/sofa_right"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )

    val LAMP = block(
        Identifier(ScuroFurniture.MOD_ID, "block/lamp"),
        ModTextureKeys.WOOL, ModTextureKeys.PLANKS, ModTextureKeys.LOG,
        TextureKey.PARTICLE
    )

    private fun item(parent: Identifier, vararg requiredTextureKeys: TextureKey): Model {
        return Model(
            Optional.of(parent), Optional.empty(), *requiredTextureKeys
        )
    }

    private fun block(parent: Identifier, vararg requiredTextureKeys: TextureKey): Model {
        return Model(
            Optional.of(parent), Optional.empty(), *requiredTextureKeys
        )
    }

    private fun block(parent: Identifier, variant: String, vararg requiredTextureKeys: TextureKey): Model {
        return Model(
            Optional.of(parent), Optional.of(variant), *requiredTextureKeys
        )
    }
}