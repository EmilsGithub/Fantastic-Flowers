package net.emilsg.ffaf.block.custom;

import net.emilsg.ffaf.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class ModSweetPotatoBlock extends ModCropBlock {

    public ModSweetPotatoBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SWEET_POTATO;
    }
}
