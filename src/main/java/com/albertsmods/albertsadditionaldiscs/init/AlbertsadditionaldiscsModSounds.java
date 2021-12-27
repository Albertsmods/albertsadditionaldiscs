package com.albertsmods.albertsadditionaldiscs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlbertsadditionaldiscsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("albertsadditionaldiscs", "hopdisc"),
				new SoundEvent(new ResourceLocation("albertsadditionaldiscs", "hopdisc")));
		REGISTRY.put(new ResourceLocation("albertsadditionaldiscs", "dunedisc"),
				new SoundEvent(new ResourceLocation("albertsadditionaldiscs", "dunedisc")));
		REGISTRY.put(new ResourceLocation("albertsadditionaldiscs", "eclipsedisc"),
				new SoundEvent(new ResourceLocation("albertsadditionaldiscs", "eclipsedisc")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
