package net.klaivert.orderofobsidian.Blocks;

import java.util.Set;
import net.klaivert.orderofobsidian.Blocks.Custom.CrusherBlockEntity;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, OrderOfObsidian.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrusherBlockEntity>> CRUSHER =
            BLOCK_ENTITIES.register("crusher", () -> new BlockEntityType<>(
                    CrusherBlockEntity::new,
                    Set.<Block>of(ModBlocks.CRUSHER.get()),
                    false
            ));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}