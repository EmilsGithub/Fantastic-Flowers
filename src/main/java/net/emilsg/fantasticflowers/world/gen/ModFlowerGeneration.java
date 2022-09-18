package net.emilsg.fantasticflowers.world.gen;

import net.emilsg.fantasticflowers.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import static net.minecraft.world.biome.BiomeKeys.FOREST;
import static net.minecraft.world.biome.BiomeKeys.JUNGLE;

public class ModFlowerGeneration {
    public static void generateFlowers(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CLOVERS_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LIGHT_BLUE_FORGET_ME_NOT_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_FORGET_ME_NOT_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_FORGET_ME_NOT_PLACED.getKey().get());
    }
}

