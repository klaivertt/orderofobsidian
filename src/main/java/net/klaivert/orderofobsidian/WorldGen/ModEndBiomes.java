package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.world.level.levelgen.SurfaceRules;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.SurfaceRuleManager;

public final class ModEndBiomes {

    private ModEndBiomes() {}

    public static void Register() {

        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.HEATHER_ISLANDS, 5);
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.FROZEN_END, 3);

        SurfaceRuleManager.addSurfaceRules(
                SurfaceRuleManager.RuleCategory.END,
                OrderOfObsidian.MOD_ID,
                holderGetter -> SurfaceRules.sequence(

                        SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(holderGetter, ModBiomes.HEATHER_ISLANDS),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.ON_FLOOR,
                                        SurfaceRules.state(ModBlocks.END_HEATHER_STONE.get().defaultBlockState())
                                )
                        ),

                        SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(holderGetter, ModBiomes.FROZEN_END),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.ON_FLOOR,
                                        SurfaceRules.state(ModBlocks.ICY_END_STONE.get().defaultBlockState())
                                )
                        )
                )
        );
    }
}