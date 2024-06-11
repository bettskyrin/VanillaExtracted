package com.kr1s1s.minecraftve.component.type;

import net.minecraft.component.type.FoodComponent;

public class FoodComponentsVE {
    public static final FoodComponent APPLE_PIE = (new FoodComponent.Builder()).nutrition(8).saturationModifier(4.8F).build();
    public static final FoodComponent COOKED_SQUID = (new FoodComponent.Builder()).nutrition(5).saturationModifier(6.0F).build();
    public static final FoodComponent RAW_SQUID = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.8F).build();
}
