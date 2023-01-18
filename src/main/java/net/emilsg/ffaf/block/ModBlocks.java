package net.emilsg.ffaf.block;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.custom.*;
import net.emilsg.ffaf.item.ModItemGroup;
import net.emilsg.ffaf.world.feature.tree.AppleTreeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Falling Blocks

    public static final Block SAND_SALT_ORE = registerBlock("sand_salt_ore", new FallingBlock(FabricBlockSettings.of(Material.STONE).strength(2f).sounds(BlockSoundGroup.SAND)),ModItemGroup.FFAF);

    //Crop Blocks

    public static final Block PINEAPPLE_CROP = registerBlockWithoutItem("pineapple_crop", new ModPineappleBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block SOY_BEAN_CROP = registerBlockWithoutItem("soy_bean_crop", new ModSoyBeanBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block SPRING_ONION_CROP = registerBlockWithoutItem("spring_onion_crop", new ModSpringOnionBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block PEANUT_CROP = registerBlockWithoutItem("peanut_crop", new ModPeanutBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block TRUFFLE_CROP = registerBlockWithoutItem("truffle_crop", new ModTruffleBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block BROCCOLI_CROP = registerBlockWithoutItem("broccoli_crop", new ModBroccoliBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block SWEET_POTATO_CROP = registerBlockWithoutItem("sweet_potato_crop", new ModMustardBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block MUSTARD_CROP = registerBlockWithoutItem("mustard_crop", new ModMustardBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block CORN_CROP = registerBlockWithoutItem("corn_crop", new ModCornBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block MINT_CROP = registerBlockWithoutItem("mint_crop", new ModMintBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block GRAPE_CROP = registerBlockWithoutItem("grape_crop", new ModGrapeBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block RICE_CROP = registerBlockWithoutItem("rice_crop", new ModRiceBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block CABBAGE_CROP = registerBlockWithoutItem("cabbage_crop", new ModCabbageBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block PEA_CROP = registerBlockWithoutItem("pea_crop", new ModPeaBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block GARLIC_CROP = registerBlockWithoutItem("garlic_crop", new ModGarlicBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block STRAWBERRY_CROP = registerBlockWithoutItem("strawberry_crop", new ModStrawberryBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block ONION_CROP = registerBlockWithoutItem("onion_crop", new ModOnionBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop", new ModEggplantBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block BLUEBERRY_CROP = registerBlockWithoutItem("blueberry_crop", new ModBlueberryBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block BELL_PEPPER_CROP = registerBlockWithoutItem("bell_pepper_crop", new ModBellPepperBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block CHILI_CROP = registerBlockWithoutItem("chili_crop", new ModChiliBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block LETTUCE_CROP = registerBlockWithoutItem("lettuce_crop", new ModLettuceBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));
    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop", new ModTomatoBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    //Small Flower Blocks

    public static final Block LAZARUS_BELL = registerBlock("lazarus_bell", new ModFlowerBlock(StatusEffects.LEVITATION, 5, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FFAF);
    public static final Block WHITE_FORGET_ME_NOT = registerBlock("white_forget_me_not", new ModFlowerBlock(StatusEffects.SPEED, 5, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FFAF);
    public static final Block PINK_FORGET_ME_NOT = registerBlock("pink_forget_me_not", new ModFlowerBlock(StatusEffects.SPEED, 5, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FFAF);
    public static final Block LIGHT_BLUE_FORGET_ME_NOT = registerBlock("light_blue_forget_me_not", new ModFlowerBlock(StatusEffects.SPEED, 5, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FFAF);

    //Plant Blocks

    public static final Block CLOVERS = registerBlock("clovers", new ModCloversBlock(PlantBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque().noCollision()), ModItemGroup.FFAF);

    //Tall Flower Blocks

    public static final Block MAGENTA_LUPINE = registerBlock("magenta_lupine", new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FFAF);
    public static final Block BLUE_LUPINE = registerBlock("blue_lupine", new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FFAF);
    public static final Block WHITE_ROSE_BUSH = registerBlock("white_rose_bush", new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FFAF);

    //Sweet Berry Bush Blocks - RegisterWithoutItem

    public static final Block PRICKLY_PEAR_BLOCK = registerBlockWithoutItem("prickly_pear_block", new ModPricklyPearBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()));
    public static final Block RASPBERRY_BUSH = registerBlockWithoutItem("raspberry_bush", new ModRaspberryBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()));

    //Trees

    //Apple Tree
    public static final Block APPLE_TREE_FRUIT_LEAVES = registerBlockWithoutItem("apple_tree_fruit_leaves", new ModAppleLeafFruitBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block APPLE_TREE_LEAVES = registerBlock("apple_tree_leaves", new ModLeafBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.FFAF);
    public static final Block APPLE_TREE_LOG = registerBlock("apple_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.FFAF);
    public static final Block APPLE_TREE_WOOD = registerBlock("apple_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.FFAF);
    public static final Block STRIPPED_APPLE_TREE_LOG = registerBlock("stripped_apple_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.FFAF);
    public static final Block STRIPPED_APPLE_TREE_WOOD = registerBlock("stripped_apple_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.FFAF);
    public static final Block APPLE_TREE_SAPLING = registerBlock("apple_tree_sapling", new SaplingBlock(new AppleTreeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.FFAF);



private static Block registerBlockWithoutItem(String name, Block block) {
    return Registry.register(Registries.BLOCK, new Identifier(FantasticFlowersAndFarming.MOD_ID, name), block);
}

private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
    return Registry.register(Registries.BLOCK, new Identifier(FantasticFlowersAndFarming.MOD_ID, name), block);
}

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(FantasticFlowersAndFarming.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks(){
        FantasticFlowersAndFarming.LOGGER.debug("Registering ModBlocks for " + FantasticFlowersAndFarming.MOD_ID);
    }
}
