package ru.scuroneko.furniture.blocks.entity

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.network.PacketByteBuf
import net.minecraft.screen.ScreenHandler
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.Constants
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.blocks.MedicalDrawerBlock
import ru.scuroneko.furniture.gui.MedicalDrawerScreenHandler
import ru.scuroneko.furniture.registry.ModBlockEntities
import ru.scuroneko.furniture.utils.DrawerUtils

class MedicalDrawerBlockEntity(pos: BlockPos, state: BlockState) : BlockEntity(ModBlockEntities.MEDICAL_DRAWER_BLOCK_ENTITY, pos, state), ExtendedScreenHandlerFactory, IInventory {
    private var boxIndex = 0
    private val inventory = DefaultedList.ofSize(4 * 9, ItemStack.EMPTY)

    fun setBoxIndex(index: Int) {
        this.boxIndex = index
    }

    override fun readNbt(nbt: NbtCompound) {
        super.readNbt(nbt)
        Inventories.readNbt(nbt, inventory)
    }

    override fun writeNbt(nbt: NbtCompound) {
        super.writeNbt(nbt)
        Inventories.writeNbt(nbt, inventory)
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return MedicalDrawerScreenHandler(syncId, playerInventory, this, this.boxIndex)
    }

    override fun getDisplayName(): Text = Text.translatable(Constants.Translatable.MEDICAL_DRAWER)
    override fun writeScreenOpeningData(player: ServerPlayerEntity, buf: PacketByteBuf) {
        val mat = DrawerUtils.blockToMaterial((world!!.getBlockState(pos).block as MedicalDrawerBlock).case.material)
        buf.writeString(mat)
    }

    override fun getItems(): DefaultedList<ItemStack> = this.inventory
}