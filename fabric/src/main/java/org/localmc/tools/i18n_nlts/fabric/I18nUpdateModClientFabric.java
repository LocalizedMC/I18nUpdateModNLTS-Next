package org.localmc.tools.i18n_nlts.fabric;

import net.fabricmc.api.ClientModInitializer;
import org.localmc.tools.i18n_nlts.I18nUpdateMod;

public class I18nUpdateModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        I18nUpdateMod.clientInit();
    }
}
