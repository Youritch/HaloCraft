package com.harby.halocraft.HaloEntities.AI;

import com.harby.halocraft.HaloEntities.BaseClasses.BasicNpcClass;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.phys.Vec3;

import java.util.EnumSet;

public class PatrolAroundTheAreaGoal extends Goal {
    protected int timer;
    protected final BasicNpcClass mob;
    protected double posX;
    protected double posY;
    protected double posZ;

    public PatrolAroundTheAreaGoal(BasicNpcClass mob){
        this.mob = mob;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }
    @Override
    public boolean canUse() {
        return mob.getPatrolPos() != BlockPos.ZERO;
    }

    @Override
    public boolean canContinueToUse() {
        return mob.getPatrolPos() != BlockPos.ZERO;
    }

    @Override
    public boolean requiresUpdateEveryTick() {
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.timer <= 100){
            timer++;
        }
    }

    @Override
    public void start() {
        super.start();
        if (this.timer >= 100){
            if (this.mob.getPatrolPos() != BlockPos.ZERO){
                RandomSource randomSource = RandomSource.create();
                this.posX = this.mob.getPatrolPos().getX() + randomSource.nextInt(-15,15);
                this.posY = this.mob.getPatrolPos().getY() + randomSource.nextInt(-2,2);
                this.posZ = this.mob.getPatrolPos().getZ() + randomSource.nextInt(-15,15);
                this.mob.getNavigation().moveTo(this.posX, this.posY, this.posZ, 1.0);
            }
            this.timer = 0;
        }

    }
}
