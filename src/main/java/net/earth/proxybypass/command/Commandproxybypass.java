package net.earth.proxybypass.command;

import net.earth.proxybypass.configuration.Config;
import net.earth.proxybypass.Info;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commandproxybypass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!sender.hasPermission(Info.PERMISSION_USE)) {
            sender.sendMessage(Info.MESSAGE_PREFIX + Info.MESSAGE_INSUFFICIENT_PERMISSION);
            return true;
        }

        if(args.length != 1) {
            showUsage(sender);
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "reload", "rl" -> runReload(sender);
            case "version", "ver" -> runVersion(sender);
            default -> showUsage(sender);
        }

        return true;
    }

    private void showUsage(CommandSender sender) {
        sender.sendMessage(Info.MESSAGE_PREFIX + Info.MESSAGE_USAGE);
    }

    private void runReload(CommandSender sender) {
        Config.getInstance().loadConfiguration();
        sender.sendMessage(Info.MESSAGE_PREFIX + Info.MESSAGE_RELOAD_CONFIGURATION);
    }

    private void runVersion(CommandSender sender) {
        sender.sendMessage(Info.MESSAGE_CHECK_VERSION);
    }
}
