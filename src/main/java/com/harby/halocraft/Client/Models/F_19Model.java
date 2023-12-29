package com.harby.halocraft.Client.Models;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Vehicles.F_19;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class F_19Model<T extends F_19> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(HaloCraft.MODID, "f_29_nandao"), "main");
	private final ModelPart frame;
	private final ModelPart wings;
	private final ModelPart wings2;
	private final ModelPart cockpit;
	private final ModelPart engines;
	private final ModelPart tail_fin;
	private final ModelPart main_thruster;

	public F_19Model() {
		ModelPart root = createBodyLayer().bakeRoot();
		this.frame = root.getChild("frame");
		this.wings = root.getChild("wings");
		this.wings2 = root.getChild("wings2");
		this.cockpit = root.getChild("cockpit");
		this.engines = root.getChild("engines");
		this.tail_fin = root.getChild("tail_fin");
		this.main_thruster = root.getChild("main_thruster");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition frame = partdefinition.addOrReplaceChild("frame", CubeListBuilder.create(), PartPose.offset(-29.097F, 34.9773F, 35.0119F));

		PartDefinition cube_r1 = frame.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(454, 188).addBox(-7.0F, -9.0F, -18.0F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, -0.2214F, -0.1835F, -2.3247F));

		PartDefinition cube_r2 = frame.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(469, 80).addBox(-9.0F, -9.0F, -18.0F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(59.1941F, -23.0F, -45.0F, -0.2214F, 0.1835F, 2.3247F));

		PartDefinition cube_r3 = frame.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 470).addBox(-8.0F, -8.0F, 3.25F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(52.6224F, -22.6636F, -111.4095F, 0.1872F, -0.1841F, 2.3389F));

		PartDefinition cube_r4 = frame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(294, 471).addBox(-8.0F, -8.0F, 3.25F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5717F, -22.6636F, -111.4095F, 0.1872F, 0.1841F, -2.3389F));

		PartDefinition cube_r5 = frame.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(269, 280).addBox(-8.0F, -8.0F, -75.75F, 16.0F, 16.0F, 79.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(52.625F, -22.6777F, -111.3998F, 0.1872F, -0.1841F, 2.3389F));

		PartDefinition cube_r6 = frame.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 288).addBox(-8.0F, -8.0F, -75.75F, 16.0F, 16.0F, 79.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.5691F, -22.6777F, -111.3998F, 0.1872F, 0.1841F, -2.3389F));

		PartDefinition cube_r7 = frame.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(362, 98).addBox(-23.0F, -57.0F, -52.0F, 23.0F, 16.0F, 61.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(64.1176F, -33.9773F, -102.2109F, 0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r8 = frame.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(394, 0).addBox(0.0F, -29.0F, 4.25F, 22.0F, 32.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.3517F, -33.9773F, -104.8696F, 0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = frame.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(140, 72).addBox(1.0F, -7.0F, 6.0F, 15.0F, 24.0F, 96.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(32.7331F, -32.6801F, -67.9506F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r10 = frame.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 168).addBox(-16.0F, -7.0F, 6.0F, 15.0F, 24.0F, 96.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(28.461F, -32.666F, -67.9406F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r11 = frame.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(266, 98).addBox(-15.0F, -29.0F, 102.0F, 11.0F, 11.0F, 50.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.097F, -32.9294F, -67.9406F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r12 = frame.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 486).addBox(-18.0F, -37.0F, 102.0F, 8.0F, 8.0F, 50.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(12.5321F, -56.5066F, -67.9406F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r13 = frame.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(126, 192).addBox(-16.0F, -7.0F, 6.0F, 15.0F, 17.0F, 96.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -34.0F, 6.0F, 22.0F, 72.0F, 96.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.097F, -32.9294F, -67.9406F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r14 = frame.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(411, 346).addBox(-22.0F, -29.0F, 4.25F, 22.0F, 32.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(35.8423F, -33.9773F, -104.8696F, 0.2618F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(200, 452).addBox(0.0F, -13.0F, -44.0F, 23.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0088F, -33.9773F, -60.1291F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r16 = frame.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(228, 375).addBox(0.0F, -57.0F, -52.0F, 23.0F, 16.0F, 61.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-3.9236F, -33.9773F, -102.2109F, 0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r17 = frame.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(266, 0).addBox(0.0F, -8.0F, -121.0F, 23.0F, 16.0F, 82.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.097F, -33.9773F, -65.0119F, 0.0F, 0.0F, 1.5708F));

		PartDefinition wings = partdefinition.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(17.1678F, 35.5F, 83.8559F));

		PartDefinition cube_r18 = wings.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(236, 57).addBox(47.5359F, -0.5F, -22.6077F, 47.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(252, 236).addBox(14.5359F, -1.0F, -17.6077F, 80.0F, 2.0F, 42.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r19 = wings.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(380, 280).addBox(-4.5359F, -1.0F, -32.6077F, 16.0F, 2.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.2081F, -23.0F, -63.3655F, 0.0F, -0.2618F, 0.0F));

		PartDefinition wings2 = partdefinition.addOrReplaceChild("wings2", CubeListBuilder.create(), PartPose.offset(-17.1678F, 35.5F, 83.8559F));

		PartDefinition cube_r20 = wings2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(140, 66).addBox(-94.5359F, -0.5F, -22.6077F, 47.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(252, 192).addBox(-94.5359F, -1.0F, -17.6077F, 80.0F, 2.0F, 42.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r21 = wings2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(140, 0).addBox(-11.4641F, -1.0F, -32.6077F, 16.0F, 2.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.2081F, -23.0F, -63.3655F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cockpit = partdefinition.addOrReplaceChild("cockpit", CubeListBuilder.create(), PartPose.offset(7.1009F, 13.3775F, 10.5657F));

		PartDefinition cube_r22 = cockpit.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(328, 384).addBox(-13.0F, 8.0F, -59.0F, 7.0F, 19.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -23.0F, -45.0F, 0.2024F, -0.1671F, 0.6811F));

		PartDefinition cube_r23 = cockpit.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(123, 316).addBox(-13.0F, -8.0F, -59.0F, 16.0F, 16.0F, 67.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6009F, -12.8775F, -41.3157F, 0.0F, -0.2618F, 1.5708F));

		PartDefinition cube_r24 = cockpit.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 383).addBox(6.0F, 8.0F, -59.0F, 7.0F, 19.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.7018F, -23.0F, -45.0F, 0.2024F, 0.1671F, -0.6811F));

		PartDefinition engines = partdefinition.addOrReplaceChild("engines", CubeListBuilder.create(), PartPose.offset(5.0883F, 26.0F, 19.8828F));

		PartDefinition cube_r25 = engines.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(430, 426).addBox(6.0F, -21.0F, 16.0F, 24.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -24.0F, -36.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r26 = engines.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(102, 422).addBox(-30.0F, -21.0F, 16.0F, 25.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.1766F, -24.0F, -36.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition tail_fin = partdefinition.addOrReplaceChild("tail_fin", CubeListBuilder.create(), PartPose.offset(2.0F, 25.0478F, 12.0713F));

		PartDefinition cube_r27 = tail_fin.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(476, 252).addBox(4.0F, -29.0F, 102.0F, 11.0F, 11.0F, 50.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r28 = tail_fin.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(372, 490).addBox(10.0F, -37.0F, 102.0F, 8.0F, 8.0F, 50.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(16.565F, -46.5772F, -45.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition cube_r29 = tail_fin.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(486, 0).addBox(-15.5F, -0.5F, -21.5F, 25.0F, 1.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.8587F, -36.9998F, 83.8134F, -3.1416F, 0.0F, 1.1781F));

		PartDefinition cube_r30 = tail_fin.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 10).addBox(-5.5F, -1.0F, -22.5F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.1629F, -32.9057F, 94.8272F, 0.0F, -1.5708F, -1.9635F));

		PartDefinition cube_r31 = tail_fin.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -1.0F, -22.5F, 39.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.6198F, -17.1092F, 81.549F, 0.0F, -0.7854F, -1.9635F));

		PartDefinition cube_r32 = tail_fin.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(222, 305).addBox(5.0F, -26.0F, 106.75F, 11.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -23.0F, -45.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition cube_r33 = tail_fin.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(438, 490).addBox(-9.5F, -0.5F, -21.5F, 25.0F, 1.0F, 39.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(33.8587F, -36.9998F, 83.8134F, -3.1416F, 0.0F, -1.1781F));

		PartDefinition cube_r34 = tail_fin.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 15).addBox(-10.5F, -1.0F, -22.5F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.1629F, -32.9057F, 94.8272F, 0.0F, 1.5708F, 1.9635F));

		PartDefinition cube_r35 = tail_fin.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 5).addBox(-33.5F, -1.0F, -22.5F, 39.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.6198F, -17.1092F, 81.549F, 0.0F, 0.7854F, 1.9635F));

		PartDefinition cube_r36 = tail_fin.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(503, 313).addBox(-16.0F, -26.0F, 106.75F, 11.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, 0.0F, 0.0F, 1.9635F));

		PartDefinition main_thruster = partdefinition.addOrReplaceChild("main_thruster", CubeListBuilder.create(), PartPose.offset(2.0F, 25.0478F, 12.0713F));

		PartDefinition cube_r37 = main_thruster.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(236, 0).addBox(-1.0F, -11.0F, 122.0F, 23.0F, 25.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(1.0F, -9.0F, 114.0F, 19.0F, 21.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(2.0F, -8.0F, 106.0F, 17.0F, 19.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(50, 34).addBox(3.0F, -7.0F, 101.0F, 15.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -23.0F, -45.0F, 0.0F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cockpit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		engines.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail_fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		main_thruster.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}