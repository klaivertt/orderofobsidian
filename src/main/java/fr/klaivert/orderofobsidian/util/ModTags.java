package fr.klaivert.orderofobsidian.util;

import fr.klaivert.orderofobsidian.OrderOfObsidianMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL
                = tag("needs_netherite_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(OrderOfObsidianMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
