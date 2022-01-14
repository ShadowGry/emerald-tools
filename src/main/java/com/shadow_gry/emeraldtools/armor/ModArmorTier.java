package com.shadow_gry.emeraldtools.armor;

import com.shadow_gry.emeraldtools.EmeraldTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorTier implements IArmorMaterial {

    // TODO: Balance sample values.
    EMERALD(25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ARMOR_EQUIP_GENERIC,
            EmeraldTools.MOD_ID + ":emerald", 0.0F, () -> {return Ingredient.of(Items.EMERALD); }, 0);

    private static int[] MAX_DAMAGE = new int[] {11, 16, 15, 13};
    private int maxDamageFactor;
    private int[] damageReductionAmount;
    private int enchantability;
    private SoundEvent soundEvent;
    private String name;
    private float toughness;
    private Supplier<Ingredient> repairMaterial;
    private float knockbackResistance;

    ModArmorTier(int maxDamageFactor, int[] damageReductionAmount, int enchantability, SoundEvent soundEvent,
                 String name, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.name = name;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return MAX_DAMAGE[slotIn.getIndex()] * maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
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
        return 0;
    }
}
