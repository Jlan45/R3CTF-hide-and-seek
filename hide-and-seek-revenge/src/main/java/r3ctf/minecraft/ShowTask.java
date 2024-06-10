package r3ctf.minecraft;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
        Location location = new Location(world, 512 * r.nextDouble(), -50 + 50 * r.nextDouble(), 512 * r.nextDouble());
        plugin.getLogger().log(Level.INFO,location.toString());
        Villager flag= world.spawn(location, Villager.class);
        flag.setAI(false);
        flag.setCustomName("R3CTF{You_2re_rea1ly_g00d_at_wr1ting_minecraft_sc2ip7s}");
        flag.setCustomNameVisible(false);
        flag.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 99999, 1));
    }
}
