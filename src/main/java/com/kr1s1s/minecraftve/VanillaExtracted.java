package com.kr1s1s.minecraftve;

import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExtracted implements ModInitializer {
	public static final String MOD_ID = "minecraftve";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + " files...");
		ItemsVE.registerItems();
		LOGGER.info("Initialized " + MOD_ID + "files.");
	}
}