package net.klaivert.orderofobsidian.Tags;

import net.klaivert.orderofobsidian.OrderOfObsidian;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> SUPPORTS_YEW = createTag("supports_yew");
        public static final TagKey<Block> INCORRECT_FOR_OXYS_TOOL = createTag("incorrect_for_oxys_tool");
        private static TagKey<Block> createTag(String name)
        {
            return BlockTags.create(Identifier.fromNamespaceAndPath(OrderOfObsidian.MOD_ID, name));
        }
    }

    public static class Items
    {

        public static final TagKey<Item> OXYS_REPAIRABLE = createTag("oxys_repairable");

        private static TagKey<Item> createTag(String name)
        {
            return ItemTags.create(Identifier.fromNamespaceAndPath(OrderOfObsidian.MOD_ID, name));
        }
    }
}
