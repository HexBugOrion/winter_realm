package net.timeworndevs.winter_realm.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.timeworndevs.winter_realm.Main;

public class WWRegistry {

    public static <I extends Item> I register(String name, I item){
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem);
        }
        return Registry.register(Registries.ITEM, new Identifier(Main.MODID, name), item);
    }

    public static <B extends Block> B register(String name, B block) {
        return Registry.register(Registries.BLOCK, new Identifier(Main.MODID, name), block);
    }
}
