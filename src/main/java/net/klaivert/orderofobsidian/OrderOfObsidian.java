package net.klaivert.orderofobsidian;

import net.klaivert.orderofobsidian.Blocks.ModBlocks;
import net.klaivert.orderofobsidian.CreativeModTab.ModCreativeModTab;
import net.klaivert.orderofobsidian.WorldGen.ModFeatures;
import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(OrderOfObsidian.MOD_ID)
public class OrderOfObsidian
{
    // Define mod id
    public static final String MOD_ID = "orderofobsidian";
    public static final Logger LOGGER = LogUtils.getLogger();

   //constructor
    public OrderOfObsidian(IEventBus _modEventBus, ModContainer _modContainer)
    {
        _modEventBus.addListener(this::commonSetup);

        ModCreativeModTab.Register(_modEventBus);
        ModItems.Register(_modEventBus);
        ModBlocks.Registered(_modEventBus);
        ModFeatures.Registered(_modEventBus);

        NeoForge.EVENT_BUS.register(this);

        _modEventBus.addListener(this::addCreative);

        _modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent _event)
    {

        LOGGER.info("Order of Obsidian");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent _event)
    {
//        if (_event.getTabKey() == CreativeModeTabs.INGREDIENTS)
//        {
//        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent _event)
    {

    }

    public static Identifier id(String _name)
    {
        return Identifier.fromNamespaceAndPath(MOD_ID, _name);
    }
}
