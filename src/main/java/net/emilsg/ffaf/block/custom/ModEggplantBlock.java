package net.emilsg.ffaf.block.custom;

import net.emilsg.ffaf.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class ModEggplantBlock extends ModCropBlock {

    public ModEggplantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.EGGPLANT_SEEDS;
    }
}
