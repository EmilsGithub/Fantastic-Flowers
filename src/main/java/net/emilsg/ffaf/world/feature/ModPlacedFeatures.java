package net.emilsg.ffaf.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


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



    public static final RegistryEntry<PlacedFeature> SAND_SALT_ORE_PLACED = PlacedFeatures.register("sand_salt_ore_placed",
            ModConfiguredFeatures.SAND_SALT_ORE, modifiersWithCount(32,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(80))));


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
