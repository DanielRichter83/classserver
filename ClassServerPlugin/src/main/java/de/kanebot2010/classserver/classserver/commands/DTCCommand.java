package de.kanebot2010.classserver.classserver.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class DTCCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int i = 0;
            for (String player : CheckCommand.players) {
                if (player != null) {
                    if (player.equals(sender.getName())) {
                        ItemStack diamonds = new ItemStack(Material.DIAMOND);
                        diamonds.setAmount(CheckCommand.playercoins[i]);
                        ((Player) sender).getInventory().addItem(diamonds);
                        CheckCommand.playercoins[i] = 0;
                    } else {
                        i += 1;
                    }
                } else {
                    i += 1;
                }
            }
            sender.sendMessage(">> Coins in Diamanten getauscht!");
        }
        return false;
    }
}
