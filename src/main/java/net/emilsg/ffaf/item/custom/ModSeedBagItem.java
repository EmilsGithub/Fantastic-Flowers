package net.emilsg.ffaf.item.custom;


import net.emilsg.ffaf.util.ModItemTags;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;


public class ModSeedBagItem extends Item {

    public ModSeedBagItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        Random random = new Random();
        List<Item> list = Registry.ITEM.stream().filter(item1 -> item1.getDefaultStack().isIn(ModItemTags.FFAF_SEEDS)).toList();

        if(!world.isClient()){
            user.getInventory().insertStack(new ItemStack(list.get(random.nextInt(list.size()))));
            itemStack.decrement(1);
            world.playSound(null, user.getBlockPos(), SoundEvents.ITEM_BUNDLE_REMOVE_ONE, SoundCategory.PLAYERS,1f,1f);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("I wonder what's inside?").formatted(Formatting.YELLOW));
        super.appendTooltip(stack, world, tooltip, context);
    }
}