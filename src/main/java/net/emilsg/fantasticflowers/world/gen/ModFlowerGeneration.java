package net.emilsg.fantasticflowers.world.gen;

import net.emilsg.fantasticflowers.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import static net.minecraft.world.biome.BiomeKeys.*;

public class ModFlowerGeneration {
    public static void generateFlowers(){
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE,FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CLOVERS_PLACED.getKey().get());
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE,FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LIGHT_BLUE_FORGET_ME_NOT_PLACED.getKey().get());
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE,FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_FORGET_ME_NOT_PLACED.getKey().get());
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,FOREST,JUNGLE,FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_FORGET_ME_NOT_PLACED.getKey().get());
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST,JUNGLE,FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGENTA_LUPINE.getKey().get());
        //noinspection OptionalGetWithoutIsPresent
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,SNOWY_TAIGA,OLD_GROWTH_PINE_TAIGA,OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUEBERRY_BUSH.getKey().get());
    }
}

