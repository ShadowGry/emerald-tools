/*
 * This file is part of Emerald Tools.
 * Copyright (C) 2022  ShadowGry
 *
 * Emerald Tools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.shadowgry.emeraldtools.common.items;

import io.github.shadowgry.emeraldtools.EmeraldTools;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldTools.MOD_ID);
	
	// Emerald Items
	public static final RegistryObject<ShovelItem>  EMERALD_SHOVEL  = ITEMS.register("emerald_shovel",  () -> new ShovelItem( ModTiers.EMERALD,  1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTiers.EMERALD,  1,    -2.8F, new Item.Properties()));
	public static final RegistryObject<AxeItem>     EMERALD_AXE     = ITEMS.register("emerald_axe",     () -> new AxeItem(    ModTiers.EMERALD,  6.0F, -3.1F, new Item.Properties()));
	public static final RegistryObject<HoeItem>     EMERALD_HOE     = ITEMS.register("emerald_hoe",     () -> new HoeItem(    ModTiers.EMERALD, -2,    -1.0F, new Item.Properties()));
	public static final RegistryObject<SwordItem>   EMERALD_SWORD   = ITEMS.register("emerald_sword",   () -> new SwordItem(  ModTiers.EMERALD,  3,    -2.4F, new Item.Properties()));
	
	// Emerald Armor
	public static final RegistryObject<ArmorItem> EMERALD_HELMET     = ITEMS.register("emerald_helmet",     () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,     new Item.Properties()));
	public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS   = ITEMS.register("emerald_leggings",   () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,   new Item.Properties()));
	public static final RegistryObject<ArmorItem> EMERALD_BOOTS      = ITEMS.register("emerald_boots",      () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,      new Item.Properties()));
	
	// Emerald Horse Armor
	public static final RegistryObject<HorseArmorItem> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () -> new HorseArmorItem(9, "emerald", new Item.Properties().stacksTo(1)));
	
	public static void registerItems() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
