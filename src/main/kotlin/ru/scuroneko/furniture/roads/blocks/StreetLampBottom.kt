package ru.scuroneko.furniture.roads.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World
import ru.scuroneko.furniture.roads.RoadBlocks

class StreetLampBottom(settings: Settings) : Block(settings) {
    val SHAPE = VoxelShapes.combineAndSimplify(
        createCuboidShape(6.0, 0.0, 6.0, 10.0, 4.0, 10.0),
        createCuboidShape(7.0, .0, 7.0, 9.0, 16.0, 9.0), BooleanBiFunction.OR)

    override fun onUse(state: BlockState, world: World, pos: BlockPos, player: PlayerEntity, hand: Hand, hit: BlockHitResult): ActionResult {
        if(player.getStackInHand(hand).item == RoadBlocks.STREET_LAMP_POLE.asItem()) {
            var i = 1
            println(world.getBlockState(pos.add(0, i, 0)).isAir)
            while (!world.getBlockState(pos.add(0, i, 0)).isAir) {
                println(world.getBlockState(pos.add(0, i-1, 0)).block)
                if(i >= 10) return ActionResult.FAIL
                if(world.getBlockState(pos.add(0, i, 0)).isAir) break
                i++
            }
            if(!player.isCreative) player.getStackInHand(hand).count -= 1
            world.setBlockState(pos.add(0, i, 0), RoadBlocks.STREET_LAMP_POLE.defaultState, 3)
            world.playSound(player, pos, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, 1f, world.getRandom().nextFloat() * 0.1f + 0.9f)
            return ActionResult.CONSUME
        }

        return ActionResult.PASS
    }

    override fun getOutlineShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = SHAPE
    override fun getCollisionShape(state: BlockState, world: BlockView, pos: BlockPos, context: ShapeContext): VoxelShape = SHAPE
}