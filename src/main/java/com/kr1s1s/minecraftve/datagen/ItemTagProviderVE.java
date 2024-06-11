package com.kr1s1s.minecraftve.datagen;

import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ItemTagProviderVE extends FabricTagProvider.ItemTagProvider {

    public ItemTagProviderVE(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.FISHES) // Fish
                .add(ItemsVE.COOKED_SQUID)
                .add(ItemsVE.RAW_SQUID);
        getOrCreateTagBuilder(ItemTags.CAT_FOOD)
                .add(ItemsVE.COOKED_SQUID)
                .add(ItemsVE.RAW_SQUID);
    }
}
