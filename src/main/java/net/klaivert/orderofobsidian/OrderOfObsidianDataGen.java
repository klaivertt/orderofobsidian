package net.klaivert.orderofobsidian;

import net.klaivert.orderofobsidian.DataGen.ModBlockLootTableProvider;
import net.klaivert.orderofobsidian.DataGen.ModBlockTagsProvider;
import net.klaivert.orderofobsidian.DataGen.ModModelProvider;
import net.klaivert.orderofobsidian.DataGen.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = OrderOfObsidian.MOD_ID)
class OrderOfObsidianDataGen
{
    @SubscribeEvent
    public static void GatherClientData(GatherDataEvent.Client _event)
    {
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
