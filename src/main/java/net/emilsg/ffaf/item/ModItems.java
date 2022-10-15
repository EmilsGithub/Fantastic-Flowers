package net.emilsg.ffaf.item;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    //Seeds

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem (ModBlocks.STRAWBERRY_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item ONION_SEEDS = registerItem("onion_seeds",
            new AliasedBlockItem (ModBlocks.ONION_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem (ModBlocks.EGGPLANT_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item BLUEBERRY_SEEDS = registerItem("blueberry_seeds",
            new AliasedBlockItem (ModBlocks.BLUEBERRY_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item CHILI_SEEDS = registerItem("chili_seeds",
            new AliasedBlockItem (ModBlocks.CHILI_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem (ModBlocks.TOMATO_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds",
            new AliasedBlockItem (ModBlocks.LETTUCE_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item BELL_PEPPER_SEEDS = registerItem("bell_pepper_seeds",
            new AliasedBlockItem (ModBlocks.BELL_PEPPER_CROP, new FabricItemSettings().group(ModItemGroup.FFAF)));

    //Crops

    public static final Item RED_BELL_PEPPER = registerItem("red_bell_pepper",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item YELLOW_BELL_PEPPER = registerItem("yellow_bell_pepper",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item GREEN_BELL_PEPPER = registerItem("green_bell_pepper",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item ONION = registerItem("onion",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item EGGPLANT = registerItem("eggplant",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item CHILI = registerItem("chili",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item TOMATO = registerItem("tomato",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                            .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item LETTUCE = registerItem("lettuce",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    public static final Item PRICKLY_PEAR = registerItem("prickly_pear",
            new AliasedBlockItem(ModBlocks.PRICKLY_PEAR_BLOCK,
                    new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build())));

    //Spices

    public static final Item SALT = registerItem("salt",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF)));

    //Ingredients

    public static final Item FLOUR = registerItem("flour",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item DOUGH = registerItem("dough",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF)));

    public static final Item WATER = registerItem("water",
            new Item (new FabricItemSettings().group(ModItemGroup.FFAF)));


    //Food
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));

    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam",
            new Item(new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));

    public static final Item MINCED_BEEF = registerItem("minced_beef",
            new Item(new FabricItemSettings().group(ModItemGroup.FFAF_FOOD)
                    .food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Food Processing
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.FFAF)));

    public static final Item KNIFE = registerItem("knife",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.FFAF)));

    public static final Item GLASS_JAR = registerItem("glass_jar",
            new Item(new FabricItemSettings().group(ModItemGroup.FFAF)));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FantasticFlowersAndFarming.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasticFlowersAndFarming.LOGGER.info("Registering Mod Items For " + FantasticFlowersAndFarming.MOD_ID);
    }

}
