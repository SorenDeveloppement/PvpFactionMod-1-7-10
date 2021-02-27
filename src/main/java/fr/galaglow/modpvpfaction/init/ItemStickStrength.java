package fr.galaglow.modpvpfaction.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemStickStrength extends Item{
	
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
		p_77659_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 450, 2));
        return p_77659_1_;
    }

}
