
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wratixor.backstick.init;

import wratixor.backstick.item.StoneBackStickItem;
import wratixor.backstick.item.NetheriteBackStickItem;
import wratixor.backstick.item.IronBackStickItem;
import wratixor.backstick.item.GoldBackStickItem;
import wratixor.backstick.item.DiamondBackStickItem;
import wratixor.backstick.item.CopperBackStickItem;
import wratixor.backstick.item.BackStickItem;
import wratixor.backstick.item.BackMutatorWoodItem;
import wratixor.backstick.item.BackMutatorStoneItem;
import wratixor.backstick.item.BackMutatorNetheriteItem;
import wratixor.backstick.item.BackMutatorIronItem;
import wratixor.backstick.item.BackMutatorGoldItem;
import wratixor.backstick.item.BackMutatorDiamondItem;
import wratixor.backstick.item.BackMutatorCopperItem;
import wratixor.backstick.item.BackEngraverWoodItem;
import wratixor.backstick.item.BackEngraverStoneItem;
import wratixor.backstick.item.BackEngraverNetheriteItem;
import wratixor.backstick.item.BackEngraverIronItem;
import wratixor.backstick.item.BackEngraverGoldItem;
import wratixor.backstick.item.BackEngraverDiamondItem;
import wratixor.backstick.item.BackEngraverCopperItem;
import wratixor.backstick.item.BackBreackerWoodItem;
import wratixor.backstick.item.BackBreackerStoneItem;
import wratixor.backstick.item.BackBreackerNetheriteItem;
import wratixor.backstick.item.BackBreackerIronItem;
import wratixor.backstick.item.BackBreackerGoldItem;
import wratixor.backstick.item.BackBreackerDiamondItem;
import wratixor.backstick.item.BackBreackerCopperItem;
import wratixor.backstick.BackstickMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class BackstickModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BackstickMod.MODID);
	public static final RegistryObject<Item> STONE_BACK_STICK = REGISTRY.register("stone_back_stick", () -> new StoneBackStickItem());
	public static final RegistryObject<Item> BACK_STICK = REGISTRY.register("back_stick", () -> new BackStickItem());
	public static final RegistryObject<Item> COPPER_BACK_STICK = REGISTRY.register("copper_back_stick", () -> new CopperBackStickItem());
	public static final RegistryObject<Item> IRON_BACK_STICK = REGISTRY.register("iron_back_stick", () -> new IronBackStickItem());
	public static final RegistryObject<Item> GOLD_BACK_STICK = REGISTRY.register("gold_back_stick", () -> new GoldBackStickItem());
	public static final RegistryObject<Item> DIAMOND_BACK_STICK = REGISTRY.register("diamond_back_stick", () -> new DiamondBackStickItem());
	public static final RegistryObject<Item> NETHERITE_BACK_STICK = REGISTRY.register("netherite_back_stick", () -> new NetheriteBackStickItem());
	public static final RegistryObject<Item> BACK_BREACKER_WOOD = REGISTRY.register("back_breacker_wood", () -> new BackBreackerWoodItem());
	public static final RegistryObject<Item> BACK_BREACKER_COPPER = REGISTRY.register("back_breacker_copper", () -> new BackBreackerCopperItem());
	public static final RegistryObject<Item> BACK_BREACKER_STONE = REGISTRY.register("back_breacker_stone", () -> new BackBreackerStoneItem());
	public static final RegistryObject<Item> BACK_BREACKER_IRON = REGISTRY.register("back_breacker_iron", () -> new BackBreackerIronItem());
	public static final RegistryObject<Item> BACK_BREACKER_GOLD = REGISTRY.register("back_breacker_gold", () -> new BackBreackerGoldItem());
	public static final RegistryObject<Item> BACK_BREACKER_DIAMOND = REGISTRY.register("back_breacker_diamond", () -> new BackBreackerDiamondItem());
	public static final RegistryObject<Item> BACK_BREACKER_NETHERITE = REGISTRY.register("back_breacker_netherite", () -> new BackBreackerNetheriteItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_WOOD = REGISTRY.register("back_engraver_wood", () -> new BackEngraverWoodItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_STONE = REGISTRY.register("back_engraver_stone", () -> new BackEngraverStoneItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_COPPER = REGISTRY.register("back_engraver_copper", () -> new BackEngraverCopperItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_IRON = REGISTRY.register("back_engraver_iron", () -> new BackEngraverIronItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_GOLD = REGISTRY.register("back_engraver_gold", () -> new BackEngraverGoldItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_DIAMOND = REGISTRY.register("back_engraver_diamond", () -> new BackEngraverDiamondItem());
	public static final RegistryObject<Item> BACK_ENGRAVER_NETHERITE = REGISTRY.register("back_engraver_netherite", () -> new BackEngraverNetheriteItem());
	public static final RegistryObject<Item> BACK_MUTATOR_WOOD = REGISTRY.register("back_mutator_wood", () -> new BackMutatorWoodItem());
	public static final RegistryObject<Item> BACK_MUTATOR_STONE = REGISTRY.register("back_mutator_stone", () -> new BackMutatorStoneItem());
	public static final RegistryObject<Item> BACK_MUTATOR_COPPER = REGISTRY.register("back_mutator_copper", () -> new BackMutatorCopperItem());
	public static final RegistryObject<Item> BACK_MUTATOR_IRON = REGISTRY.register("back_mutator_iron", () -> new BackMutatorIronItem());
	public static final RegistryObject<Item> BACK_MUTATOR_GOLD = REGISTRY.register("back_mutator_gold", () -> new BackMutatorGoldItem());
	public static final RegistryObject<Item> BACK_MUTATOR_DIAMOND = REGISTRY.register("back_mutator_diamond", () -> new BackMutatorDiamondItem());
	public static final RegistryObject<Item> BACK_MUTATOR_NETHERITE = REGISTRY.register("back_mutator_netherite", () -> new BackMutatorNetheriteItem());
}
