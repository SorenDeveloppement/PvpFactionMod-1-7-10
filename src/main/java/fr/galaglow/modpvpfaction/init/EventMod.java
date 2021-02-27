package fr.galaglow.modpvpfaction.init;

import fr.galaglow.modpvpfaction.event.ChangeDrop;
import net.minecraftforge.common.MinecraftForge;

public class EventMod {
	
	public static void init() {
		
		MinecraftForge.EVENT_BUS.register(new ChangeDrop());
		
	}

}
