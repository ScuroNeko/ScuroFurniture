package ru.scuroneko.furniture.registry

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import ru.scuroneko.furniture.api.registry.autoregistry.IRegistryContainer
import ru.scuroneko.furniture.blocks.entity.BedsideTableBlockEntity
import ru.scuroneko.furniture.blocks.entity.KitchenDrawerBlockEntity
import ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.registry.blocks.BedsideDrawers.OAK_BEDSIDE_DRAWER
import ru.scuroneko.furniture.registry.blocks.KitchenDrawers.BLACK_OAK_KITCHEN_DRAWER
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers.OAK_MEDICAL_DRAWER

object ModBlockEntities : IRegistryContainer<BlockEntityType<*>> {
    val MEDICAL_DRAWER_BLOCK_ENTITY: BlockEntityType<MedicalDrawerBlockEntity> = BlockEntityType.Builder.create(
        ::MedicalDrawerBlockEntity, OAK_MEDICAL_DRAWER
    ).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY: BlockEntityType<BedsideTableBlockEntity> = BlockEntityType.Builder.create(
        ::BedsideTableBlockEntity, OAK_BEDSIDE_DRAWER
    ).build()
    val KITCHEN_DRAWER_BLOCK_ENTITY: BlockEntityType<KitchenDrawerBlockEntity> = BlockEntityType.Builder.create(
        ::KitchenDrawerBlockEntity, BLACK_OAK_KITCHEN_DRAWER
    ).build()

    override fun getRegistry(): Registry<BlockEntityType<*>> = Registries.BLOCK_ENTITY_TYPE
}