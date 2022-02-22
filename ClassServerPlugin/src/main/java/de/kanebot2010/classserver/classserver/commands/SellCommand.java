package de.kanebot2010.classserver.classserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SellCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            boolean bool = true;
            Player player = (Player) sender;
            String material = "DIAMOND";
            int i = 0;
            for(ItemStack item : player.getInventory().getContents()){ //Geht alle Slots im Inventar durch
                if (!(item == null)){	//Ist in dem Slot ein Item?
                    if (item.getType().toString() == material){ //Ist das Item das gefragte?
                        i = i + item.getAmount(); //Hier speichern wir die komplette Anzahl der vorhandenen Items
                        player.getInventory().remove(item);	//Hier entfernen wir diese
                        player.updateInventory();
                    }
                }
            }
            int j = 0;
            for (String player2 : CheckCommand.players) {
                if (bool) {
                    if (Objects.equals(player2, player.getName())) {
                        CheckCommand.playercoins[j] += i;
                        bool = false;
                    } else {
                        j++;
                        bool = true;
                    }
                }
            }
            sender.sendMessage(">> Diamanten in Coins getauscht!");
        }
        return false;
    }
}
