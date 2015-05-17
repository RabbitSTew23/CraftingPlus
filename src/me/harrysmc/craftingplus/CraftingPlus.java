package me.harrysmc.craftingplus;

import me.harrysmc.craftingplus.CraftingRecipe.ShapedCraftingRecipe;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by HarrysMc on 17/05/2015.
 */

public class CraftingPlus extends JavaPlugin {

    //No

    @Override
    public void onEnable(){
        instance = this;

        new ShapedCraftingRecipe("disc13", new ItemStack(Material.GOLD_RECORD, 1), new String[]{"#O#", "OGO", "#O#"})
                .setIngredient('#', Material.AIR).setIngredient('O', Material.OBSIDIAN).setIngredient('G', Material.GOLD_INGOT)
                .setup();

        log.info("All recipes setup.");
    }

    @Override
    public void onDisable(){
        Bukkit.getServer().clearRecipes();
        log.info("Recipes cleared.");
    }

}
