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
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EmeraldTools.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
	@SubscribeEvent
	static void buildContents(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation(EmeraldTools.MOD_ID, "emeraldtools"), builder ->
			builder.title(Component.translatable("itemGroup.emerald_tools"))
			.icon(() -> new ItemStack(ModItems.EMERALD_PICKAXE.get()))
			.displayItems((enabledFlags, populator, hasPermissions) -> {
				populator.accept(ModItems.EMERALD_SHOVEL.get());
				populator.accept(ModItems.EMERALD_PICKAXE.get());
				populator.accept(ModItems.EMERALD_AXE.get());
				populator.accept(ModItems.EMERALD_HOE.get());
				populator.accept(ModItems.EMERALD_SWORD.get());
				
				populator.accept(ModItems.EMERALD_HELMET.get());
				populator.accept(ModItems.EMERALD_CHESTPLATE.get());
				populator.accept(ModItems.EMERALD_LEGGINGS.get());
				populator.accept(ModItems.EMERALD_BOOTS.get());
				
				populator.accept(ModItems.EMERALD_HORSE_ARMOR.get());
			})
		);
	}
}
