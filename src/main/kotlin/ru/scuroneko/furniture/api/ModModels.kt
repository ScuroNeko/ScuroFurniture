package ru.scuroneko.furniture.api

import net.minecraft.data.client.Model
import net.minecraft.data.client.TextureKey
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import java.util.*

object ModModels {
    val MEDICAL_DRAWER = block(
        Identifier(ScuroFurniture.CARPENTER_MOD_ID, "block/medical_drawer"),
        TextureKey.TEXTURE
    )
    val BEDSIDE_TABLE = block(
        Identifier(ScuroFurniture.CARPENTER_MOD_ID, "block/bedside_table"),
        TextureKey.TEXTURE
    )
    val KITCHEN_DRAWER = block(
        Identifier(ScuroFurniture.CARPENTER_MOD_ID, "block/kitchen_drawer"),
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

    private fun block(parent: String, variant: String, vararg requiredTextureKeys: TextureKey): Model {
        return Model(
            Optional.of(
                Identifier(
                    "minecraft",
                    "block/$parent"
                )
            ), Optional.of(variant), *requiredTextureKeys
        )
    }
}