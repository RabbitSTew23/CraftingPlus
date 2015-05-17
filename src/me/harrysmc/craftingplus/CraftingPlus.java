package me.harrysmc.craftingplus;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by HarrysMc on 17/05/2015.
 */
public class CraftingPlus extends JavaPlugin {

    Logger log = Bukkit.getLogger();
    @Override
    public void onEnable(){

        log.info("Crafting recipes set up.");
    }

    @Override
    public void onDisable(){

    }

}
