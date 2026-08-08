package net.klaivert.orderofobsidian.Blocks.Custom;

import net.klaivert.orderofobsidian.Blocks.ModBlockEntities;
import net.klaivert.orderofobsidian.Recipes.CrusherRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;

public class CrusherBlockEntity extends BlockEntity {
    public static final int INPUT_SLOT = 0;
    public static final int OUTPUT_SLOT = 1;
    public static final int MAX_PROGRESS = 100;

    private int progress = 0;

    private final ItemStacksResourceHandler itemHandler = new ItemStacksResourceHandler(2);

    public CrusherBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CRUSHER.get(), pos, state);
    }

    public ItemStacksResourceHandler getItemHandler() {
        return itemHandler;
    }

    public static void tick(Level level, BlockPos pos, BlockState state, CrusherBlockEntity entity) {
        if (level.isClientSide()) return;

        ItemStacksResourceHandler handler = entity.itemHandler;
        ItemResource inputResource = handler.getResource(INPUT_SLOT);
        int inputAmount = handler.getAmountAsInt(INPUT_SLOT);

        Item result = inputResource.isEmpty() ? null : CrusherRecipes.get().get(inputResource.toStack().getItem());

        if (result == null || inputAmount <= 0 || !entity.canOutput(result)) {
            if (entity.progress != 0) {
                entity.progress = 0;
                entity.setChanged();
            }
            return;
        }

        entity.progress++;
        entity.setChanged();

        if (entity.progress >= MAX_PROGRESS) {
            entity.progress = 0;

            try (Transaction tx = Transaction.openRoot()) {
                int extracted = handler.extract(INPUT_SLOT, inputResource, 1, tx);
                if (extracted == 1) {
                    int inserted = handler.insert(OUTPUT_SLOT, ItemResource.of(result), 1, tx);
                    if (inserted == 1) {
                        tx.commit();
                    }
                }
            }
            entity.setChanged();
        }
    }

    private boolean canOutput(Item result) {
        ItemStacksResourceHandler handler = this.itemHandler;
        ItemResource outputResource = handler.getResource(OUTPUT_SLOT);
        if (outputResource.isEmpty()) return true;
        if (!outputResource.equals(ItemResource.of(result))) return false;
        return handler.getAmountAsInt(OUTPUT_SLOT) < handler.getCapacityAsInt(OUTPUT_SLOT, outputResource);
    }

    public int getProgress() {
        return progress;
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        output.putInt("Progress", progress);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        progress = input.getIntOr("Progress", 0);
    }
}