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
import ru.scuroneko.furniture.ModItems
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.entity.BedsideTableBlockEntity
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem

class BedsideTableBlock(case: CaseItem, box: BoxItem) : AbstractDrawerBlock(case, box) {
    private constructor(settings: Settings) : this(ModItems.OAK_MEDICAL_DRAWER_CASE, ModItems.OAK_MEDICAL_BOX)

    private val boxTop = VoxelShapes.combineAndSimplify(
        createCuboidShape(1.0, 9.0, 14.0, 15.0, 15.0, 15.0),
        createCuboidShape(7.0, 11.0, 15.0, 9.0, 13.0, 15.5),
        BooleanBiFunction.OR
    )
    private val boxBottom = VoxelShapes.combineAndSimplify(
        createCuboidShape(7.0, 4.0, 15.0, 9.0, 6.0, 15.5),
        createCuboidShape(1.0, 2.0, 14.0, 15.0, 8.0, 15.0),
        BooleanBiFunction.OR
    )

    init {
        registerBox(boxTop, ::openScreen)
        registerBox(boxBottom, ::openScreen)

        drawerShape = createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 14.0)
        shape = sequenceOf(
            drawerShape, boxTop, boxBottom
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    }

    fun openScreen(
        box: VoxelShape,
        player: PlayerEntity,
        blockState: BlockState,
        world: World,
        pos: BlockPos
    ) {
        if (world.isClient) return
        val blockEntity = world.getBlockEntity(pos) as BedsideTableBlockEntity
        val boxToOpen = when (box) {
            boxTop -> 0
            boxBottom -> 1
            else -> -1
        }
        blockEntity.setBoxIndex(boxToOpen)
        player.openHandledScreen(blockEntity)
    }

    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::BedsideTableBlock)
    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity = BedsideTableBlockEntity(pos, state)
}