package com.albertsmods.albertsadditionaldiscs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

import com.albertsmods.albertsadditionaldiscs.item.HopItem;
import com.albertsmods.albertsadditionaldiscs.item.EclipseItem;
import com.albertsmods.albertsadditionaldiscs.item.DuneItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlbertsadditionaldiscsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item HOP = register(new HopItem());
	public static final Item DUNE = register(new DuneItem());
	public static final Item ECLIPSE = register(new EclipseItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
