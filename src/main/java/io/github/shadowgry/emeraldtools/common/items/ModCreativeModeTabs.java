/*
 * This file is part of Emerald Tools.
 * Copyright (C) 2023  ShadowGry
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
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = EmeraldTools.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

	private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldTools.MOD_ID);

	public static final RegistryObject<CreativeModeTab> EMERALD_TOOLS = CREATIVE_MODE_TABS.register(EmeraldTools.MOD_ID, () -> CreativeModeTab.builder()
		.title(Component.translatable("item_group" + EmeraldTools.MOD_ID + ".emerald_tools"))
		.icon(() -> new ItemStack(ModItems.EMERALD_PICKAXE.get()))
		.displayItems((params, output) -> {
			output.accept(ModItems.EMERALD_SHOVEL.get());
			output.accept(ModItems.EMERALD_PICKAXE.get());
			output.accept(ModItems.EMERALD_AXE.get());
			output.accept(ModItems.EMERALD_HOE.get());
			output.accept(ModItems.EMERALD_SWORD.get());
			
			output.accept(ModItems.EMERALD_HELMET.get());
			output.accept(ModItems.EMERALD_CHESTPLATE.get());
			output.accept(ModItems.EMERALD_LEGGINGS.get());
			output.accept(ModItems.EMERALD_BOOTS.get());
			
			output.accept(ModItems.EMERALD_HORSE_ARMOR.get());
		})
		.build()
	);

	public static void register() {
		CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
