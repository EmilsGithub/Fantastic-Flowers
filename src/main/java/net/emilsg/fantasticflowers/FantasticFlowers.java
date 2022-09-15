package net.emilsg.fantasticflowers;

import net.emilsg.fantasticflowers.block.ModBlocks;
import net.emilsg.fantasticflowers.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasticFlowers implements ModInitializer {
	public static final String MOD_ID = "fantasticflowers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
