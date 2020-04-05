package at.austerzockt.portals.config;

import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.Yaml;

import java.io.File;

public interface ConfigDefaults {

    public void createDefaults(YamlConfiguration configuration, File file);
}
