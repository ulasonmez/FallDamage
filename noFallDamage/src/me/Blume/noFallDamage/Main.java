package me.Blume.noFallDamage;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.noFallDamage.Commands.addplayer;
import me.Blume.noFallDamage.Commands.removeplayer;
import me.Blume.noFallDamage.Listeners.nofallevent;


public class Main extends JavaPlugin{
	public ArrayList<UUID> nofall = new ArrayList<UUID>();
	@Override
	public void onEnable() {
		getCommand("addnofall").setExecutor(new addplayer(this));
		getCommand("removenofall").setExecutor(new removeplayer(this));
		getServer().getPluginManager().registerEvents(new nofallevent(this), this);
	}
	@Override
	public void onDisable() {
		
	}
	public ArrayList<UUID> getnofall(){
		return nofall;
	}
	public void addnofall(Player player) {
		nofall.add(player.getUniqueId());
	}
	public void removenofall(Player player) {
		nofall.remove(player.getUniqueId());
	}
}
