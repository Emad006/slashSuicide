package me.xyrophyte.slashsuicide;

import me.xyrophyte.slashsuicide.commands.Suicide;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SlashSuicide extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.BLUE + "Plugin is starting.");
        Objects.requireNonNull(getCommand("suicide")).setExecutor(new Suicide(this));
        getLogger().info(ChatColor.BLUE + "Plugin started successfully.");
        getLogger().info(ChatColor.AQUA + "For support, join:");
        getLogger().info(ChatColor.GOLD + "https://discord.gg/dpYrXXWWrM");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "Plugin is shutting down.");
    }
}
