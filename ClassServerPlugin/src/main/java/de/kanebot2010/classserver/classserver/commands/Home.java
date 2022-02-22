package de.kanebot2010.classserver.classserver.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Home implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule keepInventory true");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule doImmediateRespawn true");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kill " + sender.getName());
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule keepInventory false");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule doImmediateRespawn false");
        return false;
    }
}
