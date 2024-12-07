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
package io.github.shadowgry.emeraldtools.common.loot;

import com.mojang.serialization.Codec;

import io.github.shadowgry.emeraldtools.EmeraldTools;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModLootModifiers {
	
	private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> MOD_LOOT_MODIFIER_SERIALIZERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, EmeraldTools.MOD_ID);
	private static final DeferredHolder<Codec<? extends IGlobalLootModifier>, Codec<ChestLootModifier>> CHEST_LOOT_MODIFIER_CODEC = MOD_LOOT_MODIFIER_SERIALIZERS.register("add_chest_item", ChestLootModifier.CODEC);
	
	public static void register(IEventBus modEventBus) {
		MOD_LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
	}
}
