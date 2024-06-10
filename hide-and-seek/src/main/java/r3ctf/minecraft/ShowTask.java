package r3ctf.minecraft;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.logging.Level;

public class ShowTask implements Runnable {

    private final JavaPlugin plugin;

    public ShowTask(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        // 你需要在运行的时候执行的内容放这
        World world =plugin.getServer().getWorld("world");
        Random r = new Random();
//        Villager flag= player.getWorld().spawn(player.getLocation(), Villager.class);
        Location location = new Location(world, 128 * r.nextDouble(), -50 + 50 * r.nextDouble(), 128 * r.nextDouble());
        plugin.getLogger().log(Level.INFO,location.toString());
        Villager flag= world.spawn(location, Villager.class);
        flag.setAI(false);
        flag.setCustomName("R3CTF{Jus7_play_m0r3_h1de_2nd_seek_w1th_Ben}");
        flag.setCustomNameVisible(false);
    }
}
