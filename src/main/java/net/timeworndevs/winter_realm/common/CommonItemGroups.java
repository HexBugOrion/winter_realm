package net.timeworndevs.winter_realm.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.winter_realm.Main;

public class CommonItemGroups {

    private static final RegistryKey<ItemGroup> WW_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Main.MODID, "ww_main"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, WW_BLOCKS, FabricItemGroup.builder().icon(() -> new ItemStack(Items.SNOW_BLOCK)).displayName(Text.translatable("ww.blocks")).entries((context, entries) -> {
            entries.add(CommonItems.PERMAFROST);
        }).build());
    }
}


