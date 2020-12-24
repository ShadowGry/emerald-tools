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
    EMERALD(25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            EmeraldTools.MOD_ID + ":emerald", 0.0F, () -> {return Ingredient.fromItems(Items.EMERALD); });

    private static int[] MAX_DAMAGE = new int[] {11, 16, 15, 13};
    private int maxDamageFactor;
    private int[] damageReductionAmount;
    private int enchantability;
    private SoundEvent soundEvent;
    private String name;
    private float toughness;
    private Supplier<Ingredient> repairMaterial;

    ModArmorTier(int maxDamageFactor, int[] damageReductionAmount, int enchantability, SoundEvent soundEvent,
                 String name, float toughness, Supplier<Ingredient> repairMaterial) {
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.name = name;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE[slotIn.getIndex()] * maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @OnlyIn(Dist.CLIENT)

    @Override
    public float func_230304_f_() {
        return 0;
    }
}
