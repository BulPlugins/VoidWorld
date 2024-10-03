package com.alihaine.voidworld;

import com.alihaine.bulmultiverse.BulMultiverse;
import com.alihaine.bulmultiverse.BulMultiverseAddon;
import com.alihaine.voidworld.listener.OnChunkLoad;
import com.alihaine.voidworld.options.Chunk;
import com.alihaine.voidworld.subcommands.SetBlock;
import com.alihaine.voidworld.subcommands.SetVoid;
import org.bukkit.Bukkit;

public class VoidWorld extends BulMultiverseAddon {

    @Override
    public void onEnable() {
        new Chunk();
        BulMultiverse.getBMVInstance().addCommand("setblock", new SetBlock());
        BulMultiverse.getBMVInstance().addCommand("setvoid", new SetVoid());
        BulMultiverse.getBulMultiverseInstance().getServer().getPluginManager().registerEvents(new OnChunkLoad(), BulMultiverse.getBulMultiverseInstance());
        Bukkit.getConsoleSender().sendMessage("§e[BulMultiverse] §aEnable the addon VoidWorld");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[BulMultiverse] Disable the addon VoidWorld");
    }
}
