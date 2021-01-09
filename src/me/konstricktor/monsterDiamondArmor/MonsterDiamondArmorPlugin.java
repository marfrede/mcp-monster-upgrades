package me.konstricktor.monsterDiamondArmor;

import org.bukkit.plugin.java.JavaPlugin;

import me.konstricktor.monsterDiamondArmor.listeners.Listeners;

public class MonsterDiamondArmorPlugin extends JavaPlugin {
	
	private static MonsterDiamondArmorPlugin monsterDiamondArmorPluginInstance;
	
	// private MonsterDiamondArmorPlugin() {}
	
	public static MonsterDiamondArmorPlugin getInstance() {
		return monsterDiamondArmorPluginInstance;
	}
	
	@Override
	public void onEnable() {
		monsterDiamondArmorPluginInstance = this;
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		monsterDiamondArmorPluginInstance = null;
		super.onDisable();
	}
}
