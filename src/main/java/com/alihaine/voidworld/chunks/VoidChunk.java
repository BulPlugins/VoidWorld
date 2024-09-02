package com.alihaine.voidworld.chunks;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class VoidChunk extends ChunkGenerator {

    // Creates an empty chunk with no blocks
    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        return createChunkData(world);
    }
}
