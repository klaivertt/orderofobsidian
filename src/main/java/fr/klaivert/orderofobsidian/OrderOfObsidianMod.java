package fr.klaivert.orderofobsidian;

import com.mojang.logging.LogUtils;
import fr.klaivert.orderofobsidian.block.ModBlocks;
import fr.klaivert.orderofobsidian.item.ModCreativeModTabs;
import fr.klaivert.orderofobsidian.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OrderOfObsidianMod.MOD_ID)
public class OrderOfObsidianMod {
    public static final String MOD_ID = "orderofobsidian";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OrderOfObsidianMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.OXYS);
            event.accept(ModItems.RAW_AIKIGITE);
            event.accept(ModItems.AIKIGITE_INGOT);
            event.accept(ModItems.RAW_ALUMINIUM);
            event.accept(ModItems.ALUMINIUM_INGOT);
            event.accept(ModItems.RAW_AVENRONITE);
            event.accept(ModItems.AVENRONITE_INGOT);
            event.accept(ModItems.RAW_BAUHERITE);
            event.accept(ModItems.BAUHERITE_INGOT);
            event.accept(ModItems.RAW_EDRUELIUM);
            event.accept(ModItems.EDRUELIUM_INGOT);
            event.accept(ModItems.GRAPHITE_DUST);
            event.accept(ModItems.GRAPHITE_INGOT);
            event.accept(ModItems.RAW_LEAD);
            event.accept(ModItems.LEAD_INGOT);
            event.accept(ModItems.RAW_MITHRIL);
            event.accept(ModItems.MITHRIL_INGOT);
            event.accept(ModItems.RAW_PENDORITE);
            event.accept(ModItems.PENDORITE_INGOT);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.DUST_STEEL);
            event.accept(ModItems.STEEL_INGOT);

            event.accept(ModItems.OXYS);
            event.accept(ModItems.ALUMINIUM_PLATE);
            event.accept(ModItems.OXYS_STICK);
            event.accept(ModItems.WITHER_SKELETON_SHARD);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
