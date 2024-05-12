package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.items.KitchenDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes

class KitchenCabinetBlock(case: CaseItem, box: BoxItem) : AbstractDrawerBlock(case, box) {
    private constructor(settings: Settings) : this(
        KitchenDrawersComponents.BLACK_STRIPPED_CHERRY_LOG_KITCHEN_DRAWER_CASE,
        MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX
    )

    private val boxLeft = VoxelShapes.combineAndSimplify(
        createCuboidShape(1, 1, 14, 8, 15, 15),
        createCuboidShape(6.0, 2.0, 15.0, 7.0, 6.0, 15.5),
        BooleanBiFunction.OR
    )
    private val boxRight = VoxelShapes.combineAndSimplify(
        createCuboidShape(8, 1, 14, 15, 15, 15),
        createCuboidShape(9.0, 2.0, 15.0, 10.0, 6.0, 15.5),
        BooleanBiFunction.OR
    )

    init {
        registerBox(boxLeft, ::openScreen)
        registerBox(boxRight, ::openScreen)

        drawerShape = createCuboidShape(0, 0, 0, 16, 16, 14)
        shape = sequenceOf(
            drawerShape, boxLeft, boxRight
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (world.isClient) return
        val blockEntity = world.getBlockEntity(pos) as ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
        val boxToOpen = when (box) {
            boxLeft -> 0
            boxRight -> 1
            else -> -1
        }
        blockEntity.setBoxIndex(boxToOpen)
        player.openHandledScreen(blockEntity)
    }

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? = null
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::KitchenCabinetBlock)
}