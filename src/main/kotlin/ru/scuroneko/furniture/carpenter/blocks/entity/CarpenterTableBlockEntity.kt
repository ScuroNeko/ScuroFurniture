package ru.scuroneko.furniture.carpenter.blocks.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.text.Text
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos
import ru.scuroneko.furniture.api.IInventory
import ru.scuroneko.furniture.carpenter.CarpenterBlocks
import ru.scuroneko.furniture.carpenter.gui.CarpenterTableScreenHandler

class CarpenterTableBlockEntity(pos: BlockPos, state: BlockState) : BlockEntity(CarpenterBlocks.CARPENTER_TABLE_BLOCK_ENTITY, pos, state),
    NamedScreenHandlerFactory, IInventory {
    private val inventory = DefaultedList.ofSize(4*3, ItemStack.EMPTY)
    private val onChange = ArrayList<(Inventory) -> Unit>()

    fun addChangeHandler(handler: (Inventory) -> Unit) {
        this.onChange.add(handler)
    }

    override fun readNbt(nbt: NbtCompound) {
        super.readNbt(nbt)
        Inventories.readNbt(nbt, inventory)
    }

    override fun writeNbt(nbt: NbtCompound) {
        super.writeNbt(nbt)
        Inventories.writeNbt(nbt, inventory)
    }

    override fun markDirty() {
        super.markDirty()
        this.onChange.forEach { it(this) }
    }

    override fun createMenu(syncId: Int, playerInventory: PlayerInventory, player: PlayerEntity): ScreenHandler {
        return CarpenterTableScreenHandler(syncId, playerInventory, this, ScreenHandlerContext.create(world, pos), pos)
    }
    override fun getDisplayName(): Text = Text.literal("Carpenter table")
    override fun getItems(): DefaultedList<ItemStack> = this.inventory
}