package net.emilsg.ffaf.world.gen;

import net.emilsg.ffaf.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import static net.minecraft.world.biome.BiomeKeys.*;

public class ModOreGeneration {
    public static void generateOres()   {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(OCEAN,COLD_OCEAN,DEEP_COLD_OCEAN,DEEP_OCEAN,
        DEEP_FROZEN_OCEAN,DEEP_LUKEWARM_OCEAN,DEEP_LUKEWARM_OCEAN,FROZEN_OCEAN,LUKEWARM_OCEAN,WARM_OCEAN,RIVER,FROZEN_RIVER),
        GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SAND_SALT_ORE_PLACED_KEY);
    }
}
