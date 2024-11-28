package com.teamgt6r.gregtech;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(GregTech6Reborn.MODID)
public class GregTech6Reborn
{
    
    public static final String MODID = "gregtech6reborn";
    
    private static final Logger LOGGER = LogUtils.getLogger();
 
    public GregTech6Reborn(IEventBus modEventBus, ModContainer modContainer) {

        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        RegBlocks.register(modEventBus);
    }
    
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ServerModEvents{
        
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event){
        
        }
    }
    
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
