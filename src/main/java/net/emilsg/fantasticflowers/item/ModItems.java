package net.emilsg.fantasticflowers.item;

import net.emilsg.fantasticflowers.FantasticFlowers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {





    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FantasticFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasticFlowers.LOGGER.info("Registering Mod Items For " + FantasticFlowers.MOD_ID);
    }

}
