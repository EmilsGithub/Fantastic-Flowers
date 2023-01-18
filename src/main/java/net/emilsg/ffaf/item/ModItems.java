package net.emilsg.ffaf.item;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.emilsg.ffaf.item.custom.ModSeedBagItem;
import net.emilsg.ffaf.mixin.ItemAccessor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Crops

    public static final Item PINEAPPLE = registerItem("pineapple", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item SOY_BEAN = registerItem("soy_bean", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item SPRING_ONION = registerItem("spring_onion", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item BROCCOLI = registerItem("broccoli", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item CORN = registerItem("corn", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item MINT = registerItem("mint", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item GRAPES = registerItem("grapes", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item RICE = registerItem("rice", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item CABBAGE = registerItem("cabbage", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item PEAS = registerItem("peas", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item GARLIC = registerItem("garlic", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item RASPBERRY = registerItem("raspberry", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item PRICKLY_PEAR = registerItem("prickly_pear", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item ONION = registerItem("onion", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item TOMATO = registerItem("tomato", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item LETTUCE = registerItem("lettuce", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item BLUEBERRIES = registerItem("blueberries", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item EGGPLANT = registerItem("eggplant", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item CHILI = registerItem("chili", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item RED_BELL_PEPPER = registerItem("red_bell_pepper", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item YELLOW_BELL_PEPPER = registerItem("yellow_bell_pepper", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item GREEN_BELL_PEPPER = registerItem("green_bell_pepper", new Item (new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item SWEET_POTATO = registerItem("sweet_potato", new AliasedBlockItem(ModBlocks.SWEET_POTATO_CROP, new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item PEANUT = registerItem("peanut", new AliasedBlockItem(ModBlocks.PEANUT_CROP, new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item TRUFFLES = registerItem("truffles", new AliasedBlockItem(ModBlocks.TRUFFLE_CROP, new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Crop Seeds - FFAF_CROPS_AND_TREES
    public static final Item PINEAPPLE_SEEDS = registerItem("pineapple_seeds", new AliasedBlockItem(ModBlocks.PINEAPPLE_CROP, new FabricItemSettings()));
    public static final Item SOY_BEAN_SEEDS = registerItem("soy_bean_seeds", new AliasedBlockItem(ModBlocks.SOY_BEAN_CROP, new FabricItemSettings()));
    public static final Item SPRING_ONION_SEEDS = registerItem("spring_onion_seeds", new AliasedBlockItem(ModBlocks.SPRING_ONION_CROP, new FabricItemSettings()));
    public static final Item BROCCOLI_SEEDS = registerItem("broccoli_seeds", new AliasedBlockItem(ModBlocks.BROCCOLI_CROP, new FabricItemSettings()));
    public static final Item CORN_SEEDS = registerItem("corn_seeds", new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item MINT_SEEDS = registerItem("mint_seeds", new AliasedBlockItem(ModBlocks.MINT_CROP, new FabricItemSettings()));
    public static final Item GRAPE_SEEDS = registerItem("grape_seeds", new AliasedBlockItem(ModBlocks.GRAPE_CROP, new FabricItemSettings()));
    public static final Item RICE_SEEDS = registerItem("rice_seeds", new AliasedBlockItem(ModBlocks.RICE_CROP, new FabricItemSettings()));
    public static final Item CABBAGE_SEEDS = registerItem("cabbage_seeds", new AliasedBlockItem(ModBlocks.CABBAGE_CROP, new FabricItemSettings()));
    public static final Item PEA_SEEDS = registerItem("pea_seeds", new AliasedBlockItem (ModBlocks.PEA_CROP, new FabricItemSettings()));
    public static final Item GARLIC_SEEDS = registerItem("garlic_seeds", new AliasedBlockItem (ModBlocks.GARLIC_CROP, new FabricItemSettings()));
    public static final Item RASPBERRY_SEEDS = registerItem("raspberry_seeds", new AliasedBlockItem(ModBlocks.RASPBERRY_BUSH, new FabricItemSettings()));
    public static final Item PRICKLY_PEAR_SEEDS = registerItem("prickly_pear_seeds", new AliasedBlockItem(ModBlocks.PRICKLY_PEAR_BLOCK, new FabricItemSettings()));
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds", new AliasedBlockItem (ModBlocks.STRAWBERRY_CROP, new FabricItemSettings()));
    public static final Item ONION_SEEDS = registerItem("onion_seeds", new AliasedBlockItem (ModBlocks.ONION_CROP, new FabricItemSettings()));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem (ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds", new AliasedBlockItem (ModBlocks.LETTUCE_CROP, new FabricItemSettings()));
    public static final Item BLUEBERRY_SEEDS = registerItem("blueberry_seeds", new AliasedBlockItem (ModBlocks.BLUEBERRY_CROP, new FabricItemSettings()));
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds", new AliasedBlockItem (ModBlocks.EGGPLANT_CROP, new FabricItemSettings()));
    public static final Item CHILI_SEEDS = registerItem("chili_seeds", new AliasedBlockItem (ModBlocks.CHILI_CROP, new FabricItemSettings()));
    public static final Item BELL_PEPPER_SEEDS = registerItem("bell_pepper_seeds", new AliasedBlockItem (ModBlocks.BELL_PEPPER_CROP, new FabricItemSettings()));
    public static final Item MUSTARD_SEEDS = registerItem("mustard_seeds", new AliasedBlockItem(ModBlocks.MUSTARD_CROP, new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));


    //Ingredients - FFAF

    public static final Item SALT = registerItem("salt", new Item (new FabricItemSettings()));
    public static final Item FLOUR = registerItem("flour", new Item (new FabricItemSettings()));
    public static final Item DOUGH = registerItem("dough", new Item (new FabricItemSettings()));
    public static final Item MILK = registerItem("milk", new Item (new FabricItemSettings()));
    public static final Item WATER = registerItem("water", new Item (new FabricItemSettings()));

    //Sea - FFAF_FOOD

    public static final Item SQUID = registerItem("squid", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Food - FFAF_FOOD

    public static final Item SUSHI = registerItem("sushi", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));
    public static final Item RICE_BOWL = registerItem("rice_bowl", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));
    public static final Item RAMEN = registerItem("ramen", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));
    public static final Item ONIGIRI = registerItem("onigiri", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.75f).build())));
    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
    public static final Item MINCED_BEEF = registerItem("minced_beef", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));

    //Food Processing - FFAF

    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item KNIFE = registerItem("knife", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COOKING_POT = registerItem("cooking_pot", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item FRYING_PAN = registerItem("frying_pan", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BUTCHER_KNIFE = registerItem("butcher_knife", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WAFFLE_IRON = registerItem("waffle_iron", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GLASS_JAR = registerItem("glass_jar", new Item(new FabricItemSettings()));

    //Custom - FFAF

    public static final Item SEED_BAG = registerItem("seed_bag", new ModSeedBagItem(new FabricItemSettings()));



    public static void addItemsToItemGroups() {

        addToItemGroup(ModItemGroup.FFAF, PINEAPPLE);
        addToItemGroup(ModItemGroup.FFAF, SOY_BEAN);
        addToItemGroup(ModItemGroup.FFAF, SPRING_ONION);
        addToItemGroup(ModItemGroup.FFAF, BROCCOLI);
        addToItemGroup(ModItemGroup.FFAF, CORN);
        addToItemGroup(ModItemGroup.FFAF, MINT);
        addToItemGroup(ModItemGroup.FFAF, GRAPES);
        addToItemGroup(ModItemGroup.FFAF, RICE);
        addToItemGroup(ModItemGroup.FFAF, CABBAGE);
        addToItemGroup(ModItemGroup.FFAF, PEAS);
        addToItemGroup(ModItemGroup.FFAF, GARLIC);
        addToItemGroup(ModItemGroup.FFAF, RASPBERRY);
        addToItemGroup(ModItemGroup.FFAF, PRICKLY_PEAR);
        addToItemGroup(ModItemGroup.FFAF, STRAWBERRY);
        addToItemGroup(ModItemGroup.FFAF, ONION);
        addToItemGroup(ModItemGroup.FFAF, TOMATO);
        addToItemGroup(ModItemGroup.FFAF, LETTUCE);
        addToItemGroup(ModItemGroup.FFAF, BLUEBERRIES);
        addToItemGroup(ModItemGroup.FFAF, EGGPLANT);
        addToItemGroup(ModItemGroup.FFAF, CHILI);
        addToItemGroup(ModItemGroup.FFAF, RED_BELL_PEPPER);
        addToItemGroup(ModItemGroup.FFAF, YELLOW_BELL_PEPPER);
        addToItemGroup(ModItemGroup.FFAF, GREEN_BELL_PEPPER);
        addToItemGroup(ModItemGroup.FFAF, SWEET_POTATO);
        addToItemGroup(ModItemGroup.FFAF, PEANUT);
        addToItemGroup(ModItemGroup.FFAF, TRUFFLES);

        addToItemGroup(ModItemGroup.FFAF, PINEAPPLE_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, SOY_BEAN_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, SPRING_ONION_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, BROCCOLI_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, CORN_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, MINT_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, GRAPE_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, RICE_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, CABBAGE_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, PEA_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, GARLIC_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, RASPBERRY_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, PRICKLY_PEAR_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, STRAWBERRY_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, ONION_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, TOMATO_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, LETTUCE_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, BLUEBERRY_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, EGGPLANT_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, CHILI_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, BELL_PEPPER_SEEDS);
        addToItemGroup(ModItemGroup.FFAF, MUSTARD_SEEDS);

        addToItemGroup(ModItemGroup.FFAF, FLOUR);
        addToItemGroup(ModItemGroup.FFAF, SALT);
        addToItemGroup(ModItemGroup.FFAF, DOUGH);
        addToItemGroup(ModItemGroup.FFAF, WATER);
        addToItemGroup(ModItemGroup.FFAF, MILK);

        addToItemGroup(ModItemGroup.FFAF, SQUID);
        addToItemGroup(ModItemGroup.FFAF, BLUEBERRY_JAM);
        addToItemGroup(ModItemGroup.FFAF, SUSHI);
        addToItemGroup(ModItemGroup.FFAF, RICE_BOWL);
        addToItemGroup(ModItemGroup.FFAF, RAMEN);
        addToItemGroup(ModItemGroup.FFAF, ONIGIRI);
        addToItemGroup(ModItemGroup.FFAF, BLUEBERRY_PIE);
        addToItemGroup(ModItemGroup.FFAF, MINCED_BEEF);

        addToItemGroup(ModItemGroup.FFAF, KNIFE);
        addToItemGroup(ModItemGroup.FFAF, MORTAR_AND_PESTLE);
        addToItemGroup(ModItemGroup.FFAF, COOKING_POT);
        addToItemGroup(ModItemGroup.FFAF, FRYING_PAN);
        addToItemGroup(ModItemGroup.FFAF, BUTCHER_KNIFE);
        addToItemGroup(ModItemGroup.FFAF, WAFFLE_IRON);
        addToItemGroup(ModItemGroup.FFAF, GLASS_JAR);
        addToItemGroup(ModItemGroup.FFAF, SEED_BAG);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries ->
                entries.add(item));
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FantasticFlowersAndFarming.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasticFlowersAndFarming.LOGGER.info("Registering Mod Items For " + FantasticFlowersAndFarming.MOD_ID);

        addItemsToItemGroups();
    }
}
