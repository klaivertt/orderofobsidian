package net.klaivert.orderofobsidian;

import net.klaivert.orderofobsidian.DataGen.ModModelProvider;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = OrderOfObsidian.MOD_ID)
class OrderOfObsidianDataGen
{
    @SubscribeEvent
    public static void GatherClientData(GatherDataEvent.Client _event)
    {
        DataGenerator generator = _event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, new ModModelProvider(packOutput));
    }
}
