package de.kanebot2010.classserver.classserver.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setHome implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at " + sender.getName() + " run spawnpoint " + sender.getName() + " ~ ~ ~");
        sender.sendMessage(">> Set home!");
        return false;
    }
}
