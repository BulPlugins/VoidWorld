package com.alihaine.voidworld.chunks;

import com.alihaine.voidworld.VoidWorld;
import org.bukkit.Chunk;
import org.bukkit.Material;

public class ChunkVoidMaker {

    public static void MakeChunkVoid(Chunk chunk) {
        for (int x = 0; x < 16; x++) {
            for (int y = VoidWorld.voidWorld.getVoidWorldFile().getDefaultWorldMinY(); y < VoidWorld.voidWorld.getVoidWorldFile().getDefaultWorldMaxY(); y++) {
                for (int z = 0; z < 16; z++) {
                    chunk.getBlock(x, y, z).setType(Material.AIR, false);
                }
            }
        }
    }
}
