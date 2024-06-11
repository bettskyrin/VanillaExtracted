package com.kr1s1s.minecraftve;

import com.kr1s1s.minecraftve.datagen.ItemTagProviderVE;
import com.kr1s1s.minecraftve.datagen.ModelProviderVE;
import com.kr1s1s.minecraftve.datagen.RecipeProviderVE;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VanillaExtractedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		VanillaExtracted.LOGGER.info("Initializing " + VanillaExtracted.MOD_ID + " data generator...");
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RecipeProviderVE::new);
		pack.addProvider(ModelProviderVE::new);
		pack.addProvider(ItemTagProviderVE::new);
		VanillaExtracted.LOGGER.info("Initialized " + VanillaExtracted.MOD_ID + " data generator.");
	}
}
