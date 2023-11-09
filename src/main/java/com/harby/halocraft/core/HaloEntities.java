package com.harby.halocraft.core;

import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Projectiles.BaseBulletEntity;
import com.harby.halocraft.HaloEntities.Vehicles.CarEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HaloEntities {
    public static DeferredRegister<EntityType<?>> HALO_ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            HaloCraft.MODID);
    public static void register(IEventBus eventBus) {
        HALO_ENTITIES.register(eventBus);
    }

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return HALO_ENTITIES.register(registryname, () -> entityTypeBuilder.build(registryname));
    }



    public static final RegistryObject<EntityType<CarEntity>> CAR = HALO_ENTITIES.register("car",
            () -> EntityType.Builder.of((EntityType<CarEntity> p_33002_, Level level) -> new CarEntity(level), MobCategory.MISC).sized(2f, 2f)
                    .build(new ResourceLocation(HaloCraft.MODID, "car").toString()));

    public static final RegistryObject<EntityType<BaseBulletEntity>> BULLET = register("bullet",
            EntityType.Builder.of((EntityType<BaseBulletEntity> p_33002_, Level level) -> new BaseBulletEntity(level), MobCategory.MISC)
                    .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.4f, 0.4f));

}