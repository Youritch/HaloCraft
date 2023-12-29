package com.harby.halocraft.Client.Models;// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.harby.halocraft.HaloCraft;
import com.harby.halocraft.HaloEntities.Alien.Grunt;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class GruntModel<T extends Grunt> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(HaloCraft.MODID, "gruntmodel"), "main");
	private final ModelPart Grunt;

	public GruntModel(ModelPart root) {
		this.Grunt = root.getChild("Grunt");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Grunt = partdefinition.addOrReplaceChild("Grunt", CubeListBuilder.create(), PartPose.offset(1.0F, 24.0F, 0.0F));

		PartDefinition body = Grunt.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.9293F, -10.775F, -0.0258F));

		PartDefinition Torso = body.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition TorsoTop_r1 = Torso.addOrReplaceChild("TorsoTop_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -2.0F, -3.5F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0258F, -4.3495F, -0.0629F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition TorsoCenter_r1 = Torso.addOrReplaceChild("TorsoCenter_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-5.8297F, 2.2103F, -4.0449F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5707F, -5.4353F, 2.009F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition TorsoMiddle_r1 = Torso.addOrReplaceChild("TorsoMiddle_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0707F, -2.225F, -3.4842F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(27, 6).addBox(-0.0707F, 0.775F, -2.4742F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftPlate_r1 = Torso.addOrReplaceChild("LeftPlate_r1", CubeListBuilder.create().texOffs(16, 38).addBox(-0.3217F, -0.5166F, 2.9551F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5707F, -5.4353F, 2.009F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition RightPlate_r1 = Torso.addOrReplaceChild("RightPlate_r1", CubeListBuilder.create().texOffs(16, 38).addBox(-4.6783F, -0.5166F, 1.9551F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5707F, -5.4353F, 2.009F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition Propane_tank = Torso.addOrReplaceChild("Propane_tank", CubeListBuilder.create(), PartPose.offset(-0.0258F, -8.8281F, 3.4983F));

		PartDefinition TankAttachment_r1 = Propane_tank.addOrReplaceChild("TankAttachment_r1", CubeListBuilder.create().texOffs(37, 0).addBox(0.659F, -5.1096F, -1.0449F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(10.659F, -4.1096F, -1.0449F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 28).addBox(7.659F, -4.1096F, -1.5449F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 2).addBox(4.659F, -4.1096F, -2.0449F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 25).addBox(-1.341F, -4.1096F, -3.0449F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5449F, 3.3929F, -1.4894F, 1.5708F, -0.5672F, -1.5708F));

		PartDefinition BodyArmor = Torso.addOrReplaceChild("BodyArmor", CubeListBuilder.create().texOffs(15, 59).addBox(-3.0F, 1.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightTorsoArmor = BodyArmor.addOrReplaceChild("RightTorsoArmor", CubeListBuilder.create().texOffs(28, 55).addBox(0.0F, -0.5F, 0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.5F, -0.5F));

		PartDefinition RightTorsoArmorSeg2_r1 = RightTorsoArmor.addOrReplaceChild("RightTorsoArmorSeg2_r1", CubeListBuilder.create().texOffs(26, 56).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition LeftTorsoArmor = BodyArmor.addOrReplaceChild("LeftTorsoArmor", CubeListBuilder.create(), PartPose.offset(-2.1415F, 1.5F, -0.5F));

		PartDefinition LeftTorsoArmorSeg2_r1 = LeftTorsoArmor.addOrReplaceChild("LeftTorsoArmorSeg2_r1", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftTorsoArmorSeg_r1 = LeftTorsoArmor.addOrReplaceChild("LeftTorsoArmorSeg_r1", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Arms = Torso.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = Arms.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6643F, -1.8463F, -1.9317F, -0.8727F, 0.0F, 0.4363F));

		PartDefinition RightArmSeg1 = right_arm.addOrReplaceChild("RightArmSeg1", CubeListBuilder.create(), PartPose.offset(-7.3331F, -2.9577F, 4.1422F));

		PartDefinition ArmSeg1_r1 = RightArmSeg1.addOrReplaceChild("ArmSeg1_r1", CubeListBuilder.create().texOffs(10, 30).addBox(4.329F, -1.5448F, 3.7552F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 1.1781F, 1.1345F));

		PartDefinition RightArmSeg2 = RightArmSeg1.addOrReplaceChild("RightArmSeg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmSeg2_r1 = RightArmSeg2.addOrReplaceChild("ArmSeg2_r1", CubeListBuilder.create().texOffs(10, 30).addBox(4.3301F, -4.2154F, 4.2117F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 1.1781F, 1.1345F));

		PartDefinition RightArmSeg3 = RightArmSeg2.addOrReplaceChild("RightArmSeg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmorPad_r1 = RightArmSeg3.addOrReplaceChild("ArmorPad_r1", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-1.5F, -1.25F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0033F, 1.2521F, -4.1344F, 0.48F, 1.1781F, 1.1345F));

		PartDefinition ArmSeg3_r1 = RightArmSeg3.addOrReplaceChild("ArmSeg3_r1", CubeListBuilder.create().texOffs(10, 30).addBox(4.3292F, -4.9901F, 5.6084F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 1.1781F, 1.1345F));

		PartDefinition RightArmSeg4 = RightArmSeg3.addOrReplaceChild("RightArmSeg4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmSeg4_r1 = RightArmSeg4.addOrReplaceChild("ArmSeg4_r1", CubeListBuilder.create().texOffs(41, 21).addBox(0.2442F, -7.8882F, 6.7588F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8358F, 1.3283F, 2.8364F));

		PartDefinition RHand = RightArmSeg4.addOrReplaceChild("RHand", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RHand_r1 = RHand.addOrReplaceChild("RHand_r1", CubeListBuilder.create().texOffs(41, 11).addBox(-0.2558F, -7.8882F, 10.7588F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8358F, 1.3283F, 2.8364F));

		PartDefinition RightShoulderPad = right_arm.addOrReplaceChild("RightShoulderPad", CubeListBuilder.create().texOffs(5, 55).addBox(0.038F, -0.3201F, -1.5129F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7023F, -3.2911F, -2.0018F, 0.7873F, 0.1179F, -0.065F));

		PartDefinition PadBack_r1 = RightShoulderPad.addOrReplaceChild("PadBack_r1", CubeListBuilder.create().texOffs(14, 56).addBox(-1.5001F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.538F, 0.0799F, 1.5387F, -0.9599F, 0.0F, 0.0F));

		PartDefinition PadFront_r1 = RightShoulderPad.addOrReplaceChild("PadFront_r1", CubeListBuilder.create().texOffs(14, 56).addBox(-1.5001F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.538F, 0.1799F, -1.5129F, 0.9599F, 0.0F, 0.0F));

		PartDefinition PadTip_r1 = RightShoulderPad.addOrReplaceChild("PadTip_r1", CubeListBuilder.create().texOffs(19, 55).addBox(-0.75F, -0.75F, -1.9999F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.038F, 0.6799F, 0.4871F, 0.0F, 0.0F, 0.9599F));

		PartDefinition left_arm = Arms.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.8058F, -0.8463F, -1.9317F, -0.9163F, 0.0F, -0.4363F));

		PartDefinition LeftArmSeg1 = left_arm.addOrReplaceChild("LeftArmSeg1", CubeListBuilder.create(), PartPose.offset(8.4355F, -3.3366F, 3.6907F));

		PartDefinition ArmSeg1_r2 = LeftArmSeg1.addOrReplaceChild("ArmSeg1_r2", CubeListBuilder.create().texOffs(49, 18).addBox(-6.329F, -1.5448F, 3.7552F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, -1.1781F, -1.1345F));

		PartDefinition LeftArmSeg2 = LeftArmSeg1.addOrReplaceChild("LeftArmSeg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmSeg2_r2 = LeftArmSeg2.addOrReplaceChild("ArmSeg2_r2", CubeListBuilder.create().texOffs(49, 18).addBox(-6.3274F, -4.2154F, 4.2117F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, -1.1781F, -1.1345F));

		PartDefinition LeftArmSeg3 = LeftArmSeg2.addOrReplaceChild("LeftArmSeg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmSeg3_r2 = LeftArmSeg3.addOrReplaceChild("ArmSeg3_r2", CubeListBuilder.create().texOffs(49, 18).addBox(-6.3292F, -4.9901F, 5.6084F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, -1.1781F, -1.1345F));

		PartDefinition ArmorPad_r2 = LeftArmSeg3.addOrReplaceChild("ArmorPad_r2", CubeListBuilder.create().texOffs(0, 54).addBox(-0.7034F, -0.7926F, -1.1693F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1413F, 1.5066F, -4.5843F, 0.48F, -1.1781F, -1.1345F));

		PartDefinition LeftArmSeg4 = LeftArmSeg3.addOrReplaceChild("LeftArmSeg4", CubeListBuilder.create(), PartPose.offset(-8.6517F, 2.5023F, -2.6995F));

		PartDefinition ArmSeg4_r2 = LeftArmSeg4.addOrReplaceChild("ArmSeg4_r2", CubeListBuilder.create().texOffs(41, 21).addBox(-2.2442F, -7.8882F, 6.7588F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.6517F, -2.5023F, 2.6995F, 1.8358F, -1.3283F, -2.8364F));

		PartDefinition LHand = LeftArmSeg4.addOrReplaceChild("LHand", CubeListBuilder.create(), PartPose.offset(8.6517F, -2.5023F, 2.6995F));

		PartDefinition LHand_r1 = LHand.addOrReplaceChild("LHand_r1", CubeListBuilder.create().texOffs(41, 11).addBox(-2.7442F, -7.8882F, 10.7588F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8358F, -1.3283F, -2.8364F));

		PartDefinition LeftShoulderPad = left_arm.addOrReplaceChild("LeftShoulderPad", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-3.038F, -0.3201F, -1.5129F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7023F, -3.3335F, -2.8053F, 1.0322F, -0.1017F, 0.029F));

		PartDefinition PadBack_r2 = LeftShoulderPad.addOrReplaceChild("PadBack_r2", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.4999F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.538F, 0.0799F, 1.5387F, -0.9599F, 0.0F, 0.0F));

		PartDefinition PadFront_r2 = LeftShoulderPad.addOrReplaceChild("PadFront_r2", CubeListBuilder.create().texOffs(14, 56).mirror().addBox(-1.4999F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.538F, 0.1799F, -1.5129F, 0.9599F, 0.0F, 0.0F));

		PartDefinition PadTip_r2 = LeftShoulderPad.addOrReplaceChild("PadTip_r2", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-1.25F, -0.75F, -1.9999F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.038F, 0.6799F, 0.4871F, 0.0F, 0.0F, -0.9599F));

		PartDefinition head = Torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0258F, -4.8937F, -3.1274F, -0.48F, 0.0F, 0.0F));

		PartDefinition HeadBase_r1 = head.addOrReplaceChild("HeadBase_r1", CubeListBuilder.create().texOffs(25, 15).addBox(-5.9265F, -9.8377F, -3.0449F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5449F, 0.5256F, 4.7358F, 1.5708F, -0.829F, -1.5708F));

		PartDefinition Neck_r1 = head.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1575F, -0.1989F, 1.5708F, -0.5672F, -1.5708F));

		PartDefinition Mask = head.addOrReplaceChild("Mask", CubeListBuilder.create(), PartPose.offset(-0.5449F, 0.5256F, 4.7358F));

		PartDefinition MaskRight_r1 = Mask.addOrReplaceChild("MaskRight_r1", CubeListBuilder.create().texOffs(12, 35).addBox(0.4526F, -6.292F, 4.1813F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1236F, 0.5097F, 2.5293F));

		PartDefinition MaskLeft_r1 = Mask.addOrReplaceChild("MaskLeft_r1", CubeListBuilder.create().texOffs(12, 35).addBox(-3.3455F, -6.1778F, 3.3349F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.1236F, -0.5097F, -2.5293F));

		PartDefinition MaskBase_r1 = Mask.addOrReplaceChild("MaskBase_r1", CubeListBuilder.create().texOffs(37, 48).addBox(-6.3763F, -7.4928F, -2.0449F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.6981F, -1.5708F));

		PartDefinition Legs = body.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Right_leg = Legs.addOrReplaceChild("Right_leg", CubeListBuilder.create(), PartPose.offset(-1.0707F, 10.775F, 0.0258F));

		PartDefinition RLegSeg1 = Right_leg.addOrReplaceChild("RLegSeg1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RLegSeg1_r1 = RLegSeg1.addOrReplaceChild("RLegSeg1_r1", CubeListBuilder.create().texOffs(22, 45).addBox(-3.1363F, 0.9062F, -4.0285F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9293F, -10.775F, -0.0258F, -2.321F, 0.8577F, 2.821F));

		PartDefinition RLegSeg2 = RLegSeg1.addOrReplaceChild("RLegSeg2", CubeListBuilder.create(), PartPose.offset(0.9293F, -10.775F, -0.0258F));

		PartDefinition RLegSeg2_r1 = RLegSeg2.addOrReplaceChild("RLegSeg2_r1", CubeListBuilder.create().texOffs(0, 49).addBox(1.0301F, 4.3621F, 3.7858F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 1.0908F, 1.5708F));

		PartDefinition RLegSeg3 = RLegSeg2.addOrReplaceChild("RLegSeg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RLegSeg3_r1 = RLegSeg3.addOrReplaceChild("RLegSeg3_r1", CubeListBuilder.create().texOffs(12, 45).addBox(-2.9293F, 6.775F, 3.7758F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RFoot = RLegSeg3.addOrReplaceChild("RFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RFoot_r1 = RFoot.addOrReplaceChild("RFoot_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-2.9293F, 9.775F, 2.7758F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition RToes = RFoot.addOrReplaceChild("RToes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BackToe_r1 = RToes.addOrReplaceChild("BackToe_r1", CubeListBuilder.create().texOffs(0, 3).addBox(-3.9293F, 10.025F, 3.7758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(1.0707F, 10.275F, 2.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(1.0707F, 10.275F, 4.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(1.0707F, 10.275F, 5.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Left_leg = Legs.addOrReplaceChild("Left_leg", CubeListBuilder.create(), PartPose.offset(0.9293F, 10.775F, 0.0258F));

		PartDefinition LLegSeg1 = Left_leg.addOrReplaceChild("LLegSeg1", CubeListBuilder.create(), PartPose.offset(-0.9293F, -10.775F, -0.0258F));

		PartDefinition LLegSeg1_r1 = LLegSeg1.addOrReplaceChild("LLegSeg1_r1", CubeListBuilder.create().texOffs(22, 45).addBox(1.1363F, 0.9062F, -4.0285F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.321F, -0.8577F, -2.821F));

		PartDefinition LLegSeg2 = LLegSeg1.addOrReplaceChild("LLegSeg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LLegSeg2_r1 = LLegSeg2.addOrReplaceChild("LLegSeg2_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-3.0301F, 4.3621F, 3.7758F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -1.0908F, -1.5708F));

		PartDefinition LLegSeg3 = LLegSeg2.addOrReplaceChild("LLegSeg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LLegSeg3_r1 = LLegSeg3.addOrReplaceChild("LLegSeg3_r1", CubeListBuilder.create().texOffs(12, 45).addBox(-0.0707F, 6.775F, 3.7658F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LFoot = LLegSeg3.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LFoot_r1 = LFoot.addOrReplaceChild("LFoot_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0707F, 9.775F, 2.7758F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LToe = LFoot.addOrReplaceChild("LToe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BackToe_r2 = LToe.addOrReplaceChild("BackToe_r2", CubeListBuilder.create().texOffs(0, 0).addBox(2.9293F, 10.025F, 3.7758F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-2.0707F, 10.275F, 4.2758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-2.0707F, 10.275F, 2.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-2.0707F, 10.275F, 5.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Grunt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.Grunt;
	}
}