package com.harby.halocraft.Client.Renderers;

import com.harby.halocraft.HaloEntities.BaseClasses.BasicVehicleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public abstract class VehicleRenderer <T extends BasicVehicleEntity> extends EntityRenderer<T> {
    EntityModel<T> model;
    protected VehicleRenderer(EntityRendererProvider.Context context, EntityModel<T> model1) {
        super(context);
        this.model = model1;
    }

    @Override
    public ResourceLocation getTextureLocation(T type) {
        if (type.getTint() != 0){
            return getTintedTexture();
        }
        return getBaseTexture();
    }

    public abstract ResourceLocation getBaseTexture();
    public abstract ResourceLocation getTintedTexture();


    @Override
    public void render(T type, float value, float value2, PoseStack stack, MultiBufferSource source, int value3) {
        stack.pushPose();
        stack.translate(0,1.5,0);
        stack.mulPose(Axis.YP.rotationDegrees(180.0F - value));
        stack.mulPose(Axis.ZP.rotationDegrees(-180F));
        VertexConsumer vertexConsumer = source.getBuffer(this.model.renderType(getTextureLocation(type)));
        float r;
        float g;
        float b;
        if  (type.getTint() != 0){
            int i = type.getTint();
            r = (float) (i >> 16 & 255) / 255.0F;
            g = (float) (i >> 8 & 255) / 255.0F;
            b = (float) (i & 255) / 255.0F;
        }else{
            r = 1.0f;
            g = 1.0f;
            b = 1.0f;
        }
        this.model.renderToBuffer(stack, vertexConsumer, value3, OverlayTexture.NO_OVERLAY, r, g, b, 1.0F);
        stack.popPose();
        super.render(type, value, value2, stack, source, value3);
    }
}
