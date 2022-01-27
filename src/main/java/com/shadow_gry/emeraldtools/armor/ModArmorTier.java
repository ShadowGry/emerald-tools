package com.shadow_gry.emeraldtools.armor;

import com.shadow_gry.emeraldtools.EmeraldTools;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorTier implements ArmorMaterial {

    // TODO: Balance sample values.
    EMERALD(25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ARMOR_EQUIP_GENERIC,
            EmeraldTools.MOD_ID + ":emerald", 0.0F, () -> Ingredient.of(Items.EMERALD), 0);

    private static int[] MAX_DAMAGE = new int[] {11, 16, 15, 13};
    private int maxDamageFactor;
    private int[] damageReductionAmount;
    private int enchantmentValue;
    private SoundEvent equipSound;
    private String name;
    private float toughness;
    private Supplier<Ingredient> repairIngredient;
    private float knockbackResistance;

    ModArmorTier(int maxDamageFactor, int[] damageReductionAmount, int enchantmentValue, SoundEvent equipSound,
                 String name, float toughness, Supplier<Ingredient> repairIngredient, float knockbackResistance) {
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.name = name;
        this.toughness = toughness;
        this.repairIngredient = repairIngredient;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE[slotIn.getIndex()] * maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
