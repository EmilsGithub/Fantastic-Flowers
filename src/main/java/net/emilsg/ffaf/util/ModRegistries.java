package net.emilsg.ffaf.util;

import net.emilsg.ffaf.item.ModItems;
import net.emilsg.ffaf.mixin.ItemAccessor;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerModstuffs() {
        registerCustomTrades();
        registerUtensils();
    }

    private static void registerUtensils() {
        ((ItemAccessor)ModItems.KNIFE).setRecipeRemainder(ModItems.KNIFE);
        ((ItemAccessor)ModItems.MORTAR_AND_PESTLE).setRecipeRemainder(ModItems.MORTAR_AND_PESTLE);
        ((ItemAccessor)ModItems.FRYING_PAN).setRecipeRemainder(ModItems.FRYING_PAN);
        ((ItemAccessor)ModItems.BUTCHER_KNIFE).setRecipeRemainder(ModItems.BUTCHER_KNIFE);
        ((ItemAccessor)ModItems.COOKING_POT).setRecipeRemainder(ModItems.COOKING_POT);
        ((ItemAccessor)ModItems.WAFFLE_IRON).setRecipeRemainder(ModItems.WAFFLE_IRON);
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.SEED_BAG, 1),
                    6, 5, 0.1f));
                });
    }
}
