package ru.scuroneko.furniture.api.datagen

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.data.client.TextureKey
import net.minecraft.data.client.TextureMap
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.KitchenDrawerBlock
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem

object ModTextureMap {
    fun drawer(block: Block): TextureMap {
        block as AbstractDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(block.case.material))
            .put(ModTextureKeys.GLASS, TextureMap.getId(Blocks.GLASS))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(block.case.material))
            .put(ModTextureKeys.DRAWER_BOX, boxPlanks(block.box!!))
    }

    fun drawerWithDoor(block: Block): TextureMap {
        block as AbstractDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(block.case.material))
            .put(ModTextureKeys.GLASS, TextureMap.getId(Blocks.GLASS))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(block.case.material))
            .put(ModTextureKeys.DRAWER_DOOR, doorPlanks(block.door!!))

    }

    fun drawerCase(case: CaseItem): TextureMap {
        return TextureMap().put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(case.material))
    }

    fun kitchenDrawer(block: Block): TextureMap {
        val drawer = block as KitchenDrawerBlock
        return TextureMap()
            .put(TextureKey.PARTICLE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_CASE, TextureMap.getId(drawer.case.material))
            .put(ModTextureKeys.DRAWER_BOX, boxPlanks(drawer.box!!))
            .put(ModTextureKeys.DRAWER_CONCRETE, TextureMap.getId((drawer.case as KitchenDrawerCaseItem).concrete))
    }

    /**
     * Get material from [slab] and returns planks [Identifier]
     */
    fun slabToPlanks(slab: Block): Identifier {
        val id = TextureMap.getId(slab)
        return Identifier.of(id.namespace, id.path.replace("slab", "planks"))
    }

    fun boxPlanks(box: BoxItem): Identifier = slabToPlanks(box.slab)
    fun doorPlanks(door: DoorItem): Identifier = slabToPlanks(door.slab)
}