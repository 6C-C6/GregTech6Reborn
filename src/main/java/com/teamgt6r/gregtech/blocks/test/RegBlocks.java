package com.teamgt6r.gregtech.blocks.test;

import com.teamgt6r.gregtech.GregTech6Reborn;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

public class RegBlocks{
	
  @SubscribeEvent
  public void register(RegisterEvent  event){
    event.register(
    		BuiltInRegistries.BLOCK.key(),
    		registry -> {
    			registry.register(
    					ResourceLocation.fromNamespaceAndPath(GregTech6Reborn.MODID, "b1"),
    					new Block(BlockBehaviour.Properties.of()
    				      //.setId(ResourceKey.create(Registries.BLOCK,registryName))
    				      .destroyTime(2.0f)
    				      .explosionResistance(10.0f)
    				      .sound(SoundType.GRAVEL)));
    		}
    );
  }
}