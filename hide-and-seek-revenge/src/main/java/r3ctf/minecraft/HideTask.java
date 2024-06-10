package r3ctf.minecraft;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.World;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;

public class HideTask implements Runnable {

    private final JavaPlugin plugin;

    public HideTask(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        World world=plugin.getServer().getOnlinePlayers().iterator().next().getWorld();
        Iterator<Villager> vil = world.getEntitiesByClass(Villager.class).iterator();
        while (vil.hasNext()){
            vil.next().remove();
        }
    }
}
