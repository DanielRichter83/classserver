package de.kanebot2010.classserver.classserver.commands;

import de.kanebot2010.classserver.classserver.ClassServer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player psender=(Player)sender;
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at " + psender.getName() + " run spawnpoint " + psender.getName() + " ~ ~ ~");
        return false;
    }
}
