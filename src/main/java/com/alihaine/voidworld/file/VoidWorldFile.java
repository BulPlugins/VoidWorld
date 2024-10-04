package com.alihaine.voidworld.file;

import com.alihaine.voidworld.VoidWorld;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class VoidWorldFile {

    private final VoidWorld voidWorldInstance = VoidWorld.voidWorld;
    private final boolean voidInDefaultWorld;
    private final int defaultWorldMinY;
    private final int defaultWorldMaxY;
    private final boolean enableSetBlockCmd;
    private final boolean enableChunkVoidCmd;

    public VoidWorldFile() {
        final File voidWorldFile;
        final FileConfiguration VoidWorldConfig;
        try {
            voidWorldFile = voidWorldInstance.createCustomFile("voidworld.yml", getClass().getClassLoader().getResourceAsStream("voidworld.yml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        VoidWorldConfig = new YamlConfiguration();
        try {
            VoidWorldConfig.load(voidWorldFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        this.voidInDefaultWorld = VoidWorldConfig.getBoolean("enable_void_in_default_world");
        this.defaultWorldMinY = VoidWorldConfig.getInt("default_world_min_y");
        this.defaultWorldMaxY = VoidWorldConfig.getInt("default_world_max_y");
        this.enableSetBlockCmd = VoidWorldConfig.getBoolean("enable_setblock_command");
        this.enableChunkVoidCmd = VoidWorldConfig.getBoolean("enable_chunk_void_maker_command");
    }

    public boolean isVoidInDefaultWorld() {
        return voidInDefaultWorld;
    }

    public int getDefaultWorldMinY() {
        return defaultWorldMinY;
    }

    public int getDefaultWorldMaxY() {
        return defaultWorldMaxY;
    }

    public boolean isEnableSetBlockCmd() {
        return enableSetBlockCmd;
    }

    public boolean isEnableChunkVoidCmd() {
        return enableChunkVoidCmd;
    }
}
