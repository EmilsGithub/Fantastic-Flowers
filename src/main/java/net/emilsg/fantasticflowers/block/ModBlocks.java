package net.emilsg.fantasticflowers.block;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.emilsg.fantasticflowers.block.custom.*;
import net.emilsg.fantasticflowers.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //Seed Crop Blocks

    public static final Block SANDY_SEED_CROP = registerBlock("sandy_seed_crop",
            new ModSandySeedCropBlock(FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FANTASTICFLOWERS);

    //Crop Blocks

    public static final Block BELL_PEPPER_CROP = registerBlockWithoutItem("bell_pepper_crop",
            new ModBellPepperBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block CHILI_CROP = registerBlockWithoutItem("chili_crop",
            new ModChiliBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop",
            new ModTomatoBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    //Small Flower Blocks
    public static final Block LAZARUS_BELL = registerBlock("lazarus_bell",
            new ModFlowerBlock(StatusEffects.LEVITATION, 5,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FANTASTICFLOWERS);

    public static final Block WHITE_FORGET_ME_NOT = registerBlock("white_forget_me_not",
            new ModFlowerBlock(StatusEffects.SPEED, 5,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FANTASTICFLOWERS);

    public static final Block PINK_FORGET_ME_NOT = registerBlock("pink_forget_me_not",
            new ModFlowerBlock(StatusEffects.SPEED, 5,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FANTASTICFLOWERS);

    public static final Block LIGHT_BLUE_FORGET_ME_NOT = registerBlock("light_blue_forget_me_not",
            new ModFlowerBlock(StatusEffects.SPEED, 5,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()), ModItemGroup.FANTASTICFLOWERS);

    //Plant Blocks
    public static final Block CLOVERS = registerBlock("clovers",
            new CloversBlock(PlantBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque().
                    noCollision()), ModItemGroup.FANTASTICFLOWERS);

    //Tall Flower Blocks
    public static final Block MAGENTA_LUPINE = registerBlock("magenta_lupine",
            new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FANTASTICFLOWERS);

    public static final Block BLUE_LUPINE = registerBlock("blue_lupine",
            new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FANTASTICFLOWERS);

    public static final Block WHITE_ROSE_BUSH = registerBlock("white_rose_bush",
            new ModTallFlowerBlock(FabricBlockSettings.copy(Blocks.ROSE_BUSH).nonOpaque()), ModItemGroup.FANTASTICFLOWERS);

    //Sweet Berry Bush Blocks - RegisterWithoutItem
    public static final Block BLUEBERRY_BUSH = registerBlockWithoutItem("blueberry_bush",
            new ModBlueBerryBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()));

    public static final Block PRICKLY_PEAR_BLOCK = registerBlockWithoutItem("prickly_pear_block",
            new ModPricklyPearBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()));




private static Block registerBlockWithoutItem(String name, Block block) {
    return Registry.register(Registry.BLOCK, new Identifier(FantasticFlowers.MOD_ID, name), block);
}

private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(FantasticFlowers.MOD_ID, name), block);
}

private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
    return Registry.register(Registry.ITEM, new Identifier(FantasticFlowers.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
}


    public static void registerModBlocks(){
        FantasticFlowers.LOGGER.debug("Registering ModBlocks for " + FantasticFlowers.MOD_ID);
    }
}
