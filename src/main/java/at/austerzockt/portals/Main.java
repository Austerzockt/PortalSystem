package at.austerzockt.portals;

import at.austerzockt.portals.config.ConfigHandler;
import at.austerzockt.portals.config.PortalsDefaults;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static ConfigHandler portals;

    @Override
    public void onEnable() {
        portals = new ConfigHandler("portals", new PortalsDefaults());
    }
}
