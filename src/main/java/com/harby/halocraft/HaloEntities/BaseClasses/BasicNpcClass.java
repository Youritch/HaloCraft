package com.harby.halocraft.HaloEntities.BaseClasses;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class BasicNpcClass extends PathfinderMob {
    public BasicNpcClass(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }



}
