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

public class SevenAxeBuy implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int i = 0;
        int costs = 100;
        Player player = (Player) sender;
        if (sender instanceof Player) {
            ItemStack sevenaxe = new ItemStack(Material.NETHERITE_AXE, 1);
            ItemMeta meta = sevenaxe.getItemMeta();
            meta.setDisplayName(ChatColor.BLUE + "SevenAxe");
            meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
            ArrayList<String> lore = new ArrayList<>();
            lore.add(" ");
            lore.add(ChatColor.GRAY + ">> Die " + ChatColor.RED + "stärkste" + ChatColor.GRAY + " Axt im Spiel!");
            lore.add(" ");
            meta.setLore(lore);
            sevenaxe.setItemMeta(meta);
            for (String player2 : CheckCommand.players) {
                if (player.getName().equals(player2)) {
                    if (CheckCommand.playercoins[i] >= costs) {
                        CheckCommand.playercoins[i] -= costs;
                        player.getInventory().addItem(sevenaxe);
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat die SevenAxe erhalten!");
                    } else {
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat zu wenig Coins um sich die SevenAxe zu kaufen!");
                    }
                }
                i++;
            }
        }
        return false;
    }
}
