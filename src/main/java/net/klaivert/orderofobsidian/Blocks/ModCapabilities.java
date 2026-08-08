package net.klaivert.orderofobsidian.Blocks;

import net.klaivert.orderofobsidian.Blocks.Custom.CrusherBlockEntity;
import net.minecraft.core.Direction;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class ModCapabilities {
    public static void register(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.Item.BLOCK,
                ModBlockEntities.CRUSHER.get(),
                (crusher, side) -> {
                    if (side == Direction.DOWN) {
                        return new SingleSlotResourceHandler(crusher.getItemHandler(), CrusherBlockEntity.OUTPUT_SLOT);
                    }
                    return new SingleSlotResourceHandler(crusher.getItemHandler(), CrusherBlockEntity.INPUT_SLOT);
                }
        );
    }
}