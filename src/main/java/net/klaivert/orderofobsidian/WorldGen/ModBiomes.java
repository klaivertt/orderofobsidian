package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.ArrayList;
import java.util.List;

public final class ModBiomes {

    private record BiomeInfo(ResourceKey<Biome> key,
                             java.util.function.BiFunction<HolderGetter<PlacedFeature>, HolderGetter<ConfiguredWorldCarver<?>>, Biome> factory) {}

    private static final List<BiomeInfo> BIOMES = new ArrayList<>();

    public static final ResourceKey<Biome> HEATHER_ISLANDS = register(
            "heather_islands",
            ModBiomes::heatherIslands
    );

    public static final ResourceKey<Biome> FROZEN_END = register(
            "frozen_end",
            ModBiomes::frozenEnd
    );

    private ModBiomes() {}

    public static void load() {
    }

    private static ResourceKey<Biome> register(String name,
                                               java.util.function.BiFunction<HolderGetter<PlacedFeature>, HolderGetter<ConfiguredWorldCarver<?>>, Biome> factory) {
        ResourceKey<Biome> key = biomeKey(name);
        BIOMES.add(new BiomeInfo(key, factory));
        return key;
    }

    public static void bootstrap(BootstrapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carvers = context.lookup(Registries.CONFIGURED_CARVER);

        for (BiomeInfo info : BIOMES) {
            context.register(info.key(), info.factory().apply(placedFeatures, carvers));
        }
    }

    private static Biome heatherIslands(HolderGetter<PlacedFeature> placedFeatures,
                                        HolderGetter<ConfiguredWorldCarver<?>> carvers) {

        MobSpawnSettings.Builder spawns = new MobSpawnSettings.Builder();
        spawns.addSpawn(MobCategory.MONSTER, 3, new MobSpawnSettings.SpawnerData(EntityTypes.ENDERMAN, 1, 4));

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);

        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
                .waterColor(0x491e49)
                .grassColorOverride(0x7a2d7a)
                .foliageColorOverride(0x7a2d7a)
                .build();

        EnvironmentAttributeMap attributes = EnvironmentAttributeMap.builder()
                .set(EnvironmentAttributes.FOG_COLOR, 0x571a57)
                .set(EnvironmentAttributes.SKY_COLOR, 0x000000)
                .build();

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(0.5f)
                .downfall(0.5f)
                .specialEffects(effects)
                .mobSpawnSettings(spawns.build())
                .generationSettings(generation.build())
                .build();
    }


    private static Biome frozenEnd(HolderGetter<PlacedFeature> placedFeatures,
                                        HolderGetter<ConfiguredWorldCarver<?>> carvers) {

        MobSpawnSettings.Builder spawns = new MobSpawnSettings.Builder();
        spawns.addSpawn(MobCategory.MONSTER, 3, new MobSpawnSettings.SpawnerData(EntityTypes.ENDERMAN, 1, 4));

        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);

        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
                .waterColor(0x3f76e4)
                .grassColorOverride(0x7a2d7a)
                .foliageColorOverride(0x7a2d7a)
                .build();

        EnvironmentAttributeMap attributes = EnvironmentAttributeMap.builder()
                .set(EnvironmentAttributes.FOG_COLOR, 0xa0c8d7)
                .set(EnvironmentAttributes.SKY_COLOR, 0x000000)
                .build();

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(0.0f)
                .downfall(0.5f)
                .specialEffects(effects)
                .mobSpawnSettings(spawns.build())
                .generationSettings(generation.build())
                .build();
    }

    private static ResourceKey<Biome> biomeKey(String name) {
        return ResourceKey.create(Registries.BIOME, OrderOfObsidian.id(name));
    }
}