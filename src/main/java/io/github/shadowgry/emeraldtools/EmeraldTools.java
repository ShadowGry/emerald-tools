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
package io.github.shadowgry.emeraldtools;

import io.github.shadowgry.emeraldtools.common.items.ModCreativeTabs;
import io.github.shadowgry.emeraldtools.common.items.ModItems;
import io.github.shadowgry.emeraldtools.common.loot.ModLootModifiers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EmeraldTools.MOD_ID)
public class EmeraldTools
{
	public static final String MOD_ID = "emeraldtools";
	
	public EmeraldTools() {
		ModItems.registerItems();
		MinecraftForge.EVENT_BUS.register(ModCreativeTabs.class);
		ModLootModifiers.registerModifiers();
	}
}
