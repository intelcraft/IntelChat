package org.intelcraft.intelchat.ChatChannels;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Server;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class PlayerObject implements Player{
 
	boolean op;
	String chatchannel;
	String playername;
	public PlayerObject(String playername,boolean op,String chatchannel){
		this.op = op;
		this.chatchannel = chatchannel;
		this.playername = playername;
	}

	
	public PlayerInventory getInventory() {
		
		return null;
	}
	
	public ItemStack getItemInHand() {
		
		return null;
	}
	
	public String getName() {
		
		return null;
	}
	
	public int getSleepTicks() {
		
		return 0;
	}
	
	public boolean isSleeping() {
		
		return false;
	}
	
	public void setGameMode(GameMode arg0) {
		
		
	}
	
	public void setItemInHand(ItemStack arg0) {
		
		
	}
	
	public void damage(int arg0) {
		
		
	}
	
	public void damage(int arg0, Entity arg1) {
		
		
	}
	
	public double getEyeHeight() {
		
		return 0;
	}
	
	public double getEyeHeight(boolean arg0) {
		
		return 0;
	}
	
	public Location getEyeLocation() {
		
		return null;
	}
	
	public int getHealth() {
		
		return 0;
	}
	
	public int getLastDamage() {
		
		return 0;
	}
	
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> arg0, int arg1) {
		
		return null;
	}
	
	public List<Block> getLineOfSight(HashSet<Byte> arg0, int arg1) {
		
		return null;
	}
	
	public int getMaximumAir() {
		
		return 0;
	}
	
	public int getMaximumNoDamageTicks() {
		
		return 0;
	}
	
	public int getNoDamageTicks() {
		
		return 0;
	}
	
	public int getRemainingAir() {
		
		return 0;
	}
	
	public Block getTargetBlock(HashSet<Byte> arg0, int arg1) {
		
		return null;
	}
	
	public Vehicle getVehicle() {
		
		return null;
	}
	
	public boolean isInsideVehicle() {
		
		return false;
	}
	
	public boolean leaveVehicle() {
		
		return false;
	}
	
	public void setHealth(int arg0) {
		
		
	}
	
	public void setLastDamage(int arg0) {
		
		
	}
	
	public void setMaximumAir(int arg0) {
		
		
	}
	
	public void setMaximumNoDamageTicks(int arg0) {
		
		
	}
	
	public void setNoDamageTicks(int arg0) {
		
		
	}
	
	public void setRemainingAir(int arg0) {
		
		
	}
	
	public Arrow shootArrow() {
		
		return null;
	}
	
	public Egg throwEgg() {
		
		return null;
	}
	
	public Snowball throwSnowball() {
		
		return null;
	}
	
	public boolean eject() {
		
		return false;
	}
	
	public int getEntityId() {
		
		return 0;
	}
	
	public float getFallDistance() {
		
		return 0;
	}
	
	public int getFireTicks() {
		
		return 0;
	}
	
	public EntityDamageEvent getLastDamageCause() {
		
		return null;
	}
	
	public Location getLocation() {
		
		return null;
	}
	
	public int getMaxFireTicks() {
		
		return 0;
	}
	
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		
		return null;
	}
	
	public Entity getPassenger() {
		
		return null;
	}
	
	public Server getServer() {
		
		return null;
	}
	
	public UUID getUniqueId() {
		
		return null;
	}
	
	public Vector getVelocity() {
		
		return null;
	}
	
	public World getWorld() {
		
		return null;
	}
	
	public boolean isDead() {
		
		return false;
	}
	
	public boolean isEmpty() {
		
		return false;
	}
	
	public void remove() {
		
		
	}
	
	public void setFallDistance(float arg0) {
		
		
	}
	
	public void setFireTicks(int arg0) {
		
		
	}
	
	public void setLastDamageCause(EntityDamageEvent arg0) {
		
		
	}
	
	public boolean setPassenger(Entity arg0) {
		
		return false;
	}
	
	public void setVelocity(Vector arg0) {
		
		
	}
	
	public boolean teleport(Location arg0) {
		
		return false;
	}
	
	public boolean teleport(Entity arg0) {
		
		return false;
	}
	
	public PermissionAttachment addAttachment(Plugin arg0) {
		
		return null;
	}
	
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		
		return null;
	}
	
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2) {
		
		return null;
	}
	
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2, int arg3) {
		
		return null;
	}
	
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		
		return null;
	}
	
	public boolean hasPermission(String arg0) {
		
		return false;
	}
	
	public boolean hasPermission(Permission arg0) {
		
		return false;
	}
	
	public boolean isPermissionSet(String arg0) {
		
		return false;
	}
	
	public boolean isPermissionSet(Permission arg0) {
		
		return false;
	}
	
	public void recalculatePermissions() {
		
		
	}
	
	public void removeAttachment(PermissionAttachment arg0) {
		
		
	}
	
	public boolean isOp() {
		
		return false;
	}
	
	public void setOp(boolean arg0) {
		
		
	}
	
	public void sendMessage(String arg0) {
		
		
	}
	
	public boolean isBanned() {
		
		return false;
	}
	
	public boolean isOnline() {
		
		return false;
	}
	
	public boolean isWhitelisted() {
		
		return false;
	}
	
	public void setBanned(boolean arg0) {
		
		
	}
	
	public void setWhitelisted(boolean arg0) {
		
		
	}
	
	public void awardAchievement(Achievement arg0) {
		
		
	}
	
	public void chat(String arg0) {
		
		
	}
	
	public InetSocketAddress getAddress() {
		
		return null;
	}
	
	public Location getBedSpawnLocation() {
		
		return null;
	}
	
	public Location getCompassTarget() {
		
		return null;
	}
	
	public String getDisplayName() {
		
		return null;
	}
	
	public float getExhaustion() {
		
		return 0;
	}
	
	public int getExperience() {
		
		return 0;
	}
	
	public int getFoodLevel() {
		
		return 0;
	}
	
	public int getLevel() {
		
		return 0;
	}
	
	public long getPlayerTime() {
		
		return 0;
	}
	
	public long getPlayerTimeOffset() {
		
		return 0;
	}
	
	public float getSaturation() {
		
		return 0;
	}
	
	public int getTotalExperience() {
		
		return 0;
	}
	
	public void incrementStatistic(Statistic arg0) {
		
		
	}
	
	public void incrementStatistic(Statistic arg0, int arg1) {
		
		
	}
	
	public void incrementStatistic(Statistic arg0, Material arg1) {
		
		
	}
	
	public void incrementStatistic(Statistic arg0, Material arg1, int arg2) {
		
		
	}
	
	public boolean isPlayerTimeRelative() {
		
		return false;
	}
	
	public boolean isSleepingIgnored() {
		
		return false;
	}
	
	public boolean isSneaking() {
		
		return false;
	}
	
	public boolean isSprinting() {
		
		return false;
	}
	
	public void kickPlayer(String arg0) {
		
		
	}
	
	public void loadData() {
		
		
	}
	
	public boolean performCommand(String arg0) {
		
		return false;
	}
	
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		
		
	}
	
	public void playNote(Location arg0, byte arg1, byte arg2) {
		
		
	}
	
	public void playNote(Location arg0, Instrument arg1, Note arg2) {
		
		
	}
	
	public void resetPlayerTime() {
		
		
	}
	
	public void saveData() {
		
		
	}
	
	public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
		
		
	}
	
	public void sendBlockChange(Location arg0, int arg1, byte arg2) {
		
		
	}
	
	public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3,
			byte[] arg4) {
		
		return false;
	}
	
	public void sendMap(MapView arg0) {
		
		
	}
	
	public void sendRawMessage(String arg0) {
		
		
	}
	
	public void setCompassTarget(Location arg0) {
		
		
	}
	
	public void setDisplayName(String arg0) {
		
		
	}
	
	public void setExhaustion(float arg0) {
		
		
	}
	
	public void setExperience(int arg0) {
		
		
	}
	
	public void setFoodLevel(int arg0) {
		
		
	}
	
	public void setLevel(int arg0) {
		
		
	}
	
	public void setPlayerTime(long arg0, boolean arg1) {
		
		
	}
	
	public void setSaturation(float arg0) {
		
		
	}
	
	public void setSleepingIgnored(boolean arg0) {
		
		
	}
	
	public void setSneaking(boolean arg0) {
		
		
	}
	
	public void setSprinting(boolean arg0) {
		
		
	}
	
	public void setTotalExperience(int arg0) {
		
		
	}
	
	public void updateInventory() {
		
		
	}

	
	public GameMode getGameMode() {
		
		return null;
	}
}
