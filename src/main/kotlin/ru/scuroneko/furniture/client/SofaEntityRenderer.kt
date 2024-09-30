package ru.scuroneko.furniture.client

import net.minecraft.client.render.entity.EntityRenderer
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.blocks.entity.SofaEntity

class SofaEntityRenderer(ctx: EntityRendererFactory.Context) : EntityRenderer<SofaEntity>(ctx) {
    override fun getTexture(entity: SofaEntity): Identifier {
        return Identifier.of("minecraft", "textures/block/cherry_planks.png")
    }
}