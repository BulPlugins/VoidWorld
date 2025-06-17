package com.alihaine.voidworld.commands;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import com.alihaine.bulmultiverse.command.BaseBmvCommand;
import com.alihaine.voidworld.chunks.ChunkVoidMaker;
import org.bukkit.entity.Player;

@CommandAlias("bmv|bulmv|bulmultiverse")
@Description("The chunk at your position will be void")
@CommandPermission("bulmultiverse.setvoid")
public class SetVoidCommand extends BaseBmvCommand {

    @Subcommand("setvoid")
    public void onSetVoid(Player player) {
        ChunkVoidMaker.MakeChunkVoid(player.getLocation().getChunk());
    }
}
