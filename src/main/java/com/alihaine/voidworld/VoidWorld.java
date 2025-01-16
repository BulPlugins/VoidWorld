package com.alihaine.voidworld;

import com.alihaine.bulmultiverse.BulMultiverse;
import com.alihaine.bulmultiverse.addon.BulMultiverseAddon;
import com.alihaine.voidworld.file.VoidWorldFile;
import com.alihaine.voidworld.listener.OnChunkLoad;
import com.alihaine.voidworld.options.Chunk;
import com.alihaine.voidworld.subcommands.SetBlock;
import com.alihaine.voidworld.subcommands.SetVoid;
import org.bukkit.Bukkit;

import java.util.Collections;

public class VoidWorld extends BulMultiverseAddon {

    public static VoidWorld voidWorld;
    private VoidWorldFile voidWorldFile;

    public VoidWorld() {
        super("VoidWorld", Collections.singletonList("AliHaine"), Collections.singletonList("https://www.spigotmc.org/resources/addon-voidworld.119020/"), "https://discord.com/invite/wxnTV68dX2");
    }

    @Override
    public void onEnable() {
        voidWorld = this;

        voidWorldFile = new VoidWorldFile();

        new Chunk();
        if (voidWorldFile.isEnableSetBlockCmd())
            BulMultiverse.getBulMultiverse().getBMV().addCommand("setblock", new SetBlock());
        if (voidWorldFile.isEnableChunkVoidCmd())
            BulMultiverse.getBulMultiverse().getBMV().addCommand("setvoid", new SetVoid());
        if (voidWorldFile.isVoidInDefaultWorld())
            BulMultiverse.getBulMultiverse().getServer().getPluginManager().registerEvents(new OnChunkLoad(), BulMultiverse.getBulMultiverse());
        Bukkit.getConsoleSender().sendMessage("§e[BulMultiverse] §aEnable the addon VoidWorld");
    }

    @Override
    public void onEnableAfterWorldsLoad() {

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[BulMultiverse] Disable the addon VoidWorld");
    }

    public static VoidWorld getVoidWorld() {
        return voidWorld;
    }

    public VoidWorldFile getVoidWorldFile() {
        return this.voidWorldFile;
    }

}
