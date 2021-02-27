package fr.galaglow.modpvpfaction.init;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class PatatoBag extends Item{
	
	static int MAX_AMMOUNT = 300;
	
	public PatatoBag() {
		this.maxStackSize = 1;
	}
	
	public static boolean addPotatoes(ItemStack bag, int increment) {
		
		initTagCompound(bag);
		int numberOfPotateos = getNumberOfPotatoes(bag);
		if (numberOfPotateos >= MAX_AMMOUNT)
			return false;
		
		bag.getTagCompound().setInteger("potatoAmmount", numberOfPotateos + increment);
		return true;
	}

	private static int getNumberOfPotatoes(ItemStack bag) {
		
		initTagCompound(bag);
		return bag.getTagCompound().getInteger("potatoAmmount");
	}
	
	public static boolean removePotateos(ItemStack bag, int decrement) {
		
		initTagCompound(bag);
		int numberOfPotateos = getNumberOfPotatoes(bag);
		
		if (numberOfPotateos < decrement)
			return false;
		
		bag.getTagCompound().setInteger("potatoAmmount", numberOfPotateos - decrement);
		return true;
	}

	private static void initTagCompound(ItemStack bag) {
		
		if (!bag.hasTagCompound()) {
			
			NBTTagCompound comp = new NBTTagCompound();
			comp.setInteger("potatoAmmount", 0);
			bag.setTagCompound(comp);
			
		}
		
		if (!bag.getTagCompound().hasKey("potatoAmmount")) {
			
			NBTTagCompound comp = bag.getTagCompound();
			comp.setInteger("potatoAmmount", 0);
			bag.setTagCompound(comp);
			
		}
		
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
		
		list.add("§4" + getNumberOfPotatoes(stack) + "§c patates dans le sac !");
		super.addInformation(stack, player, list, b);
		
	}

}
