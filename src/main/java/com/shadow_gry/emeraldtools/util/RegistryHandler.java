package com.shadow_gry.emeraldtools.util;

import com.shadow_gry.emeraldtools.EmeraldTools;
import com.shadow_gry.emeraldtools.armor.ModArmorTier;
import com.shadow_gry.emeraldtools.tools.ModToolTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldTools.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // TODO: Balance sample values.
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(ModToolTier.EMERALD, 0.5F, -3.0F, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(ModToolTier.EMERALD, 0, -2.8F, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(ModToolTier.EMERALD, 5, -3.1F, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new HoeItem(ModToolTier.EMERALD, -3, -1.0F, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ModToolTier.EMERALD, 2, -2.4F, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    // Armor
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorTier.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorTier.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorTier.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorTier.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(EmeraldTools.TAB_EMERALD_TOOLS)));
}
