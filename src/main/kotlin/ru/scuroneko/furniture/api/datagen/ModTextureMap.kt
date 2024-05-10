package ru.scuroneko.furniture.api.datagen

import net.minecraft.block.Block
import net.minecraft.data.client.TextureKey
import net.minecraft.data.client.TextureMap
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenCabinetBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.MedicalDrawerBlock
import ru.scuroneko.furniture.blocks.SofaBlock

object ModTextureMap {
    fun drawer(block: Block): TextureMap {
        val drawer = block as AbstractDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(drawer.caseMaterial))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(drawer.caseMaterial))
            .put(ModTextureKeys.DRAWER_BOX, TextureMap.getId(drawer.boxMaterial))
    }

    fun kitchenDrawer(block: Block): TextureMap {
        val drawer = block as KitchenDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(drawer.caseMaterial))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(drawer.caseMaterial))
            .put(ModTextureKeys.DRAWER_BOX, TextureMap.getId(drawer.boxMaterial))
            .put(ModTextureKeys.DRAWER_CONCRETE, TextureMap.getId(drawer.concrete))
    }

    fun sofa(block: Block): TextureMap {
        val sofa = block as SofaBlock
        return TextureMap()
            .put(ModTextureKeys.WOOL, TextureMap.getId(sofa.wool))
            .put(ModTextureKeys.LOG, TextureMap.getId(sofa.legMaterial))
            .put(ModTextureKeys.PLANKS, TextureMap.getId(sofa.baseMaterial))
            .put(TextureKey.PARTICLE, TextureMap.getId(sofa.baseMaterial))
    }
}