package com.alihaine.voidworld;

import com.alihaine.bulmultiverse.BulMultiverse;
import com.alihaine.bulmultiverse.BulMultiverseAddon;
import com.alihaine.voidworld.file.VoidWorldFile;
import com.alihaine.voidworld.listener.OnChunkLoad;
import com.alihaine.voidworld.options.Chunk;
import com.alihaine.voidworld.subcommands.SetBlock;
import com.alihaine.voidworld.subcommands.SetVoid;
import org.bukkit.Bukkit;

public class VoidWorld extends BulMultiverseAddon {

    public static VoidWorld voidWorld;
    private VoidWorldFile voidWorldFile;

    @Override
    public void onEnable() {
        voidWorld = this;

        voidWorldFile = new VoidWorldFile();

        new Chunk();
        if (voidWorldFile.isEnableSetBlockCmd())
            BulMultiverse.getBMVInstance().addCommand("setblock", new SetBlock());
        if (voidWorldFile.isEnableChunkVoidCmd())
            BulMultiverse.getBMVInstance().addCommand("setvoid", new SetVoid());
        if (voidWorldFile.isVoidInDefaultWorld())
            BulMultiverse.getBulMultiverseInstance().getServer().getPluginManager().registerEvents(new OnChunkLoad(), BulMultiverse.getBulMultiverseInstance());
        Bukkit.getConsoleSender().sendMessage("§e[BulMultiverse] §aEnable the addon VoidWorld");
    }

    @Override
    public void onEnableAfterWorldsLoad() {

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[BulMultiverse] Disable the addon VoidWorld");
    }

    public VoidWorldFile getVoidWorldFile() {
        return this.voidWorldFile;
    }

}
