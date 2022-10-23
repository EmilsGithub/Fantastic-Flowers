package net.emilsg.ffaf.block.custom;

import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class ModCropBlock extends CropBlock {

    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public ModCropBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
