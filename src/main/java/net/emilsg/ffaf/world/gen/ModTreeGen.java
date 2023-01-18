package net.emilsg.ffaf.world.gen;

import net.emilsg.ffaf.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import static net.minecraft.world.biome.BiomeKeys.FOREST;
import static net.minecraft.world.biome.BiomeKeys.PLAINS;

public class ModTreeGen {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(PLAINS, FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.APPLE_TREE_PLACED_KEY);
    }
}
