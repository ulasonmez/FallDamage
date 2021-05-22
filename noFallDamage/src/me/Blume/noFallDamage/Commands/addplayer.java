package me.Blume.noFallDamage.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Blume.noFallDamage.Main;

public class addplayer implements CommandExecutor{

	private Main plugin;
	public addplayer(Main plugin) {
		this.plugin=plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length==0) {
				if(label.equals("addnofall")) {
					if(!plugin.getnofall().contains(player.getUniqueId())) {
						player.sendMessage("No fall added");
						plugin.addnofall(player);
					}
				}
			}
		}


		return false;
	}
}
