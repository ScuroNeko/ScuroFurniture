package ru.scuroneko.furniture.blocks.entity

import net.minecraft.entity.data.DataTracker
import net.minecraft.nbt.NbtCompound
import net.minecraft.world.World
import ru.scuroneko.furniture.api.blocks.AbstractSofaEntity
import ru.scuroneko.furniture.registry.ModEntities

class SofaEntity(world: World) : AbstractSofaEntity<SofaEntity>(world, ModEntities.SOFA_ENTITY) {
    override fun initDataTracker(builder: DataTracker.Builder) {}
    override fun readCustomDataFromNbt(nbt: NbtCompound) {}
    override fun writeCustomDataToNbt(nbt: NbtCompound) {}
}