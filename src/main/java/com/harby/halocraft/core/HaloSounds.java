package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HaloSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HaloCraft.MODID);
    public static void register(IEventBus eventBus) {SOUNDS.register(eventBus);}

    private static RegistryObject<SoundEvent> soundRegistry(String id){
        return SOUNDS.register(id, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(HaloCraft.MODID, id)));
    }
}
