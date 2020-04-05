package at.austerzockt.portals.config;

import at.austerzockt.portals.config.ConfigDefaults;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigHandler {
    private String configname;
    private File file;
    private YamlConfiguration configuration;
    private static File directory;
    public ConfigHandler(String configname, ConfigDefaults defaults)  {
        this.configname = configname;
        directory = new File("plugins/Portals");
        directory.mkdirs();
        file = new File(directory.getPath() + "/" + configname + ".yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            configuration = YamlConfiguration.loadConfiguration(file);
            defaults.createDefaults(configuration,file);
        }

    }

    public ConfigurationSection getSection(String name) {
        return configuration.getConfigurationSection(name);
    }
    public void save() {
        try {
            configuration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
