package net.emilsg.fantasticflowers.item;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.emilsg.fantasticflowers.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    //Seeds

    public static final Item CHILI_SEEDS = registerItem("chili_seeds",
            new AliasedBlockItem (ModBlocks.CHILI_CROP, new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)));

    //Crops

    public static final Item CHILI = registerItem("chili",
            new Item (new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS_FOOD)
                            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Spices

    public static final Item SALT = registerItem("salt",
            new Item (new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)));

    //Ingredients

    public static final Item WATER = registerItem("water",
            new Item (new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)));

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH,
                    new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS_FOOD)
                            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));

    public static final Item PRICKLY_PEAR = registerItem("prickly_pear",
            new AliasedBlockItem(ModBlocks.PRICKLY_PEAR_BLOCK,
                    new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS_FOOD)
                            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));

    //Food
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS_FOOD)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));

    public static final Item MINCED_BEEF = registerItem("minced_beef",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Food Processing
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.FANTASTICFLOWERS)));

    public static final Item KNIFE = registerItem("knife",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.FANTASTICFLOWERS)));

    public static final Item GLASS_JAR = registerItem("glass_jar",
            new Item(new FabricItemSettings().group(ModItemGroup.FANTASTICFLOWERS)));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FantasticFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasticFlowers.LOGGER.info("Registering Mod Items For " + FantasticFlowers.MOD_ID);
    }

}
