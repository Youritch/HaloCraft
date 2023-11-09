package com.harby.halocraft.Client.Models;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.BaseClasses.BasicVehicleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class WarthogModel<T extends BasicVehicleEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(HaloCraft.MODID, "warthogmodel"), "main");
	private final ModelPart trunk;
	private final ModelPart frame;
	private final ModelPart seats;
	private final ModelPart hexadecagon;
	private final ModelPart suspension;
	private final ModelPart wheel_detail;
	private final ModelPart turret;
	private final ModelPart bb_main;

	public WarthogModel() {
		ModelPart root = createBodyLayer().bakeRoot();
		this.trunk = root.getChild("trunk");
		this.frame = root.getChild("frame");
		this.seats = root.getChild("seats");
		this.hexadecagon = root.getChild("hexadecagon");
		this.suspension = root.getChild("suspension");
		this.wheel_detail = root.getChild("wheel_detail");
		this.turret = root.getChild("turret");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition trunk = partdefinition.addOrReplaceChild("trunk", CubeListBuilder.create().texOffs(152, 57).addBox(-0.9908F, -15.554F, 19.9218F, 17.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 76).addBox(4.531F, -14.804F, -68.4015F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.876F, 17.7F, 22.5623F));

		PartDefinition cube_r1 = trunk.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 140).addBox(-1.1234F, -0.685F, -45.5674F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = trunk.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(108, 140).addBox(1.8064F, -0.685F, -45.0702F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r3 = trunk.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(140, 4).addBox(25.3543F, -0.685F, -33.3647F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r4 = trunk.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 153).addBox(18.7158F, -0.685F, -17.0857F, 15.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = trunk.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 121).addBox(30.2367F, -0.685F, -22.6809F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(118, 91).addBox(-37.9128F, -1.435F, 20.6176F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r6 = trunk.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 22).addBox(11.3565F, -1.435F, 15.0885F, 22.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = trunk.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(118, 86).addBox(29.9128F, -1.435F, 20.6176F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(146, 148).addBox(-35.2367F, -0.685F, -22.6809F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r8 = trunk.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 84).addBox(-0.4866F, -1.435F, 43.0267F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r9 = trunk.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(142, 104).addBox(-3.8766F, -0.685F, -45.5674F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r10 = trunk.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(142, 112).addBox(-6.8064F, -0.685F, -45.0702F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r11 = trunk.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(146, 140).addBox(-30.3543F, -0.685F, -33.3647F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r12 = trunk.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(14.02F, 2.2048F, -15.2411F, 30.0F, 0.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-44.7158F, 5.315F, -16.0857F, 24.0F, 0.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(48, 32).addBox(-44.7158F, -0.685F, -16.0857F, 24.0F, 0.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-33.7158F, -0.685F, -17.0857F, 14.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = trunk.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(59, 88).addBox(-8.5134F, -1.435F, 43.0267F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r14 = trunk.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(138, 25).addBox(-33.3565F, -1.435F, 15.0885F, 22.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.876F, -14.119F, -22.8532F, 0.0F, 1.5708F, 0.0F));

		PartDefinition frame = partdefinition.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(0, 155).addBox(-9.3817F, -6.6983F, 33.3803F, 17.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(157, 65).addBox(-9.3817F, -11.1983F, 33.6303F, 17.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(92, 18).addBox(-11.9984F, -18.9088F, -21.9584F, 25.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(142, 131).addBox(-10.7456F, -18.9088F, 0.744F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5526F, 11.8159F, 9.6271F));

		PartDefinition cube_r15 = frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 27).addBox(-10.7068F, -10.6739F, -1.023F, 21.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r16 = frame.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 67).addBox(15.002F, 1.3205F, -16.4593F, 0.0F, 13.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r17 = frame.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 104).addBox(18.825F, -0.8153F, -16.4593F, 2.0F, 4.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r18 = frame.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 64).addBox(-4.301F, 10.6478F, -16.4593F, 13.0F, 1.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r19 = frame.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(95, 31).addBox(-7.8077F, 10.6874F, -16.4593F, 12.0F, 1.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 1.5708F, 0.8727F, 1.5708F));

		PartDefinition cube_r20 = frame.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(59, 65).addBox(-0.8233F, 13.5153F, -16.4593F, 13.0F, 1.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition cube_r21 = frame.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(68, 101).addBox(16.4038F, 9.0437F, -16.4593F, 2.0F, 2.0F, 33.0F, new CubeDeformation(0.0F))
		.texOffs(90, 107).addBox(17.9005F, 4.6891F, -17.0093F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, 1.2217F, -1.5708F));

		PartDefinition cube_r22 = frame.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(152, 47).addBox(-0.4308F, 13.1617F, -17.0857F, 17.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, 0.8727F, -1.5708F));

		PartDefinition cube_r23 = frame.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(142, 123).addBox(11.3568F, -2.9634F, 15.3357F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(140, 0).addBox(11.3568F, 1.5366F, 15.0857F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r24 = frame.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(157, 69).addBox(-5.9415F, 9.6575F, -17.0857F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r25 = frame.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 99).addBox(-0.1466F, 1.5366F, 42.9831F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 89).addBox(-0.1466F, -2.9634F, 43.2331F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r26 = frame.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(59, 64).addBox(-5.8771F, 9.6875F, 15.0857F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 1.5708F, -0.6981F, -1.5708F));

		PartDefinition cube_r27 = frame.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 8).addBox(-13.0219F, 16.5861F, -5.5175F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 2.6922F, 0.3146F, -0.9639F));

		PartDefinition cube_r28 = frame.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(24, 12).addBox(16.3212F, 5.2858F, -4.9164F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -2.2166F, 0.5904F, -1.968F));

		PartDefinition cube_r29 = frame.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(59, 93).addBox(29.8832F, 1.5366F, 20.6185F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 93).addBox(29.8832F, -2.9634F, 20.8685F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r30 = frame.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(152, 52).addBox(-16.5692F, 13.1617F, -17.0857F, 17.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, -0.8727F, 1.5708F));

		PartDefinition cube_r31 = frame.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 159).addBox(-10.0585F, 9.6575F, -17.0857F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r32 = frame.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 69).addBox(-6.1229F, 9.6875F, 15.0857F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 1.5708F, 0.6981F, 1.5708F));

		PartDefinition cube_r33 = frame.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(142, 127).addBox(-33.3568F, -2.9634F, 15.3357F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 151).addBox(-33.3568F, 1.5366F, 15.0857F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r34 = frame.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(105, 107).addBox(-38.8832F, 1.5366F, 20.6185F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 109).addBox(-38.8832F, -2.9634F, 20.8685F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r35 = frame.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 103).addBox(-8.8534F, 1.5366F, 42.9831F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(105, 111).addBox(-8.8534F, -2.9634F, 43.2331F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r36 = frame.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(31, 99).addBox(10.4207F, 6.8661F, -16.2411F, 2.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition cube_r37 = frame.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 72).addBox(1.0219F, 16.5861F, -5.5175F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, 2.6922F, -0.3146F, 0.9639F));

		PartDefinition cube_r38 = frame.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(24, 27).addBox(-18.3212F, 5.2858F, -4.9164F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -2.2166F, -0.5904F, 1.968F));

		PartDefinition cube_r39 = frame.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 112).addBox(-19.9005F, 4.6891F, -17.0093F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, -8.2349F, -9.918F, -1.5708F, -1.2217F, 1.5708F));

		PartDefinition seats = partdefinition.addOrReplaceChild("seats", CubeListBuilder.create(), PartPose.offset(10.136F, 18.8906F, 11.5334F));

		PartDefinition cube_r40 = seats.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 136).mirror().addBox(-10.5515F, 6.1975F, 1.3807F, 13.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.136F, -15.3095F, -11.8244F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r41 = seats.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 134).mirror().addBox(-7.9831F, 3.371F, 1.3807F, 13.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.136F, -15.3095F, -11.8244F, 1.5708F, -0.2618F, -1.5708F));

		PartDefinition cube_r42 = seats.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 134).addBox(-5.0169F, 3.371F, 1.3807F, 13.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.136F, -15.3095F, -11.8244F, 1.5708F, 0.2618F, 1.5708F));

		PartDefinition cube_r43 = seats.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(52, 136).addBox(-2.4485F, 6.1975F, 1.3807F, 13.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.136F, -15.3095F, -11.8244F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon", CubeListBuilder.create(), PartPose.offset(19.25F, 132.25F, -142.0F));

		PartDefinition suspension = partdefinition.addOrReplaceChild("suspension", CubeListBuilder.create(), PartPose.offset(7.9677F, 19.195F, 27.5543F));

		PartDefinition wheel_detail = partdefinition.addOrReplaceChild("wheel_detail", CubeListBuilder.create(), PartPose.offset(104.055F, 18.195F, 27.805F));

		PartDefinition bone = wheel_detail.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-201.11F, -2.0F, -1.0F));

		PartDefinition bone2 = wheel_detail.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-201.11F, -2.0F, -54.61F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, 0.0F));

		PartDefinition bone3 = bone4.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 232).addBox(112.055F, -5.9341F, -5.5945F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 232).addBox(105.055F, -5.9341F, -5.5945F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(104.9905F, -7.0659F, -1.4055F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(104.9905F, 5.6528F, -1.4055F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(104.9905F, -1.4055F, -7.0659F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(104.9905F, -1.4055F, 5.6528F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(0, 232).addBox(112.055F, -5.9341F, 44.7045F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 232).addBox(105.055F, -5.9341F, 44.7045F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(104.9905F, -7.0659F, 49.2045F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(104.9905F, 5.6528F, 49.2045F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(104.9905F, -1.4055F, 56.2628F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(104.9905F, -1.4055F, 43.5441F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r1 = bone3.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 26.6737F, 1.7602F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 26.6737F, 14.4789F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = bone3.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 21.1587F, 11.8337F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 21.1587F, 24.5524F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 28.2169F, 17.4942F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 15.4982F, 17.4942F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = bone3.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 1.1857F, 22.2534F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 1.1857F, 34.9721F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 8.2439F, 27.9139F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, -4.4748F, 27.9139F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = bone3.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, -10.2316F, 21.0132F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, -10.2316F, 33.7319F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r5 = bone3.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(152, 30).addBox(-6.1535F, -7.2322F, 15.3613F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, -0.6545F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r6 = bone3.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(22, 82).addBox(7.0F, -1.9145F, 28.3917F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 24.5141F, -0.48F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r7 = bone3.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 26.9693F, -3.469F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 26.9693F, -16.1877F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r8 = bone3.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 21.3187F, -13.6332F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 21.3187F, -26.3519F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 28.3769F, -20.6915F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 15.6582F, -20.6915F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r9 = bone3.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, 1.0257F, -24.0529F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, 1.0257F, -36.7716F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, 8.0839F, -31.1112F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F))
		.texOffs(234, 251).addBox(8.9355F, -4.6348F, -31.1112F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r10 = bone3.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(237, 251).addBox(8.9355F, -10.5273F, -22.7221F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F))
		.texOffs(237, 251).addBox(8.9355F, -10.5273F, -35.4408F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r11 = bone3.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(152, 30).addBox(-6.3135F, -7.4673F, -29.6677F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, 0.6545F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r12 = bone3.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(22, 82).addBox(7.0F, -2.1076F, -31.7626F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(96.055F, -13.614F, 26.5141F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 232).mirror().addBox(-112.055F, -5.9341F, -5.5945F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 232).mirror().addBox(-105.055F, -5.9341F, -5.5945F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-113.055F, -7.0659F, -1.4055F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-113.055F, 5.6528F, -1.4055F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-113.055F, -1.4055F, -7.0659F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-113.055F, -1.4055F, 5.6528F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 232).mirror().addBox(-112.055F, -5.9341F, 44.7045F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 232).mirror().addBox(-105.055F, -5.9341F, 44.7045F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-113.055F, -7.0659F, 49.2045F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-113.055F, 5.6528F, 49.2045F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-113.055F, -1.4055F, 56.2628F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-113.055F, -1.4055F, 43.5441F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(192.11F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r13 = bone5.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 26.6737F, 1.7602F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 26.6737F, 14.4789F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r14 = bone5.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 21.1587F, 11.8337F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 21.1587F, 24.5524F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 28.2169F, 17.4942F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 15.4982F, 17.4942F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r15 = bone5.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 1.1857F, 22.2534F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 1.1857F, 34.9721F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 8.2439F, 27.9139F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, -4.4748F, 27.9139F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r16 = bone5.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, -10.2316F, 21.0132F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, -10.2316F, 33.7319F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r17 = bone5.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(152, 30).mirror().addBox(3.1535F, -7.2322F, 15.3613F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, -0.6545F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r18 = bone5.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(-9.0F, -1.9145F, 28.3917F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 24.5141F, -0.48F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r19 = bone5.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 26.9693F, -3.469F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 26.9693F, -16.1877F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r20 = bone5.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 21.3187F, -13.6332F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 21.3187F, -26.3519F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 28.3769F, -20.6915F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 15.6582F, -20.6915F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r21 = bone5.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, 1.0257F, -24.0529F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, 1.0257F, -36.7716F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, 8.0839F, -31.1112F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(234, 251).mirror().addBox(-17.0F, -4.6348F, -31.1112F, 8.0645F, 1.4132F, 2.811F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r22 = bone5.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(237, 251).mirror().addBox(-17.0F, -10.5273F, -22.7221F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(237, 251).mirror().addBox(-17.0F, -10.5273F, -35.4408F, 8.0645F, 2.811F, 1.4132F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r23 = bone5.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(152, 30).mirror().addBox(3.3135F, -7.4673F, -29.6677F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, 0.6545F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r24 = bone5.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(-9.0F, -2.1076F, -31.7626F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-96.055F, -13.614F, 26.5141F, 0.48F, 0.0F, 0.0F));

		PartDefinition turret = partdefinition.addOrReplaceChild("turret", CubeListBuilder.create().texOffs(0, 60).addBox(-2.998F, 6.1878F, -0.2539F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(105, 119).addBox(-1.748F, -5.4545F, -4.017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(136, 84).addBox(-3.748F, -10.4545F, -12.767F, 7.0F, 5.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(125, 140).addBox(-2.498F, -7.7045F, -29.767F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(87, 140).addBox(0.502F, -7.7045F, -29.767F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(139, 5).addBox(-1.048F, -10.2045F, -29.767F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(92, 0).addBox(-7.998F, 12.1878F, -5.2539F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.002F, -7.1878F, 22.2539F));

		PartDefinition cube_r44 = turret.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(59, 85).addBox(-16.3591F, -20.1233F, 18.8561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 8).addBox(-16.3591F, -17.9733F, 18.8561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 53).addBox(-17.3591F, -20.9733F, 19.1061F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 10.7688F, -22.5448F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r45 = turret.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(65, 85).addBox(14.3591F, -17.9733F, 18.8561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 85).addBox(14.3591F, -20.1233F, 18.8561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 66).addBox(16.3591F, -20.9733F, 19.1061F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 10.7688F, -22.5448F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r46 = turret.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 60).addBox(-2.5F, -19.6616F, 3.9813F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 42).addBox(7.25F, -27.6616F, 3.7313F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 42).addBox(-8.25F, -27.6616F, 3.7313F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 74).addBox(-7.25F, -29.6616F, 3.7313F, 5.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 0).addBox(2.25F, -29.6616F, 3.7313F, 5.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 10.7688F, -22.5448F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r47 = turret.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 99).addBox(-2.0F, -1.7718F, 22.0412F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(59, 74).addBox(-2.5F, 4.0782F, 21.5412F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, 10.7688F, -22.5448F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r48 = bb_main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 64).addBox(1.468F, 5.5F, -10.0827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 0).addBox(7.468F, 5.5F, -10.0827F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.419F, -0.2909F, 0.0F, 0.5672F, -1.5708F));

		PartDefinition cube_r49 = bb_main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 74).addBox(4.468F, 5.7F, -10.2827F, 1.0F, 2.3F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.419F, -0.2909F, 0.0F, 0.5672F, -1.5708F));

		PartDefinition cube_r50 = bb_main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 60).addBox(4.7F, -7.468F, -10.0827F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 73).addBox(12.3F, -7.468F, -10.0827F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 99).addBox(8.0F, -6.468F, -15.2827F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.419F, -0.2909F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bb_main.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 74).addBox(-5.468F, -12.3F, -10.2827F, 1.0F, 2.3F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.419F, -0.2909F, 0.0F, -0.5672F, 1.5708F));

		PartDefinition cube_r52 = bb_main.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(80, 99).addBox(8.0F, -13.6664F, -11.4141F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.419F, -0.2909F, 1.1345F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		trunk.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seats.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		suspension.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel_detail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		turret.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}