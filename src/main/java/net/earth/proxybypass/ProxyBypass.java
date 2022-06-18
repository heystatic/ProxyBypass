package net.earth.proxybypass;

import net.earth.proxybypass.command.Commandproxybypass;
import net.earth.proxybypass.configuration.Config;
import net.earth.proxybypass.listener.PlayerLoginListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProxyBypass extends JavaPlugin {

    @Override
    public void onEnable() {
        Config.getInstance().loadConfiguration();
        register();
    }

    @Override
    public void onDisable() {

    }

    private void register() {
        getCommand("proxybypass").setExecutor(new Commandproxybypass());
        this.getServer().getPluginManager().registerEvents(new PlayerLoginListener(), this);
    }

}
