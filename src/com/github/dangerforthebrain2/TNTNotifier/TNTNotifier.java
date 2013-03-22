package com.github.dangerforthebrain2.TNTNotifier;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TNTNotifier extends JavaPlugin{
		 
	    public void onEnable(){
	    	PluginManager manager = this.getServer().getPluginManager();
	    	
	    	manager.registerEvents(new TNTNotifierTNTListener(), this);
	    }
	 
	    public void onDisable(){
	    	
	    }
}