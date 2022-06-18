package net.earth.proxybypass;

public interface Info {

    String VERSION = ProxyBypass.getPlugin(ProxyBypass.class).getDescription().getVersion();
    String PERMISSION_USE = "proxybypass.use";

    String MESSAGE_PREFIX = "§8[§6ProxyBypass§8]";
    String MESSAGE_USAGE = "§7Usage§8: §b/proxybypass [reload|version]";
    String MESSAGE_INSUFFICIENT_PERMISSION = "§cYou do not have permission to run this command.";
    String MESSAGE_RELOAD_CONFIGURATION = "§aConfiguration successfully reloaded.";
    String MESSAGE_CHECK_VERSION = "§7This plugin is running version " + VERSION + ".";
}