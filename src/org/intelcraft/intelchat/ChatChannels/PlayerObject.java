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
	@Override
	public GameMode getGameMode() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PlayerInventory getInventory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemStack getItemInHand() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getSleepTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isSleeping() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setGameMode(GameMode arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setItemInHand(ItemStack arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void damage(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void damage(int arg0, Entity arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getEyeHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getEyeHeight(boolean arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Location getEyeLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getLastDamage() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Block> getLastTwoTargetBlocks(HashSet<Byte> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Block> getLineOfSight(HashSet<Byte> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMaximumAir() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMaximumNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getNoDamageTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getRemainingAir() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Block getTargetBlock(HashSet<Byte> arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isInsideVehicle() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean leaveVehicle() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setHealth(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLastDamage(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setMaximumAir(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setMaximumNoDamageTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setNoDamageTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setRemainingAir(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Arrow shootArrow() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Egg throwEgg() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Snowball throwSnowball() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean eject() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getEntityId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getFallDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public EntityDamageEvent getLastDamageCause() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMaxFireTicks() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Entity getPassenger() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Server getServer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UUID getUniqueId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vector getVelocity() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFallDistance(float arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFireTicks(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean setPassenger(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setVelocity(Vector arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean teleport(Location arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean teleport(Entity arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public PermissionAttachment addAttachment(Plugin arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PermissionAttachment addAttachment(Plugin arg0, String arg1,
			boolean arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasPermission(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasPermission(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isPermissionSet(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isPermissionSet(Permission arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void recalculatePermissions() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeAttachment(PermissionAttachment arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isOp() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setOp(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendMessage(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isBanned() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isOnline() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isWhitelisted() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setBanned(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setWhitelisted(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void awardAchievement(Achievement arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chat(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public InetSocketAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Location getBedSpawnLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Location getCompassTarget() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public float getExhaustion() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getExperience() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFoodLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long getPlayerTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long getPlayerTimeOffset() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getSaturation() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getTotalExperience() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void incrementStatistic(Statistic arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void incrementStatistic(Statistic arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void incrementStatistic(Statistic arg0, Material arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void incrementStatistic(Statistic arg0, Material arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isPlayerTimeRelative() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSleepingIgnored() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSneaking() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSprinting() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void kickPlayer(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean performCommand(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void playEffect(Location arg0, Effect arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playNote(Location arg0, byte arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playNote(Location arg0, Instrument arg1, Note arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resetPlayerTime() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendBlockChange(Location arg0, int arg1, byte arg2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3,
			byte[] arg4) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void sendMap(MapView arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendRawMessage(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCompassTarget(Location arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setDisplayName(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setExhaustion(float arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setExperience(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFoodLevel(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLevel(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPlayerTime(long arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSaturation(float arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSleepingIgnored(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSneaking(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSprinting(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setTotalExperience(int arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateInventory() {
		// TODO Auto-generated method stub
		
	}
}
