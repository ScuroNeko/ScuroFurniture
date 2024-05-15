package ru.scuroneko.furniture.registry

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import ru.scuroneko.furniture.ModBlocks.CARPENTER_TABLE
import ru.scuroneko.furniture.api.registry.IRegistryContainer
import ru.scuroneko.furniture.blocks.entity.BedsideTableBlockEntity
import ru.scuroneko.furniture.blocks.entity.CarpenterTableBlockEntity
import ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.registry.blocks.BedsideDrawers.CHERRY_BEDSIDE_DRAWER
import ru.scuroneko.furniture.registry.blocks.MedicalDrawers.OAK_MEDICAL_DRAWER

object ModBlockEntities: IRegistryContainer<BlockEntityType<*>> {
    val CARPENTER_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::CarpenterTableBlockEntity, CARPENTER_TABLE
    ).build(null)

    val MEDICAL_DRAWER_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::MedicalDrawerBlockEntity, OAK_MEDICAL_DRAWER
    ).build(null)
    val BEDSIDE_TABLE_BLOCK_ENTITY = BlockEntityType.Builder.create(
        ::BedsideTableBlockEntity, CHERRY_BEDSIDE_DRAWER
    ).build(null)

    override fun getRegistry(): Registry<BlockEntityType<*>> = Registries.BLOCK_ENTITY_TYPE
}