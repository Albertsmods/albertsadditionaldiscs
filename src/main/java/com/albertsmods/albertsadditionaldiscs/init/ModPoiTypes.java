package com.albertsmods.albertsadditionaldiscs.init;

import com.albertsmods.albertsadditionaldiscs.AlbertsAdditionalDiscs;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModPoiTypes {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, AlbertsAdditionalDiscs.MOD_ID);

    public static final RegistryObject<PoiType> DJ_POI = POI_TYPES.register("dj", () -> new PoiType("dj", PoiType.getBlockStates(BlockInit.DJ_BOOTH.get()), 1, 1));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, DJ_POI.get());
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
