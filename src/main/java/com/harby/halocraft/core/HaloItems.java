package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloItems.AssaultRifle;
import com.harby.halocraft.HaloItems.BlockItemBase;
import com.harby.halocraft.HaloItems.Gun;
import com.harby.halocraft.HaloItems.ItemBase;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class HaloItems {
    public  static  final List<Item> HALO_ITEMS = new ArrayList<>();
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaloCraft.MODID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public  static final RegistryObject<Item> BULLET = ITEMS.register("bullet",
            () -> new ItemBase( new Item.Properties()));
    public  static final RegistryObject<Item> EXPLOSIVE_BULLET = ITEMS.register("explosive_bullet",
            () -> new ItemBase( new Item.Properties()));
    public  static final RegistryObject<Item> FIRE_BULLET = ITEMS.register("fire_bullet",
            () -> new ItemBase( new Item.Properties()));
    public  static final RegistryObject<Item> FROZEN_BULLET = ITEMS.register("frozen_bullet",
            () -> new ItemBase( new Item.Properties()));
    public  static final RegistryObject<Item> PENETRATING_BULLET = ITEMS.register("penetrating_bullet",
            () -> new ItemBase( new Item.Properties()));


    public  static final RegistryObject<Item> AssaultRifle = ITEMS.register("assault_rifle",
            () -> new AssaultRifle( new Item.Properties()));


    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItemBase(block.get(), new Item.Properties()));
    }
    public static final RegistryObject<Item> CONCRETE_BRICK = block(HaloBlocks.CONCRETE_BRICK);
    public static final RegistryObject<Item> CONCRETE_BRICK_POLISHED = block(HaloBlocks.CONCRETE_BRICK_POLISHED);
    public static final RegistryObject<Item> CONCRETE_LAYERED = block(HaloBlocks.CONCRETE_LAYERED);
    public static final RegistryObject<Item> CONCRETE_LAYERED_SECOND = block(HaloBlocks.CONCRETE_LAYERED_SECOND);

    public static final RegistryObject<Item> ASTEROID = block(HaloBlocks.ASTEROID);
    public static final RegistryObject<Item> DENSE_ASTEROID = block(HaloBlocks.DENSE_ASTEROID);

}
