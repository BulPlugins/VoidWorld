package com.alihaine.voidworld.commands;

import co.aikar.commands.annotation.*;
import com.alihaine.bulmultiverse.command.BaseBmvCommand;
import com.alihaine.voidworld.chunks.ChunkVoidMaker;
import org.bukkit.entity.Player;

@CommandAlias("bmv|bulmv|bulmultiverse")
@CommandPermission("bulmultiverse.setvoid")
public class SetVoidCommand extends BaseBmvCommand {

    @Subcommand("setvoid")
    @Description("The chunk at your position will be void")
    @Syntax("/bmv setvoid")
    public void onSetVoid(Player player) {
        ChunkVoidMaker.MakeChunkVoid(player.getLocation().getChunk());
    }
}
