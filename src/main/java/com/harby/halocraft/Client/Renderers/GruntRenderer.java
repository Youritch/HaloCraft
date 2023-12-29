package com.harby.halocraft.Client.Renderers;

import com.harby.halocraft.Client.Models.GruntModel;
import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Alien.Grunt;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GruntRenderer <Type extends Grunt> extends MobRenderer<Type , GruntModel<Type>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HaloCraft.MODID,
            "textures/entity/grunt.png");


    public GruntRenderer(EntityRendererProvider.Context context) {
        super(context, new GruntModel<>(context.bakeLayer(GruntModel.LAYER_LOCATION)), 0.5f);
    }



    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }

}