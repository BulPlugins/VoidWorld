package com.alihaine.voidworld.chunks;

import org.bukkit.Chunk;
import org.bukkit.Material;

public class ChunkVoidMaker {

    public static void MakeChunkVoid(Chunk chunk) {
        for (int x = 0; x < 16; x++) {
            for (int y = -64; y < 256; y++) {
                for (int z = 0; z < 16; z++) {
                    chunk.getBlock(x, y, z).setType(Material.AIR, false);
                }
            }
        }
    }
}
