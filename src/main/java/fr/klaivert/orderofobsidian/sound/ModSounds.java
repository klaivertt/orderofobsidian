package fr.klaivert.orderofobsidian.sound;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OrderOfObsidianMod.MOD_ID);



    public static final RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvent("bar_brawl");
    public static final RegistryObject<SoundEvent> CAT_REMIX = registerSoundEvent("cat_remix");
    public static final RegistryObject<SoundEvent> LITTLE_ADVENTURES = registerSoundEvent("little_adventures");
    public static final RegistryObject<SoundEvent> PARADISE = registerSoundEvent("paradise");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(OrderOfObsidianMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
