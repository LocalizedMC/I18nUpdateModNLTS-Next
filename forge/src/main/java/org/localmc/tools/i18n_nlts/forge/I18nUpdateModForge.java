package org.localmc.tools.i18n_nlts.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.localmc.tools.i18n_nlts.I18nUpdateMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(I18nUpdateMod.MOD_ID)
public class I18nUpdateModForge {
    public I18nUpdateModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(I18nUpdateMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        IEventBus modEventBus = EventBuses.getModEventBus(I18nUpdateMod.MOD_ID).get();

        modEventBus.addListener(this::onInitialize);
        modEventBus.addListener(this::onInitializeClient);
    }

    public void onInitialize(FMLCommonSetupEvent event) {
        I18nUpdateMod.init();
    }

    public void onInitializeClient(FMLClientSetupEvent event) {
        I18nUpdateMod.clientInit();
    }
}
