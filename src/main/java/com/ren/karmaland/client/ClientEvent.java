package com.ren.karmaland.client;

import com.ren.karmaland.Karmaland;
import com.ren.karmaland.common.item.armor.NightWolfArmor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Karmaland.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvent {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        armorModel();
    }

    private static void armorModel(){
        NightWolfArmor.initArmorModel();
    }

}
