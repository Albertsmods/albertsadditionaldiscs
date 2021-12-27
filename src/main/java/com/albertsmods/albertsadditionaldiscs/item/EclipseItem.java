
package com.albertsmods.albertsadditionaldiscs.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import com.albertsmods.albertsadditionaldiscs.init.AlbertsadditionaldiscsModSounds;

public class EclipseItem extends RecordItem {
	public EclipseItem() {
		super(0, AlbertsadditionaldiscsModSounds.REGISTRY.get(new ResourceLocation("albertsadditionaldiscs:eclipsedisc")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("eclipse");
	}
}
