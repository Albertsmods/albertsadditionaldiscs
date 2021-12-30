package com.albertsmods.albertsadditionaldiscs;

import com.albertsmods.albertsadditionaldiscs.objects.items.AlbertsAdditionalDiscsMusicDisc;
import com.albertsmods.albertsadditionaldiscs.objects.items.ModCreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(AlbertsAdditionalDiscs.MOD_ID)
public class AlbertsAdditionalDiscs {
    public static final String MOD_ID = "albertsadditionaldiscs";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MOD_ID);

    // Disc item

    // Soar
    public static final RegistryObject<Item> SOAR_MUSIC_DISC = ITEMS.register("soar_disc",
            () -> new AlbertsAdditionalDiscsMusicDisc(1, AlbertsAdditionalDiscs.SOAR_DISC_LAZY.get(),
                    new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(ModCreativeModeTab.ALBERTSADDITIONALDISCS_TAB)));

    // Disc sounds

    // Soar
    public static final Lazy<SoundEvent> SOAR_DISC_LAZY = Lazy.of(() -> new SoundEvent(new
            ResourceLocation(AlbertsAdditionalDiscs.MOD_ID, "item.soar_disc")));

    public static final RegistryObject<SoundEvent> SOAR_DISC = SOUNDS.register("item.soar_disc.disc", SOAR_DISC_LAZY);


    public AlbertsAdditionalDiscs() {
        MinecraftForge.EVENT_BUS.register(this);
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("This is an official version of Alberts Additional Discs"); //change to "NEWMODID uses the source code of albertsadditionaldiscs (https://github.com/AlbertsMods/albertsadditionaldiscs)" for copies/ports
    }
}