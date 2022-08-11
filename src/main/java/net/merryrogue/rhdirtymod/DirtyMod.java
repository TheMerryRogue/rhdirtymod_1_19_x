package net.merryrogue.rhdirtymod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.merryrogue.rhdirtymod.block.ModBlocks;
//import net.merryrogue.rhdirtymod.item.ModItems;


public class DirtyMod implements ModInitializer
{
	public static final String MOD_ID = "rhdirtymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		//ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
