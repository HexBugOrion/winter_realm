package net.timeworndevs.winter_realm.common;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.timeworndevs.winter_realm.init.WWRegistry;

public class CommonItems {

    public static BlockItem PERMAFROST;

    public static void init() {
        PERMAFROST = WWRegistry.register("permafrost", new BlockItem(CommonBlocks.PERMAFROST, new Item.Settings()));
    }
}
