package com.kr1s1s.minecraftve.datagen;

import com.kr1s1s.minecraftve.VanillaExtracted;
import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProviderVE extends FabricModelProvider {
    public ModelProviderVE(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        VanillaExtracted.LOGGER.info("Generating " + VanillaExtracted.MOD_ID + " block models...");
        VanillaExtracted.LOGGER.info("Generated " + VanillaExtracted.MOD_ID + "block models.");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        VanillaExtracted.LOGGER.info("Generating " + VanillaExtracted.MOD_ID + " item models...");
        itemModelGenerator.register(ItemsVE.APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.GRUEL, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.MILK_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.HOT_COCOA, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.COOKED_SQUID, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.RAW_SQUID, Models.GENERATED);
        VanillaExtracted.LOGGER.info("Generated " + VanillaExtracted.MOD_ID + "item models.");
    }
}
