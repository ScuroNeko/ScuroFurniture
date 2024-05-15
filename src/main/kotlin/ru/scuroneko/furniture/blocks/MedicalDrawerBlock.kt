package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.ModBlocks
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.entity.MedicalDrawerBlockEntity
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.items.MedicalDrawersComponents

class MedicalDrawerBlock(case: CaseItem, box: BoxItem) : AbstractDrawerBlock(case, box) {
    private constructor(settings: Settings) : this(
        MedicalDrawersComponents.OAK_MEDICAL_DRAWER_CASE,
        MedicalDrawersComponents.OAK_MEDICAL_BOX
    )

    private val boxTopLeft = VoxelShapes.combineAndSimplify(
        createCuboidShape(3.0, 11.0, 9.0, 5.0, 13.0, 9.5),
        createCuboidShape(1.0, 9.0, 8.0, 7.0, 15.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxTopRight = VoxelShapes.combineAndSimplify(
        createCuboidShape(11.0, 11.0, 9.0, 13.0, 13.0, 9.5),
        createCuboidShape(9.0, 9.0, 8.0, 15.0, 15.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxBottomLeft = VoxelShapes.combineAndSimplify(
        createCuboidShape(3.0, 3.0, 9.0, 5.0, 5.0, 9.5),
        createCuboidShape(1.0, 1.0, 8.0, 7.0, 7.0, 9.0),
        BooleanBiFunction.OR
    )
    private val boxBottomRight = VoxelShapes.combineAndSimplify(
        createCuboidShape(11.0, 3.0, 9.0, 13.0, 5.0, 9.5),
        createCuboidShape(9.0, 1.0, 8.0, 15.0, 7.0, 9.0),
        BooleanBiFunction.OR
    )


    init {
        defaultState = defaultState.with(HORIZONTAL_FACING, Direction.NORTH)
        registerBox(boxTopLeft, ::openScreen)
        registerBox(boxTopRight, ::openScreen)
        registerBox(boxBottomLeft, ::openScreen)
        registerBox(boxBottomRight, ::openScreen)

        drawerShape = createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0)
        shape = sequenceOf(
            drawerShape, boxTopLeft, boxTopRight, boxBottomLeft, boxBottomRight
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (world.isClient) return
        val optional = world.getBlockEntity(pos, ModBlockEntities.MEDICAL_DRAWER_BLOCK_ENTITY)
        if (!optional.isPresent) return
        val blockEntity = optional.get()
        val boxToOpen = when (box) {
            boxTopLeft -> 0
            boxTopRight -> 1
            boxBottomLeft -> 2
            boxBottomRight -> 3
            else -> -1
        }

        blockEntity.setBoxIndex(boxToOpen)
        player.openHandledScreen(blockEntity)
    }

    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity =
        MedicalDrawerBlockEntity(pos, state)

    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::MedicalDrawerBlock)
}