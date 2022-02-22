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

public class SevenHelmetBuy implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int i = 0;
        int costs = 75;
        Player player = (Player) sender;
        if (sender instanceof Player) {
            ItemStack sevenhelmet = new ItemStack(Material.NETHERITE_HELMET, 1);
            ItemMeta meta = sevenhelmet.getItemMeta();
            meta.setDisplayName(ChatColor.BLUE + "SevenHelmet");
            meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
            ArrayList<String> lore = new ArrayList<>();
            lore.add(" ");
            lore.add(ChatColor.GRAY + ">> Der " + ChatColor.RED + "stärkste" + ChatColor.GRAY + " Helm im Spiel!");
            lore.add(" ");
            meta.setLore(lore);
            sevenhelmet.setItemMeta(meta);
            for (String player2 : CheckCommand.players) {
                if (player.getName().equals(player2)) {
                    if (CheckCommand.playercoins[i] >= costs) {
                        CheckCommand.playercoins[i] -= costs;
                        player.getInventory().addItem(sevenhelmet);
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat den SevenHelmet erhalten!");
                    } else {
                        sender.sendMessage(ChatColor.GRAY + ">> " + ChatColor.BLUE + player.getName() + ChatColor.GRAY + " hat zu wenig Coins um sich den SevenHelmet zu kaufen!");
                    }
                }
                i++;
            }
        }
        return false;
    }
}
