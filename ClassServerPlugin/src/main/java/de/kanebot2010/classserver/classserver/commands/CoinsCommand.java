package de.kanebot2010.classserver.classserver.commands;

import de.kanebot2010.classserver.classserver.ClassServer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;

public class CoinsCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int i = 0;
        for (String player : CheckCommand.players) {
            if (player != null) {
                sender.sendMessage(">> " + player + ": " + CheckCommand.playercoins[i]);
            }
            i++;
        }
        return false;
    }
    public static String[] getPlayers() {
        return CheckCommand.players;
    }
    public static int[] getPlayercoins() {
        return CheckCommand.playercoins;
    }
}
