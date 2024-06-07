package com.kr1s1s.minecraftve.item;

import com.kr1s1s.minecraftve.VanillaExtracted;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemGroupsVE {
    public static void itemGroupFood(FabricItemGroupEntries entries) { // Item Groups
        entries.addBefore(Items.PUMPKIN_PIE, ItemsVE.APPLE_PIE);
        entries.addAfter(Items.MILK_BUCKET, ItemsVE.HOT_COCOA);
        entries.addAfter(Items.MILK_BUCKET, ItemsVE.MILK_BOTTLE);
    }

    public static void registerCompostableItem() { // Compostables
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ItemsVE.APPLE_PIE, 1.0F);
    }

    public static void updateItemGroups() {
        VanillaExtracted.LOGGER.info("Updating item groups...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ItemGroupsVE::itemGroupFood);
        registerCompostableItem();
        VanillaExtracted.LOGGER.info("Updated item groups.");
    }
}
