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
package com.github.shadowgry.emeraldtools;

import com.github.shadowgry.emeraldtools.common.items.ModItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(EmeraldTools.MOD_ID)
public class EmeraldTools
{
    public static final String MOD_ID = "emeraldtools";

    public EmeraldTools() {
        ModItems.registerItems();
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final CreativeModeTab TAB_EMERALD_TOOLS = new CreativeModeTab("emerald_tools") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMERALD_AXE.get());
        }
    };
}
