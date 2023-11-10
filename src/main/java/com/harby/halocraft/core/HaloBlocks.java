package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HaloBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HaloCraft.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


    public static final RegistryObject<Block> CONCRETE_BRICK = BLOCKS.register("concrete_brick", () -> new Block(BlockBehaviour.Properties.of().strength(2f,4f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_BRICK_POLISHED = BLOCKS.register("concrete_brick_polished", () -> new Block(BlockBehaviour.Properties.of().strength(2f,4f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_LAYERED = BLOCKS.register("concrete_layered", () -> new Block(BlockBehaviour.Properties.of().strength(2f,4f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_LAYERED_SECOND = BLOCKS.register("concrete_layered_second", () -> new Block(BlockBehaviour.Properties.of().strength(2f,4f).sound(SoundType.STONE)));


    public static final RegistryObject<Block> DENSE_ASTEROID = BLOCKS.register("dense_asteroid", () -> new Block(BlockBehaviour.Properties.of().strength(2f,6f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASTEROID = BLOCKS.register("asteroid", () -> new Block(BlockBehaviour.Properties.of().strength(2f,4f).sound(SoundType.STONE)));


}
