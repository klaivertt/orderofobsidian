package net.klaivert.orderofobsidian.Blocks;

import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.transaction.TransactionContext;


public class SingleSlotResourceHandler implements ResourceHandler<ItemResource> {
    private final ResourceHandler<ItemResource> parent;
    private final int slot;

    public SingleSlotResourceHandler(ResourceHandler<ItemResource> parent, int slot) {
        this.parent = parent;
        this.slot = slot;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isValid(int index, ItemResource resource) {
        return parent.isValid(slot, resource);
    }

    @Override
    public long getCapacityAsLong(int index, ItemResource resource) {
        return parent.getCapacityAsLong(slot, resource);
    }

    @Override
    public ItemResource getResource(int index) {
        return parent.getResource(slot);
    }

    @Override
    public long getAmountAsLong(int index) {
        return parent.getAmountAsLong(slot);
    }

    @Override
    public int insert(int index, ItemResource resource, int amount, TransactionContext transaction) {
        return parent.insert(slot, resource, amount, transaction);
    }

    @Override
    public int extract(int index, ItemResource resource, int amount, TransactionContext transaction) {
        return parent.extract(slot, resource, amount, transaction);
    }
}