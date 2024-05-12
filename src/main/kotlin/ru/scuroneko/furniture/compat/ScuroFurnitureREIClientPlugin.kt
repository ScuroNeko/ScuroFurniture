package ru.scuroneko.furniture.compat

import me.shedaniel.rei.api.client.plugins.REIClientPlugin
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry

class ScuroFurnitureREIClientPlugin : REIClientPlugin {
    override fun registerCategories(registry: CategoryRegistry?) {
        super.registerCategories(registry)
    }

    override fun registerDisplays(registry: DisplayRegistry?) {
        super.registerDisplays(registry)
    }

    override fun registerScreens(registry: ScreenRegistry?) {
        super.registerScreens(registry)
    }
}