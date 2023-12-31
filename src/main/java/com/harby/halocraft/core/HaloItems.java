package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloItems.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class HaloItems {
    public static final List<Item> HALO_ITEMS = new ArrayList<>();
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaloCraft.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BULLET = ITEMS.register("bullet",
            () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> EXPLOSIVE_BULLET = ITEMS.register("explosive_bullet",
            () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_BULLET = ITEMS.register("fire_bullet",
            () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_BULLET = ITEMS.register("frozen_bullet",
            () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> PENETRATING_BULLET = ITEMS.register("penetrating_bullet",
            () -> new ItemBase(new Item.Properties()));


    public static final RegistryObject<AssaultRifle> AssaultRifle = ITEMS.register("assault_rifle",
            () -> new AssaultRifle(new Item.Properties()));
    public static final RegistryObject<sniperRifle> SRS99_sniper_rifle = ITEMS.register("sniper_rifle",
            () -> new sniperRifle(new Item.Properties()));


    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItemBase(block.get(), new Item.Properties()));
    }

    public static final RegistryObject<Item> CONCRETE_BRICK = block(HaloBlocks.CONCRETE_BRICK);
    public static final RegistryObject<Item> CONCRETE_BRICK_POLISHED = block(HaloBlocks.CONCRETE_BRICK_POLISHED);
    public static final RegistryObject<Item> CONCRETE_LAYERED = block(HaloBlocks.CONCRETE_LAYERED);
    public static final RegistryObject<Item> CONCRETE_LAYERED_SECOND = block(HaloBlocks.CONCRETE_LAYERED_SECOND);

    public static final RegistryObject<Item> ASPHALT = block(HaloBlocks.ASPHALT);
    public static final RegistryObject<Item> CONCRETE_YELLOW_DOUBLE = block(HaloBlocks.CONCRETE_YELLOW_DOUBLE);
    public static final RegistryObject<Item> WHITE_LINE = block(HaloBlocks.WHITE_LINE);
    public static final RegistryObject<Item> WHITE_LINE_DOTS = block(HaloBlocks.WHITE_LINE_DOTS);
    public static final RegistryObject<Item> YELLOW_DOUBLE = block(HaloBlocks.YELLOW_DOUBLE);
    public static final RegistryObject<Item> YELLOW_DOUBLE_DOT = block(HaloBlocks.YELLOW_DOUBLE_DOT);
    public static final RegistryObject<Item> YELLOW_LINE = block(HaloBlocks.YELLOW_LINE);

    public static final RegistryObject<Item> ASTEROID = block(HaloBlocks.ASTEROID);
    public static final RegistryObject<Item> DENSE_ASTEROID = block(HaloBlocks.DENSE_ASTEROID);

}
