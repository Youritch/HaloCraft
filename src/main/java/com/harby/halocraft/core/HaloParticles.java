package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HaloParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HaloCraft.MODID);
    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }


    public static final RegistryObject<SimpleParticleType> PLASMA_TRAIL =
            PARTICLE_TYPES.register("plasma_trail", () -> new SimpleParticleType(true));
}
