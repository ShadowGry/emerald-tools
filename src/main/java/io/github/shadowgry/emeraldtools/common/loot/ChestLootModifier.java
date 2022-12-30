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

import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class ChestLootModifier extends LootModifier {
	
	private final List<Item> items;
	private final double chance;
	private final int size;
	
	public static final Supplier<Codec<ChestLootModifier>> CODEC = Suppliers.memoize(() ->
		RecordCodecBuilder.create(
			inst -> codecStart(inst).and(
				inst.group(
					ForgeRegistries.ITEMS.getCodec().listOf().fieldOf("items").forGetter(m -> m.items),
					Codec.DOUBLE.fieldOf("chance").forGetter(m -> m.chance)
				)
			).apply(inst, ChestLootModifier::new)
		)
	);
	
	public ChestLootModifier(final LootItemCondition[] conditionsIn, List<Item> items, double chance) {
		super(conditionsIn);
		this.items = items;
		this.size = items.size();
		this.chance = chance;
	}
	
	@NotNull
	@Override
	protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
		// Modify the loot and return the new drops
		if(context.getRandom().nextDouble() < chance) {
			generatedLoot.add(items.get(context.getRandom().nextInt(size)).getDefaultInstance());
		}
		return generatedLoot;
	}
	
	@Override
	public Codec<? extends IGlobalLootModifier> codec() {
		// Return the codec used to encode and decode this modifier
		return CODEC.get();
	}
}
