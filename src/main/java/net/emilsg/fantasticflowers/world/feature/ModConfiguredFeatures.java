package net.emilsg.fantasticflowers.world.feature;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.emilsg.fantasticflowers.block.ModBlocks;
import net.emilsg.fantasticflowers.block.custom.ModBlueBerryBushBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;


public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> CLOVERS_PLACED =
            ConfiguredFeatures.register("clovers", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    128, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CLOVERS)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> LIGHT_BLUE_FORGET_ME_NOT_PLACED =
            ConfiguredFeatures.register("light_blue_forget_me_not", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PINK_FORGET_ME_NOT_PLACED =
            ConfiguredFeatures.register("pink_forget_me_not", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_FORGET_ME_NOT)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> WHITE_FORGET_ME_NOT_PLACED =
            ConfiguredFeatures.register("white_forget_me_not", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_FORGET_ME_NOT)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> MAGENTA_LUPINE_PLACED =
            ConfiguredFeatures.register("magenta_lupine", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    112, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_LUPINE)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLUE_LUPINE_PLACED =
            ConfiguredFeatures.register("blue_lupine", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    112, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_LUPINE)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BLUEBERRY_BUSH_PLACED =
            ConfiguredFeatures.register("blueberry_bush", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUEBERRY_BUSH)))) );

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PRICKLY_PEAR_BLOCK_PLACED =
            ConfiguredFeatures.register("prickly_pear_block", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                    32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PRICKLY_PEAR_BLOCK)))) );

    public static void registerConfiguredFeatures(){
        FantasticFlowers.LOGGER.debug("Registering the ModConfiguredFeatures for" + FantasticFlowers.MOD_ID);
    }
}