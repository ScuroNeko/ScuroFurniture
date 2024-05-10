package ru.scuroneko.furniture.api.blocks

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.HorizontalFacingBlock
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.state.property.EnumProperty
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.api.SofaType

abstract class AbstractSofaBlock<T: Entity>(settings: Settings) : HorizontalFacingBlock(settings) {
    companion object {
        val TYPE_PROPERTY: EnumProperty<SofaType> = EnumProperty.of("type", SofaType::class.java)
    }

    var baseMaterial: Block = Blocks.OAK_PLANKS
    var legMaterial: Block = Blocks.STRIPPED_OAK_LOG
    var wool: Block = Blocks.WHITE_WOOL

    constructor(base: Block, leg: Block, wool: Block): this(FabricBlockSettings.copy(base)) {
        this.baseMaterial = base
        this.legMaterial = leg
        this.wool = wool
    }

    override fun onPlaced(world: World, pos: BlockPos, state: BlockState, placer: LivingEntity?, itemStack: ItemStack) {
        if(world.isClient) return
        val (leftPos, rightPos) = getSideBlocks(state, pos)
        val (nextLeftPos, nextRightPos) = getNextSideBlocks(state, pos)

        val leftState = world.getBlockState(leftPos)
        val rightState = world.getBlockState(rightPos)

        if (leftState.block is AbstractSofaBlock<*>) {
            val next = world.getBlockState(nextLeftPos)
            var property = SofaType.RIGHT
            if(next.block is AbstractSofaBlock<*>) {
                world.setBlockState(leftPos, leftState.with(TYPE_PROPERTY, SofaType.CENTER))
                if(rightState.block is AbstractSofaBlock<*>)
                    property = SofaType.CENTER
            } else {
                world.setBlockState(leftPos, leftState.with(TYPE_PROPERTY, SofaType.LEFT))
                if(rightState.block is AbstractSofaBlock<*>)
                    property = SofaType.CENTER
            }
            world.setBlockState(pos, state.with(TYPE_PROPERTY, property))
        }

        if (rightState.block is AbstractSofaBlock<*>) {
            val next = world.getBlockState(nextRightPos)
            var property = SofaType.LEFT
            if(next.block is AbstractSofaBlock<*>) {
                world.setBlockState(rightPos, leftState.with(TYPE_PROPERTY, SofaType.CENTER))
                if(rightState.block is AbstractSofaBlock<*>)
                    property = SofaType.CENTER
            } else {
                world.setBlockState(rightPos, leftState.with(TYPE_PROPERTY, SofaType.RIGHT))
                if(rightState.block is AbstractSofaBlock<*>)
                    property = SofaType.CENTER
            }
            world.setBlockState(pos, state.with(TYPE_PROPERTY, property))
        }
        super.onPlaced(world, pos, state, placer, itemStack)
    }

    override fun onBreak(world: World, pos: BlockPos, state: BlockState, player: PlayerEntity): BlockState {
        if(world.isClient) return super.onBreak(world, pos, state, player)
        val (leftPos, rightPos) = getSideBlocks(state, pos)
        val (nextLeftPos, nextRightPos) = getNextSideBlocks(state, pos)

        if(world.getBlockState(leftPos).block is AbstractSofaBlock<*>) {
            if(world.getBlockState(nextLeftPos).isAir)
                world.setBlockState(leftPos, world.getBlockState(leftPos).with(TYPE_PROPERTY, SofaType.SINGLE))
            else if(world.getBlockState(nextLeftPos).block is AbstractSofaBlock<*>)
                world.setBlockState(leftPos, world.getBlockState(leftPos).with(TYPE_PROPERTY, SofaType.RIGHT))
        }
        if(world.getBlockState(rightPos).block is AbstractSofaBlock<*>) {
            if(world.getBlockState(nextRightPos).isAir)
                world.setBlockState(rightPos, world.getBlockState(rightPos).with(TYPE_PROPERTY, SofaType.SINGLE))
            else if(world.getBlockState(nextRightPos).block is AbstractSofaBlock<*>)
                world.setBlockState(rightPos, world.getBlockState(rightPos).with(TYPE_PROPERTY, SofaType.LEFT))
        }
        return super.onBreak(world, pos, state, player)
    }

    fun add(pos: BlockPos, state: BlockState, i: Int): BlockPos {
        return when(state.get(HORIZONTAL_FACING)) {
            Direction.NORTH -> pos.add(i, 0, 0)
            Direction.WEST -> pos.add(0, 0, i)
            Direction.SOUTH -> pos.add(-i, 0, 0)
            Direction.EAST -> pos.add(0, 0, -i)
            else -> pos
        }
    }

    fun getSideBlocks(state: BlockState, pos: BlockPos): Pair<BlockPos, BlockPos> {
        return when(state.get(HORIZONTAL_FACING)) {
            Direction.NORTH -> Pair(pos.add(-1, 0, 0), pos.add(1, 0, 0))
            Direction.WEST -> Pair(pos.add(0, 0, 1), pos.add(0, 0, -1))
            Direction.SOUTH -> Pair(pos.add(1, 0, 0), pos.add(-1, 0, 0))
            Direction.EAST -> Pair(pos.add(0, 0, -1), pos.add(0, 0, 1))
            else -> Pair(pos, pos)
        }
    }
    fun getNextSideBlocks(state: BlockState, pos: BlockPos): Pair<BlockPos, BlockPos> {
        val (left, right) = getSideBlocks(state, pos)
        return Pair(
            getSideBlocks(state, left).first,
            getSideBlocks(state, right).second
        )
    }

    fun createCuboidShape(
        minX: Int,
        minY: Int,
        minZ: Int,
        maxX: Int,
        maxY: Int,
        maxZ: Int
    ): VoxelShape {
        return VoxelShapes.cuboid(minX / 16.0, minY / 16.0, minZ / 16.0, maxX / 16.0, maxY / 16.0, maxZ / 16.0)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? = super.getPlacementState(ctx)?.with(
        HORIZONTAL_FACING, ctx.horizontalPlayerFacing
    )?.with(
        TYPE_PROPERTY, SofaType.SINGLE
    )
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_FACING)
        builder.add(TYPE_PROPERTY)
    }
}