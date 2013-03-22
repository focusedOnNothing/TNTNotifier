package com.github.dangerforthebrain2.TNTNotifier;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class TNTNotifierTNTListener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onBlockPlace(BlockPlaceEvent event){
		if (event.isCancelled()) return;
		
	//	Player player = event.getPlayer();
		
	   if (event.getBlock().getType() == Material.TNT){
	  // 	event.setCancelled(true);
	  //    event.getPlayer().sendMessage(ChatColor.RED + "WHOA SON, NO TNT ALOUD HERE!");
	    
	    for (Player onlinePlayer : Bukkit.getServer().getOnlinePlayers()){
	        	if (onlinePlayer.isOp()){
	        		event.setCancelled(false);
	        	}else 
	        		event.setCancelled(true);
	        	  //  event.getPlayer().sendMessage(ChatColor.RED + "WHOA SON, NO TNT ALOUD HERE!");
	    
	        
	        Player player1 = event.getPlayer();
	        
	        for (Player onlinePlayer1 : Bukkit.getServer().getOnlinePlayers()){
	        	if (onlinePlayer1.isOp()){
	        		onlinePlayer1.sendMessage(ChatColor.RED + player1.getName() + " Placed TNT");}}}}}
	            
	      
	  
	    
	@EventHandler(priority = EventPriority.HIGH)	
   public void  onExplosionPrime(ExplosionPrimeEvent event){
       if (event.isCancelled()) return;   
       
      if (event.getEntity()instanceof TNTPrimed){
    	  event.setCancelled(true);
  	    for (Player onlinePlayer : Bukkit.getServer().getOnlinePlayers()){
        	if (onlinePlayer.isOp()){
        		event.setCancelled(false);}
      }
   }

}}