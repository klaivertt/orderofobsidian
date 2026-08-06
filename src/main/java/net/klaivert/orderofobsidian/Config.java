package net.klaivert.orderofobsidian;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    // a list of strings that are treated as resource locations for items
    public static final ModConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
            .comment("A list of items to log on common setup.")
            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), () -> "", Config::validateItemName);

    // === oxys worldgen config ===
    public static final ModConfigSpec.IntValue OXYS_SPAWN_CHANCE_PERCENT = BUILDER
            .comment("Chance (0-100) for a chunk to contain one oxys vein")
            .defineInRange("oxysSpawnChancePercent", 20, 0, 100);

    public static final ModConfigSpec.IntValue OXYS_VEIN_WEIGHT_SIZE_1 = BUILDER
            .comment("Relative weight for generating a vein of size 1 (higher = more likely; used with sizes 2 and 3)")
            .defineInRange("oxysVeinWeightSize1", 50, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue OXYS_VEIN_WEIGHT_SIZE_2 = BUILDER
            .comment("Relative weight for generating a vein of size 2")
            .defineInRange("oxysVeinWeightSize2", 40, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.IntValue OXYS_VEIN_WEIGHT_SIZE_3 = BUILDER
            .comment("Relative weight for generating a vein of size 3 (very rare by default)")
            .defineInRange("oxysVeinWeightSize3", 10, 0, Integer.MAX_VALUE);


    // === end oxys config ===

    static final ModConfigSpec SPEC = BUILDER.build();

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(Identifier.parse(itemName));
    }
}
