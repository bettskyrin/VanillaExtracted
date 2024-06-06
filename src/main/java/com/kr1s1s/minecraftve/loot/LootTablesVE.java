package com.kr1s1s.minecraftve.loot;

import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

import java.util.function.Consumer;

public class LootTablesVE {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((key, tableBuilder, source) -> {
            /* Structures */
            /* * Villages * */
            if(source.isBuiltin() && LootTables.VILLAGE_PLAINS_CHEST.equals(key)) {
                LootPool.Builder poolbuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ItemsVE.APPLE_PIE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());
                tableBuilder.modifyPools((Consumer<? super LootPool.Builder>) poolbuilder).pool(poolbuilder.build()); // FIXME
            }
        }));
    }
}
