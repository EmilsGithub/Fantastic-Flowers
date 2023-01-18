package net.emilsg.ffaf;

import net.emilsg.ffaf.block.ModBlocks;
import net.emilsg.ffaf.item.ModItemGroup;
import net.emilsg.ffaf.item.ModItems;
import net.emilsg.ffaf.mixin.ItemAccessor;
import net.emilsg.ffaf.util.ModLootTableModifiers;
import net.emilsg.ffaf.util.ModRegistries;
import net.emilsg.ffaf.world.feature.ModConfiguredFeatures;
import net.emilsg.ffaf.world.gen.ModOreGeneration;
import net.emilsg.ffaf.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasticFlowersAndFarming implements ModInitializer {
	public static final String MOD_ID = "ffaf";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModRegistries.registerModstuffs();

		ModWorldGen.generateModWorldGen();


	}
}
