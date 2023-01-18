package net.emilsg.ffaf.util;

import net.emilsg.ffaf.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModFlammableAndOrStrippableBlocks {

    public static void registerFlammableAndStrippableBlocks() {
        registerFlammableBlocks();
        registerStrippables();
    }

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.APPLE_TREE_LOG, 5, 5);
        registry.add(ModBlocks.APPLE_TREE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_APPLE_TREE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_APPLE_TREE_WOOD, 5, 5);

        //registry.add(ModBlocks.APPLE_TREE_PLANKS, 5, 20);

        registry.add(ModBlocks.APPLE_TREE_FRUIT_LEAVES, 30, 60);
        registry.add(ModBlocks.APPLE_TREE_LEAVES, 30, 60);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.APPLE_TREE_LOG, ModBlocks.STRIPPED_APPLE_TREE_LOG);
        StrippableBlockRegistry.register(ModBlocks.APPLE_TREE_WOOD, ModBlocks.STRIPPED_APPLE_TREE_WOOD);
    }
}
