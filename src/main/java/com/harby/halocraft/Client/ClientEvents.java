package com.harby.halocraft.Client;

import com.harby.halocraft.Client.Models.*;
import com.harby.halocraft.Client.Renderers.*;
import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Vehicles.F_19;
import com.harby.halocraft.Particles.PlasmaParticleTrail;
import com.harby.halocraft.core.HaloEntities;
import com.harby.halocraft.core.HaloParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HaloCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    private ClientEvents() {
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WarthogModel.LAYER_LOCATION, WarthogModel::createBodyLayer);
        event.registerLayerDefinition(GhostModel.LAYER_LOCATION, GhostModel::createBodyLayer);
        event.registerLayerDefinition(BansheModel.LAYER_LOCATION, BansheModel::createBodyLayer);
        event.registerLayerDefinition(PlasmaProjectileModel.LAYER_LOCATION, PlasmaProjectileModel::createBodyLayer);
        event.registerLayerDefinition(F_19Model.LAYER_LOCATION, F_19Model::createBodyLayer);
    }


    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(HaloEntities.CAR.get(), WarthogRenderer::new);
        event.registerEntityRenderer(HaloEntities.GHOST.get(), GhostRenderer::new);
        event.registerEntityRenderer(HaloEntities.BANSHE.get(), BansheRenderer::new);
        event.registerEntityRenderer(HaloEntities.F29.get(), F_19Renderer::new);
        event.registerEntityRenderer(HaloEntities.BULLET.get(), BulletRenderer::new);
        event.registerEntityRenderer(HaloEntities.LASER.get(), PlasmaProjectileRenderer::new);
    }

    @SubscribeEvent
    public static void registerParticle(RegisterParticleProvidersEvent event) {
        Minecraft.getInstance().particleEngine.register(HaloParticles.PLASMA_TRAIL.get(),
                PlasmaParticleTrail.MobProvider::new);
    }
}
