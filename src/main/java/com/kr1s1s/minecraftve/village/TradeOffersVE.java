package com.kr1s1s.minecraftve.village;

import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class TradeOffersVE {
    public static void modifyTradeOffers() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> { // Farmer Apprentice
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(ItemsVE.APPLE_PIE, 4),
                    12, 5,0.05F
            ));
        });
    }

}
