package ru.scuroneko.furniture.client.renderer

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.block.entity.BlockEntityRenderer
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory
import net.minecraft.client.render.entity.ItemFrameEntityRenderer
import net.minecraft.client.render.model.json.ModelTransformation
import net.minecraft.client.render.model.json.ModelTransformationMode
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.math.RotationAxis
import ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
import kotlin.math.sin


@Environment(EnvType.CLIENT)
class MedicalDrawerBlockEntityRenderer(ctx: BlockEntityRendererFactory.Context): BlockEntityRenderer<MedicalDrawerBlockEntity> {
    override fun render(
        entity: MedicalDrawerBlockEntity,
        tickDelta: Float,
        matrices: MatrixStack,
        vertexConsumers: VertexConsumerProvider?,
        light: Int,
        overlay: Int
    ) {
        matrices.push()
        matrices.translate(0.75, 9.0/16, 0.5)
        val stack = entity.getStack(0)
        if(!stack.isEmpty)
            MinecraftClient.getInstance().itemRenderer.renderItem(stack, ModelTransformationMode.GROUND, light, overlay, matrices, vertexConsumers, entity.world, 0);

        // Mandatory call after GL calls
        matrices.pop();
    }
}