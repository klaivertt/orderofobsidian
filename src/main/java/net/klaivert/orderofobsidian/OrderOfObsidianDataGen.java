package net.klaivert.orderofobsidian;

import net.klaivert.orderofobsidian.DataGen.ModBlockLootTableProvider;
import net.klaivert.orderofobsidian.DataGen.ModBlockTagsProvider;
import net.klaivert.orderofobsidian.DataGen.ModModelProvider;
import net.klaivert.orderofobsidian.DataGen.ModRecipeProvider;
import net.klaivert.orderofobsidian.WorldGen.OrderOfObsidianWorldgen;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = OrderOfObsidian.MOD_ID)
class OrderOfObsidianDataGen
{
    @SubscribeEvent
    public static void GatherClientData(GatherDataEvent.Client _event)
    {
        // Doit passer en premier : les providers suivants doivent voir les registres dynamiques
        // enrichis (configured_feature / placed_feature / biome_modifier) via getLookupProvider().
        _event.createDatapackRegistryObjects(new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, OrderOfObsidianWorldgen::bootstrapConfiguredFeatures)
                .add(Registries.PLACED_FEATURE, OrderOfObsidianWorldgen::bootstrapPlacedFeatures)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, OrderOfObsidianWorldgen::bootstrapBiomeModifiers));

        DataGenerator generator = _event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = _event.getLookupProvider();


        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(
                        new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)
                ), lookupProvider));
        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
    }
}
