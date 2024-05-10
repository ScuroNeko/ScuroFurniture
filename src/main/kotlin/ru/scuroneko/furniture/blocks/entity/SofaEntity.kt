package ru.scuroneko.furniture.blocks.entity

import net.minecraft.nbt.NbtCompound
import net.minecraft.world.World
import ru.scuroneko.furniture.ModEntities
import ru.scuroneko.furniture.api.blocks.AbstractSofaEntity

class SofaEntity(world: World) : AbstractSofaEntity<SofaEntity>(world, ModEntities.SOFA_ENTITY) {
    override fun initDataTracker() {}
    override fun readCustomDataFromNbt(nbt: NbtCompound) {}
    override fun writeCustomDataToNbt(nbt: NbtCompound) {}
}