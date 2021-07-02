package me.xyrophyte.slashsuicide.commands;

import me.xyrophyte.slashsuicide.SlashSuicide;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Suicide implements CommandExecutor {

    private final SlashSuicide instance;

    public Suicide(SlashSuicide instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("slashsuicide.suicide")) {
                if(args.length == 0) {
                    player.setHealth(0);
                    player.sendMessage(ChatColor.GOLD + "Goodbye Cruel World.");
                } else {
                    return true;
                }
            } else {
                player.sendMessage(ChatColor.RED + "Failed to run command. You do not have enough permission. Please contact an administrator if you believe this is an error.");
            }
        } else {
            instance.getLogger().info(ChatColor.GOLD + "Failed to run command. Command is player only.");
        }
        return true;
    }
}
