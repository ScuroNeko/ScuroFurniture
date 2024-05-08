package ru.scuroneko.furniture.gui

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.CraftingResultInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.screen.slot.Slot
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import ru.scuroneko.furniture.ModScreenHandlers
import ru.scuroneko.furniture.blocks.entity.CarpenterTableBlockEntity
import ru.scuroneko.furniture.recipe.ShapelessCarpenterTableRecipe

class CarpenterTableScreenHandler(syncId: Int, playerInventory: PlayerInventory, private val inventory: Inventory, private val context: ScreenHandlerContext, private val pos: BlockPos) : ScreenHandler(ModScreenHandlers.CARPENTER_TABLE_SCREEN_HANDLER, syncId) {
    constructor(syncId: Int, playerInventory: PlayerInventory) : this(syncId, playerInventory, SimpleInventory(4*3), ScreenHandlerContext.EMPTY, BlockPos.ORIGIN)

    private val result = CraftingResultInventory()
    private val player = playerInventory.player

    init {
        checkSize(inventory, 4*3)
        inventory.onOpen(playerInventory.player)
        if(inventory is CarpenterTableBlockEntity)
            this.inventory.addChangeHandler(this::onContentChanged)

        var slotIndex = 0
        for (line in 0 until 3)
            for (m in 0 until 4)
                this.addSlot(Slot(inventory, slotIndex++, 12 + m * 18, 17+(line*18)))

        this.addSlot(Slot(this.result, slotIndex, 124, 35))

        for (row in 0 until 3)
            for(line in 0 until 9)
                this.addSlot(Slot(playerInventory, line + row * 9 + 9, 8 + line * 18, 84 + row * 18))

        for (m in 0 until 9)
            this.addSlot(Slot(playerInventory, m, 8 + m * 18, 142))
    }

    private fun updateResult(world: World) {
        if(world.isClient) return
        val serverPlayerEntity = player as ServerPlayerEntity
        var itemStack = ItemStack.EMPTY
        val inv = SimpleInventory(this.inventory.size())
        for (i in 0 until this.inventory.size())
            inv.setStack(i, this.inventory.getStack(i))

        val optional = world.server!!.recipeManager.getFirstMatch(ShapelessCarpenterTableRecipe.Type.INSTANCE, inv, world)
//        println(optional.isPresent)
        if (optional.isPresent) {
            val recipeEntry = optional.get()
            val craftingRecipe = recipeEntry.value()
//            println(craftingRecipe.getResult(null))
            itemStack = craftingRecipe.getResult(world.registryManager)
        }

//        println(itemStack)

        this.result.setStack(0, itemStack)
        this.setPreviousTrackedSlot(0, itemStack)
        serverPlayerEntity.networkHandler.sendPacket(
            ScreenHandlerSlotUpdateS2CPacket(this.syncId, this.nextRevision(), 12, itemStack)
        )
    }

    override fun onContentChanged(inventory: Inventory) {
        this.context.run { world, _ -> updateResult(world) }
    }

    override fun onClosed(player: PlayerEntity?) {
        super.onClosed(player)
        this.context.run { _, _ -> this.dropInventory(player, this.result) }
    }

    override fun quickMove(player: PlayerEntity, invSlot: Int): ItemStack {
        var newStack = ItemStack.EMPTY
        val slot = slots[invSlot]
        if (slot.hasStack()) {
            val originalStack = slot.stack
            newStack = originalStack.copy()
            if (invSlot < inventory.size()) {
                if (!this.insertItem(originalStack, inventory.size(), slots.size, true))
                    return ItemStack.EMPTY
            } else if (!this.insertItem(originalStack, 0, inventory.size()/4, false))
                return ItemStack.EMPTY

            if (originalStack.isEmpty) slot.stack = ItemStack.EMPTY
            else slot.markDirty()
        }

        return newStack
    }

    override fun canUse(player: PlayerEntity): Boolean = this.inventory.canPlayerUse(player)
    override fun canInsertIntoSlot(stack: ItemStack, slot: Slot): Boolean = slot.inventory != this.result && super.canInsertIntoSlot(stack, slot)
}