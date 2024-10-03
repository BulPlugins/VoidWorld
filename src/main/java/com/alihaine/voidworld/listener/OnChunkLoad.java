package com.alihaine.voidworld.listener;

import com.alihaine.voidworld.chunks.ChunkVoidMaker;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public class OnChunkLoad implements Listener {

    private final World defaultWorld = Bukkit.getWorlds().get(0);

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        if (!event.getWorld().equals(defaultWorld))
            return;

        if (!event.isNewChunk())
            return;

        Chunk chunk = event.getChunk();
        ChunkVoidMaker.MakeChunkVoid(chunk);
    }
}
