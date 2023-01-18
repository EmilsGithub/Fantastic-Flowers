package net.emilsg.ffaf.world.feature;


import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class ModConfiguredFeatures {

    //Flowers and Plants

    public static final RegistryKey<ConfiguredFeature<?,?>> LIGHT_BLUE_FORGET_ME_NOT_KEY = registerKey("light_blue_forget_me_not");
    public static final RegistryKey<ConfiguredFeature<?,?>> PINK_FORGET_ME_NOT_KEY = registerKey("pink_forget_me_not");
    public static final RegistryKey<ConfiguredFeature<?,?>> WHITE_FORGET_ME_NOT_KEY = registerKey("white_forget_me_not");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAGENTA_LUPINE_KEY = registerKey("magenta_lupine");
    public static final RegistryKey<ConfiguredFeature<?,?>> BLUE_LUPINE_KEY = registerKey("blue_lupine");
    public static final RegistryKey<ConfiguredFeature<?,?>> WHITE_ROSE_BUSH_KEY = registerKey("white_rose_bush");
    public static final RegistryKey<ConfiguredFeature<?,?>> CLOVERS_KEY = registerKey("clovers");
    public static final RegistryKey<ConfiguredFeature<?,?>> TRUFFLE_CROP_KEY = registerKey("truffle_crop");
    public static final RegistryKey<ConfiguredFeature<?,?>> PRICKLY_PEAR_BLOCK_KEY = registerKey("prickly_pear_block");

    public static final RegistryKey<ConfiguredFeature<?,?>> APPLE_TREE_KEY = registerKey("apple_tree");
    public static final RegistryKey<ConfiguredFeature<?,?>> APPLE_TREE_SPAWN_KEY = registerKey("apple_tree_spawn");

    public static final RegistryKey<ConfiguredFeature<?,?>> SAND_SALT_ORE_KEY = registerKey("sand_salt_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RuleTest sandReplaceable = new BlockMatchRuleTest(Blocks.SAND);

        List<OreFeatureConfig.Target> sandSaltOres =
                List.of(OreFeatureConfig.createTarget(sandReplaceable, ModBlocks.SAND_SALT_ORE.getDefaultState()));

        register(context, LIGHT_BLUE_FORGET_ME_NOT_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT)))));

        register(context, PINK_FORGET_ME_NOT_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_FORGET_ME_NOT)))));

        register(context, WHITE_FORGET_ME_NOT_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_FORGET_ME_NOT)))));

        register(context, MAGENTA_LUPINE_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                112, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_LUPINE)))));

        register(context, BLUE_LUPINE_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                112, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_LUPINE)))));

        register(context, WHITE_ROSE_BUSH_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                112, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_ROSE_BUSH)))));

        register(context, CLOVERS_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                128, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CLOVERS)))) );

        register(context, TRUFFLE_CROP_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TRUFFLE_CROP)))));

        register(context, PRICKLY_PEAR_BLOCK_KEY, Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(
                32, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PRICKLY_PEAR_BLOCK)))));

        register(context, SAND_SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(sandSaltOres, 12));

        register(context, APPLE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.APPLE_TREE_LOG),
                new StraightTrunkPlacer(5, 1, 0),
                BlockStateProvider.of(ModBlocks.APPLE_TREE_FRUIT_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, APPLE_TREE_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.APPLE_TREE_CHECKED_KEY),
                        0.5f)), placedFeatureRegistryEntryLookup.getOrThrow(ModPlacedFeatures.APPLE_TREE_CHECKED_KEY)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(FantasticFlowersAndFarming.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}