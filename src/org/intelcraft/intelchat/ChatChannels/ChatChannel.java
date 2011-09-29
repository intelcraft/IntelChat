package org.intelcraft.intelchat.ChatChannels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatChannel {
Collection<PlayerObject> players = new ArrayList<PlayerObject>();

ArrayList<String> muted = new ArrayList<String>();



String name = null;
public ChatChannel(String name,PlayerObject owner){
	this.name = name;
	this.players.add(owner);
}
public void sendMessage(String message){
	for(Player p : players){
		p.sendMessage(ChatColor.BLACK + "[" + ChatColor.BLUE + "name " + ChatColor.BLACK +  "]" + ChatColor.WHITE  + message);
	}
}
public String getName(){
	return this.name;
}
}
