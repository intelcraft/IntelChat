package org.intelcraft.intelchat.ChatChannels;

import org.bukkit.entity.Player;

public abstract class PlayerObject implements Player{
 
	boolean op;
	String chatchannel;
	public PlayerObject(boolean op,String chatchannel){
		this.op = op;
		this.chatchannel = chatchannel;
	}
}
