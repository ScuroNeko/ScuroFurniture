package ru.scuroneko.furniture.api

import net.minecraft.data.client.Model
import net.minecraft.data.client.TextureKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import java.util.*

object ModModels {
    val MEDICAL_DRAWER = block(
        Identifier(ScuroFurniture.MOD_ID, "block/medical_drawer"),
        TextureKey.TEXTURE
    )
    val MEDICAL_CASE = block(
        Identifier(ScuroFurniture.MOD_ID, "item/medical_case"),
        TextureKey.TEXTURE
    )
    val MEDICAL_BOX = block(
        Identifier(ScuroFurniture.MOD_ID, "item/medical_box"),
        TextureKey.TEXTURE
    )
    val BEDSIDE_TABLE = block(
        Identifier(ScuroFurniture.MOD_ID, "block/bedside_table"),
        TextureKey.TEXTURE
    )
    val KITCHEN_DRAWER = block(
        Identifier(ScuroFurniture.MOD_ID, "block/kitchen_drawer"),
        TextureKey.TEXTURE
    )
    val KITCHEN_CABINET = block(
        Identifier(ScuroFurniture.MOD_ID, "block/kitchen_cabinet"),
        TextureKey.TEXTURE
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