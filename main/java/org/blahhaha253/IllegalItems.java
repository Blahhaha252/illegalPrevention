package org.blahhaha253;

import org.bukkit.Material;
import org.bukkit.Registry;
import org.bukkit.enchantments.Enchantment;
import java.util.*;

public class IllegalItems {
    public static Set<Material> ILLEGAL_ITEMS = Set.of(
            //Normal based illegals
            Material.BEDROCK,
            Material.BARRIER,
            Material.COMMAND_BLOCK,
            Material.REPEATING_COMMAND_BLOCK,
            Material.CHAIN_COMMAND_BLOCK,
            Material.STRUCTURE_BLOCK,
            Material.STRUCTURE_VOID,
            Material.DEBUG_STICK,
            Material.SPAWNER,
            Material.COMMAND_BLOCK_MINECART,
            // spawn eggs
            Material.ALLAY_SPAWN_EGG,
            Material.AXOLOTL_SPAWN_EGG,
            Material.BAT_SPAWN_EGG,
            Material.BEE_SPAWN_EGG,
            Material.BLAZE_SPAWN_EGG,
            Material.CAMEL_SPAWN_EGG,
            Material.CAT_SPAWN_EGG,
            Material.CAVE_SPIDER_SPAWN_EGG,
            Material.CHICKEN_SPAWN_EGG,
            Material.COD_SPAWN_EGG,
            Material.COW_SPAWN_EGG,
            Material.CREEPER_SPAWN_EGG,
            Material.DOLPHIN_SPAWN_EGG,
            Material.DONKEY_SPAWN_EGG,
            Material.DROWNED_SPAWN_EGG,
            Material.ELDER_GUARDIAN_SPAWN_EGG,
            Material.ENDERMAN_SPAWN_EGG,
            Material.ENDERMITE_SPAWN_EGG,
            Material.EVOKER_SPAWN_EGG,
            Material.FOX_SPAWN_EGG,
            Material.FROGSPAWN,
            Material.FROG_SPAWN_EGG,
            Material.GHAST_SPAWN_EGG,
            Material.GLOW_SQUID_SPAWN_EGG,
            Material.GOAT_SPAWN_EGG,
            Material.GUARDIAN_SPAWN_EGG,
            Material.HOGLIN_SPAWN_EGG,
            Material.HUSK_SPAWN_EGG,
            Material.IRON_GOLEM_SPAWN_EGG,
            Material.LLAMA_SPAWN_EGG,
            Material.MAGMA_CUBE_SPAWN_EGG,
            Material.MOOSHROOM_SPAWN_EGG,
            Material.MULE_SPAWN_EGG,
            Material.OCELOT_SPAWN_EGG,
            Material.PANDA_SPAWN_EGG,
            Material.PARROT_SPAWN_EGG,
            Material.PHANTOM_SPAWN_EGG,
            Material.PIG_SPAWN_EGG,
            Material.PIGLIN_SPAWN_EGG,
            Material.PIGLIN_BRUTE_SPAWN_EGG,
            Material.PILLAGER_SPAWN_EGG,
            Material.POLAR_BEAR_SPAWN_EGG,
            Material.PUFFERFISH_SPAWN_EGG,
            Material.RABBIT_SPAWN_EGG,
            Material.RAVAGER_SPAWN_EGG,
            Material.SALMON_SPAWN_EGG,
            Material.SHEEP_SPAWN_EGG,
            Material.SHULKER_SPAWN_EGG,
            Material.SILVERFISH_SPAWN_EGG,
            Material.SKELETON_SPAWN_EGG,
            Material.SKELETON_HORSE_SPAWN_EGG,
            Material.SLIME_SPAWN_EGG,
            Material.SNIFFER_SPAWN_EGG,
            Material.SNOW_GOLEM_SPAWN_EGG,
            Material.SPIDER_EYE,
            Material.SQUID_SPAWN_EGG,
            Material.STRAY_SPAWN_EGG,
            Material.STRIDER_SPAWN_EGG,
            Material.TADPOLE_SPAWN_EGG,
            Material.TRADER_LLAMA_SPAWN_EGG,
            Material.TROPICAL_FISH_SPAWN_EGG,
            Material.TURTLE_SPAWN_EGG,
            Material.VEX_SPAWN_EGG,
            Material.VILLAGER_SPAWN_EGG,
            Material.VINDICATOR_SPAWN_EGG,
            Material.WANDERING_TRADER_SPAWN_EGG,
            Material.WARDEN_SPAWN_EGG,
            Material.WITCH_SPAWN_EGG,
            Material.WITHER_SKELETON_SPAWN_EGG,
            Material.WOLF_SPAWN_EGG,
            Material.ZOGLIN_SPAWN_EGG,
            Material.ZOMBIE_SPAWN_EGG,
            Material.ZOMBIE_HORSE_SPAWN_EGG,
            Material.ZOMBIE_VILLAGER_SPAWN_EGG,
            Material.ZOMBIFIED_PIGLIN_SPAWN_EGG

    );
    public static List<Enchantment> Enchantment_list() {
        List<Enchantment> Enchantments = new ArrayList<>();
        for (Enchantment enchantment : Registry.ENCHANTMENT){
            Enchantments.add(enchantment);
        }
        return Enchantments;
    }
    public static List<Enchantment> Illegal_sword_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BANE_OF_ARTHROPODS);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.FIRE_ASPECT);
        illegalEnchantments.remove(Enchantment.KNOCKBACK);
        illegalEnchantments.remove(Enchantment.LOOTING);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SHARPNESS);
        illegalEnchantments.remove(Enchantment.SMITE);
        illegalEnchantments.remove(Enchantment.SWEEPING_EDGE);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_shovel_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.EFFICIENCY);
        illegalEnchantments.remove(Enchantment.FORTUNE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SILK_TOUCH);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_pickaxe_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.EFFICIENCY);
        illegalEnchantments.remove(Enchantment.FORTUNE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SILK_TOUCH);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_axe_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BANE_OF_ARTHROPODS);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.EFFICIENCY);
        illegalEnchantments.remove(Enchantment.FORTUNE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SHARPNESS);
        illegalEnchantments.remove(Enchantment.SILK_TOUCH);
        illegalEnchantments.remove(Enchantment.SMITE);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_hoe_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.EFFICIENCY);
        illegalEnchantments.remove(Enchantment.FORTUNE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SILK_TOUCH);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_boot_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BLAST_PROTECTION);
        illegalEnchantments.remove(Enchantment.BINDING_CURSE);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.DEPTH_STRIDER);
        illegalEnchantments.remove(Enchantment.FEATHER_FALLING);
        illegalEnchantments.remove(Enchantment.FIRE_PROTECTION);
        illegalEnchantments.remove(Enchantment.FROST_WALKER);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.PROJECTILE_PROTECTION);
        illegalEnchantments.remove(Enchantment.PROTECTION);
        illegalEnchantments.remove(Enchantment.SOUL_SPEED);
        illegalEnchantments.remove(Enchantment.THORNS);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_legging_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BLAST_PROTECTION);
        illegalEnchantments.remove(Enchantment.BINDING_CURSE);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.FIRE_PROTECTION);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.PROJECTILE_PROTECTION);
        illegalEnchantments.remove(Enchantment.PROTECTION);
        illegalEnchantments.remove(Enchantment.THORNS);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_chestplate_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BLAST_PROTECTION);
        illegalEnchantments.remove(Enchantment.BINDING_CURSE);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.FIRE_PROTECTION);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.PROJECTILE_PROTECTION);
        illegalEnchantments.remove(Enchantment.PROTECTION);
        illegalEnchantments.remove(Enchantment.THORNS);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_helmet_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.AQUA_AFFINITY);
        illegalEnchantments.remove(Enchantment.BLAST_PROTECTION);
        illegalEnchantments.remove(Enchantment.BINDING_CURSE);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.FIRE_PROTECTION);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.PROJECTILE_PROTECTION);
        illegalEnchantments.remove(Enchantment.PROTECTION);
        illegalEnchantments.remove(Enchantment.RESPIRATION);
        illegalEnchantments.remove(Enchantment.THORNS);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_rod_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.LUCK_OF_THE_SEA);
        illegalEnchantments.remove(Enchantment.LURE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_mace_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BANE_OF_ARTHROPODS);
        illegalEnchantments.remove(Enchantment.BREACH);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.DENSITY);
        illegalEnchantments.remove(Enchantment.FIRE_ASPECT);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.SMITE);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        illegalEnchantments.remove(Enchantment.WIND_BURST);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_bow_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.FLAME);
        illegalEnchantments.remove(Enchantment.INFINITY);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.POWER);
        illegalEnchantments.remove(Enchantment.PUNCH);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_compass_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_shears_Enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.EFFICIENCY);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_shield_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_trident_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.CHANNELING);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.IMPALING);
        illegalEnchantments.remove(Enchantment.LOYALTY);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.RIPTIDE);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_cross_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.MULTISHOT);
        illegalEnchantments.remove(Enchantment.PIERCING);
        illegalEnchantments.remove(Enchantment.QUICK_CHARGE);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_flint_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_brush_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
    public static List<Enchantment> Illegal_elytra_enchantments() {
        List<Enchantment> illegalEnchantments = Enchantment_list();
        illegalEnchantments.remove(Enchantment.BINDING_CURSE);
        illegalEnchantments.remove(Enchantment.VANISHING_CURSE);
        illegalEnchantments.remove(Enchantment.MENDING);
        illegalEnchantments.remove(Enchantment.UNBREAKING);
        return illegalEnchantments;
    }
}