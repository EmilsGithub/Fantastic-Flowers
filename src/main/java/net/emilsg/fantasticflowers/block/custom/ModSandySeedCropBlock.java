package net.emilsg.fantasticflowers.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModSandySeedCropBlock extends PlantBlock {

    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SAND);
    }

    public ModSandySeedCropBlock(Settings settings) {
        super(settings);
    }

}
