package net.emilsg.ffaf.block.custom;

import net.emilsg.ffaf.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class ModMustardBlock extends ModCropBlock {

    public ModMustardBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.MUSTARD_SEEDS;
    }
}
