package org.blahhaha253;

import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class PickupEventWrapper {
   public UUID playerUUID;
   public ItemStack itemStack;
    public int slot;
    public PickupEventWrapper(UUID playerUUID, ItemStack itemStack, int slot){
        this.playerUUID = playerUUID;
        this.itemStack = itemStack;
        this.slot = slot;

    }
}
