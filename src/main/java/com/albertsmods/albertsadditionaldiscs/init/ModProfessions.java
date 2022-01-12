package com.albertsmods.albertsadditionaldiscs.init;

import com.albertsmods.albertsadditionaldiscs.AlbertsAdditionalDiscs;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModProfessions {
    public static final DeferredRegister<VillagerProfession> PROFFESIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, AlbertsAdditionalDiscs.MOD_ID);

    public static final RegistryObject<VillagerProfession> DJ = PROFFESIONS.register("dj",
            () -> new VillagerProfession("dj", ModPoiTypes.DJ_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CLERIC));

    // TRADE LISTS
    public static void fillTradeData() {
        // DJ TRADES
        VillagerTrades.ItemListing[] djLevel1 = new VillagerTrades.ItemListing[]{

        };

    }
}
