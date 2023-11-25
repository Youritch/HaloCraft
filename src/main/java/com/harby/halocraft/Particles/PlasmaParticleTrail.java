package com.harby.halocraft.Particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PlasmaParticleTrail extends TextureSheetParticle {
    public PlasmaParticleTrail(ClientLevel level, double xCoord, double yCoord, double zCoord,
                               SpriteSet spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);
        this.gravity = 0f;
        this.hasPhysics = false;
        this.friction = 0F;
        this.xd = xd;
        this.yd = yd;
        this.zd = zd;
        this.quadSize *= 1.2F;
        this.lifetime = 20;
        this.setSpriteFromAge(spriteSet);
    }

    @Override
    public void tick() {
        super.tick();
        fadeOut();
    }

    private void fadeOut() {
        this.alpha = (-(1/(float)lifetime) * age + 1);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @OnlyIn(Dist.CLIENT)
    public static class MobProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public MobProvider(SpriteSet p_107826_) {
            this.sprite = p_107826_;
        }

        public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double r, double g, double b) {
            Particle particle = new PlasmaParticleTrail(level, x, y, z, this.sprite,0,0,0);
            particle.setColor((float)r, (float)g, (float)b);
            return particle;
        }
    }
}
