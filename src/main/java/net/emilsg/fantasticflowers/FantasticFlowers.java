package net.emilsg.fantasticflowers;

import net.emilsg.fantasticflowers.block.ModBlocks;
import net.emilsg.fantasticflowers.item.ModItems;
import net.emilsg.fantasticflowers.mixin.ItemAccessor;
import net.emilsg.fantasticflowers.world.feature.ModConfiguredFeatures;
import net.emilsg.fantasticflowers.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasticFlowers implements ModInitializer {
	public static final String MOD_ID = "fantasticflowers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		((ItemAccessor)ModItems.KNIFE).setRecipeRemainder(ModItems.KNIFE);
		((ItemAccessor)ModItems.MORTAR_AND_PESTLE).setRecipeRemainder(ModItems.MORTAR_AND_PESTLE);
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();


	}
}
