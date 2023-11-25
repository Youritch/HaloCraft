package com.harby.halocraft.Client.Renderers;

import com.harby.halocraft.Client.Models.BansheModel;
import com.harby.halocraft.Client.Models.WarthogModel;
import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.BaseClasses.BasicVehicleEntity;
import com.harby.halocraft.HaloEntities.Vehicles.Banshe;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class BansheRenderer<T extends Banshe> extends EntityRenderer<T> {
    private final BansheModel model;
    private static final ResourceLocation TEXTURE = new ResourceLocation(HaloCraft.MODID,
            "textures/entity/banshee.png");

    public BansheRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.7F;
        this.model = new BansheModel();
    }


    @Override
    public void render(T type, float value, float value2, PoseStack stack, MultiBufferSource source, int value3) {
        stack.pushPose();
        stack.translate(0,1.5,0);
        stack.mulPose(Axis.YP.rotationDegrees(180.0F - value));
        stack.mulPose(Axis.ZP.rotationDegrees(-180F));
        VertexConsumer vertexConsumer = source.getBuffer(this.model.renderType(getTextureLocation(type)));
        this.model.renderToBuffer(stack, vertexConsumer, value3, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        stack.popPose();
        super.render(type, value, value2, stack, source, value3);
    }

    @Override
    public ResourceLocation getTextureLocation(T p_114482_) {
        return TEXTURE;
    }
}
