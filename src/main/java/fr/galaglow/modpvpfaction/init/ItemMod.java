package fr.galaglow.modpvpfaction.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.galaglow.modpvpfaction.PvpMod;
import fr.galaglow.modpvpfaction.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMod {
	
	public static Item tp_cane, patato_bag, super_gantlet, saphir, rubis, fluorite, iron_stick, flower_of_strength, stick_of_strength, flower_of_jump, stick_of_jump, flower_of_heal, flower_of_speed, stick_of_heal, stick_of_speed;
	
	public static void init() {
		
		iron_stick = new Item().setUnlocalizedName("Iron_Stick").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":iron_stick");

		//fleurs de force / jump / heal / speed
		
		flower_of_strength = new Item().setUnlocalizedName("Flower_of_strength").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":brick_of_strength");
		flower_of_jump = new Item().setUnlocalizedName("Flower_of_jump").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":brick_of_jump");
		flower_of_heal = new Item().setUnlocalizedName("Flower_of_heal").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":brick_of_heal");
		flower_of_speed = new Item().setUnlocalizedName("Flower_of_speed").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":brick_of_speed");
		
		//sticks de force / jump / heal / speed
		
		stick_of_strength = new ItemStickStrength().setUnlocalizedName("Stick_of_strength").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":stick_of_strength");
		stick_of_jump = new ItemStickJump().setUnlocalizedName("Stick_of_jump").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":stick_of_jump");
		stick_of_heal = new ItemStickheal().setUnlocalizedName("Stick_of_heal").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":stick_of_heal");
		stick_of_speed = new ItemStickspeed().setUnlocalizedName("Stick_of_speed").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":stick_of_speed");
		
		//cristal des minerais
		
		rubis = new Item().setUnlocalizedName("Rubis").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":rubis");
		saphir = new Item().setUnlocalizedName("Saphir").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":saphire");
		fluorite = new Item().setUnlocalizedName("Fluorite").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":fluorite");
		
		//autres items
		
		super_gantlet = new Item().setUnlocalizedName("super_gantlet").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":super_gantlet");
		patato_bag = new PatatoBag().setUnlocalizedName("patato_bag").setCreativeTab(PvpMod.PvpTab).setTextureName(Reference.MODID + ":patato_bag");
		tp_cane = new TPCane().setUnlocalizedName("TPCane").setTextureName(Reference.MODID + ":tp_cane");
		
	}
	
	public static void register() {
		
		GameRegistry.registerItem(iron_stick, "iron_stick");
		GameRegistry.registerItem(flower_of_strength, "brick_of_strength");
		GameRegistry.registerItem(stick_of_strength, "stick_of_strength");
		GameRegistry.registerItem(flower_of_jump, "brick_of_jump");
		GameRegistry.registerItem(stick_of_jump, "stick_of_jump");
		GameRegistry.registerItem(flower_of_heal, "brick_of_heal");
		GameRegistry.registerItem(stick_of_heal, "stick_of_heal");
		GameRegistry.registerItem(flower_of_speed, "brick_of_speed");
		GameRegistry.registerItem(stick_of_speed, "stick_of_speed");
		GameRegistry.registerItem(rubis, "Rubis");
		GameRegistry.registerItem(saphir, "Saphir");
		GameRegistry.registerItem(super_gantlet, "super_gantlet");
		GameRegistry.registerItem(patato_bag, "patato_bag");
		GameRegistry.registerItem(tp_cane, "tp_cane");

	}
	
	public static void addRecipe() {
		
		GameRegistry.addRecipe(new ItemStack(ItemMod.iron_stick, 2), new Object[]{"###", "#/#", "#/#", '/', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flower_of_strength, 1), new Object[]{"ééé", "é/é", "é#é", '/', Items.brick, '#', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stick_of_strength, 1), new Object[]{"é#é", "é/é", "é/é", '/', ItemMod.iron_stick, '#', ItemMod.flower_of_strength});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flower_of_jump, 1), new Object[]{"ééé", "é/é", "é#é", '/', Items.brick, '#', Items.emerald});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stick_of_jump, 1), new Object[]{"é#é", "é/é", "é/é", '/', ItemMod.iron_stick, '#', ItemMod.flower_of_heal});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flower_of_heal, 1), new Object[]{"ééé", "é/é", "é#é", '/', Items.brick, '#', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stick_of_heal, 1), new Object[]{"é#é", "é/é", "é/é", '/', ItemMod.iron_stick, '#', ItemMod.flower_of_heal});
		GameRegistry.addRecipe(new ItemStack(ItemMod.flower_of_speed, 1), new Object[]{"ééé", "é/é", "é#é", '/', Items.brick, '#', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stick_of_speed, 1), new Object[]{"é#é", "é/é", "é/é", '/', ItemMod.iron_stick, '#', ItemMod.flower_of_speed});
		
	}

}