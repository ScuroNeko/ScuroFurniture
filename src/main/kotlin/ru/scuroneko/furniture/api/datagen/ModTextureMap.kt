package ru.scuroneko.furniture.api.datagen

import net.minecraft.block.Block
import net.minecraft.data.client.TextureKey
import net.minecraft.data.client.TextureMap
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.blocks.SofaBlock
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

object ModTextureMap {
    fun drawer(block: Block): TextureMap {
        val drawer = block as AbstractDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_BOX, boxPlanks(drawer.box))
    }

    fun kitchenDrawer(block: Block): TextureMap {
        val drawer = block as KitchenDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_BOX, slabToPlanks(drawer.box.slab))
            .put(ModTextureKeys.DRAWER_CONCRETE, TextureMap.getId((drawer.case as KitchenDrawerCaseItem).concrete))
    }

    fun sofa(block: Block): TextureMap {
        val sofa = block as SofaBlock
        return TextureMap()
            .put(ModTextureKeys.WOOL, TextureMap.getId(sofa.wool))
            .put(ModTextureKeys.LOG, TextureMap.getId(sofa.legMaterial))
            .put(ModTextureKeys.PLANKS, TextureMap.getId(sofa.baseMaterial))
            .put(TextureKey.PARTICLE, TextureMap.getId(sofa.baseMaterial))
    }

    /**
     * Get material from [slab] and returns planks [Identifier]
     */
    fun slabToPlanks(slab: Block): Identifier {
        val id = TextureMap.getId(slab)
        return Identifier(id.namespace, id.path.replace("slab", "planks"))
    }

    fun boxPlanks(box: BoxItem): Identifier = slabToPlanks(box.slab)
}