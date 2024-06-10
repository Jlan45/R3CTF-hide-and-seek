package r3ctf.minecraft;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

public final class Hide_and_seek extends JavaPlugin {

    @Override
    public void onEnable() {
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new ShowTask(this), 0L, 400L);
        scheduler.scheduleSyncRepeatingTask(this, new HideTask(this), 200L, 400L);
        getCommand("newtp").setExecutor(new TPCommand());
        getServer().getPluginManager().registerEvents(new AllListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
