package com.harby.halocraft.Client;

import com.harby.halocraft.Client.Models.WarthogModel;
import com.harby.halocraft.Client.Renderers.BulletRenderer;
import com.harby.halocraft.Client.Renderers.WarthogRenderer;
import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.core.HaloEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HaloCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    private ClientEvents() {
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WarthogModel.LAYER_LOCATION, WarthogModel::createBodyLayer);
    }


    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(HaloEntities.CAR.get(), WarthogRenderer::new);
        event.registerEntityRenderer(HaloEntities.BULLET.get(), BulletRenderer::new);
    }
}