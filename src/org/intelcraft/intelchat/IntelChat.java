/**
 * IntelCraft Development™
 *
 * IntelChat™ v1.0
 * Created by Oliver Yasuna
 *
 * Source Approved and Distributed by Oliver Yasuna
 **/

package org.intelcraft.intelchat;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;
import org.intelcraft.intelchat.listeners.playerListener;
import org.intelcraft.intelchat.updater.UpdatePlugin;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class IntelChat extends JavaPlugin
{
	private boolean updateAvailable = false;
	private PluginManager pm;

	public final Logger log = Logger.getLogger("Minecraft");

	public PluginDescriptionFile pdfFile;

	private final playerListener PlayerListener = new playerListener(this);

	public Map<Player, Player> chatType = new HashMap<Player, Player>();

	public Configuration config;
	public Configuration chatConfig;
	public Configuration serverConfig;

	public void onEnable()
	{
		boolean cancel = false;

		pdfFile = getDescription();
		pm = getServer().getPluginManager();

		log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Checking for updates...");
		if(UpdatePlugin.isUpToDate(pdfFile.getVersion(), UpdatePlugin.getLatestVersion("http://oyasdev.site40.net/latest.html")))
		{
			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Up to date!");
		} else {
			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] UPDATE AVAILABLE!");

			cancel = true;
			updateAvailable = true;

			pm.disablePlugin(this);
		}

		if(!cancel)
		{
			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Enabling...");

			config = new Configuration(new File(getDataFolder().getPath() + "/config.yml"));
			config.load();
			chatConfig = new Configuration(new File(getDataFolder().getPath() + "/chat.yml"));
			chatConfig.load();
			serverConfig = new Configuration(new File(getDataFolder().getPath() + "/global.yml"));
			serverConfig.load();

			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Successfully enabled!");

			pm.registerEvent(Event.Type.PLAYER_JOIN, PlayerListener, Event.Priority.Normal, this);
			pm.registerEvent(Event.Type.PLAYER_QUIT, PlayerListener, Event.Priority.Normal, this);
			pm.registerEvent(Event.Type.PLAYER_CHAT, PlayerListener, Event.Priority.Normal, this);
		}
	}
	public void onDisable()
	{
		log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Disabled.");
		log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Thanks for using!");

		if(updateAvailable)
		{
			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Downloading update...");

			UpdatePlugin.update("http://oyasdev.site40.net/ChatWithMe.jar", getDataFolder().getPath() + ".jar");

			log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Update complete!");

			if(config.getBoolean("reloadOnUpdate", false))
			{
				getServer().reload();
			} else {
				log.info("[" + pdfFile.getName() + " v" + pdfFile.getVersion() + "] Reload the server to apply changes.");
			}
		}
	}
	public boolean onCommand(CommandSender sender, Command cmd, String cmdStr, String[] args)
	{
		if(sender instanceof Player)
		{
			Player player = (Player)sender;

			if(chk(cmdStr, "chat", "ch"))
			{
				if(chk(args[0], "private", "pv")) //Private Chatting
				{
					if(player.hasPermission("ic.chat.private"))
					{
						if(getServer().getPlayer(args[1]).isOnline())
						{
							if(chatType.get(player) != getServer().getPlayer(args[1]))
							{
								chatType.put(player, getServer().getPlayer(args[1]));

								player.sendMessage(ChatColor.GREEN + "Started chat with " + ChatColor.YELLOW + getServer().getPlayer(args[1]).getName() + ".");
							} else {
								player.sendMessage(ChatColor.RED + "You are already chatting with this person.");
							}
						} else {
							player.sendMessage(ChatColor.RED + "That player is not online.");
						}
					} else {
						player.sendMessage(ChatColor.RED + "You don't have permission.");
					}
				} else if(chk(args[0], "public", "pl")) { //Public Chatting
					if(chatType.get(player) != null)
					{
						chatType.put(player, null);

						player.sendMessage(ChatColor.GREEN + "You are now chatting publicly.");
					} else {
						player.sendMessage(ChatColor.RED + "You are already in public chat,");
					}
				} else if(chk(args[0], "group", "g")) { //Group Chatting
					if(player.hasPermission("ic.chat.group"))
					{
						//TODO: Implement group chat
					}
				} else if(chk(args[0], "global", "gb")) { //Global Chatting
					if(player.hasPermission("ic.chat.global"))
					{
						//TODO: Finish multiple server communication

						final Collection<String> serversList = new ArrayList<String>();
						try {
							FileInputStream fstream = new FileInputStream(new File(getDataFolder().getPath() + "/chat.yml"));
							DataInputStream in = new DataInputStream(fstream);
							BufferedReader br = new BufferedReader(new InputStreamReader(in));

							String s = null;
							while((s = br.readLine()) != null)
							{
								if(!s.startsWith(" "))
								{
									serversList.add(s.split(": ")[0]);
								}
							}

							in.close();
						} catch(FileNotFoundException e) {
							e.printStackTrace();
						} catch(IOException e) {
							e.printStackTrace();
						}

						for(final String s : serversList)
						{
							if(chk(args[1], s))
							{
								String hostname = serverConfig.getString(s + ".hostname");
								int port = serverConfig.getInt(s + ".port", 25565);

								if(Protocol.checkOnline(hostname, port))
								{
									player.sendMessage(ChatColor.GREEN + "Successfully connected to server.");
								} else {
									player.sendMessage(ChatColor.RED + "Unable to find " + hostname + ":" + Integer.toString(port) + ".");
								}
							}
						}
					} else {
						player.sendMessage(ChatColor.RED + "You don't have permission.");
					}
				} else if(chk(args[0], "setname", "sn")) {
					final String[] colors = {"aqua", "black", "blue", "darkaqua", "darkblue", "darkgray", "darkgreen", "darkpurple",
							"darkred", "gold", "gray", "green", "lightpurple", "red", "white", "yellow"};
					final ChatColor[] colorsC = {ChatColor.AQUA, ChatColor.BLACK, ChatColor.BLUE, ChatColor.DARK_AQUA,
							ChatColor.DARK_BLUE, ChatColor.DARK_GRAY, ChatColor.DARK_GREEN, ChatColor.DARK_PURPLE,
							ChatColor.DARK_RED, ChatColor.GOLD, ChatColor.GRAY, ChatColor.GREEN,
							ChatColor.LIGHT_PURPLE, ChatColor.RED, ChatColor.WHITE, ChatColor.YELLOW};
					int i = 0;

					if(player.hasPermission("ic.setname.allow"))
					{
						String format = args[1];

						for(final String s : colors)
						{
							if(player.hasPermission("ic.setname." + s) || player.hasPermission("ic.setname.allcol"))
							{
								format = format.replaceAll("%" + s + "%", colorsC[i].toString());

								i = i + 1;
							}
						}
						/*if(player.hasPermission("ic.setname.aqua") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%aqua%", ChatColor.AQUA.toString());
						}
						if(player.hasPermission("ic.setname.black") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%black%", ChatColor.BLACK.toString());
						}
						if(player.hasPermission("ic.setname.blue") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%blue%", ChatColor.BLUE.toString());
						}
						if(player.hasPermission("ic.setname.darkaqua") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkaqua%", ChatColor.DARK_AQUA.toString());
						}
						if(player.hasPermission("ic.setname.darkblue") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkblue%", ChatColor.DARK_BLUE.toString());
						}
						if(player.hasPermission("ic.setname.darkgray") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkgray%", ChatColor.DARK_GRAY.toString());
						}
						if(player.hasPermission("ic.setname.darkgreen") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkgreen%", ChatColor.DARK_GREEN.toString());
						}
						if(player.hasPermission("ic.setname.darkpurple") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkpurple%", ChatColor.DARK_PURPLE.toString());
						}
						if(player.hasPermission("ic.setname.darkred") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%darkred%", ChatColor.DARK_RED.toString());
						}
						if(player.hasPermission("ic.setname.gold") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%gold%", ChatColor.GOLD.toString());
						}
						if(player.hasPermission("ic.setname.gray") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%gray%", ChatColor.GRAY.toString());
						}
						if(player.hasPermission("ic.setname.green") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%green%", ChatColor.GREEN.toString());
						}
						if(player.hasPermission("ic.setname.lightpurple") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%lightpurple%", ChatColor.LIGHT_PURPLE.toString());
						}
						if(player.hasPermission("ic.setname.red") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%red%", ChatColor.RED.toString());
						}
						if(player.hasPermission("ic.setname.white") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%white%", ChatColor.WHITE.toString());
						}
						if(player.hasPermission("ic.setname.yellow") || player.hasPermission("ic.setname.allcol"))
						{
							format = format.replaceAll("%yellow%", ChatColor.YELLOW.toString());
						}*/

						format = format.replaceAll("%name%", player.getName());

						player.setDisplayName(format);
					} else {
						player.sendMessage(ChatColor.RED + "You don't have permission.");
					}
				}
			}

			return true;
		} else {
			log.severe("You cannot use this command from console.");
		}

		return false;
	}

	private boolean chk(String read, String ... inputs)
	{
		for(final String i : inputs)
		{
			if(read.equalsIgnoreCase(i))
			{
				return true;
			}
		}

		return false;
	}
}
