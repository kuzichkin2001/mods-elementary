package com.example.penis_mod.item;

import com.example.penis_mod.PenisMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PenisMod.MOD_ID);

    public static final RegistryObject<Item> NEW_STONE_PICKAXE =
            ITEMS.register("new_stone_pickaxe", () -> new Item(
                    new Item.Properties()
                            .tab(CreativeModeTab.TAB_TOOLS)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
