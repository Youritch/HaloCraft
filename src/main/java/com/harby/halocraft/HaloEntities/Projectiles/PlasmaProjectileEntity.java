package com.harby.halocraft.HaloEntities.Projectiles;

import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.core.HaloEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;

public class PlasmaProjectileEntity extends Projectile {
    private static final EntityDataAccessor<Integer> COLOR =
            SynchedEntityData.defineId(PlasmaProjectileEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Integer> TEMPERATURE =
            SynchedEntityData.defineId(PlasmaProjectileEntity.class, EntityDataSerializers.INT);

    private float setBaseDamage;

    public PlasmaProjectileEntity(Level level) {
        super(HaloEntities.LASER.get(), level);
    }
    public PlasmaProjectileEntity(Level level, Entity livingEntity) {
        super(HaloEntities.LASER.get(), level);
        this.setOwner(livingEntity);
        BlockPos blockpos = livingEntity.blockPosition();
        double d0 = (double)blockpos.getX() + 0.5D;
        double d1 = (double)blockpos.getY() + 1.5D;
        double d2 = (double)blockpos.getZ() + 0.5D;
        this.moveTo(d0, d1, d2, livingEntity.getYRot(), this.getXRot());
    }


    @Override
    protected void defineSynchedData() {
        this.entityData.define(COLOR, 0);
        this.entityData.define(TEMPERATURE, 0);
    }


    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        tag.putInt("color",this.getColor());
        tag.putInt("temperature",this.getTemperature());
    }
    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        this.setColor(tag.getInt("color"));
        this.setTemperature(tag.getInt("temperature"));
    }


    public void setColor(int i){
        this.entityData.set(COLOR,i);
    }
    public int getColor(){
        return this.entityData.get(COLOR);
    }
    public void setTemperature(int i){
        this.entityData.set(TEMPERATURE,i);
    }
    public int getTemperature(){
        return this.entityData.get(TEMPERATURE);
    }


    @Override
    protected boolean canHitEntity(Entity entity) {
        return entity != getOwner();
    }

    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }


    @Override
    protected void onHitBlock(BlockHitResult result) {
        super.onHitBlock(result);
        if (!level().isClientSide){
            boolean flag = true;
            this.noPhysics = false;
            BlockState state = this.level().getBlockState(result.getBlockPos());
            if (state.is(BlockTags.create(new ResourceLocation(HaloCraft.MODID,"shooting_through")))){
                this.noPhysics = true;
                flag = false;
            }else{
                if (this.getTemperature() > 500 && state.isFlammable(this.level(),result.getBlockPos(),result.getDirection())){
                    BlockPos pos = result.getBlockPos().relative(result.getDirection());
                    BlockState fire = Blocks.FIRE.defaultBlockState();
                    level().setBlock(pos,fire,2);
                }
            }
            if (flag){
                this.discard();
            }
        }

    }

    @Override
    public void tick() {
        super.tick();
        if (this.tickCount >= 300) {
            this.remove(RemovalReason.DISCARDED);
        }
        HitResult hitresult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
        Vec3 vec3 = this.getDeltaMovement();
        double d0 = this.getX() + vec3.x;
        double d1 = this.getY() + vec3.y;
        double d2 = this.getZ() + vec3.z;
        this.setPos(d0, d1, d2);

        if (hitresult.getType() != HitResult.Type.MISS && !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, hitresult)) {
            this.onHit(hitresult);
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        if (!this.level().isClientSide()) {
            if (entityHitResult.getEntity() instanceof LivingEntity livingEntity){
                livingEntity.hurt(this.level().damageSources().mobProjectile(this, (LivingEntity) this.getOwner()), getDamage());
                if (this.getTemperature() > 100){
                    int extraFire = this.getTemperature() % 100;
                    livingEntity.setSecondsOnFire(5 * extraFire);
                }
            }
        }
    }

    public void setBaseDamage(float i){
        this.setBaseDamage = i;
    }
    public float getDamage(){
        return this.setBaseDamage;
    }
}
