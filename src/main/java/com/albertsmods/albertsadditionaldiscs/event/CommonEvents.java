package com.albertsmods.albertsadditionaldiscs.event;

import com.albertsmods.albertsadditionaldiscs.AlbertsAdditionalDiscs;
import com.albertsmods.albertsadditionaldiscs.init.ModPoiTypes;
import com.albertsmods.albertsadditionaldiscs.init.ModProfessions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = AlbertsAdditionalDiscs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModProfessions.fillTradeData();
            ModPoiTypes.registerPOIs();
        });
    }
}
