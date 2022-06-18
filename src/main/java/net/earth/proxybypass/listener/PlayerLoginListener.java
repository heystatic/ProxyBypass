package net.earth.proxybypass.listener;

import net.earth.proxybypass.check.LoginCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerLoginListener implements Listener {

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        LoginCheck check = new LoginCheck(event);
        check.run();
    }
}
