package com.kr1s1s.item;

import com.kr1s1s.component.type.FoodComponentsVE;
import com.kr1s1s.minecraftve.VanillaExtracted;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemsVE {
    public static Item APPLE_PIE;

    static {
        APPLE_PIE = register("apple_pie", new Item((new Item.Settings()).food(FoodComponentsVE.APPLE_PIE)));
    }

    public static Item register(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaExtracted.MOD_ID, path), item);
    }

    public static void registerItems() {
        VanillaExtracted.LOGGER.info("Registering " + VanillaExtracted.MOD_ID + " items.");
        ItemGroupsVE.updateItemGroups();
        VanillaExtracted.LOGGER.info("Registered " + VanillaExtracted.MOD_ID + " items.");

    }
}
