package com.playivanikyt.codetitul;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuManager implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Проверяем, что команду ввёл игрок, а не консоль
        if (!(sender instanceof Player)) {
            sender.sendMessage("Команду может использовать только игрок!");
            return true;
        }

        Player player = (Player) sender;

        // Создаём меню с 54 слотами
        Inventory menu = Bukkit.createInventory(null, 54, ChatColor.BLACK + "Кастомные Титулы");

        // Добавим один предмет в начало
        ItemStack item = new ItemStack(Material.NAME_TAG);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "%Titul%");
        item.setItemMeta(meta);

        // Кладём предмет в начало
        menu.setItem(0, item);

        // Открываем меню игроку
        player.openInventory(menu);

        return true;
    }
}
