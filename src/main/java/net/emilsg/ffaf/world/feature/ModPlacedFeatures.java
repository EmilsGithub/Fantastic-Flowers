package net.emilsg.ffaf.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;


public class ModPlacedFeatures {
    //Vegetation
    public static final RegistryEntry<PlacedFeature> CLOVERS_PLACED = PlacedFeatures.register("clovers_placed",
            ModConfiguredFeatures.CLOVERS_PLACED, RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> LIGHT_BLUE_FORGET_ME_NOT_PLACED = PlacedFeatures.register("light_blue_forget_me_not_placed",
            ModConfiguredFeatures.LIGHT_BLUE_FORGET_ME_NOT_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> PINK_FORGET_ME_NOT_PLACED = PlacedFeatures.register("pink_forget_me_not_placed",
            ModConfiguredFeatures.PINK_FORGET_ME_NOT_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> WHITE_FORGET_ME_NOT_PLACED = PlacedFeatures.register("white_forget_me_not_placed",
            ModConfiguredFeatures.WHITE_FORGET_ME_NOT_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> MAGENTA_LUPINE = PlacedFeatures.register("magenta_lupine",
            ModConfiguredFeatures.MAGENTA_LUPINE_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> BLUE_LUPINE = PlacedFeatures.register("blue_lupine",
            ModConfiguredFeatures.BLUE_LUPINE_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> WHITE_ROSE_BUSH = PlacedFeatures.register("white_rose_bush",
            ModConfiguredFeatures.WHITE_ROSE_BUSH_PLACED, RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> PRICKLY_PEAR_BLOCK = PlacedFeatures.register("prickly_pear_block",
            ModConfiguredFeatures.PRICKLY_PEAR_BLOCK_PLACED, RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
}
