package com.harby.halocraft.Client.Renderers;

import com.harby.halocraft.Client.Models.WarthogModel;
import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.BaseClasses.BasicVehicleEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class WarthogRenderer <T extends BasicVehicleEntity> extends VehicleRenderer<T> {

    public WarthogRenderer(EntityRendererProvider.Context context) {
        super(context,new WarthogModel<>());
        this.shadowRadius = 0.7F;
    }

    @Override
    public ResourceLocation getBaseTexture() {
        return new ResourceLocation(HaloCraft.MODID,
                "textures/entity/car.png");
    }

    @Override
    public ResourceLocation getTintedTexture() {
        return new ResourceLocation(HaloCraft.MODID,
                "textures/entity/blank.png");
    }
}
