package com.playivanikyt.codetitul;

import org.bukkit.plugin.java.JavaPlugin;

public class CodeTitul extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CodeTitul активирован!");
        getCommand("customtitul").setExecutor(new MenuManager());
    }


    @Override
    public void onDisable() {
        getLogger().info("CodeTitul отключен!");
    }
}
