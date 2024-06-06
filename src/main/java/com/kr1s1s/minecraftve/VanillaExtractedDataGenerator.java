package com.kr1s1s.minecraftve;

import com.kr1s1s.datagen.RecipeProviderVE;
import com.kr1s1s.item.ItemsVE;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VanillaExtractedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		VanillaExtracted.LOGGER.info("Initializing " + VanillaExtracted.MOD_ID + "data generator...");
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RecipeProviderVE::new);
		VanillaExtracted.LOGGER.info("Initialized " + VanillaExtracted.MOD_ID + "data generator.");
	}
}
