package net.emilsg.ffaf.world.feature;

import net.emilsg.ffaf.FantasticFlowersAndFarming;
import net.emilsg.ffaf.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> APPLE_TREE_CHECKED_KEY = registerKey("apple_tree_checked");
    public static final RegistryKey<PlacedFeature> APPLE_TREE_PLACED_KEY = registerKey("apple_tree_placed");

    public static final RegistryKey<PlacedFeature> CLOVERS_PLACED_KEY = registerKey("clovers_placed");
    public static final RegistryKey<PlacedFeature> LIGHT_BLUE_FORGET_ME_NOT_PLACED_KEY = registerKey("light_blue_forget_me_not_placed");
    public static final RegistryKey<PlacedFeature> PINK_FORGET_ME_NOT_PLACED_KEY = registerKey("pink_forget_me_not_placed");
    public static final RegistryKey<PlacedFeature> WHITE_FORGET_ME_NOT_PLACED_KEY = registerKey("white_forget_me_not_placed");
    public static final RegistryKey<PlacedFeature> MAGENTA_LUPINE_PLACED_KEY = registerKey("magenta_lupine_placed");
    public static final RegistryKey<PlacedFeature> BLUE_LUPINE_PLACED_KEY = registerKey("blue_lupine_placed");
    public static final RegistryKey<PlacedFeature> WHITE_ROSE_BUSH_PLACED_KEY = registerKey("white_rose_bush_placed");
    public static final RegistryKey<PlacedFeature> TRUFFLE_CROP_PLACED_KEY = registerKey("truffle_crop_placed");
    public static final RegistryKey<PlacedFeature> PRICKLY_PEAR_BLOCK_PLACED_KEY = registerKey("prickly_pear_block_placed");

    public static final RegistryKey<PlacedFeature> SAND_SALT_ORE_PLACED_KEY = registerKey("sand_salt_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, APPLE_TREE_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.APPLE_TREE_KEY),
                List.of(PlacedFeatures.wouldSurvive(ModBlocks.APPLE_TREE_SAPLING)));
        register(context, APPLE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.APPLE_TREE_KEY),
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));

        register(context, CLOVERS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CLOVERS_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, LIGHT_BLUE_FORGET_ME_NOT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LIGHT_BLUE_FORGET_ME_NOT_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, PINK_FORGET_ME_NOT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINK_FORGET_ME_NOT_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, WHITE_FORGET_ME_NOT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_FORGET_ME_NOT_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, MAGENTA_LUPINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGENTA_LUPINE_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUE_LUPINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_LUPINE_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, WHITE_ROSE_BUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_ROSE_BUSH_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, TRUFFLE_CROP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TRUFFLE_CROP_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, PRICKLY_PEAR_BLOCK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PRICKLY_PEAR_BLOCK_KEY),
                RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SAND_SALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAND_SALT_ORE_KEY),
                modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(80))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(FantasticFlowersAndFarming.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
