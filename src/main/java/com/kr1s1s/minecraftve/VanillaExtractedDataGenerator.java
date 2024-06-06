package com.kr1s1s.minecraftve;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VanillaExtractedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		VanillaExtracted.LOGGER.info("Initializing " + VanillaExtracted.MOD_ID + "data generator...");

		VanillaExtracted.LOGGER.info("Initialized " + VanillaExtracted.MOD_ID + "data generator.");
	}
}
