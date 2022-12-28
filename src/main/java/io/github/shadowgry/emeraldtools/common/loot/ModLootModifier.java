package io.github.shadowgry.emeraldtools.common.loot;

import com.mojang.serialization.Codec;

import io.github.shadowgry.emeraldtools.EmeraldTools;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifier {
	
	private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> MOD_LOOT_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, EmeraldTools.MOD_ID);
	private static final RegistryObject<Codec<DesertPyramidModifier>> DESERT_PYRAMID_LOOT = MOD_LOOT_MODIFIER_SERIALIZERS.register("add_item", DesertPyramidModifier.CODEC);
	
	public static void registerModifiers() {
		MOD_LOOT_MODIFIER_SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
