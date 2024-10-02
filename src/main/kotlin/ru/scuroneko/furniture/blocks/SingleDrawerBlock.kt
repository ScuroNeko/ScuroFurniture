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
import ru.scuroneko.furniture.api.blocks.AbstractStackableDrawerBlock
import ru.scuroneko.furniture.item.CaseItem
import ru.scuroneko.furniture.item.DoorItem
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.registry.items.BigDrawersDoors
import ru.scuroneko.furniture.registry.items.SingleDrawerComponents

class SingleDrawerBlock(case: CaseItem, door: DoorItem): AbstractStackableDrawerBlock(case, null, door, "single_drawer") {
    private constructor(settings: Settings) : this(
        SingleDrawerComponents.OAK_SINGLE_DRAWER_CASE,
        BigDrawersDoors.OAK_BIG_DRAWER_DOOR
    )

    private val boxShape = VoxelShapes.combine(
        VoxelShapes.cuboid(0.0625, 0.0625, 0.875, 0.9375, 0.9375, 0.9375),
        VoxelShapes.cuboid(0.8125, 0.375, 0.9375, 0.875, 0.625, 0.96875),
        BooleanBiFunction.OR
    )

    init {
        registerBox(boxShape, ::openScreen)
        drawerShape = VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 1.0, 0.875)
        this.shape = VoxelShapes.combine(boxShape, drawerShape, BooleanBiFunction.OR)
    }

    private fun openScreen(box: VoxelShape, player: PlayerEntity, state: BlockState, world: World, pos: BlockPos) {
        if (world.isClient) return
        val optional = world.getBlockEntity(pos, ModBlockEntities.MEDICAL_DRAWER_BLOCK_ENTITY)
        if (!optional.isPresent) return
        val blockEntity = optional.get()
        player.openHandledScreen(blockEntity)
    }

    override fun getCodec(): MapCodec<out BlockWithEntity> = createCodec(::SingleDrawerBlock)
    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? = null
}