package de.kanebot2010.classserver.classserver.listeners;

import de.kanebot2010.classserver.classserver.ClassServer;
import de.kanebot2010.classserver.classserver.commands.CheckCommand;
import de.kanebot2010.classserver.classserver.scoreboard.ScoreboardUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Listeners implements Listener {
    boolean bool = true;
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.setScoreboard(ScoreboardUtils.getBaseScoreboard(player));
        for (String player2 : CheckCommand.players) {
            if (player.getName().equals(player2)) {
                bool = false;
            }
        }
        if (bool) {
            CheckCommand.players[CheckCommand.players.length] = player.getName();
        }
        event.setJoinMessage(">> Willkommen zum Klassenserver " + player.getName());
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(">> Bye " + player.getName());
    }
    @EventHandler
    public void onEntityDamagedByEntity(EntityDamageByEntityEvent entity) {
        if (entity instanceof Player) {
            double multiply = 0.75;
            Player killedPlayer = (Player) entity;
            if (killedPlayer.getKiller() instanceof Player) {
                Player killer = killedPlayer.getKiller();
                double givecoins = 0;
                if (entity.getEntity().isDead()) {
                    String killedName = entity.getEntity().getName();
                    int i = 0;
                    for (String player : CheckCommand.players) {
                        if (player.equals(killedName)) {
                            CheckCommand.playercoins[i] = (int) (CheckCommand.playercoins[i] * multiply);
                            givecoins = CheckCommand.playercoins[i] * (1 - multiply);
                        }
                        i++;
                    }
                    i = 0;
                    for (String player : CheckCommand.players) {
                        if (player.equals(killer.getName())) {
                            CheckCommand.playercoins[i] = (int) (CheckCommand.playercoins[i] + givecoins);
                        }
                        i++;
                    }
                }
            }
        }
    }
}
