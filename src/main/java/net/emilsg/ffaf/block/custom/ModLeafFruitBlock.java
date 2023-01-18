package net.emilsg.ffaf.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class ModLeafFruitBlock extends ModCropBlock implements Fertilizable{
    public static final IntProperty DISTANCE = IntProperty.of("distance", 1, 7);
    private static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    public ModLeafFruitBlock(Settings settings) {
        super(settings);
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(this);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return true;
    }

     @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
         return true;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    @Deprecated
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos, updateDistanceFromLogs(state, world, pos), 3);
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        int i = getDistanceFromLog(neighborState) + 1;
        if (i != 1 || (Integer)state.get(DISTANCE) != i) {
            world.scheduleBlockTick(pos, this, 1);
        }

        return state;
    }

    private static BlockState updateDistanceFromLogs(BlockState state, WorldAccess world, BlockPos pos) {
        int i = 7;
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        Direction[] var5 = Direction.values();
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Direction direction = var5[var7];
            mutable.set(pos, direction);
            i = Math.min(i, getDistanceFromLog(world.getBlockState(mutable)) + 1);
            if (i == 1) {
                break;
            }
        }

        return (BlockState)state.with(DISTANCE, i);
    }

    private static int getDistanceFromLog(BlockState state) {
        if (state.isIn(BlockTags.LOGS)) {
            return 0;
        } else {
            return state.getBlock() instanceof ModLeafFruitBlock || state.getBlock() instanceof LeavesBlock ? state.get(DISTANCE) : 7;
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = this.getAge(state);
        if (i < this.getMaxAge()) {
            if (random.nextInt(40) == 0) {
                world.setBlockState(pos, this.withAge(i + 1), 2);
            }
        }
        if (this.shouldDecay(state)) {
            dropStacks(state, world, pos);
            world.removeBlock(pos, false);
        }
    }

    protected boolean shouldDecay(BlockState state) {
        return (Integer)state.get(DISTANCE) == 7;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, DISTANCE);
    }

    @Override
    @Deprecated
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 1;
    }

    @Override
    @Deprecated
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = (Integer)state.get(AGE);
        boolean bl = i == 3;
        if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        } else if (i > 1) {
            int j = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(Items.APPLE, j + (bl ? 1 : 0)));
            world.playSound((PlayerEntity)null, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = (BlockState)state.with(AGE, 0);
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }

}
