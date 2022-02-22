package de.kanebot2010.classserver.classserver.commands;

import de.kanebot2010.classserver.classserver.ClassServer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;

public class CheckCommand implements CommandExecutor{
    public static String[] onlineplayers = new String[30];
    public static String[] players = new String[30];
    public static int[] playercoins = ClassServer.getPlayercoins();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int i = 0;
        for (Player onPlayer : Bukkit.getOnlinePlayers())  {
            onlineplayers[i] = onPlayer.getName();
            sender.sendMessage(">> OnlinePlayer " + (i + 1)  + ": "+ onlineplayers[i]);
            i++;
        }
        i = 0;
        for (String player : players) {
            if (player != null) {
                sender.sendMessage(">> Player " + (i + 1)  + ": "+ players[i]);
            }
            i++;
        }
        return false;
    }
}