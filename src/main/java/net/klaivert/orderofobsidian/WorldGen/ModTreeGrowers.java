package net.klaivert.orderofobsidian.WorldGen;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public final class ModTreeGrowers
{
    public static final TreeGrower YEW = new TreeGrower(
            "yew",
            Optional.empty(),
            Optional.of(OrderOfObsidianWorldgen.YEW_TREE),
            Optional.empty()
    );

    private ModTreeGrowers()
    {
    }
}
