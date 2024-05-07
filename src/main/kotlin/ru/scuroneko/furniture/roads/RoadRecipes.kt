package ru.scuroneko.furniture.roads

import net.minecraft.recipe.Recipe
import net.minecraft.recipe.RecipeSerializer
import net.minecraft.recipe.RecipeType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.roads.recipe.RoadWorkerStationRecipe

object RoadRecipes {
    fun register() {
        registerRecipe("road_worker_station", RoadWorkerStationRecipe.Type.INSTANCE, RoadWorkerStationRecipe.Serializer.INSTANCE)
    }

    private fun <T: Recipe<*>> registerRecipe(path: String, type: RecipeType<T>, serializer: RecipeSerializer<T>) {
        Registry.register(Registries.RECIPE_TYPE, Identifier(ScuroFurniture.MOD_ID, path), type)
        Registry.register(Registries.RECIPE_SERIALIZER, Identifier(ScuroFurniture.MOD_ID, path), serializer)
        ScuroFurniture.LOGGER.info("Registered recipe type '${ScuroFurniture.MOD_ID}:$path'")
    }
}