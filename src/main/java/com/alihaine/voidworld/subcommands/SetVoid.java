package com.alihaine.voidworld.subcommands;

import com.alihaine.bulmultiverse.command.SubCommand;
import com.alihaine.voidworld.chunks.ChunkVoidMaker;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class SetVoid implements SubCommand {
    @Override
    public void executor(CommandSender sender, List<String> list) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§e[BULMultiverse] §cThis command can be executed only in-game");
            return;
        }

        Player player = (Player) sender;
        ChunkVoidMaker.MakeChunkVoid(player.getLocation().getChunk());
    }

    @Override
    public String getUsage() {
        return "/bmv setvoid";
    }

    @Override
    public String getDescription() {
        return "The chunk at your position will be void";
    }
}
