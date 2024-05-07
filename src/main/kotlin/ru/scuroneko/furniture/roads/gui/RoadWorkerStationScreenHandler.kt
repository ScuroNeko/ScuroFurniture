package ru.scuroneko.furniture.roads.gui

import com.google.common.collect.Lists
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.CraftingResultInventory
import net.minecraft.inventory.Inventory
import net.minecraft.inventory.SimpleInventory
import net.minecraft.item.ItemStack
import net.minecraft.recipe.RecipeEntry
import net.minecraft.screen.Property
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.screen.slot.Slot
import net.minecraft.world.World
import ru.scuroneko.furniture.ModScreenHandlers
import ru.scuroneko.furniture.roads.recipe.RoadWorkerStationRecipe

class RoadWorkerStationScreenHandler : ScreenHandler {
    private var availableRecipes: List<RecipeEntry<RoadWorkerStationRecipe>>
    private var selectedRecipe: Property
    private var world: World
    private var context: ScreenHandlerContext

    private var input: SimpleInventory
    private var inputSlot: Slot
    private var inputStack: ItemStack
    private var output: CraftingResultInventory
    private var outputSlot: Slot

    constructor(syncId: Int, playerInventory: PlayerInventory, context: ScreenHandlerContext) : super(ModScreenHandlers.ROAD_WORKER_STATION_SCREEN_HANDLER, syncId) {
        this.availableRecipes = Lists.newArrayList()
        this.selectedRecipe = Property.create()
        this.world = playerInventory.player.world
        this.context = context

        this.input = object : SimpleInventory(1) {
            override fun markDirty() {
                super.markDirty()
                this@RoadWorkerStationScreenHandler.onContentChanged(this)
            }
        }
        this.inputStack = ItemStack.EMPTY
        this.output = CraftingResultInventory()

        inputSlot = Slot(this.input, 0, 0, 0)
        outputSlot = object: Slot(this.output, 1, 20, 20) {
            override fun canInsert(stack: ItemStack): Boolean = false
            private fun getInputStacks(): List<ItemStack> = listOf<ItemStack>(this@RoadWorkerStationScreenHandler.inputSlot.stack)
        }
        this.addSlot(inputSlot)
        this.addSlot(outputSlot)

        this.addPlayerInventorySlots(playerInventory)
        this.addPlayerHotbarSlots(playerInventory)

        this.addProperty(this.selectedRecipe)
    }
    constructor(syncId: Int, inventory: PlayerInventory) : this(syncId, inventory, ScreenHandlerContext.EMPTY)

    fun getSelectedRecipe(): Int = this.selectedRecipe.get()
    fun getAvailableRecipes(): List<RecipeEntry<RoadWorkerStationRecipe>> = this.availableRecipes
    fun getAvailableRecipeCount(): Int = this.getAvailableRecipes().size
    fun canCraft(): Boolean = this.inputSlot.hasStack() && this.getAvailableRecipes().isNotEmpty()

    override fun onContentChanged(inventory: Inventory) {
        val itemStack: ItemStack = this.inputSlot.stack
        if (!itemStack.isOf(this.inputStack.item)) {
            this.inputStack = itemStack.copy()
            this.updateInput(inventory as SimpleInventory, itemStack)
        }
    }

    private fun updateInput(input: SimpleInventory, itemStack: ItemStack) {
        this.availableRecipes = listOf()
        this.selectedRecipe.set(-1)
        this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY)
        if(!itemStack.isEmpty) {
            this.availableRecipes =
                this.world.recipeManager.getAllMatches(RoadWorkerStationRecipe.Type.INSTANCE, input, this.world)
        }
    }

    override fun onClosed(player: PlayerEntity) {
        super.onClosed(player)
        this.output.removeStack(1)
        this.dropInventory(player, this.input)
    }

    private fun addPlayerInventorySlots(playerInventory: PlayerInventory) {
        for (i in 0 until 3)
            for (l in 0 until 9)
                this.addSlot(Slot(playerInventory, l + i * 9+9, 8+l*18, 84+i*18))
    }

    private fun addPlayerHotbarSlots(playerInventory: PlayerInventory) {
        for (i in 0 until 9)
            this.addSlot(Slot(playerInventory, i, 8+i*18, 142))
    }

    override fun quickMove(player: PlayerEntity, slotIndex: Int): ItemStack {
        var newStack = ItemStack.EMPTY
//        val slot = this.slots[slotIndex]
//        if(slot.hasStack()) {
//            val originalStack = slot.stack
//            newStack = originalStack.copy()
//
//            if(slotIndex < this.inventory.size()) {
//                if(!this.insertItem(originalStack, this.inventory.size(), this.slots.size, true))
//                    return ItemStack.EMPTY
//            } else if(!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
//                return ItemStack.EMPTY
//            }
//            if(originalStack.isEmpty) {
//                slot.stack = ItemStack.EMPTY
//            } else {
//                slot.markDirty()
//            }
//        }
        return newStack
    }

    override fun getType(): ScreenHandlerType<*> = ModScreenHandlers.ROAD_WORKER_STATION_SCREEN_HANDLER
    override fun canUse(player: PlayerEntity): Boolean = this.input.canPlayerUse(player)
}