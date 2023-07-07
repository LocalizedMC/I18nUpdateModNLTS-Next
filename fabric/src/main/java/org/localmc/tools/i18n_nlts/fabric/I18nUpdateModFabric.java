package org.localmc.tools.i18n_nlts.fabric;

import org.localmc.tools.i18n_nlts.I18nUpdateMod;
import net.fabricmc.api.ModInitializer;

public class I18nUpdateModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        I18nUpdateMod.init();
    }
}
