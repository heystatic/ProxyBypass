package net.earth.proxybypass.check;

import net.earth.proxybypass.Check;
import net.earth.proxybypass.configuration.Config;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginCheck implements Check {

    private final PlayerLoginEvent event;

    public LoginCheck(PlayerLoginEvent event) {
        this.event = event;
    }

    @Override
    public void run() {
         if(Config.getInstance().getProxyAddresses()
                 .stream()
                 .anyMatch(address -> event.getAddress().getHostAddress().contains(address))) {

             event.disallow(PlayerLoginEvent.Result.KICK_OTHER, Config.getInstance().getKickMessage());
         }
    }
}