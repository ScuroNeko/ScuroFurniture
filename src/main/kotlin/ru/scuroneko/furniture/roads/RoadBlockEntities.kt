package ru.scuroneko.furniture.roads

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.roads.blocks.entity.RoadWorkerStationBlockEntity


object RoadBlockEntities {
    lateinit var ROAD_WORKER_STATION_BLOCK_ENTITY: BlockEntityType<RoadWorkerStationBlockEntity>

    fun register() {
        ROAD_WORKER_STATION_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            Identifier(ScuroFurniture.ROADS_MOD_ID, "road_worker_station_be"),
            BlockEntityType.Builder.create(::RoadWorkerStationBlockEntity, RoadBlocks.ROAD_WORKER_STATION).build()
        )
    }
}