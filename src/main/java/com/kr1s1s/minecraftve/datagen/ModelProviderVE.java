package com.kr1s1s.minecraftve.datagen;

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

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemsVE.APPLE_PIE, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.COOKED_SQUID, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.MILK_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.RAW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ItemsVE.HOT_COCOA, Models.GENERATED);
    }
}
