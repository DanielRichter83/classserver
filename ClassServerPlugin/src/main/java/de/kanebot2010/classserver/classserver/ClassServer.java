package de.kanebot2010.classserver.classserver;

import de.kanebot2010.classserver.classserver.commands.*;
import de.kanebot2010.classserver.classserver.listeners.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Array;

public final class ClassServer extends JavaPlugin {
    public static int[] playercoins = new int[30];
    private static ClassServer instance;
    @Override
    public void onEnable() {
        int i = 0;
        instance = this;
        // Plugin startup logic
        getCommand("coins").setExecutor(new CoinsCommand());
        getCommand("check").setExecutor(new CheckCommand());
        getCommand("sell").setExecutor(new SellCommand());
        getCommand("cointodia").setExecutor(new DTCCommand());
        getCommand("buy").setExecutor(new BuyCommand());
        getCommand("sevensword").setExecutor(new SevenSwordBuy());
        getCommand("sevenaxe").setExecutor(new SevenAxeBuy());
        getCommand("sevenhelmet").setExecutor(new SevenHelmetBuy());
        getCommand("sevenchestplate").setExecutor(new SevenChestplateBuy());
        getCommand("sevenleggings").setExecutor(new SevenLeggingsBuy());
        getCommand("sevenboots").setExecutor(new SevenBootsBuy());
        getCommand("spider").setExecutor(new SpiderBuy());
        getCommand("cavespider").setExecutor(new CaveSpiderBuy());
        getCommand("zombie").setExecutor(new ZombieBuy());
        getCommand("skeleton").setExecutor(new SkeletonBuy());
        getCommand("creeper").setExecutor(new CreeperBuy());
        getCommand("blaze").setExecutor(new BlazeBuy());
        
        PluginManager pluginmanager = Bukkit.getPluginManager();
        pluginmanager.registerEvents(new Listeners(), this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static int[] getPlayercoins() {
        return playercoins;
    }
    public static ClassServer getInstance() {
        return instance;
    }
}
