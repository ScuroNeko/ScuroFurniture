package ru.scuroneko.furniture.registry

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import ru.scuroneko.furniture.api.registry.autoregistry.IRegistryContainer
import ru.scuroneko.furniture.blocks.entity.*

object ModBlockEntities : IRegistryContainer<BlockEntityType<*>> {
    val MEDICAL_DRAWER_BLOCK_ENTITY: BlockEntityType<MedicalDrawerBlockEntity> = BlockEntityType.Builder.create(
        ::MedicalDrawerBlockEntity, *RegistryHelper.Blocks.MEDICAL_DRAWERS.toTypedArray()
    ).build()
    val BEDSIDE_TABLE_BLOCK_ENTITY: BlockEntityType<BedsideTableBlockEntity> = BlockEntityType.Builder.create(
        ::BedsideTableBlockEntity, *RegistryHelper.Blocks.BEDSIDE_DRAWERS.toTypedArray()
    ).build()
    val KITCHEN_DRAWER_BLOCK_ENTITY: BlockEntityType<KitchenDrawerBlockEntity> = BlockEntityType.Builder.create(
        ::KitchenDrawerBlockEntity, *RegistryHelper.Blocks.KITCHEN_DRAWERS.toTypedArray()
    ).build()
    val KITCHEN_CABINET_BLOCK_ENTITY: BlockEntityType<KitchenCabinetBlockEntity> = BlockEntityType.Builder.create(
        ::KitchenCabinetBlockEntity, *RegistryHelper.Blocks.KITCHEN_CABINETS.toTypedArray()
    ).build()
    val SINGLE_DRAWER_BLOCK_ENTITY: BlockEntityType<SingleDrawerBlockEntity> = BlockEntityType.Builder.create(
        ::SingleDrawerBlockEntity, *RegistryHelper.Blocks.SINGLE_DRAWERS.toTypedArray()
    ).build()

    override fun getRegistry(): Registry<BlockEntityType<*>> = Registries.BLOCK_ENTITY_TYPE
}