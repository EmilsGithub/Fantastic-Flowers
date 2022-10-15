package net.emilsg.ffaf.item;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FFAF = FabricItemGroupBuilder.build(
            new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf"), () -> new ItemStack(ModBlocks.LAZARUS_BELL));

    public static final ItemGroup FFAF_FOOD = FabricItemGroupBuilder.build(
            new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf_food"), () -> new ItemStack(ModItems.BLUEBERRY_PIE));

}
