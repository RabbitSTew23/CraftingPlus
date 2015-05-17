package me.harrysmc.craftingplus.CraftingRecipe;

import me.harrysmc.craftingplus.CraftingPlus;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.logging.Logger;

/**
 * Created by HarrysMc on 17/05/2015.
 */
public abstract class CraftingRecipe {


    Logger log;
    FileConfiguration config;

    String name;


    public CraftingRecipe(String name, ItemStack itemStack){
        this.name = name;

        config = CraftingPlus.getInstance().getConfig();
        config.addDefault("enabled." + name, true);

        log = CraftingPlus.getInstance().getLogger();
    }

    public void setup(){
        if(!(config.contains("enabled." + name))){
            log.info("Error loading " + name + " option from config.");
            return;
        }

        if(config.getBoolean("enabled." + name)){
            Bukkit.addRecipe(getRecipe());
        }

    }

    public abstract Recipe getRecipe();

}
