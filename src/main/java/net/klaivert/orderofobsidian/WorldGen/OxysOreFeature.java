package net.klaivert.orderofobsidian.WorldGen;

import com.mojang.serialization.Codec;
import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import javax.annotation.Nullable;

public class OxysOreFeature extends Feature<NoneFeatureConfiguration> {

    /** Rayon horizontal (en blocs) autour de l'origine ou l'on cherche une colonne d'end stone. */
    private static final int SEARCH_RADIUS = 3;
    /** Nombre de colonnes testees avant d'abandonner le chunk. */
    private static final int COLUMN_ATTEMPTS = 16;

    public OxysOreFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        RandomSource random = context.random();
        WorldGenLevel level = context.level();

        if (random.nextInt(100) >= Config.OXYS_SPAWN_CHANCE_PERCENT.get()) {
            return false; // pas de vein dans ce chunk
        }

        BlockPos start = pickOreSpot(level, context.origin(), random);
        if (start == null) {
            return false; // que du vide sous ce chunk (l'End est majoritairement vide)
        }

        int veinSize = pickWeightedSize(random);
        BlockState ore = ModBlocks.OXYS_ORE.get().defaultBlockState();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        int placed = 0;
        // On tire des positions dans le cube 3x3x3 autour de start ; un bloc deja converti
        // n'est plus de l'end stone donc il ne sera pas recompte.
        for (int attempt = veinSize * 6; attempt > 0 && placed < veinSize; attempt--) {
            pos.setWithOffset(start, random.nextInt(3) - 1, random.nextInt(3) - 1, random.nextInt(3) - 1);
            if (level.getBlockState(pos).is(Blocks.END_STONE)) {
                level.setBlock(pos, ore, 2);
                placed++;
            }
        }
        return placed > 0;
    }

    /**
     * Tire un bloc d'end stone uniformement au hasard dans une colonne, sur toute la hauteur du monde.
     * Comme les blocs interieurs d'une ile sont bien plus nombreux que les deux couches de surface,
     * l'oxys se retrouve enfoui la plupart du temps, comme un minerai classique.
     */
    @Nullable
    private static BlockPos pickOreSpot(WorldGenLevel level, BlockPos origin, RandomSource random) {
        BlockPos.MutableBlockPos cursor = new BlockPos.MutableBlockPos();
        int minY = level.getMinY();
        int maxY = level.getMaxY();

        for (int attempt = 0; attempt < COLUMN_ATTEMPTS; attempt++) {
            int x = origin.getX() + random.nextInt(SEARCH_RADIUS * 2 + 1) - SEARCH_RADIUS;
            int z = origin.getZ() + random.nextInt(SEARCH_RADIUS * 2 + 1) - SEARCH_RADIUS;

            // Echantillonnage par reservoir : un seul passage sur la colonne, chaque bloc d'end stone
            // ayant exactement la meme probabilite d'etre retenu.
            int seen = 0;
            int pickedY = minY;
            for (int y = minY; y <= maxY; y++) {
                cursor.set(x, y, z);
                if (level.getBlockState(cursor).is(Blocks.END_STONE)) {
                    seen++;
                    if (random.nextInt(seen) == 0) {
                        pickedY = y;
                    }
                }
            }

            if (seen > 0) {
                return new BlockPos(x, pickedY, z);
            }
        }
        return null;
    }

    private int pickWeightedSize(RandomSource random) {
        int w1 = Config.OXYS_VEIN_WEIGHT_SIZE_1.get();
        int w2 = Config.OXYS_VEIN_WEIGHT_SIZE_2.get();
        int w3 = Config.OXYS_VEIN_WEIGHT_SIZE_3.get();
        int total = Math.max(w1 + w2 + w3, 1);
        int roll = random.nextInt(total);

        if (roll < w1) return 1;
        if (roll < w1 + w2) return 2;
        return 3;
    }
}
