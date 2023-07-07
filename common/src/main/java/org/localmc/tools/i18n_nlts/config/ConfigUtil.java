package org.localmc.tools.i18n_nlts.config;

import dev.architectury.platform.Platform;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

import org.localmc.tools.i18n_nlts.I18nUpdateMod;

public class ConfigUtil {
    private static ModConfigScreen configScreen;

    public static ModConfigScreen getConfig() {
        if (configScreen == null) {
            AutoConfig.register(ModConfigScreen.class, GsonConfigSerializer::new);
            configScreen = AutoConfig.getConfigHolder(ModConfigScreen.class).getConfig();
        }
        return configScreen;
    }

    public static void saveConfig() {
        AutoConfig.getConfigHolder(getConfig().getClass()).save();
    }

    public static void setConfigScreen() {
        Platform.getMod(I18nUpdateMod.MOD_ID).registerConfigurationScreen(parent -> AutoConfig.getConfigScreen(ModConfigScreen.class, parent).get());
    }
}
