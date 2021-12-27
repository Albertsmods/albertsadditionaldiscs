package com.albertsmods.albertsadditionaldiscs.item;

import com.albertsmods.albertsadditionaldiscs.AlbertsAdditionalDiscs;
import com.albertsmods.albertsadditionaldiscs.init.AlbertsadditionaldiscsModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class DuneItem extends RecordItem {
    public DuneItem() {
        super(0, AlbertsadditionaldiscsModSounds.REGISTRY.get(new ResourceLocation("albertsadditionaldiscs:dunedisc")),
                new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
        setRegistryName("dune");
    }


}
