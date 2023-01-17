package net.emilsg.ffaf.util;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> FFAF_SEEDS = TagKey.of(Registries.ITEM.getKey(), new Identifier("ffaf", "ffaf_seeds"));
}

