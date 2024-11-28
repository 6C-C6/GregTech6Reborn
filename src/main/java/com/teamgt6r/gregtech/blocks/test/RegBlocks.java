package com.teamgt6r.gregtech.blocks.test;

import com.teamgt6r.gregtech.GregTech6Reborn;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RegBlocks{
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    BuiltInRegistries.BLOCK,
    GregTech6Reborn.MODID
  );
  public static final DeferredHolder<Block, Block> b1=BLOCKS.register(
    "b1",
    registryName -> new Block(BlockBehaviour.Properties.of()
      //.setId(ResourceKey.create(Registries.BLOCK,registryName))
      .destroyTime(2.0f)
      .explosionResistance(10.0f)
      .sound(SoundType.GRAVEL)
      .lightLevel(state -> 7)
    ));
  public static final void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
  }
}