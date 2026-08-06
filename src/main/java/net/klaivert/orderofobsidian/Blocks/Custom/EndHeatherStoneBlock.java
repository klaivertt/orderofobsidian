package net.klaivert.orderofobsidian.Blocks.Custom;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class EndHeatherStoneBlock extends Block {

    public EndHeatherStoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockPos above = pos.above();

        if (level.getMaxLocalRawBrightness(above) < 4
                && level.getBlockState(above).isCollisionShapeFullBlock(level, above)) {
            level.setBlockAndUpdate(pos, Blocks.END_STONE.defaultBlockState());
            return;
        }

        if (level.getMaxLocalRawBrightness(above) >= 4) {
            for (int i = 0; i < 4; i++) {
                BlockPos target = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (level.getBlockState(target).is(Blocks.END_STONE)
                        && level.getMaxLocalRawBrightness(target.above()) >= 4) {
                    level.setBlockAndUpdate(target, ModBlocks.END_HEATHER_STONE.get().defaultBlockState());
                }
            }
        }
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }
}