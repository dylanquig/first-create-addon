/* (C)2025 */
package com.example.examplemod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class NoiseBlock extends Block implements EntityBlock {
  public NoiseBlock(BlockBehaviour.Properties properties) {
    super(properties);
  }

  // Runs every tick. Perhaps check block state, emit Sound events, then we'd need some clever sound
  // design to keep it consistent.
  // docs: https://docs.neoforged.net/docs/blocks/#client-ticking,
  // https://docs.neoforged.net/docs/resources/client/sounds/
  @Override
  public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
    // TODO
    super.animateTick(state, level, pos, random);
  }

  @Override
  public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
    // TODO
    return null;
  }
}
