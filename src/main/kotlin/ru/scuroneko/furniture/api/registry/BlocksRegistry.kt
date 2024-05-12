package ru.scuroneko.furniture.api.registry

import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.registry.annotations.NoBlockItem
import kotlin.reflect.full.findAnnotations
import kotlin.reflect.full.memberProperties

object BlocksRegistry : AutoRegistry<Block>() {
    fun registerContainer(container: IBlocksContainer, modId: String) {
        this.processContainer(modId, container)
        ScuroFurniture.LOGGER.info("Container ${container::class.simpleName} has been registered!")
    }

    private fun processContainer(modId: String, container: IBlocksContainer) {
        val cls = container::class

        var counter = 0
        cls.memberProperties.forEach { field ->
            val info = super.processField(field, container, modId) ?: return@forEach
            counter++
            if (field.findAnnotations(NoBlockItem::class).isNotEmpty()) return@forEach
            Registry.register(
                Registries.ITEM,
                Identifier(info.namespace, info.name),
                container.getBlockItem(info.obj)
            )
        }
        container.afterRegistry()
        ScuroFurniture.LOGGER.info("Registered $counter blocks in ${container::class.simpleName}")
    }
}