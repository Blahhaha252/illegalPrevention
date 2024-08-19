package org.blahhaha253;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class EnchantmentHandler {

    public void processItemStack(ItemStack itemStack){
        String type = ToolType.getItemType(itemStack.getType());
        if (type.equals("sword")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_sword_enchantments();
            iterator(itemStack, illegalEnchantments);
            sword_cleaner(itemStack);
        } else if (type.equals("shovel")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_shovel_enchantments();
            iterator(itemStack, illegalEnchantments);
            shovel_cleaner(itemStack);
        } else if (type.equals("pickaxe")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_pickaxe_enchantments();
            iterator(itemStack, illegalEnchantments);
            pickaxe_cleaner(itemStack);
        } else if (type.equals("axe")){
            List <Enchantment> illegalEnchantments = IllegalItems.Illegal_axe_enchantments();
            iterator(itemStack, illegalEnchantments);
            axe_cleaner(itemStack);
        } else if (type.equals("hoe")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_hoe_enchantments();
            iterator(itemStack, illegalEnchantments);
            hoe_cleaner(itemStack);
        } else if (type.equals("boots")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_boot_enchantments();
            iterator(itemStack, illegalEnchantments);
            boots_cleaner(itemStack);
        } else if (type.equals("leggings")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_legging_enchantments();
            iterator(itemStack, illegalEnchantments);
            leggings_cleaner(itemStack);
        } else if (type.equals("chestplate")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_chestplate_enchantments();
            iterator(itemStack, illegalEnchantments);
            chestplate_cleaner(itemStack);
        } else if (type.equals("helmet")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_helmet_enchantments();
            iterator(itemStack, illegalEnchantments);
            helmet_cleaner(itemStack);
        } else if (type.equals("fishing_rod")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_rod_enchantments();
            iterator(itemStack, illegalEnchantments);
            rod_cleaner(itemStack);
        } else if (type.equals("mace")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_mace_enchantments();
            iterator(itemStack, illegalEnchantments);
            mace_cleaner(itemStack);
        } else if (type.equals("bow")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_bow_enchantments();
            iterator(itemStack, illegalEnchantments);
            bow_cleaner(itemStack);
        } else if (type.equals("compass")) {
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_compass_enchantments();
            iterator(itemStack, illegalEnchantments);
            compass_cleaner(itemStack);
        } else if (type.equals("shears")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_shears_Enchantments();
            iterator(itemStack, illegalEnchantments);
            shears_cleaner(itemStack);
        } else if (type.equals("shield")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_shield_enchantments();
            iterator(itemStack, illegalEnchantments);
            shield_cleaner(itemStack);
        } else if (type.equals("trident")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_trident_enchantments();
            iterator(itemStack, illegalEnchantments);
            trident_cleaner(itemStack);
        } else if (type.equals("crossbow")){
           List<Enchantment> illegalEnchantments = IllegalItems.Illegal_cross_enchantments();
           iterator(itemStack, illegalEnchantments);
           crossbow_cleaner(itemStack);
        } else if (type.equals("flint/steel")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_flint_enchantments();
            iterator(itemStack, illegalEnchantments);
            flint_cleaner(itemStack);
        } else if (type.equals("brush")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_brush_enchantments();
            iterator(itemStack, illegalEnchantments);
            brush_cleaner(itemStack);
        } else if (type.equals("elytra")){
            List<Enchantment> illegalEnchantments = IllegalItems.Illegal_elytra_enchantments();
            iterator(itemStack, illegalEnchantments);
            elytra_cleaner(itemStack);
        } else if (type.equals("enchanted_book")){
            enchanted_book_cleaner(itemStack);
        } else if (type.equals("unknown")) itemStack.removeEnchantments();
    }
    private void iterator(ItemStack itemStack, List<Enchantment> illegalEnchantments){
        for (Enchantment ench : illegalEnchantments){
            if (itemStack.containsEnchantment(ench)) {
                itemStack.removeEnchantment(ench);
            }
        }
    }
    private void enchFix (ItemStack itemStack, Enchantment enchantment, int maxLevel){
        if (itemStack.containsEnchantment(enchantment)){
            int level = itemStack.getEnchantmentLevel(enchantment);
            if (level > maxLevel) itemStack.addUnsafeEnchantment(enchantment, maxLevel);
        }
    }
    private void sword_cleaner (ItemStack itemStack) {
        enchFix(itemStack, Enchantment.BANE_OF_ARTHROPODS, 5);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.FIRE_ASPECT, 2);
        enchFix(itemStack, Enchantment.KNOCKBACK, 2);
        enchFix(itemStack, Enchantment.LOOTING, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SHARPNESS, 5);
        enchFix(itemStack, Enchantment.SMITE, 5);
        enchFix(itemStack, Enchantment.SWEEPING_EDGE, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void shovel_cleaner (ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.EFFICIENCY, 5);
        enchFix(itemStack, Enchantment.FORTUNE, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SILK_TOUCH, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void pickaxe_cleaner (ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.EFFICIENCY, 5);
        enchFix(itemStack, Enchantment.FORTUNE, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SILK_TOUCH, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void axe_cleaner (ItemStack itemStack){
        enchFix(itemStack, Enchantment.BANE_OF_ARTHROPODS, 5);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.EFFICIENCY, 5);
        enchFix(itemStack, Enchantment.FORTUNE, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SHARPNESS, 5);
        enchFix(itemStack, Enchantment.SILK_TOUCH, 1);
        enchFix(itemStack, Enchantment.SMITE, 5);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void hoe_cleaner (ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.EFFICIENCY, 5);
        enchFix(itemStack, Enchantment.FORTUNE, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SILK_TOUCH, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void boots_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.BLAST_PROTECTION,4);
        enchFix(itemStack, Enchantment.BINDING_CURSE, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.DEPTH_STRIDER, 3);
        enchFix(itemStack, Enchantment.FEATHER_FALLING, 4);
        enchFix(itemStack, Enchantment.FIRE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.FROST_WALKER, 2);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.PROJECTILE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.PROTECTION, 4);
        enchFix(itemStack, Enchantment.SOUL_SPEED, 3);
        enchFix(itemStack, Enchantment.THORNS, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void leggings_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.BLAST_PROTECTION, 4);
        enchFix(itemStack, Enchantment.BINDING_CURSE, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.FIRE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.PROJECTILE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.PROTECTION, 4);
        enchFix(itemStack, Enchantment.SWIFT_SNEAK, 3);
        enchFix(itemStack, Enchantment.THORNS, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void chestplate_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.BLAST_PROTECTION, 4);
        enchFix(itemStack, Enchantment.BINDING_CURSE, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.FIRE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.PROJECTILE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.PROTECTION, 4);
        enchFix(itemStack, Enchantment.THORNS, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void helmet_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.AQUA_AFFINITY, 1);
        enchFix(itemStack, Enchantment.BLAST_PROTECTION, 4);
        enchFix(itemStack, Enchantment.BINDING_CURSE, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.FIRE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.PROJECTILE_PROTECTION, 4);
        enchFix(itemStack, Enchantment.PROTECTION, 4);
        enchFix(itemStack, Enchantment.RESPIRATION, 3);
        enchFix(itemStack, Enchantment.THORNS, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void rod_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.LUCK_OF_THE_SEA, 3);
        enchFix(itemStack, Enchantment.LURE, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void mace_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.BANE_OF_ARTHROPODS, 5);
        enchFix(itemStack, Enchantment.BREACH, 4);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.DENSITY, 5);
        enchFix(itemStack, Enchantment.FIRE_ASPECT, 2);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.SMITE, 5);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
        enchFix(itemStack, Enchantment.WIND_BURST, 3);
    }
    private void bow_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.FLAME, 1);
        enchFix(itemStack, Enchantment.INFINITY, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.POWER, 5);
        enchFix(itemStack, Enchantment.PUNCH, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void compass_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
    }
    private void shears_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.EFFICIENCY, 5);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void shield_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 1);
    }
    private void trident_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.CHANNELING, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.IMPALING, 5);
        enchFix(itemStack, Enchantment.LOYALTY, 3);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.RIPTIDE, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void crossbow_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.MULTISHOT, 1);
        enchFix(itemStack, Enchantment.PIERCING, 4);
        enchFix(itemStack, Enchantment.QUICK_CHARGE, 3);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void flint_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void brush_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void elytra_cleaner(ItemStack itemStack){
        enchFix(itemStack, Enchantment.BINDING_CURSE, 1);
        enchFix(itemStack, Enchantment.VANISHING_CURSE, 1);
        enchFix(itemStack, Enchantment.MENDING, 1);
        enchFix(itemStack, Enchantment.UNBREAKING, 3);
    }
    private void enchanted_book_cleaner(ItemStack itemStack){
        Map<Enchantment, Integer> enchantments = itemStack.getEnchantments();
        for (Map.Entry<Enchantment, Integer> entry : enchantments.entrySet()) {
            Enchantment enchantment = entry.getKey();
            int maxLevel = enchantment.getMaxLevel();
            enchFix(itemStack, enchantment, maxLevel);
        }
    }
}
