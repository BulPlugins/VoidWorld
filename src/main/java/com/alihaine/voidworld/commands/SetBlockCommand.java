package com.alihaine.voidworld.commands;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import com.alihaine.bulmultiverse.command.BaseBmvCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@CommandAlias("bmv|bulmv|bulmultiverse")
@Description("Create a block at your position")
@CommandPermission("bulmultiverse.setblock")
public class SetBlockCommand extends BaseBmvCommand {

    @Subcommand("setblock")
    public void onSetBlock(Player player) {
        player.getLocation().getBlock().setType(Material.BEDROCK);
    }
}
