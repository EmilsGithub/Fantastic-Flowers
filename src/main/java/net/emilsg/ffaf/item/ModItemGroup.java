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

    public static void registerItemGroup() {
        FFAF = FabricItemGroup.builder(new Identifier(FantasticFlowersAndFarming.MOD_ID, "ffaf"))
                .displayName(Text.literal("FFAF"))
                .icon(() -> new ItemStack(ModBlocks.LAZARUS_BELL)).build();
    }
}

