package ru.scuroneko.furniture.roads.recipe

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.network.PacketByteBuf
import net.minecraft.recipe.Ingredient
import net.minecraft.recipe.Recipe
import net.minecraft.recipe.RecipeSerializer
import net.minecraft.recipe.RecipeType
import net.minecraft.registry.DynamicRegistryManager
import net.minecraft.util.collection.DefaultedList
import net.minecraft.world.World


class RoadWorkerStationRecipe(private val ingredient: Ingredient, val output: ItemStack) : Recipe<SimpleInventory> {
    override fun matches(inventory: SimpleInventory, world: World): Boolean = if(world.isClient) false else this.ingredient.test(inventory.getStack(0))
    override fun craft(inventory: SimpleInventory, registryManager: DynamicRegistryManager): ItemStack = this.output
    override fun fits(width: Int, height: Int): Boolean = true
    override fun getResult(registryManager: DynamicRegistryManager?): ItemStack = this.output
    override fun getSerializer(): RecipeSerializer<*> = Serializer.INSTANCE
    override fun getType(): RecipeType<*> = Type.INSTANCE

    override fun getIngredients(): DefaultedList<Ingredient> {
        val list = DefaultedList.of<Ingredient>()
        list.add(this.ingredient)
        return list
    }

    class Type : RecipeType<RoadWorkerStationRecipe> {
        companion object {
            @JvmStatic
            val INSTANCE = Type()
        }
    }

    class Serializer : RecipeSerializer<RoadWorkerStationRecipe> {
        companion object {
            @JvmStatic
            val INSTANCE = Serializer()
        }

        private val codec: Codec<RoadWorkerStationRecipe> = RecordCodecBuilder.create { instance ->
            instance.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter { r -> r.ingredient },
                ItemStack.RECIPE_RESULT_CODEC.fieldOf("output").forGetter { r -> r.output }
            ).apply(instance, ::RoadWorkerStationRecipe)
        }

        override fun codec(): Codec<RoadWorkerStationRecipe> = codec

        override fun read(buf: PacketByteBuf): RoadWorkerStationRecipe {
            val input = Ingredient.fromPacket(buf)
            val output = buf.readItemStack()
            return RoadWorkerStationRecipe(input, output)
        }

        override fun write(buf: PacketByteBuf, recipe: RoadWorkerStationRecipe) {
            recipe.ingredient.write(buf)
            buf.writeItemStack(recipe.getResult(null))
        }
    }
}