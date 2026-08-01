package net.klaivert.orderofobsidian.Blocks.Custom;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

public class YewLogBlock extends RotatedPillarBlock {

    public YewLogBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (itemAbility == ItemAbilities.AXE_STRIP) {
            return ModBlocks.STRIPPED_YEW_LOG.get().defaultBlockState()
                    .setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}