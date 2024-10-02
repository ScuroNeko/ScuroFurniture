package ru.scuroneko.furniture.gui

import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.render.GameRenderer
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import ru.scuroneko.furniture.Constants

class MedicalDrawerScreen(handler: MedicalDrawerScreenHandler, inventory: PlayerInventory, title: Text) :
    HandledScreen<MedicalDrawerScreenHandler>(handler, inventory, title) {
//    var texture: Identifier = DrawerUtils.materialToId(Constants.ScreenMaterialTextures.MEDICAL_DRAWER, this.handler.material)
    val texture = Constants.ScreenTextures.MEDICAL_DRAWER

    override fun drawBackground(context: DrawContext, delta: Float, mouseX: Int, mouseY: Int) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram)
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f)
        RenderSystem.setShaderTexture(0, texture)

        val x = (width - backgroundWidth) / 2
        val y = (height - backgroundHeight) / 2
        context.drawTexture(texture, x, y, 0, 0, backgroundWidth, backgroundHeight)
    }

    override fun render(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
        super.render(context, mouseX, mouseY, delta)
        this.drawMouseoverTooltip(context, mouseX, mouseY)
    }
}