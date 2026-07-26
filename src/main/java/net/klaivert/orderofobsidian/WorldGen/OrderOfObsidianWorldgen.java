package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public final class OrderOfObsidianWorldgen {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OXYS_ORE = configuredFeatureKey("oxys_ore");

    public static final ResourceKey<PlacedFeature> OXYS_ORE_PLACED = placedFeatureKey("oxys_ore");

    public static final ResourceKey<BiomeModifier> ADD_OXYS_ORE = biomeModifierKey("add_oxys_ore");

    private OrderOfObsidianWorldgen() {
    }

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> _context)
    {
        _context.register(OXYS_ORE, new ConfiguredFeature<>(ModFeatures.OXYS_ORE.get(), NoneFeatureConfiguration.INSTANCE));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> _context)
    {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = _context.lookup(Registries.CONFIGURED_FEATURE);


        // Pas de heightmap ni de height_range : les iles de l'End flottent a des altitudes variables,
        // donc c'est la feature qui tire une profondeur uniforme dans la roche.
        _context.register(OXYS_ORE_PLACED, new PlacedFeature(
                configuredFeatures.getOrThrow(OXYS_ORE),
                List.of(
                        InSquarePlacement.spread(), // colonne aleatoire dans le chunk
                        BiomeFilter.biome()
                )
        ));
    }

    public static void bootstrapBiomeModifiers(BootstrapContext<BiomeModifier> _context)
    {
        HolderGetter<Biome> biomes = _context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = _context.lookup(Registries.PLACED_FEATURE);

        _context.register(ADD_OXYS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(OXYS_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey(String _name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, OrderOfObsidian.id(_name));
    }

    private static ResourceKey<PlacedFeature> placedFeatureKey(String _name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, OrderOfObsidian.id(_name));
    }

    private static ResourceKey<BiomeModifier> biomeModifierKey(String _name)
    {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, OrderOfObsidian.id(_name));
    }
}
