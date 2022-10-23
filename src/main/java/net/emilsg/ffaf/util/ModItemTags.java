package net.emilsg.ffaf.util;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> FFAF_SEEDS = TagKey.of(Registry.ITEM_KEY, new Identifier("ffaf", "ffaf_seeds"));
}

