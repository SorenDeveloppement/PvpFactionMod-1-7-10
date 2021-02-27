package fr.galaglow.modpvpfaction.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import fr.galaglow.modpvpfaction.init.BlockMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenFaction implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		
			case -1:
				GenerateNether(world, chunkX * 16, chunkZ * 16, random);
			
			case 0:
				GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
				
			case 1:
				GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
		
		}
		
	}
	
	private void addOres(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance) {
		
		for(int i = 0; i < spawnChance; i++) {
			
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
			
		}
		
	}

	private void GenerateEnd(World world, int i, int j, Random random) {
		
		
	}

	private void GenerateOverWorld(World world, int i, int j, Random random) {
		
		addOres(BlockMod.rubis_block, Blocks.stone, random, world, i, j, 3, 10, 1, 4, 10);
		addOres(BlockMod.saphir_block, Blocks.stone, random, world, i, j, 5, 10, 1, 5, 10);
		addOres(BlockMod.fluorite_block, Blocks.stone, random, world, i, j, 3, 6, 1, 2, 2);
		
	}

	private void GenerateNether(World world, int i, int j, Random random) {
		
		
	}

}
