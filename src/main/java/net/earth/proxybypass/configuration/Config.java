package net.earth.proxybypass.configuration;

import net.earth.proxybypass.ProxyBypass;
import org.bukkit.ChatColor;

import java.util.List;

public class Config {

    private static final Config INSTANCE = new Config();

    private final ProxyBypass plugin = ProxyBypass.getPlugin(ProxyBypass.class);

    private Config() {}

    public static Config getInstance() {
        return INSTANCE;
    }

    public void loadConfiguration() {
        plugin.saveDefaultConfig();
        plugin.reloadConfig();
    }

    public List<String> getProxyAddresses() {
        return plugin.getConfig().getStringList("proxy-addresses");
    }

    public String getKickMessage() {
        return ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("kick-message"));
    }
}
