package ru.scuroneko.furniture.integration

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import me.shedaniel.autoconfig.AutoConfig
import net.minecraft.client.gui.screen.Screen
import ru.scuroneko.furniture.config.ScuroFurnitureConfig

class ScuroFurnitureModMenuIntegration : ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<*> {
        return ConfigScreenFactory { parent: Screen ->
            AutoConfig.getConfigScreen(
                ScuroFurnitureConfig::class.java,
                parent
            ).get()
        }
    }
}