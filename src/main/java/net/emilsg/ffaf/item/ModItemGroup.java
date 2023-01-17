package net.emilsg.ffaf.item;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup FFAF;
    public static ItemGroup FFAF_CROPS_AND_TREES;
    public static ItemGroup FFAF_FOOD;

    public static void registerItemGroups() {
        registerMainItemGroup();
        registerSecondItemGroup();
        registerThirdItemGroup();
    }


    public static void registerMainItemGroup() {
        FFAF = FabricItemGroup.builder(new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf"))
                .displayName(Text.literal("FFAF"))
                .icon(() -> new ItemStack(ModBlocks.LAZARUS_BELL)).build();
    }

    public static void registerSecondItemGroup() {
        FFAF_CROPS_AND_TREES = FabricItemGroup.builder(new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf_crops_and_trees"))
                .displayName(Text.literal("FFAF Crops And Trees"))
                .icon(() -> new ItemStack(ModItems.GARLIC_SEEDS)).build();
    }

    public static void registerThirdItemGroup() {
        FFAF_FOOD = FabricItemGroup.builder(new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf_food"))
                .displayName(Text.literal("FFAF Food"))
                .icon(() -> new ItemStack(ModItems.BLUEBERRY_PIE)).build();
    }
}

