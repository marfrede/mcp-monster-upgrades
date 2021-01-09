package me.konstricktor.monsterDiamondArmor.listeners;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Listeners implements Listener {
	
	@EventHandler
	public void event(CreatureSpawnEvent creatureSpwanEvent) {
		if(creatureSpwanEvent.getEntityType() == EntityType.CREEPER) {
			Creeper creeper = (Creeper) creatureSpwanEvent.getEntity();
			creeper.setExplosionRadius(creeper.getExplosionRadius() * 5);
		}
		if(creatureSpwanEvent.getEntityType() == EntityType.SKELETON) {
			Skeleton skeleton = (Skeleton) creatureSpwanEvent.getEntity();
			skeleton.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
			skeleton.getEquipment().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
			skeleton.getEquipment().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
			skeleton.getEquipment().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
		}
		if(creatureSpwanEvent.getEntityType() == EntityType.ZOMBIE) {
			Zombie zombie = (Zombie) creatureSpwanEvent.getEntity();
			zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
			zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
			zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
			zombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
		}
	}
}
