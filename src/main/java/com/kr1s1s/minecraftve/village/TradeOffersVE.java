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
        //Farmer
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> { // Apprentice
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(ItemsVE.APPLE_PIE, 4),
                    12, 5,0.05F
            ));
        });
        //Fisherman
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 3, factories -> { // Journeyman
            factories.add((entity, random) -> new TradeOffer(
                new TradedItem(Items.EMERALD, 1),
                new ItemStack(ItemsVE.RAW_SQUID, 8),
                16, 10, 0.2F
            ));
        });
    }

}
