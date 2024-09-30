package ru.scuroneko.furniture.api.registry.autoregistry

import net.minecraft.item.Item
import ru.scuroneko.furniture.ScuroFurniture

object ItemsRegistry : AutoRegistry<Item>() {
    fun registerContainer(container: IItemContainer, modId: String) {
        ScuroFurniture.LOGGER.debug("Container ${container::class.simpleName} has been registered!")
        super.processContainer(container, modId)
    }
}