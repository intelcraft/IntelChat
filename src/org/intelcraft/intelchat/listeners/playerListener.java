package org.intelcraft.intelchat.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.intelcraft.intelchat.IntelChat;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class playerListener extends PlayerListener
{
	private IntelChat intelChat;
	public playerListener(IntelChat intelChat)
	{
		this.intelChat = intelChat;
	}

	public String censor(String message, String[] censor)
	{
		for(final String s : censor)
		{
			if(message.contains(s))
			{
				int length = s.length();

				String hash = "";
				for(int i = 0 ; i != length ; i++)
				{
					hash = hash + "*";
				}

				return (message = message.replaceAll(s, hash));
			}
		}

		return message;
	}

	public void onPlayerChat(PlayerChatEvent event)
	{
		Player player = event.getPlayer();

		if(intelChat.chatType.get(player) != null)
		{
			event.setCancelled(true);

			player.sendMessage("To " + ChatColor.YELLOW + intelChat.chatType.get(player).getName() + ": " + ChatColor.WHITE + event.getMessage());
			intelChat.chatType.get(player).sendMessage("From " + ChatColor.YELLOW + player.getName() + ": " + ChatColor.WHITE + event.getMessage());
		} else {
			event.setCancelled(true);

			String words = intelChat.config.getString("censor");
			String[] censorList = words.split(",");
			for(final Player players : intelChat.getServer().getOnlinePlayers())
			{
				String censored = censor(event.getMessage(), censorList);

				players.sendMessage(player.getDisplayName() + " " + censored);
			}
		}
	}

	public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();

		intelChat.chatType.put(player, null);

		final Collection<String> groupsList = new ArrayList<String>();
		try {
			FileInputStream fstream = new FileInputStream(new File(intelChat.getDataFolder().getPath() + "/chat.yml"));
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String s = null;
			while((s = br.readLine()) != null)
			{
				groupsList.add(s.split(": ")[0]);
			}

			in.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		for(final String s : groupsList)
		{
			if(player.hasPermission("ic." + s))
			{
				String format = intelChat.chatConfig.getString(s);

				format = format.replaceAll("%aqua%", ChatColor.AQUA.toString());
				format = format.replaceAll("%black%", ChatColor.BLACK.toString());
				format = format.replaceAll("%blue%", ChatColor.BLUE.toString());
				format = format.replaceAll("%darkaqua%", ChatColor.DARK_AQUA.toString());
				format = format.replaceAll("%darkblue%", ChatColor.DARK_BLUE.toString());
				format = format.replaceAll("%darkgray%", ChatColor.DARK_GRAY.toString());
				format = format.replaceAll("%darkgreen%", ChatColor.DARK_GREEN.toString());
				format = format.replaceAll("%darkpurple%", ChatColor.DARK_PURPLE.toString());
				format = format.replaceAll("%darkred%", ChatColor.DARK_RED.toString());
				format = format.replaceAll("%gold%", ChatColor.GOLD.toString());
				format = format.replaceAll("%gray%", ChatColor.GRAY.toString());
				format = format.replaceAll("%green%", ChatColor.GREEN.toString());
				format = format.replaceAll("%lightpurple%", ChatColor.LIGHT_PURPLE.toString());
				format = format.replaceAll("%red%", ChatColor.RED.toString());
				format = format.replaceAll("%white%", ChatColor.WHITE.toString());
				format = format.replaceAll("%yellow%", ChatColor.YELLOW.toString());
				format = format.replaceAll("%name%", player.getName());

				player.setDisplayName(format);
			}
		}
	}

	public void onPlayerQuit(PlayerQuitEvent event)
	{
		Player player = event.getPlayer();

		if(intelChat.chatType.get(player) != null)
		{
			intelChat.chatType.put(player, null);
			intelChat.chatType.put(intelChat.chatType.get(player), null);

			intelChat.chatType.get(player).sendMessage(ChatColor.GREEN + "Chat ended with " + player.getName() + ".");
			intelChat.chatType.get(player).sendMessage(ChatColor.GREEN + "Reason: Player Disconnected.");
		}
	}
}
