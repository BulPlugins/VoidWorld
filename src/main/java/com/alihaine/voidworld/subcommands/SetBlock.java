package com.alihaine.voidworld.subcommands;

import com.alihaine.bulmultiverse.command.SubCommand;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class SetBlock implements SubCommand {
    @Override
    public void executor(CommandSender sender, List<String> list) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§e[BULMultiverse] §cThis command can be executed only in-game");
            return;
        }

        Player player = (Player) sender;
        player.getLocation().getBlock().setType(Material.BEDROCK);
    }

    @Override
    public String getUsage() {
        return "/setblock";
    }

    @Override
    public String getDescription() {
        return "Create a block at your position";
    }
}
