package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HaloBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HaloCraft.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
