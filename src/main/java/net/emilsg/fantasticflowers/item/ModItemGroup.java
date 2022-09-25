package net.emilsg.fantasticflowers.item;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.emilsg.fantasticflowers.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FANTASTICFLOWERS = FabricItemGroupBuilder.build(
            new Identifier(FantasticFlowers.MOD_ID, "fantasticflowers"), () -> new ItemStack(ModBlocks.LAZARUS_BELL));

    public static final ItemGroup FANTASTICFLOWERS_FOOD = FabricItemGroupBuilder.build(
            new Identifier(FantasticFlowers.MOD_ID, "fantasticflowers_food"), () -> new ItemStack(ModItems.BLUEBERRY_PIE));

}
