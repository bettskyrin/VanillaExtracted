package com.kr1s1s.minecraftve.datagen;

import com.kr1s1s.minecraftve.item.ItemGroupsVE;
import com.kr1s1s.minecraftve.item.ItemsVE;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class RecipeProviderVE extends FabricRecipeProvider {
    public RecipeProviderVE(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Food
        // Apple Pie
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemsVE.APPLE_PIE, 1)
                .input(Items.APPLE)
                .input(Items.SUGAR)
                .input(Items.EGG)
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter);
        // Milk Bottle
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemsVE.MILK_BOTTLE, 4)
                .input(Items.GLASS_BOTTLE, 4)
                .input(Items.MILK_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET), FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);
        // Hot Cocoa
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemsVE.HOT_COCOA, 4)
                .input(Items.COCOA_BEANS)
                .input(Items.SUGAR)
                .input(ItemsVE.MILK_BOTTLE, 4)
                .criterion(FabricRecipeProvider.hasItem(Items.COCOA_BEANS), FabricRecipeProvider.conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemsVE.HOT_COCOA, 4)
                .input(Items.COCOA_BEANS)
                .input(Items.SUGAR)
                .input(Items.GLASS_BOTTLE, 4)
                .input(Items.MILK_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(Items.COCOA_BEANS), FabricRecipeProvider.conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, Identifier.of("hot_cocoa_from_milk_bucket"));
        // Squid
        offerSmelting(exporter, ItemGroupsVE.SQUID, RecipeCategory.FOOD, ItemsVE.COOKED_SQUID, 0.35f, 200, "squid");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ItemsVE.RAW_SQUID), RecipeCategory.FOOD, ItemsVE.COOKED_SQUID, 0.35f, 100)
                .criterion(FabricRecipeProvider.hasItem(ItemsVE.RAW_SQUID), FabricRecipeProvider.conditionsFromItem(ItemsVE.RAW_SQUID))
                .offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ItemsVE.RAW_SQUID), RecipeCategory.FOOD, ItemsVE.COOKED_SQUID, 0, 600)
                .criterion(FabricRecipeProvider.hasItem(ItemsVE.RAW_SQUID), FabricRecipeProvider.conditionsFromItem(ItemsVE.RAW_SQUID))
                .offerTo(exporter, Identifier.of("cooked_squid_from_campfire"));

    }
}
