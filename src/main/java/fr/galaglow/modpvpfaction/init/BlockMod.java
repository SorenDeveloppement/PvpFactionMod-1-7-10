package fr.galaglow.modpvpfaction.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.galaglow.modpvpfaction.PvpMod;
import fr.galaglow.modpvpfaction.Reference;
import fr.galaglow.modpvpfaction.blocks.MineraiRubis;
import fr.galaglow.modpvpfaction.blocks.MineraiSaphir;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockMod {
	
	public static Block rubis_block, saphir_block, fluorite_block;
	
	public static void init() {
		
		rubis_block = new MineraiRubis(Material.rock).setBlockName("Rubis_Ore").setCreativeTab(PvpMod.PvpTab).setBlockTextureName(Reference.MODID + ":minerai_rubis");
		saphir_block = new MineraiSaphir(Material.rock).setBlockName("Saphir_Ore").setCreativeTab(PvpMod.PvpTab).setBlockTextureName(Reference.MODID + ":minerai_saphire");
		fluorite_block = new MineraiSaphir(Material.rock).setBlockName("Fluorite_Ore").setCreativeTab(PvpMod.PvpTab).setBlockTextureName(Reference.MODID + ":minerai_fluorite");
		
	}
	
	public static void register() {
		
		GameRegistry.registerBlock(rubis_block, rubis_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(saphir_block, saphir_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(fluorite_block, fluorite_block.getUnlocalizedName().substring(5));
		
	}
	
	public static void addRecipe() {
		
		GameRegistry.addSmelting(rubis_block, new ItemStack(ItemMod.rubis), 10f);
		GameRegistry.addSmelting(saphir_block, new ItemStack(ItemMod.saphir), 10f);
		GameRegistry.addSmelting(fluorite_block, new ItemStack(ItemMod.fluorite), 10f);
		
	}

}
