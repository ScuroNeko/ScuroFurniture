package ru.scuroneko.furniture.roads.gui

import com.mojang.blaze3d.systems.RenderSystem
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.gui.screen.ingame.HandledScreen
import net.minecraft.client.render.GameRenderer
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture

@Environment(EnvType.CLIENT)
class RoadWorkerStationScreen(handler: RoadWorkerStationScreenHandler, inventory: PlayerInventory, title: Text) : HandledScreen<RoadWorkerStationScreenHandler>(handler, inventory, title) {
    private val TEXTURE = Identifier(ScuroFurniture.ROADS_MOD_ID, "textures/gui/road_worker_station_gui.png")

    override fun init() {
        super.init()
    }

    override fun drawBackground(context: DrawContext, delta: Float, mouseX: Int, mouseY: Int) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram)
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f)
        RenderSystem.setShaderTexture(0, TEXTURE)

        val x = (width - backgroundWidth) / 2
        val y = (height - backgroundHeight) / 2
        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight)

        this.renderRecipeIcons(context, mouseX, mouseY)
    }

    private fun renderRecipeIcons(context: DrawContext, mouseX: Int, mouseY: Int) {
        val recipe = this.handler.getAvailableRecipes()
        println(recipe)

        //FIXME
        for (i in recipe.indices) {
            context.drawItem(recipe[i].value.getResult(null), i*18+18, (i/4)*18)
        }
    }

    override fun render(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) {
        super.render(context, mouseX, mouseY, delta)
        this.drawMouseoverTooltip(context, mouseX, mouseY)
    }
}