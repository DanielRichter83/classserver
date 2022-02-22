package de.kanebot2010.classserver.classserver.scoreboard;

import de.kanebot2010.classserver.classserver.commands.CheckCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardUtils {
    public static Scoreboard getBaseScoreboard(Player player) {
        Scoreboard s = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = s.registerNewObjective("main", "main", "sevenserver.zaptos.com");
        int i = 0;
        int j = 0;
        for (String player2: CheckCommand.players) {
            if (player2 != null) {
                objective.getScore(ChatColor.BLUE + player2 + ChatColor.GRAY + ": " + ChatColor.DARK_RED + CheckCommand.playercoins[j]).setScore(i);
                j++;
            }
            i++;
        }
        objective.getScore("Dein Rang:").setScore(i + 3);
        objective.getScore(player.isOp() ? ChatColor.DARK_PURPLE + "Admin" : "Spieler").setScore(i + 2);
        objective.getScore("").setScore(i + 1);

        return s;
    }
}
