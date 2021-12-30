package com.albertsmods.albertsadditionaldiscs.objects.items;

import com.albertsmods.albertsadditionaldiscs.AlbertsAdditionalDiscs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALBERTSADDITIONALDISCS_TAB = new CreativeModeTab("albertsadditionaldiscsModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AlbertsAdditionalDiscs.SOAR_MUSIC_DISC.get());
        }
    };
}
