package net.timeworndevs.winter_realm;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.winter_realm.common.CommonBlocks;
import net.timeworndevs.winter_realm.common.CommonItemGroups;
import net.timeworndevs.winter_realm.common.CommonItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "winter_realm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("It's getting cold enough for Avali to play around here :D");

		LOGGER.info("Initializing blocks");
		CommonBlocks.init();
		LOGGER.info("Initialized blocks!");

		LOGGER.info("Initializing items");
		CommonItems.init();
		LOGGER.info("Initialized items!");

		LOGGER.info("Initializing groups");
		CommonItemGroups.init();
		LOGGER.info("Initialized groups!");

	}
}
