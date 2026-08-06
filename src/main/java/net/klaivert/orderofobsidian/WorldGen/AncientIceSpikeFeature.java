package net.klaivert.orderofobsidian.WorldGen;

import com.mojang.serialization.Codec;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class AncientIceSpikeFeature extends Feature<NoneFeatureConfiguration> {

    public AncientIceSpikeFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    private enum LandscapeShape {
        ORGANIC_DOME,
        WIND_SPIKE,
        GLACIER_TOOTH
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        RandomSource random = context.random();

        LandscapeShape shape = LandscapeShape.values()[random.nextInt(LandscapeShape.values().length)];

        int height = switch (shape) {
            case ORGANIC_DOME -> random.nextInt(4) + 6;
            case WIND_SPIKE -> random.nextInt(7) + 11;
            case GLACIER_TOOTH -> random.nextInt(9) + 14;
        };

        float baseRadius = switch (shape) {
            case ORGANIC_DOME -> random.nextFloat() * 1.5f + 4.5f;
            case WIND_SPIKE -> random.nextFloat() * 1.5f + 3.0f;
            case GLACIER_TOOTH -> random.nextFloat() * 1.0f + 4.0f;
        };

        float seedX = random.nextFloat() * 100.0f;
        float seedZ = random.nextFloat() * 100.0f;

        float windX = (random.nextFloat() - 0.5f) * 0.6f;
        float windZ = (random.nextFloat() - 0.5f) * 0.6f;
        if (shape == LandscapeShape.ORGANIC_DOME) {
            windX = 0; windZ = 0;
        }


        for (int y = height; y >= -4; y--) {
            float progress = Math.max(0, (float) y / height);


            float radiusAtY;
            if (shape == LandscapeShape.ORGANIC_DOME) {
                radiusAtY = baseRadius * (float) Math.sin(Math.acos(Math.min(1.0f, progress)));
            } else {

                radiusAtY = baseRadius * (float) Math.pow(1.0f - progress, 1.4f);
            }

            if (radiusAtY <= 0.2f && y > 0) continue;

            int searchRange = Math.round(radiusAtY + 2.0f);

            int driftX = Math.round(windX * Math.max(0, y));
            int driftZ = Math.round(windZ * Math.max(0, y));

            for (int x = -searchRange; x <= searchRange; x++) {
                for (int z = -searchRange; z <= searchRange; z++) {

                    double angle = Math.atan2(z, x);
                    double noiseModifier = Math.sin(angle * 3.0 + seedX) * 0.5
                            + Math.cos(angle * 5.0 + seedZ) * 0.3;

                    double currentMaxRadius = radiusAtY + noiseModifier;
                    double distSq = x * x + z * z;

                    if (distSq <= currentMaxRadius * currentMaxRadius) {
                        BlockPos currentPos = origin.offset(x + driftX, y, z + driftZ);

                        if (y < 0) {
                            if (level.getBlockState(currentPos).isAir() && !hasSolidGroundBelow(level, currentPos, 6)) {
                                continue;
                            }
                        }

                        BlockState stateToPlace = selectIceMaterial(y, height, distSq, currentMaxRadius * currentMaxRadius, random);

                        BlockState existingState = level.getBlockState(currentPos);
                        if (existingState.is(Blocks.END_STONE)) {
                            level.setBlock(currentPos, ModBlocks.ICY_END_STONE.get().defaultBlockState(), 2);
                        } else {
                            level.setBlock(currentPos, stateToPlace, 2);
                        }

                        tryPlaceSnowLayer(level, currentPos, random);

                        tryPlaceIcicle(level, currentPos, random);
                    }
                }
            }
        }

        return true;
    }


    private boolean hasSolidGroundBelow(WorldGenLevel level, BlockPos pos, int maxDepth) {
        for (int i = 1; i <= maxDepth; i++) {
            if (!level.getBlockState(pos.below(i)).isAir()) {
                return true;
            }
        }
        return false;
    }


    private BlockState selectIceMaterial(int y, int totalHeight, double distSq, double maxDistSq, RandomSource random) {
        if (y >= totalHeight - 2) {
            return ModBlocks.ANCIENT_BLUE_ICE.get().defaultBlockState();
        }

        int roll = random.nextInt(100);

        if (distSq > maxDistSq * 0.6) {
            if (roll < 40) return ModBlocks.ANCIENT_ICE.get().defaultBlockState();
            if (roll < 70) return ModBlocks.ANCIENT_PACKED_ICE.get().defaultBlockState();
            return Blocks.SNOW_BLOCK.defaultBlockState();
        }
        else {
            if (roll < 40) return ModBlocks.ANCIENT_PACKED_ICE.get().defaultBlockState();
            if (roll < 80) return ModBlocks.ANCIENT_BLUE_ICE.get().defaultBlockState();
            return ModBlocks.ANCIENT_ICE.get().defaultBlockState();
        }
    }


    private void tryPlaceSnowLayer(WorldGenLevel level, BlockPos pos, RandomSource random) {
        BlockPos above = pos.above();
        if (level.getBlockState(above).isAir() && level.getBlockState(pos).isFaceSturdy(level, pos, Direction.UP)) {
            if (random.nextFloat() < 0.30f) {
                level.setBlock(above, Blocks.SNOW.defaultBlockState(), 2);
            }
        }
    }

    private void tryPlaceIcicle(WorldGenLevel level, BlockPos pos, RandomSource random) {
        BlockPos below = pos.below();

        if (pos.getY() > 3 && level.getBlockState(below).isAir() && random.nextFloat() < 0.08f) {
            level.setBlock(below, ModBlocks.ANCIENT_ICE.get().defaultBlockState(), 2);
            if (random.nextFloat() < 0.4f && level.getBlockState(below.below()).isAir()) {
                level.setBlock(below.below(), ModBlocks.ANCIENT_PACKED_ICE.get().defaultBlockState(), 2);
            }
        }
    }
}