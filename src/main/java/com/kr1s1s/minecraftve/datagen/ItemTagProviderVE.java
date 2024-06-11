package com.kr1s1s.minecraftve.datagen;

import com.kr1s1s.minecraftve.VanillaExtracted;
import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProviderVE extends FabricTagProvider.ItemTagProvider {

    public ItemTagProviderVE(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        VanillaExtracted.LOGGER.info("Generating " + VanillaExtracted.MOD_ID + " item tags...");
        getOrCreateTagBuilder(ItemTags.FISHES) // Fish
                .add(ItemsVE.COOKED_SQUID)
                .add(ItemsVE.RAW_SQUID);
        getOrCreateTagBuilder(ItemTags.CAT_FOOD) // Cat Food
                .add(ItemsVE.COOKED_SQUID)
                .add(ItemsVE.RAW_SQUID);
        VanillaExtracted.LOGGER.info("Generated " + VanillaExtracted.MOD_ID + " item tags.");
    }
}
