package fr.galaglow.modpvpfaction.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
	
	public static void mainRegistry() {
		
		RegisterWorldGen(new WorldGenFaction(), -1);
		RegisterWorldGen(new WorldGenFaction(), 0);
		RegisterWorldGen(new WorldGenFaction(), 1);
		
	}
	
	public static void RegisterWorldGen(IWorldGenerator iGenerator, int probability) {
		
		GameRegistry.registerWorldGenerator(iGenerator, probability);
		
	}

}
