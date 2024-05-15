package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.block.*
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.state.property.Properties
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.api.properties.CoffeeTableType
import ru.scuroneko.furniture.api.blocks.AbstractTableBlock
import ru.scuroneko.furniture.api.properties.ModProperties
import ru.scuroneko.furniture.utils.MathUtils


class CoffeeTableBlock(wood: Block) : AbstractTableBlock(wood) {
    private constructor(settings: Settings) : this(Blocks.OAK_PLANKS)

    val shape = sequenceOf(
        createCuboidShape(14.0, 0.0, 14.0, 16.0, 7.0, 16.0),
        createCuboidShape(14.0, 0.0, 0.0, 16.0, 7.0, 2.0),
        createCuboidShape(0.0, 0.0, 0.0, 2.0, 7.0, 2.0),
        createCuboidShape(0.0, 0.0, 14.0, 2.0, 7.0, 16.0),
        createCuboidShape(0.0, 7.0, 0.0, 16.0, 8.0, 16.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    val leftShape = sequenceOf(
        createCuboidShape(0.0, 0.0, 14.0, 2.0, 7.0, 16.0),
        createCuboidShape(0.0, 0.0, 0.0, 2.0, 7.0, 2.0),
        createCuboidShape(0.0, 7.0, 0.0, 16.0, 8.0, 16.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    val centerShape = createCuboidShape(0.0, 7.0, 0.0, 16.0, 8.0, 16.0)
    val rightShape = sequenceOf(
        createCuboidShape(14.0, 0.0, 14.0, 16.0, 7.0, 16.0),
        createCuboidShape(14.0, 0.0, 0.0, 16.0, 7.0, 2.0),
        createCuboidShape(0.0, 7.0, 0.0, 16.0, 8.0, 16.0)
    ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }

    override fun onPlaced(
        world: World,
        pos: BlockPos,
        state: BlockState,
        placer: LivingEntity?,
        itemStack: ItemStack
    ) {
        if (world.isClient) return
        checkSide<CoffeeTableBlock>(world, pos, state)
    }

    override fun onBreak(world: World, pos: BlockPos, state: BlockState, player: PlayerEntity): BlockState {
        return super.onBreak(world, pos, state, player)
    }

    private fun getShape(state: BlockState): VoxelShape {
        val facing = state.get(Properties.HORIZONTAL_FACING)
        val s = when (state.get(ModProperties.COFFEE_TABLE_TYPE)) {
            CoffeeTableType.SINGLE -> shape
            CoffeeTableType.LEFT -> leftShape
            CoffeeTableType.CENTER -> centerShape
            CoffeeTableType.RIGHT -> rightShape
            else -> shape
        }
        return MathUtils.rotateShape(facing, s)
    }

    @Environment(EnvType.CLIENT)
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

    override fun getCodec(): MapCodec<out HorizontalFacingBlock> = createCodec(::CoffeeTableBlock)
}