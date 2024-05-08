package ru.scuroneko.furniture

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import ru.scuroneko.furniture.datagen.LootTableGeneratorProvider
import ru.scuroneko.furniture.datagen.ModelGeneratorProvider
import ru.scuroneko.furniture.datagen.RecipeGeneratorProvider
import ru.scuroneko.furniture.datagen.lang.EnglishLangProvider
import ru.scuroneko.furniture.datagen.lang.RussianLangProvider

object ScuroFurnitureDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()

		pack.addProvider(::ModelGeneratorProvider)
		pack.addProvider(::LootTableGeneratorProvider)
		pack.addProvider(::RecipeGeneratorProvider)

		pack.addProvider(::EnglishLangProvider)
		pack.addProvider(::RussianLangProvider)
	}
}