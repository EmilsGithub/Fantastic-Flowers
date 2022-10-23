package net.emilsg.ffaf.block.custom;

import net.emilsg.ffaf.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class ModBlueberryBlock extends ModCropBlock {

    public ModBlueberryBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.BLUEBERRY_SEEDS;
    }
}
