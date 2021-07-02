package me.xyrophyte.slashsuicide;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlashSuicide extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.BLUE + "Plugin is starting.");

    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "Plugin is shutting down.");
    }
}
