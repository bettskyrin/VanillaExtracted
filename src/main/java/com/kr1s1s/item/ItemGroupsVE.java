package com.kr1s1s.item;

import com.kr1s1s.minecraftve.VanillaExtracted;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemGroupsVE {
    private static void itemGroupFood(FabricItemGroupEntries entries) {
        entries.addBefore(Items.PUMPKIN_PIE, ItemsVE.APPLE_PIE);
    }

    public static void updateItemGroups() {
        VanillaExtracted.LOGGER.info("Updating item groups...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ItemGroupsVE::itemGroupFood);
        VanillaExtracted.LOGGER.info("Updated item groups.");
    }
}
