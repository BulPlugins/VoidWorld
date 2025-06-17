package com.alihaine.voidworld.commands;

import co.aikar.commands.annotation.*;
import com.alihaine.bulmultiverse.command.BaseBmvCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@CommandAlias("bmv|bulmv|bulmultiverse")
@CommandPermission("bulmultiverse.setblock")
public class SetBlockCommand extends BaseBmvCommand {

    @Subcommand("setblock")
    @Description("Create a block at your position")
    @Syntax("/bmv setblock")
    public void onSetBlock(Player player) {
        player.getLocation().getBlock().setType(Material.BEDROCK);
    }
}
