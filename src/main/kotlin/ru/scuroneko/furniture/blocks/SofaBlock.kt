package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.*
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.api.properties.SofaType
import ru.scuroneko.furniture.api.blocks.AbstractSofaBlock
import ru.scuroneko.furniture.api.properties.ModProperties
import ru.scuroneko.furniture.blocks.entity.SofaEntity
import ru.scuroneko.furniture.registry.ModEntities
import ru.scuroneko.furniture.utils.MathUtils

class SofaBlock(base: Block, leg: Block, wool: Block) : AbstractSofaBlock<SofaEntity>(base, leg, wool) {
    private constructor(settings: Settings) : this(Blocks.OAK_PLANKS, Blocks.STRIPPED_OAK_LOG, Blocks.WHITE_WOOL)

    private val shape: VoxelShape = VoxelShapes.combineAndSimplify(
        sequenceOf(
            createCuboidShape(13, 0, 12, 15, 2, 14),
            createCuboidShape(13, 0, 1, 15, 2, 3),
            createCuboidShape(1, 0, 1, 3, 2, 3),
            createCuboidShape(1, 0, 12, 3, 2, 14)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }, sequenceOf(
            createCuboidShape(0, 4, 2, 2, 11, 16),
            createCuboidShape(0, 2, 0, 16, 4, 16),
            createCuboidShape(14, 4, 2, 16, 11, 16),
            createCuboidShape(0, 4, 0, 16, 16, 2),
            VoxelShapes.combineAndSimplify(
                createCuboidShape(2, 4, 2, 14, 6, 15),
                createCuboidShape(2, 6, 2, 14, 14, 4),
                BooleanBiFunction.OR
            )
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        BooleanBiFunction.OR
    )
    private val leftShape = VoxelShapes.combineAndSimplify(
        sequenceOf(
            createCuboidShape(1, 0, 1, 3, 2, 3),
            createCuboidShape(1, 0, 12, 3, 2, 14)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }, sequenceOf(
            createCuboidShape(0, 4, 2, 2, 11, 16),
            createCuboidShape(0, 2, 0, 16, 4, 16),
            createCuboidShape(0, 4, 0, 16, 16, 2),
            VoxelShapes.combineAndSimplify(
                createCuboidShape(2, 4, 2, 16, 6, 15),
                createCuboidShape(2, 6, 2, 16, 14, 4),
                BooleanBiFunction.OR
            )
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        BooleanBiFunction.OR
    )
    private val centerShape = VoxelShapes.combineAndSimplify(
        VoxelShapes.combineAndSimplify(
            createCuboidShape(7, 0, 12, 9, 2, 14),
            createCuboidShape(7, 0, 1, 9, 2, 3),
            BooleanBiFunction.OR
        ), sequenceOf(
            createCuboidShape(0, 2, 0, 16, 4, 16),
            createCuboidShape(0, 4, 0, 16, 16, 2),
            VoxelShapes.combineAndSimplify(
                createCuboidShape(0, 4, 2, 16, 6, 15),
                createCuboidShape(0, 6, 2, 16, 14, 4),
                BooleanBiFunction.OR
            )
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        BooleanBiFunction.OR
    )
    private val rightShape = VoxelShapes.combineAndSimplify(
        sequenceOf(
            createCuboidShape(13, 0, 12, 15, 2, 14),
            createCuboidShape(13, 0, 1, 15, 2, 3)
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }, sequenceOf(
            createCuboidShape(0, 2, 0, 16, 4, 16),
            createCuboidShape(14, 4, 2, 16, 11, 16),
            createCuboidShape(0, 4, 0, 16, 16, 2),
            VoxelShapes.combineAndSimplify(
                createCuboidShape(0, 4, 2, 14, 6, 15),
                createCuboidShape(0, 6, 2, 14, 14, 4),
                BooleanBiFunction.OR
            )
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) },
        BooleanBiFunction.OR
    )

    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH).with(ModProperties.SOFA_TYPE, SofaType.SINGLE)
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        if (!world.isClient) {
            val entity = ModEntities.SOFA_ENTITY.create(world)!!
            entity.setPosition(pos.toCenterPos())
            world.spawnEntity(entity)
            if (entity.hasPassengers()) return ActionResult.FAIL
            player.startRiding(entity)
        }
        return super.onUse(state, world, pos, player, hand, hit)
    }

    fun getShape(state: BlockState): VoxelShape {
        val part = when (state.get(ModProperties.SOFA_TYPE)) {
            SofaType.SINGLE -> shape
            SofaType.LEFT -> leftShape
            SofaType.CENTER -> centerShape
            SofaType.RIGHT -> rightShape
            else -> shape
        }
        return MathUtils.rotateShape(state.get(HORIZONTAL_FACING), part)
    }

    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape = getShape(state)

    override fun getCollisionShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext
    ): VoxelShape = getShape(state)

    override fun getRenderType(state: BlockState?): BlockRenderType = BlockRenderType.MODEL
    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::SofaBlock)
}