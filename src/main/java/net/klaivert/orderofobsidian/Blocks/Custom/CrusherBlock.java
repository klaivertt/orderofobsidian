package net.klaivert.orderofobsidian.Blocks.Custom;

import net.klaivert.orderofobsidian.Blocks.ModBlockEntities;
import net.klaivert.orderofobsidian.Recipes.CrusherRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import org.jetbrains.annotations.Nullable;

public class CrusherBlock extends Block implements EntityBlock {
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);

    public CrusherBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CrusherBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (level.isClientSide()) return null;
        return type == ModBlockEntities.CRUSHER.get()
                ? (lvl, pos, st, be) -> CrusherBlockEntity.tick(lvl, pos, st, (CrusherBlockEntity) be)
                : null;
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;
        if (!(level.getBlockEntity(pos) instanceof CrusherBlockEntity crusher)) return InteractionResult.PASS;

        ItemStacksResourceHandler handler = crusher.getItemHandler();

        if (stack.isEmpty()) {
            ItemResource outputResource = handler.getResource(CrusherBlockEntity.OUTPUT_SLOT);
            int outputAmount = handler.getAmountAsInt(CrusherBlockEntity.OUTPUT_SLOT);

            if (!outputResource.isEmpty() && outputAmount > 0) {
                try (Transaction tx = Transaction.openRoot()) {
                    int extracted = handler.extract(CrusherBlockEntity.OUTPUT_SLOT, outputResource, outputAmount, tx);
                    if (extracted > 0) {
                        tx.commit();
                        ItemStack output = outputResource.toStack(extracted);
                        Block.popResource(level, pos, output);
                        player.sendSystemMessage(Component.literal("Crusher: sortie éjectée -> " + output.getItem()));
                        return InteractionResult.CONSUME;
                    }
                }
            }

            ItemResource inputResource = handler.getResource(CrusherBlockEntity.INPUT_SLOT);
            int inputAmount = handler.getAmountAsInt(CrusherBlockEntity.INPUT_SLOT);
            player.sendSystemMessage(Component.literal(
                    "Progress: " + crusher.getProgress() + "/" + CrusherBlockEntity.MAX_PROGRESS +
                            " | input: " + inputAmount + "x " + (inputResource.isEmpty() ? "-" : inputResource.toStack().getItem())
            ));
            return InteractionResult.CONSUME;
        }

        int currentInputAmount = handler.getAmountAsInt(CrusherBlockEntity.INPUT_SLOT);
        if (CrusherRecipes.get().containsKey(stack.getItem()) && currentInputAmount == 0) {
            try (Transaction tx = Transaction.openRoot()) {
                int inserted = handler.insert(CrusherBlockEntity.INPUT_SLOT, ItemResource.of(stack), 1, tx);
                if (inserted > 0) {
                    tx.commit();
                    stack.shrink(inserted);
                    player.sendSystemMessage(Component.literal("Crusher: item inséré"));
                    return InteractionResult.CONSUME;
                }
            }
        }

        return InteractionResult.PASS;
    }
}