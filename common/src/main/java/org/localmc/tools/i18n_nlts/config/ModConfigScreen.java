package org.localmc.tools.i18n_nlts.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import org.localmc.tools.i18n_nlts.I18nUpdateMod;

@Config(name = I18nUpdateMod.MOD_ID)
public class ModConfigScreen implements ConfigData {
    public boolean autoSwitchLanguage = true;
    public String downloadLink = "http://downloader1.meitangdehulu.com:22943";
    public String resourcePackName = "Minecraft-Mod-Language-Modpack-1-19";
    public String md5Name = "1.19";
}
