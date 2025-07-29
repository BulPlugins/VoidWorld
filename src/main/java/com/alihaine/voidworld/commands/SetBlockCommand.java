package com.alihaine.voidworld.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import com.alihaine.bulmultiverse.command.BaseBmvCommand;
import org.bukkit.Material;
import org.bukkit.entity.Player;

@CommandAlias(BaseBmvCommand.commandRootAlias)
@CommandPermission("bulmultiverse.setblock")
public class SetBlockCommand extends BaseCommand {

    @Subcommand("setblock")
    @Description("Create a block at your position")
    @Syntax("/bmv setblock")
    public void onSetBlock(Player player) {
        player.getLocation().getBlock().setType(Material.BEDROCK);
    }
}
