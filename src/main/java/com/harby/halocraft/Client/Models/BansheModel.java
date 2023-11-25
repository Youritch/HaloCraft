package com.harby.halocraft.Client.Models;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Vehicles.Banshe;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class BansheModel<T extends Banshe> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(HaloCraft.MODID, "banshee_1"), "main");
	private final ModelPart banshee;

	public BansheModel() {
		ModelPart root = createBodyLayer().bakeRoot();
		this.banshee = root.getChild("banshee");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition banshee = partdefinition.addOrReplaceChild("banshee", CubeListBuilder.create().texOffs(81, 96).addBox(-52.0F, -6.0F, -9.0F, 6.0F, 6.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(50, 90).addBox(46.0F, -6.0F, -9.0F, 6.0F, 6.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 113).addBox(-11.0F, -19.0F, -10.0F, 2.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-11.0F, -10.0F, 29.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(27, 78).addBox(-12.0F, -14.25F, -25.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(117, 115).addBox(8.0F, -14.25F, -25.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(79, 24).addBox(9.0F, -22.0F, 8.0F, 2.0F, 12.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(132, 134).addBox(9.0F, -26.0F, 18.0F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(9.0F, -10.0F, 17.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(57, 39).addBox(9.0F, -22.0F, 31.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(9.0F, -12.0F, 31.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(9.0F, -10.0F, 29.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(112, 90).addBox(9.0F, -19.0F, -10.0F, 2.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 78).addBox(-11.0F, -22.0F, 8.0F, 2.0F, 12.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(0, 138).addBox(-11.0F, -10.0F, 17.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-11.0F, -26.0F, 18.0F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-11.0F, -22.0F, 31.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-11.0F, -12.0F, 31.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(106, 24).addBox(-8.0F, -18.0F, -16.0F, 16.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0F, -14.0F, -7.0F, 18.0F, 6.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = banshee.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(131, 11).addBox(-23.0F, -2.0F, 2.0F, 12.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(132, 71).addBox(-11.0F, -2.0F, 1.0F, 11.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(65, 121).addBox(-40.0F, -2.0F, 4.0F, 17.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(46.0F, -2.0F, 0.0F, 0.0F, 0.1745F, 0.3491F));

		PartDefinition cube_r2 = banshee.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(114, 59).addBox(-39.0F, -2.0F, -13.0F, 16.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(134, 81).addBox(-11.0F, -2.0F, -8.0F, 11.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(129, 42).addBox(-23.0F, -2.0F, -11.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(46.0F, -2.0F, 0.0F, 0.0F, -0.0873F, 0.3491F));

		PartDefinition cube_r3 = banshee.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 0).addBox(23.0F, -2.0F, 4.0F, 17.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(65, 132).addBox(11.0F, -2.0F, 2.0F, 12.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(134, 91).addBox(0.0F, -2.0F, 1.0F, 11.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-46.0F, -2.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition cube_r4 = banshee.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 128).addBox(11.0F, -2.0F, -11.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(22, 115).addBox(23.0F, -2.0F, -13.0F, 16.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(107, 134).addBox(0.0F, -2.0F, -8.0F, 11.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-46.0F, -2.0F, 0.0F, 0.0F, 0.0873F, -0.3491F));

		PartDefinition cube_r5 = banshee.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 0).addBox(-8.0F, -3.75F, 10.5F, 16.0F, 9.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(60, 60).addBox(-9.0F, -2.75F, -7.5F, 18.0F, 12.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-9.0F, -1.75F, -28.5F, 18.0F, 18.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.9762F, 7.2309F, 0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		banshee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}