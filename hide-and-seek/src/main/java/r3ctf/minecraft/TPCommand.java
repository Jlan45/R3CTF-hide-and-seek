package r3ctf.minecraft;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TPCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player= (Player) commandSender;
        try {
            Double.parseDouble(strings[0]);
            Double.parseDouble(strings[1]);
            Double.parseDouble(strings[2]);
        }catch (Exception e){
            return false;
        }
        if(Double.parseDouble(strings[0])<129 && Double.parseDouble(strings[0])>=0 && Double.parseDouble(strings[1])<51 && Double.parseDouble(strings[1])>-51 && Double.parseDouble(strings[2])<129 && Double.parseDouble(strings[2])>=0){
            player.teleport(new Location(player.getWorld(),Double.parseDouble(strings[0]),Double.parseDouble(strings[1]),Double.parseDouble(strings[2])));
        }
        else {
            return false;
        }
        return true;
    }
}