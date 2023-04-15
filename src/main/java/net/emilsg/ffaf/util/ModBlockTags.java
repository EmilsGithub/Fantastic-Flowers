package net.emilsg.ffaf.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> FFAF_COCONUT_LOGS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("ffaf", "ffaf_coconut_logs"));
}

