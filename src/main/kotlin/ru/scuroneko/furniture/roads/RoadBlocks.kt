package ru.scuroneko.furniture.roads

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import ru.scuroneko.furniture.ScuroFurniture
import ru.scuroneko.furniture.roads.blocks.*

object RoadBlocks {
    val AsphaltFull = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolid = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidLeft = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidRight = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidLeftTurn = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidRightTurn = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidDouble = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidDashedRight = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullSolidDashedLeft = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullDashed = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullDashedDouble = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullCrosswalk = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullArrowStraight = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullArrowSideways = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullArrowLeft = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val AsphaltFullArrowRight = AsphaltFullBlock(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))

    val asphaltFullBlocks = sortedMapOf(compareBy<String> { it.length }.thenBy { it },
        "asphalt_full" to AsphaltFull,
        "asphalt_full_solid" to AsphaltFullSolid,
        "asphalt_full_solid_left" to AsphaltFullSolidLeft,
        "asphalt_full_solid_right" to AsphaltFullSolidRight,
        "asphalt_full_solid_left_turn" to AsphaltFullSolidLeftTurn,
        "asphalt_full_solid_right_turn" to AsphaltFullSolidRightTurn,
        "asphalt_full_solid_double" to AsphaltFullSolidDouble,
        "asphalt_full_solid_dashed_right" to AsphaltFullSolidDashedRight,
        "asphalt_full_solid_dashed_left" to AsphaltFullSolidDashedLeft,
        "asphalt_full_dashed" to AsphaltFullDashed,
        "asphalt_full_dashed_double" to AsphaltFullDashedDouble,
        "asphalt_full_crosswalk" to AsphaltFullCrosswalk,
        "asphalt_full_arrow_straight" to AsphaltFullArrowStraight,
        "asphalt_full_arrow_sideways" to AsphaltFullArrowSideways,
        "asphalt_full_arrow_left" to AsphaltFullArrowLeft,
        "asphalt_full_arrow_right" to AsphaltFullArrowRight,
    )

    val Asphalt78 = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78Solid = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidLeft = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidRight = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidLeftTurn = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidRightTurn = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidDouble = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidDashedRight = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78SolidDashedLeft = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78Dashed = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78DashedDouble = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78Crosswalk = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78ArrowStraight = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78ArrowSideways = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78ArrowLeft = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val Asphalt78ArrowRight = Asphalt78Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))

    val asphalt78Blocks = sortedMapOf(compareBy<String> { it.length }.thenBy { it },
        "asphalt_78" to Asphalt78,
        "asphalt_78_solid" to Asphalt78Solid,
        "asphalt_78_solid_left" to Asphalt78SolidLeft,
        "asphalt_78_solid_right" to Asphalt78SolidRight,
        "asphalt_78_solid_left_turn" to Asphalt78SolidLeftTurn,
        "asphalt_78_solid_right_turn" to Asphalt78SolidRightTurn,
        "asphalt_78_solid_double" to Asphalt78SolidDouble,
        "asphalt_78_solid_dashed_right" to Asphalt78SolidDashedRight,
        "asphalt_78_solid_dashed_left" to Asphalt78SolidDashedLeft,
        "asphalt_78_dashed" to Asphalt78Dashed,
        "asphalt_78_dashed_double" to Asphalt78DashedDouble,
        "asphalt_78_crosswalk" to Asphalt78Crosswalk,
        "asphalt_78_arrow_straight" to Asphalt78ArrowStraight,
        "asphalt_78_arrow_sideways" to Asphalt78ArrowSideways,
        "asphalt_78_arrow_left" to Asphalt78ArrowLeft,
        "asphalt_78_arrow_right" to Asphalt78ArrowRight,
    )

    val ASPHALT_68 = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLID = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDLEFT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDRIGHT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDLEFTTURN = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDRIGHTTURN = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDDOUBLE = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDDASHEDRIGHT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_SOLIDDASHEDLEFT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_DASHED = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_DASHEDDOUBLE = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_CROSSWALK = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_ARROWSTRAIGHT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_ARROWSIDEWAYS = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_ARROWLEFT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))
    val ASPHALT_68_ARROWRIGHT = Asphalt68Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE))

    val asphalt68Blocks = sortedMapOf(compareBy<String> { it.length }.thenBy { it },
        "asphalt_68" to ASPHALT_68,
        "asphalt_68_solid" to ASPHALT_68_SOLID,
        "asphalt_68_solid_left" to ASPHALT_68_SOLIDLEFT,
        "asphalt_68_solid_right" to ASPHALT_68_SOLIDRIGHT,
        "asphalt_68_solid_left_turn" to ASPHALT_68_SOLIDLEFTTURN,
        "asphalt_68_solid_right_turn" to ASPHALT_68_SOLIDRIGHTTURN,
        "asphalt_68_solid_double" to ASPHALT_68_SOLIDDOUBLE,
        "asphalt_68_solid_dashed_right" to ASPHALT_68_SOLIDDASHEDRIGHT,
        "asphalt_68_solid_dashed_left" to ASPHALT_68_SOLIDDASHEDLEFT,
        "asphalt_68_dashed" to ASPHALT_68_DASHED,
        "asphalt_68_dashed_double" to ASPHALT_68_DASHEDDOUBLE,
        "asphalt_68_crosswalk" to ASPHALT_68_CROSSWALK,
        "asphalt_68_arrow_straight" to ASPHALT_68_ARROWSTRAIGHT,
        "asphalt_68_arrow_sideways" to ASPHALT_68_ARROWSIDEWAYS,
        "asphalt_68_arrow_left" to ASPHALT_68_ARROWLEFT,
        "asphalt_68_arrow_right" to ASPHALT_68_ARROWRIGHT,
    )

    val ROAD_SIGN_ROUND = RoadSignRoundBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK))

    val roadSigns = sortedMapOf(compareBy<String> { it.length }.thenBy { it },
        "road_sign_round" to ROAD_SIGN_ROUND,
    )

    val STREET_LAMP_SINGLE = StreetLampSingle(FabricBlockSettings.create().sounds(BlockSoundGroup.GLASS).luminance(15))
    val STREET_LAMP_DOUBLE = StreetLampDouble(FabricBlockSettings.create().sounds(BlockSoundGroup.GLASS).luminance(15))
    val STREET_LAMP_POLE = StreetLampPole(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL))
    val STREET_LAMP_BOTTOM = StreetLampBottom(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL))

    val ROAD_RAIL_STRAIGHT = RoadRailBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL))
    val ROAD_WORKER_STATION = RoadWorkerStationBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL))

    fun register() {
        asphaltFullBlocks.forEach { registerBlock(it.key, it.value) }
        asphalt78Blocks.forEach { registerBlock(it.key, it.value) }
        asphalt68Blocks.forEach { registerBlock(it.key, it.value) }

        roadSigns.forEach { registerBlock(it.key, it.value) }

        registerBlock("street_lamp_single", STREET_LAMP_SINGLE)
        registerBlock("street_lamp_double", STREET_LAMP_DOUBLE)
        registerBlock("street_lamp_pole", STREET_LAMP_POLE)
        registerBlock("street_lamp_bottom", STREET_LAMP_BOTTOM)

        registerBlock("road_rail_straight", ROAD_RAIL_STRAIGHT)
        registerBlock("road_worker_station", ROAD_WORKER_STATION)
    }

    private fun registerBlock(path: String, block: Block) {
        Registry.register(Registries.BLOCK, Identifier(ScuroFurniture.ROADS_MOD_ID, path), block)
        Registry.register(Registries.ITEM, Identifier(ScuroFurniture.ROADS_MOD_ID, path), BlockItem(block, FabricItemSettings()))
    }
}