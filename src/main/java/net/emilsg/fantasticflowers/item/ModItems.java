package net.emilsg.fantasticflowers.item;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.emilsg.fantasticflowers.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH,
                    new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)
                            .food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())));

    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(4f).build())));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FantasticFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasticFlowers.LOGGER.info("Registering Mod Items For " + FantasticFlowers.MOD_ID);
    }

}
