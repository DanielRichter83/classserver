package de.kanebot2010.classserver.classserver.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            sender.sendMessage("Was wollen sie kaufen?:");
            TextComponent sevensword = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenSword");
            player.spigot().sendMessage(sevensword);
            TextComponent sevenaxe = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenAxe");
            player.spigot().sendMessage(sevenaxe);
            TextComponent sevenhelmet = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenHelmet");
            player.spigot().sendMessage(sevenhelmet);
            TextComponent sevenchestplate = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenChestplate");
            player.spigot().sendMessage(sevenchestplate);
            TextComponent sevenleggings = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenLeggings");
            player.spigot().sendMessage(sevenleggings);
            TextComponent sevenboots = new TextComponent(ChatColor.LIGHT_PURPLE + "SevenBoots");
            player.spigot().sendMessage(sevenboots);

            sender.sendMessage("Spawner?:");
            TextComponent spider = new TextComponent(ChatColor.LIGHT_PURPLE + "Spider");
            player.spigot().sendMessage(spider);
            TextComponent cavespider = new TextComponent(ChatColor.LIGHT_PURPLE + "CaveSpider");
            player.spigot().sendMessage(cavespider);
            TextComponent zombie = new TextComponent(ChatColor.LIGHT_PURPLE + "Zombie");
            player.spigot().sendMessage(zombie);
            TextComponent skeleton = new TextComponent(ChatColor.LIGHT_PURPLE + "Skeleton");
            player.spigot().sendMessage(skeleton);
            TextComponent creeper = new TextComponent(ChatColor.LIGHT_PURPLE + "Creeper");
            player.spigot().sendMessage(creeper);
            TextComponent blaze = new TextComponent(ChatColor.LIGHT_PURPLE + "Blaze");
            player.spigot().sendMessage(blaze);

            sevensword.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevensword"));
            sevenaxe.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevenaxe"));
            sevenhelmet.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevenhelmet"));
            sevenchestplate.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevenchestplate"));
            sevenleggings.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevenleggings"));
            sevenboots.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/sevenboots"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/spider"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/cavespider"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/zombie"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/skeleton"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/creeper"));
            spider.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/blaze"));

            sender.sendMessage("Wenn das anklicken nicht funktioniert, führen sie den Befehl /'name' aus!");
        }
        return false;
    }
}
