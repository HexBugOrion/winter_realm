package net.timeworndevs.winter_realm.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.timeworndevs.winter_realm.init.WWRegistry;

public class CommonBlocks {

    public static Block PERMAFROST;

    public static void init() {
        PERMAFROST = WWRegistry.register("permafrost", new Block(FabricBlockSettings.of().mapColor(MapColor.WHITE).requiresTool().sounds(BlockSoundGroup.ROOTED_DIRT).strength(1.5F,6.0F)));
    }
}
