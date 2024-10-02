package ru.scuroneko.furniture.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.registry.Registries
import net.minecraft.util.Util
import net.minecraft.util.function.BooleanBiFunction
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.World
import ru.scuroneko.furniture.api.blocks.AbstractDrawerBlock
import ru.scuroneko.furniture.blocks.entity.KitchenDrawerBlockEntity
import ru.scuroneko.furniture.item.BoxItem
import ru.scuroneko.furniture.item.KitchenDrawerCaseItem
import ru.scuroneko.furniture.registry.items.KitchenDrawersComponents
import ru.scuroneko.furniture.registry.items.MediumDrawerBoxes

class KitchenDrawerBlock(case: KitchenDrawerCaseItem, box: BoxItem) : AbstractDrawerBlock(case, box, null, "kitchen_drawer") {
    constructor(settings: Settings) : this(
        KitchenDrawersComponents.BLACK_CHERRY_KITCHEN_DRAWER_CASE,
        MediumDrawerBoxes.CHERRY_MEDIUM_DRAWER_BOX
    )

    private val boxTop = VoxelShapes.combineAndSimplify(
        createCuboidShape(1, 9, 14, 15, 15, 15),
        createCuboidShape(5.0, 11.0, 15.0, 11.0, 13.0, 15.5),
        BooleanBiFunction.OR
    )
    private val boxBottom = VoxelShapes.combineAndSimplify(
        createCuboidShape(1, 2, 14, 15, 8, 15),
        createCuboidShape(5.0, 4.0, 15.0, 11.0, 6.0, 15.5),
        BooleanBiFunction.OR
    )

    init {
        registerBox(boxTop, ::openScreen)
        registerBox(boxBottom, ::openScreen)

        drawerShape = VoxelShapes.combineAndSimplify(
            createCuboidShape(0, 15, 0, 16, 16, 16),
            createCuboidShape(0, 0, 0, 16, 15, 14),
            BooleanBiFunction.OR
        )
        shape = sequenceOf(
            drawerShape, boxTop, boxBottom
        ).reduce { v1, v2 -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR) }
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (!world.isClient) {
            val blockEntity = world.getBlockEntity(pos) as KitchenDrawerBlockEntity
            val boxToOpen = when (box) {
                boxTop -> 0
                boxBottom -> 1
                else -> -1
            }
            blockEntity.setBoxIndex(boxToOpen)
            player.openHandledScreen(blockEntity)
        }
    }

    override fun getDrawerName(): String {
        val top = Util.createTranslationKey("block", Registries.BLOCK.getId((this.case as KitchenDrawerCaseItem).concrete)).split(".")[2]
        return super.getDrawerName()+"_$top"
    }
    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity = KitchenDrawerBlockEntity(pos, state)
    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::KitchenDrawerBlock)
}