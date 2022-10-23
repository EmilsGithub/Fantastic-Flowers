package net.emilsg.ffaf.util;

import net.emilsg.ffaf.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ABANDONED_MINESHAFT_CHEST_ID = new Identifier("minecraft","chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY_CHEST_ID = new Identifier("minecraft","chests/ancient_city");
    private static final Identifier ANCIENT_CITY_ICE_BOX_CHEST_ID = new Identifier("minecraft","chests/ancient_city_ice_box");
    private static final Identifier BASTION_BRIDGE_CHEST_ID = new Identifier("minecraft","chests/bastion_bridge");
    private static final Identifier BASTION_HOGLIN_STABLE_CHEST_ID = new Identifier("minecraft","chests/bastion_hoglin_stable");
    private static final Identifier BASTION_OTHER_CHEST_ID = new Identifier("minecraft","chests/bastion_other");
    private static final Identifier BASTION_TREASURE_CHEST_ID = new Identifier("minecraft","chests/bastion_treasure");
    private static final Identifier DESERT_PYRAMID_CHEST_ID = new Identifier("minecraft","chests/desert_pyramid");
    private static final Identifier END_CITY_TRESURE_CHEST_ID = new Identifier("minecraft","chests/end_city_treasure");
    private static final Identifier JUNGLE_TEMPLE_CHEST_ID = new Identifier("minecraft","chests/jungle_temple");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID = new Identifier("minecraft","chests/igloo_chest");
    private static final Identifier NETHER_BRIDGE_CHEST_ID = new Identifier("minecraft","chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST_CHEST_ID = new Identifier("minecraft","chests/pillager_outpost");
    private static final Identifier RUINED_PORTAL_CHEST_ID = new Identifier("minecraft","chests/ruined_portal");
    private static final Identifier SHIPWRECK_SUPPLY_CHEST_ID = new Identifier("minecraft","chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TREASURE_CHEST_ID = new Identifier("minecraft","chests/shipwreck_treasure");
    private static final Identifier SPAWN_BONUS_CHEST_CHEST_ID = new Identifier("minecraft","chests/spawn_bonus_chest");
    private static final Identifier STRONGHOLD_CORRIDOR_CHEST_ID = new Identifier("minecraft","chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_CHEST_ID = new Identifier("minecraft","chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_RUIN_BIG_CHEST_ID = new Identifier("minecraft","chests/stronghold_ruin_big");
    private static final Identifier STRONGHOLD_RUIN_SMALL_CHEST_ID = new Identifier("minecraft","chests/stronghold_ruin_small");

    private static final Identifier VILLAGE_ARMORER_CHEST_ID = new Identifier("minecraft","chests/village/village_armorer");
    private static final Identifier VILLAGE_BUTCHER_CHEST_ID = new Identifier("minecraft","chests/village/village_butcher");
    private static final Identifier VILLAGE_CARTOGRAPHER_CHEST_ID = new Identifier("minecraft","chests/village/village_cartographer");
    private static final Identifier VILLAGE_DESERT_HOUSE_CHEST_ID = new Identifier("minecraft","chests/village/village_desert_house");
    private static final Identifier VILLAGE_FISHER_CHEST_ID = new Identifier("minecraft","chests/village/village_fisher");
    private static final Identifier VILLAGE_FLETCHER_CHEST_ID = new Identifier("minecraft","chests/village/village_fletcher");
    private static final Identifier VILLAGE_MASON_CHEST_ID = new Identifier("minecraft","chests/village/village_mason");
    private static final Identifier VILLAGE_PLAINS_HOUSE_CHEST_ID = new Identifier("minecraft","chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_CHEST_ID = new Identifier("minecraft","chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SHEPHERD_CHEST_ID = new Identifier("minecraft","chests/village/village_shepherd");
    private static final Identifier VILLAGE_SNOWY_HOUSE_CHEST_ID = new Identifier("minecraft","chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE_CHEST_ID = new Identifier("minecraft","chests/village/village_taiga_house");
    private static final Identifier VILLAGE_TANNERY_CHEST_ID = new Identifier("minecraft","chests/village/village_tannery");
    private static final Identifier VILLAGE_TEMPLE_CHEST_ID = new Identifier("minecraft","chests/village/village_temple");
    private static final Identifier VILLAGE_TOOLSMITH_CHEST_ID = new Identifier("minecraft","chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_CHEST_ID = new Identifier("minecraft","chests/village/village_weaponsmith");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (ABANDONED_MINESHAFT_CHEST_ID.equals(id)){
        LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
        builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
        (2f, 4f)).build());
        tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (ANCIENT_CITY_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (ANCIENT_CITY_ICE_BOX_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (BASTION_BRIDGE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (BASTION_HOGLIN_STABLE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (BASTION_OTHER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (BASTION_TREASURE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (DESERT_PYRAMID_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (END_CITY_TRESURE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (JUNGLE_TEMPLE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (IGLOO_STRUCTURE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (NETHER_BRIDGE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (PILLAGER_OUTPOST_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (RUINED_PORTAL_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (SHIPWRECK_SUPPLY_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (SHIPWRECK_TREASURE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (SPAWN_BONUS_CHEST_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (STRONGHOLD_CORRIDOR_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (STRONGHOLD_CROSSING_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (STRONGHOLD_RUIN_BIG_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (STRONGHOLD_RUIN_SMALL_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});


//Village
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_ARMORER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_BUTCHER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_CARTOGRAPHER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_DESERT_HOUSE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_FISHER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_FLETCHER_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_MASON_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_PLAINS_HOUSE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_SAVANNA_HOUSE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_SHEPHERD_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_SNOWY_HOUSE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_TAIGA_HOUSE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_TANNERY_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_TEMPLE_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_TOOLSMITH_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> { if (VILLAGE_WEAPONSMITH_CHEST_ID.equals(id)){
            LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.
                    builder(0.5f)).with(ItemEntry.builder(ModItems.SEED_BAG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create
                    (2f, 4f)).build());
            tableBuilder.pool(poolBuilder.build());
        }});
    }
}