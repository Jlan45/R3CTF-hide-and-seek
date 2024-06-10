package r3ctf.minecraft;

import net.kyori.adventure.text.Component;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class AllListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().setGameMode(GameMode.SURVIVAL);
        event.getPlayer().sendTitle("§0W§1e§2l§3c§4o§5m§6e§7 §8t§9o§a §bR§c3§dC§eT§fF§g!", "Have fun!", 10, 70, 20);
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 99999, 20));

    }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        event.getPlayer().setGameMode(GameMode.SURVIVAL);
//        event.getPlayer().sendTitle("Welcome to R3CTF!", "Have fun!", 10, 70, 20);
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 99999, 20));
    }
}
