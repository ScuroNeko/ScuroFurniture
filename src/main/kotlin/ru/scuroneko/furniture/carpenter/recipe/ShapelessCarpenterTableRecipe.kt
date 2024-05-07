package ru.scuroneko.furniture.carpenter.recipe

import com.mojang.serialization.Codec
import com.mojang.serialization.DataResult
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
import net.minecraft.util.dynamic.Codecs
import net.minecraft.world.World


// TODO will be shapeless
class ShapelessCarpenterTableRecipe(private val ingredients: List<Ingredient>, private val output: ItemStack) : Recipe<SimpleInventory> {
    override fun matches(inventory: SimpleInventory, world: World): Boolean {
        if(world.isClient) return false
        for (i in 0 until this.ingredients.size) {
            if (!this.ingredients[i].test(inventory.getStack(i)))
                return false
        }
        return true
    }

    override fun craft(inventory: SimpleInventory, registryManager: DynamicRegistryManager?): ItemStack {
        inventory.getStack(0).count -= 1

        return this.getResult(registryManager)
    }
    override fun getResult(registryManager: DynamicRegistryManager?): ItemStack = this.output
    override fun fits(width: Int, height: Int): Boolean = true
    override fun getSerializer(): RecipeSerializer<*> = Serializer.INSTANCE
    override fun getType(): RecipeType<*> = Type.INSTANCE
    override fun getIngredients(): DefaultedList<Ingredient> {
        val input = DefaultedList.ofSize<Ingredient>(this.ingredients.size)
        input.addAll(this.ingredients)
        return input
    }

    class Type : RecipeType<ShapelessCarpenterTableRecipe> {
        companion object {
            @JvmStatic val INSTANCE = Type()
        }
    }

    class Serializer : RecipeSerializer<ShapelessCarpenterTableRecipe> {
        companion object {
            @JvmStatic val INSTANCE = Serializer()
        }

        private val codec: Codec<ShapelessCarpenterTableRecipe> = RecordCodecBuilder.create { instance ->
            instance.group(
                validateAmount(Ingredient.DISALLOW_EMPTY_CODEC, 12).fieldOf("ingredients")
                    .forGetter(ShapelessCarpenterTableRecipe::getIngredients),
                ItemStack.RECIPE_RESULT_CODEC.fieldOf("output").forGetter { r -> r.output }
            ).apply(instance, ::ShapelessCarpenterTableRecipe)
        }

        private fun validateAmount(delegate: Codec<Ingredient>, max: Int): Codec<List<Ingredient>> {
            return Codecs.validate(Codecs.validate(delegate.listOf()) { list ->
                if (list.size > max) DataResult.error { "Too many" } else DataResult.success(list)
            }) { list ->
                if (list.isEmpty()) DataResult.error { "Empty" } else DataResult.success(list)
            }
        }

        override fun codec(): Codec<ShapelessCarpenterTableRecipe> = codec

        override fun read(buf: PacketByteBuf): ShapelessCarpenterTableRecipe {
            val count = buf.readInt()
            val input = DefaultedList.ofSize<Ingredient>(count)
            for (i in 0 until count)
                input.add(Ingredient.fromPacket(buf))
            val output = buf.readItemStack()
            println(output)
            return ShapelessCarpenterTableRecipe(input, output)
        }

        override fun write(buf: PacketByteBuf, recipe: ShapelessCarpenterTableRecipe) {
            buf.writeInt(recipe.ingredients.size)
            for (ingredient in recipe.ingredients)
                ingredient.write(buf)
            buf.writeItemStack(recipe.getResult(null))
        }
    }
}