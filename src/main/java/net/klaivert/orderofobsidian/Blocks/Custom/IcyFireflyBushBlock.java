package net.klaivert.orderofobsidian.Blocks.Custom;

import net.klaivert.orderofobsidian.Tags.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class IcyFireflyBushBlock extends BushBlock {

    public IcyFireflyBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(ModTags.Blocks.SUPPORTS_ICY_FIREFLY_BUSH);
    }
}