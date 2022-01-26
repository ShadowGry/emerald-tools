package com.shadow_gry.emeraldtools.tools;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModToolTier {

    // TODO: Balance sample values.
    public static final ForgeTier EMERALD = new ForgeTier(3, 800, 7.0F, 3.0F, 12,
            Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Items.EMERALD));
}
