package net.klaivert.orderofobsidian.WorldGen;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFeatures
{
    public static final DeferredRegister<Feature<?>> features =
            DeferredRegister.create(Registries.FEATURE, OrderOfObsidian.MOD_ID);

    public static final DeferredHolder<Feature<?>, OxysOreFeature> OXYS_ORE =
            features.register("oxys_ore", () -> new OxysOreFeature(NoneFeatureConfiguration.CODEC));

    public static void Registered(IEventBus _eventBus)
    {
        features.register(_eventBus);
    }
}
