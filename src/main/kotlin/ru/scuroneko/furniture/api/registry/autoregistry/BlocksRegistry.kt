package ru.scuroneko.furniture.api.registry.autoregistry

import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.api.registry.autoregistry.annotations.NoBlockItem
import kotlin.reflect.full.findAnnotations
import kotlin.reflect.full.memberProperties

object BlocksRegistry : AutoRegistry<Block>() {
    fun registerContainer(container: IBlocksContainer, modId: String) {
        processContainer(modId, container)
        ScuroFurniture.LOGGER.debug("Container ${container::class.simpleName} has been registered!")
    }

    private fun processContainer(modId: String, container: IBlocksContainer) {
        val cls = container::class

        var counter = 0
        cls.memberProperties.forEach { field ->
            val info = super.processField(field, container, modId) ?: return@forEach
            counter++
            if (field.findAnnotations(NoBlockItem::class).isNotEmpty()) return@forEach
            val blockItem = container.getBlockItem(info.obj)
            Registry.register(
                Registries.ITEM,
                Identifier.of(info.namespace, info.name),
                blockItem
            )
            container.afterBlockItem(blockItem)
        }
        container.afterRegistry()
        ScuroFurniture.LOGGER.debug("Registered $counter blocks in ${container::class.simpleName}")
    }
}