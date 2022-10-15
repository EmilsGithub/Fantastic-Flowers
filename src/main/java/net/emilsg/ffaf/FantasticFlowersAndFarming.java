package net.emilsg.ffaf;

import net.emilsg.ffaf.block.ModBlocks;
import net.emilsg.ffaf.item.ModItems;
import net.emilsg.ffaf.mixin.ItemAccessor;
import net.emilsg.ffaf.world.feature.ModConfiguredFeatures;
import net.emilsg.ffaf.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasticFlowersAndFarming implements ModInitializer {
	public static final String MOD_ID = "ffaf";
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
