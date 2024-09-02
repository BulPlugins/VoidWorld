package com.alihaine.voidworld.options;

import com.alihaine.bulmultiverse.world.WorldOption;
import com.alihaine.voidworld.chunks.VoidChunk;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public class Chunk extends WorldOption {
    public Chunk() {
        super("chunk", "-c", "-c void", "Create a empty world (void)", false);
    }

    @Override
    public void optionExecutor(String value, WorldCreator worldCreator) throws Exception {
        if (value.equalsIgnoreCase("NORMAL"))
            return;
        try {
            worldCreator.generator(new VoidChunk());
        } catch (IllegalArgumentException exception) {
            throw new Exception("The custom chunk type " + value + " don't exist");
        }
    }

    @Override
    public Object getDefaultValue(World world) {
        return "NORMAL";
    }
}
