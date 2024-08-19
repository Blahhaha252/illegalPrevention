package org.blahhaha253;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerPickupItemEvent;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main extends JavaPlugin implements Listener {
    private final Queue<PickupEventWrapper> eventQueue = new LinkedList<>();
    private List<String> swordPriority;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("IllegalPrevention plugin has been enabled");
        getServer().getPluginManager().registerEvents(this, this);
        long timerInterval = getConfig().getLong("timer", 50L);
        long timerIntervalTicks = timerInterval / 50;
        List<String> swordPriority = getConfig().getStringList("sword_priority");
        startScheduler(timerIntervalTicks);
    }
    @EventHandler
    public void onPlayerPickupItem(PlayerPickupItemEvent event) {
        Player player = event.getPlayer();
        ItemStack itemStack = event.getItem().getItemStack();
        int slot = event.getPlayer().getInventory().firstEmpty();
        PickupEventWrapper wrapper = new PickupEventWrapper(player.getUniqueId(), itemStack, slot);
        eventQueue.add(wrapper);
    }
    private void startScheduler ( long interval){
        Bukkit.getScheduler().runTaskTimer(this, this::processNextEvent, 0L, interval);
    }

    private void processNextEvent(){
        PickupEventWrapper wrapper = eventQueue.poll();
        if (wrapper != null){
            Player player = Bukkit.getPlayer(wrapper.playerUUID);
            if (player != null){
                ItemStack itemStack = player.getInventory().getItem(wrapper.slot);
                if (itemStack != null){
                    if (IllegalItems.ILLEGAL_ITEMS.contains(itemStack.getType())){
                        itemStack.setAmount(0);
                        return;
                    }
                    EnchantmentHandler enchantmentHandler = new EnchantmentHandler();
                    enchantmentHandler.processItemStack(itemStack);
                }
            }
        }

    }
    @Override
    public void onDisable() {
        getLogger().info("IllegalPrevention plugin has been disabled");
    }


    }

