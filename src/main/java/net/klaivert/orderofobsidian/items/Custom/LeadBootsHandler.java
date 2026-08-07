package net.klaivert.orderofobsidian.items.Custom;

import net.klaivert.orderofobsidian.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = "orderofobsidian")
public class LeadBootsHandler {

    @SubscribeEvent
    public static void onEffectAdded(MobEffectEvent.Added event) {
        if (!(event.getEntity() instanceof Player player)) return;

        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        if (!boots.is(ModItems.LEAD_BOOTS.get())) return;

        if (event.getEffectInstance().getEffect() == MobEffects.LEVITATION) {
            MobEffectInstance current = event.getEffectInstance();

        }
    }

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        if (player.level().isClientSide()) return;

        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        if (!boots.is(ModItems.LEAD_BOOTS.get())) return;

        if (player.hasEffect(MobEffects.LEVITATION)) {
            player.removeEffect(MobEffects.LEVITATION);
        }

        if (player.isInWater()) {
            Vec3 motionBefore = player.getDeltaMovement();
            double newVelocityY = motionBefore.y - 0.03;
            player.setDeltaMovement(motionBefore.x, newVelocityY, motionBefore.z);
            player.hurtMarked = true;

            if (player instanceof ServerPlayer serverPlayer) {
                serverPlayer.sendSystemMessage(
                        Component.literal("Vitesse Y avant: " + String.format("%.3f", motionBefore.y) + " | Après: " + String.format("%.3f", newVelocityY)),
                        true
                );
            }
        }
    }
}