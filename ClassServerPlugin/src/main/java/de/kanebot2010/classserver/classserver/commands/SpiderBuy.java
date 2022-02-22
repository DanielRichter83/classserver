package de.kanebot2010.classserver.classserver.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SpiderBuy implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int i = 0;
        int costs = 250;
        Player player = (Player) sender;
        if (sender instanceof Player) {
            ItemStack spawner = new ItemStack(Material.SPAWNER, 1);
            ItemStack egg = new ItemStack(Material.SPIDER_SPAWN_EGG, 1);
            for (String player2 : CheckCommand.players) {
                if (player.getName().equals(player2)) {
                    if (CheckCommand.playercoins[i] >= costs) {
                        CheckCommand.playercoins[i] -= costs;
                        player.getInventory().addItem(spawner);
                        player.getInventory().addItem(egg);
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat den SpiderSpawner erhalten!");
                    } else {
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat zu wenig Coins um sich den SpiderSpawner zu kaufen!");
                    }
                }
                i++;
            }
        }
        return false;
    }
}
