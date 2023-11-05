package com.Pr1tcha.rotp_ova_addon.client.render.entity.model.stand;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.Pr1tcha.rotp_ova_addon.action.stand.TheWorldOvaUltraPunch;
import com.Pr1tcha.rotp_ova_addon.entity.stand.stands.TheWorldOvaEntity;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.client.render.SlopeModelBox;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.SlopeModelBox;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransition;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransitionMultiple;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.ModelRenderer;


public class TheWorldOvaModel extends HumanoidStandModel<TheWorldOvaEntity> {
	private final ModelRenderer headpiece;
	private final ModelRenderer slopeNew;
	private final ModelRenderer faceRight;
	private final ModelRenderer faceLeft;
	private final ModelRenderer heartSmallHead;
	private final ModelRenderer smallHeartCube4;
	private final ModelRenderer smallHeartCube5;
	private final ModelRenderer smallHeartCube6;
	private final ModelRenderer smallHeartCube7;
	private final ModelRenderer smallHeartCube8;
	private final ModelRenderer torso_r1;
	private final ModelRenderer torso_r2;
	private final ModelRenderer heartLargeAbdomen;
	private final ModelRenderer largeHeartCube1;
	private final ModelRenderer largeHeartCube2;
	private final ModelRenderer heartSmallAbdomen;
	private final ModelRenderer smallHeartCube1;
	private final ModelRenderer smallHeartCube2;
	private final ModelRenderer smallHeartCube3;
	private final ModelRenderer smallHeartCube9;
	private final ModelRenderer smallHeartCube10;
	private final ModelRenderer tube3;
	private final ModelRenderer tube2;
	private final ModelRenderer heartLeftArm;
	private final ModelRenderer heartCube4;
	private final ModelRenderer heartCube5;
	private final ModelRenderer heartCube6;
	private final ModelRenderer heartCube15;
	private final ModelRenderer heartCube16;
	private final ModelRenderer leftForeArm_r1;
	private final ModelRenderer leftForeArm_r2;
	private final ModelRenderer heartRightArm;
	private final ModelRenderer heartCube1;
	private final ModelRenderer heartCube2;
	private final ModelRenderer heartCube3;
	private final ModelRenderer heartCube13;
	private final ModelRenderer heartCube14;
	private final ModelRenderer rightForeArm_r1;
	private final ModelRenderer rightForeArm_r2;
	private final ModelRenderer heartRightLeg;
	private final ModelRenderer heartCube10;
	private final ModelRenderer heartCube11;
	private final ModelRenderer heartCube12;
	private final ModelRenderer heartCube19;
	private final ModelRenderer heartCube20;
	private final ModelRenderer heartLeftLeg;
	private final ModelRenderer heartCube7;
	private final ModelRenderer heartCube8;
	private final ModelRenderer heartCube9;
	private final ModelRenderer heartCube17;
	private final ModelRenderer heartCube18;

	public TheWorldOvaModel() {
		super();

		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;

		headpiece = new ModelRenderer(this);
		headpiece.setPos(0.0F, -2.0F, -5.3F);
		head.addChild(headpiece);


		slopeNew = new ModelRenderer(this);
		slopeNew.setPos(0.0F, -6.4F, 1.3F);
		headpiece.addChild(slopeNew);
		SlopeModelBox.addSlopeBox(slopeNew,
				30, 14,
				-4.0F, 0.2F, -2.8F, 0.2F,
				8.0F, 6.0F, 7.0F, 8.0F,
				0.2F, false, texWidth, texHeight);

		faceRight = new ModelRenderer(this);
		faceRight.setPos(-4.2F, -6.4F, 1.3F);
		headpiece.addChild(faceRight);
		setRotationAngle(faceRight, 0.0F, 0.3023F, 0.0F);
		faceRight.texOffs(69, 21).addBox(0.2F, 0.2F, 0.2F, 4.0F, 6.0F, 1.0F, 0.2F, false);

		faceLeft = new ModelRenderer(this);
		faceLeft.setPos(4.2F, -6.4F, 1.3F);
		headpiece.addChild(faceLeft);
		setRotationAngle(faceLeft, 0.0F, -0.3023F, 0.0F);
		faceLeft.texOffs(69, 21).addBox(-4.2F, 0.2F, 0.2F, 4.0F, 6.0F, 1.0F, 0.2F, true);

		heartSmallHead = new ModelRenderer(this);
		heartSmallHead.setPos(0.0F, 0.55F, -4.0F);
		head.addChild(heartSmallHead);


		smallHeartCube4 = new ModelRenderer(this);
		smallHeartCube4.setPos(0.0F, 0.0F, 0.0F);
		heartSmallHead.addChild(smallHeartCube4);
		setRotationAngle(smallHeartCube4, 0.0F, 0.0F, -0.7854F);
		smallHeartCube4.texOffs(4, 6).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		smallHeartCube5 = new ModelRenderer(this);
		smallHeartCube5.setPos(0.3F, -0.3F, 0.0F);
		heartSmallHead.addChild(smallHeartCube5);
		setRotationAngle(smallHeartCube5, 0.0F, 0.0F, -0.7854F);
		smallHeartCube5.texOffs(4, 6).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		smallHeartCube6 = new ModelRenderer(this);
		smallHeartCube6.setPos(-0.3F, -0.3F, 0.0F);
		heartSmallHead.addChild(smallHeartCube6);
		setRotationAngle(smallHeartCube6, 0.0F, 0.0F, -0.7854F);
		smallHeartCube6.texOffs(4, 6).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		smallHeartCube7 = new ModelRenderer(this);
		smallHeartCube7.setPos(-0.3F, -0.3F, 0.0F);
		heartSmallHead.addChild(smallHeartCube7);
		setRotationAngle(smallHeartCube7, 0.0F, 0.0F, 0.7854F);
		smallHeartCube7.texOffs(4, 6).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		smallHeartCube8 = new ModelRenderer(this);
		smallHeartCube8.setPos(0.3F, -0.3F, 0.0F);
		heartSmallHead.addChild(smallHeartCube8);
		setRotationAngle(smallHeartCube8, 0.0F, 0.0F, 0.7854F);
		smallHeartCube8.texOffs(4, 6).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		torso.texOffs(49, 70).addBox(-3.7F, 5.4F, -2.5F, 1.0F, 5.0F, 5.0F, 0.25F, false);
		torso.texOffs(49, 65).addBox(2.7F, 5.4F, -2.5F, 1.0F, 5.0F, 5.0F, 0.25F, true);
		torso.texOffs(20, 64).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
		torso.texOffs(24, 73).addBox(-2.5F, 4.0F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(9, 80).addBox(0.6F, 2.0F, 2.0F, 2.0F, 5.0F, 2.0F, -0.1F, true);
		torso.texOffs(9, 80).addBox(-2.6F, 2.0F, 2.0F, 2.0F, 5.0F, 2.0F, -0.1F, false);

		torso_r1 = new ModelRenderer(this);
		torso_r1.setPos(0.0F, 24.0F, -0.1F);
		torso.addChild(torso_r1);
		setRotationAngle(torso_r1, 0.0F, 0.0F, 0.0873F);
		torso_r1.texOffs(49, 65).addBox(-5.4F, -23.7F, -2.5F, 1.0F, 5.0F, 5.0F, 0.35F, false);

		torso_r2 = new ModelRenderer(this);
		torso_r2.setPos(0.0F, 24.0F, -0.1F);
		torso.addChild(torso_r2);
		setRotationAngle(torso_r2, 0.0F, 0.0F, -0.0873F);
		torso_r2.texOffs(49, 65).addBox(4.4F, -23.7F, -2.5F, 1.0F, 5.0F, 5.0F, 0.35F, true);

		heartLargeAbdomen = new ModelRenderer(this);
		heartLargeAbdomen.setPos(0.0F, 11.5F, -2.0F);
		torso.addChild(heartLargeAbdomen);


		largeHeartCube1 = new ModelRenderer(this);
		largeHeartCube1.setPos(0.0F, 2.0F, 0.25F);
		heartLargeAbdomen.addChild(largeHeartCube1);
		setRotationAngle(largeHeartCube1, 0.0F, 0.0F, 0.7854F);
		largeHeartCube1.texOffs(22, 81).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 0.0F, 0.25F, false);

		largeHeartCube2 = new ModelRenderer(this);
		largeHeartCube2.setPos(0.0F, 2.0F, 0.25F);
		heartLargeAbdomen.addChild(largeHeartCube2);
		setRotationAngle(largeHeartCube2, 0.0F, 0.0F, -0.7854F);
		largeHeartCube2.texOffs(22, 81).addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 0.0F, 0.25F, true);

		heartSmallAbdomen = new ModelRenderer(this);
		heartSmallAbdomen.setPos(0.0F, 11.3F, -2.05F);
		torso.addChild(heartSmallAbdomen);


		smallHeartCube1 = new ModelRenderer(this);
		smallHeartCube1.setPos(0.0F, 0.0F, 0.0F);
		heartSmallAbdomen.addChild(smallHeartCube1);
		setRotationAngle(smallHeartCube1, 0.0F, 0.0F, -0.7854F);
		smallHeartCube1.texOffs(17, 80).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		smallHeartCube2 = new ModelRenderer(this);
		smallHeartCube2.setPos(0.3F, -0.3F, 0.0F);
		heartSmallAbdomen.addChild(smallHeartCube2);
		setRotationAngle(smallHeartCube2, 0.0F, 0.0F, -0.7854F);
		smallHeartCube2.texOffs(17, 80).addBox(0.3F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		smallHeartCube3 = new ModelRenderer(this);
		smallHeartCube3.setPos(-0.3F, -0.3F, 0.0F);
		heartSmallAbdomen.addChild(smallHeartCube3);
		setRotationAngle(smallHeartCube3, 0.0F, 0.0F, -0.7854F);
		smallHeartCube3.texOffs(17, 80).addBox(0.0F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		smallHeartCube9 = new ModelRenderer(this);
		smallHeartCube9.setPos(-0.3F, -0.3F, 0.0F);
		heartSmallAbdomen.addChild(smallHeartCube9);
		setRotationAngle(smallHeartCube9, 0.0F, 0.0F, 0.7854F);
		smallHeartCube9.texOffs(17, 80).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		smallHeartCube10 = new ModelRenderer(this);
		smallHeartCube10.setPos(0.3F, -0.3F, 0.0F);
		heartSmallAbdomen.addChild(smallHeartCube10);
		setRotationAngle(smallHeartCube10, 0.0F, 0.0F, 0.7854F);
		smallHeartCube10.texOffs(17, 80).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

		tube3 = new ModelRenderer(this);
		tube3.setPos(-1.5F, 2.25F, 1.25F);
		torso.addChild(tube3);
		setRotationAngle(tube3, -0.1138F, -0.1137F, -0.4731F);
		tube3.texOffs(9, 35).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 6.0F, 3.0F, 0.0F, true);
		tube3.texOffs(10, 44).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 2.0F, 0.0F, true);

		tube2 = new ModelRenderer(this);
		tube2.setPos(1.5F, 2.25F, 1.25F);
		torso.addChild(tube2);
		setRotationAngle(tube2, -0.1138F, 0.1137F, 0.4731F);
		tube2.texOffs(9, 35).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 6.0F, 3.0F, 0.0F, false);
		tube2.texOffs(10, 44).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		leftArm.texOffs(16, 110).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.25F, true);
		leftArm.texOffs(48, 105).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, true);

		heartLeftArm = new ModelRenderer(this);
		heartLeftArm.setPos(0.0F, 3.8F, 1.8F);
		leftArm.addChild(heartLeftArm);


		heartCube4 = new ModelRenderer(this);
		heartCube4.setPos(0.0F, 0.0F, 0.0F);
		heartLeftArm.addChild(heartCube4);
		setRotationAngle(heartCube4, 0.0F, 0.0F, -0.7854F);
		heartCube4.texOffs(48, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube5 = new ModelRenderer(this);
		heartCube5.setPos(0.5F, -0.5F, 0.0F);
		heartLeftArm.addChild(heartCube5);
		setRotationAngle(heartCube5, 0.0F, 0.0F, -0.7854F);
		heartCube5.texOffs(48, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube6 = new ModelRenderer(this);
		heartCube6.setPos(-0.5F, -0.5F, 0.0F);
		heartLeftArm.addChild(heartCube6);
		setRotationAngle(heartCube6, 0.0F, 0.0F, -0.7854F);
		heartCube6.texOffs(48, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube15 = new ModelRenderer(this);
		heartCube15.setPos(0.0F, 0.0F, 0.0F);
		heartLeftArm.addChild(heartCube15);
		setRotationAngle(heartCube15, 0.0F, 0.0F, 0.7854F);
		heartCube15.texOffs(16, 121).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		heartCube16 = new ModelRenderer(this);
		heartCube16.setPos(-0.5F, -0.5F, 0.0F);
		heartLeftArm.addChild(heartCube16);
		setRotationAngle(heartCube16, 0.0F, 0.0F, 0.7854F);
		heartCube16.texOffs(16, 121).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		leftForeArm.texOffs(16, 105).addBox(-2.0F, 3.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, true);
		leftForeArm.texOffs(32, 96).addBox(0.9F, 2.7F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, true);
		leftForeArm.texOffs(42, 97).addBox(1.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, true);

		leftForeArm_r1 = new ModelRenderer(this);
		leftForeArm_r1.setPos(-5.4F, 18.3F, 0.0F);
		leftForeArm.addChild(leftForeArm_r1);
		setRotationAngle(leftForeArm_r1, 0.0F, 0.0F, 0.1745F);
		leftForeArm_r1.texOffs(48, 119).addBox(2.775F, -20.6F, -2.0F, 2.0F, 5.0F, 4.0F, 0.15F, true);
		leftForeArm_r1.texOffs(19, 100).addBox(3.775F, -19.7F, -2.0F, 1.0F, 1.0F, 4.0F, 0.15F, true);

		leftForeArm_r2 = new ModelRenderer(this);
		leftForeArm_r2.setPos(-2.5409F, 13.9409F, 0.0F);
		leftForeArm.addChild(leftForeArm_r2);
		setRotationAngle(leftForeArm_r2, 0.0F, 0.0F, 0.0436F);
		leftForeArm_r2.texOffs(50, 121).addBox(3.775F, -16.6F, -1.0F, 1.0F, 1.0F, 2.0F, 0.15F, true);

		rightArm.texOffs(16, 110).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.25F, false);
		rightArm.texOffs(48, 105).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, false);

		heartRightArm = new ModelRenderer(this);
		heartRightArm.setPos(0.0F, 3.8F, 1.8F);
		rightArm.addChild(heartRightArm);


		heartCube1 = new ModelRenderer(this);
		heartCube1.setPos(0.0F, 0.0F, 0.0F);
		heartRightArm.addChild(heartCube1);
		setRotationAngle(heartCube1, 0.0F, 0.0F, -0.7854F);
		heartCube1.texOffs(16, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube2 = new ModelRenderer(this);
		heartCube2.setPos(0.5F, -0.5F, 0.0F);
		heartRightArm.addChild(heartCube2);
		setRotationAngle(heartCube2, 0.0F, 0.0F, -0.7854F);
		heartCube2.texOffs(16, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube3 = new ModelRenderer(this);
		heartCube3.setPos(0.5F, -0.5F, 0.0F);
		heartRightArm.addChild(heartCube3);
		setRotationAngle(heartCube3, 0.0F, 0.0F, 0.7854F);
		heartCube3.texOffs(48, 121).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		heartCube13 = new ModelRenderer(this);
		heartCube13.setPos(0.0F, 0.0F, 0.0F);
		heartRightArm.addChild(heartCube13);
		setRotationAngle(heartCube13, 0.0F, 0.0F, 0.7854F);
		heartCube13.texOffs(48, 121).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		heartCube14 = new ModelRenderer(this);
		heartCube14.setPos(-0.5F, -0.5F, 0.0F);
		heartRightArm.addChild(heartCube14);
		setRotationAngle(heartCube14, 0.0F, 0.0F, 0.7854F);
		heartCube14.texOffs(48, 121).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		rightForeArm.texOffs(16, 105).addBox(-2.0F, 3.1F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, false);
		rightForeArm.texOffs(32, 96).addBox(-2.9F, 2.7F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, false);
		rightForeArm.texOffs(42, 97).addBox(-2.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, false);

		rightForeArm_r1 = new ModelRenderer(this);
		rightForeArm_r1.setPos(2.5409F, 13.9409F, 0.0F);
		rightForeArm.addChild(rightForeArm_r1);
		setRotationAngle(rightForeArm_r1, 0.0F, 0.0F, -0.0436F);
		rightForeArm_r1.texOffs(50, 121).addBox(-4.775F, -16.6F, -1.0F, 1.0F, 1.0F, 2.0F, 0.15F, false);

		rightForeArm_r2 = new ModelRenderer(this);
		rightForeArm_r2.setPos(5.4F, 18.3F, 0.0F);
		rightForeArm.addChild(rightForeArm_r2);
		setRotationAngle(rightForeArm_r2, 0.0F, 0.0F, -0.1745F);
		rightForeArm_r2.texOffs(19, 100).addBox(-4.775F, -19.7F, -2.0F, 1.0F, 1.0F, 4.0F, 0.15F, false);
		rightForeArm_r2.texOffs(48, 119).addBox(-4.775F, -20.6F, -2.0F, 2.0F, 5.0F, 4.0F, 0.15F, false);

		leftLeg.texOffs(80, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, true);
		leftLeg.texOffs(112, 108).addBox(1.8F, -1.75F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		heartRightLeg = new ModelRenderer(this);
		heartRightLeg.setPos(0.0F, 6.0F, -1.8F);
		leftLeg.addChild(heartRightLeg);


		heartCube10 = new ModelRenderer(this);
		heartCube10.setPos(0.0F, 0.05F, 0.0F);
		heartRightLeg.addChild(heartCube10);
		setRotationAngle(heartCube10, 0.0F, 0.0F, -0.7854F);
		heartCube10.texOffs(96, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		heartCube11 = new ModelRenderer(this);
		heartCube11.setPos(0.5F, -0.45F, 0.0F);
		heartRightLeg.addChild(heartCube11);
		setRotationAngle(heartCube11, 0.0F, 0.0F, -0.7854F);
		heartCube11.texOffs(96, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		heartCube12 = new ModelRenderer(this);
		heartCube12.setPos(-0.5F, -0.45F, 0.0F);
		heartRightLeg.addChild(heartCube12);
		setRotationAngle(heartCube12, 0.0F, 0.0F, -0.7854F);
		heartCube12.texOffs(96, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		heartCube19 = new ModelRenderer(this);
		heartCube19.setPos(0.0F, 0.05F, 0.0F);
		heartRightLeg.addChild(heartCube19);
		setRotationAngle(heartCube19, 0.0F, 0.0F, 0.7854F);
		heartCube19.texOffs(64, 120).addBox(-1.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		heartCube20 = new ModelRenderer(this);
		heartCube20.setPos(-0.5F, -0.45F, 0.0F);
		heartRightLeg.addChild(heartCube20);
		setRotationAngle(heartCube20, 0.0F, 0.0F, 0.7854F);
		heartCube20.texOffs(64, 120).addBox(-1.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, true);

		leftLowerLeg.texOffs(112, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);

		rightLeg.texOffs(80, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, false);
		rightLeg.texOffs(112, 108).addBox(-2.8F, -1.75F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		heartLeftLeg = new ModelRenderer(this);
		heartLeftLeg.setPos(0.0F, 6.0F, -1.8F);
		rightLeg.addChild(heartLeftLeg);


		heartCube7 = new ModelRenderer(this);
		heartCube7.setPos(0.0F, 0.05F, 0.0F);
		heartLeftLeg.addChild(heartCube7);
		setRotationAngle(heartCube7, 0.0F, 0.0F, -0.7854F);
		heartCube7.texOffs(64, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

		heartCube8 = new ModelRenderer(this);
		heartCube8.setPos(0.5F, -0.45F, 0.0F);
		heartLeftLeg.addChild(heartCube8);
		setRotationAngle(heartCube8, 0.0F, 0.0F, -0.7854F);
		heartCube8.texOffs(64, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		heartCube9 = new ModelRenderer(this);
		heartCube9.setPos(0.5F, -0.45F, 0.0F);
		heartLeftLeg.addChild(heartCube9);
		setRotationAngle(heartCube9, 0.0F, 0.0F, 0.7854F);
		heartCube9.texOffs(96, 120).addBox(-1.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, true);

		heartCube17 = new ModelRenderer(this);
		heartCube17.setPos(0.0F, 0.05F, 0.0F);
		heartLeftLeg.addChild(heartCube17);
		setRotationAngle(heartCube17, 0.0F, 0.0F, 0.7854F);
		heartCube17.texOffs(96, 120).addBox(-1.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, true);

		heartCube18 = new ModelRenderer(this);
		heartCube18.setPos(-0.5F, -0.45F, 0.0F);
		heartLeftLeg.addChild(heartCube18);
		setRotationAngle(heartCube18, 0.0F, 0.0F, 0.7854F);
		heartCube18.texOffs(96, 120).addBox(-1.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, 0.1F, true);

		rightLowerLeg.texOffs(80, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);
	}
	@Override
	protected RotationAngle[][] initSummonPoseRotations() {
		return new RotationAngle[][] {
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 10F, 0, 0),
						RotationAngle.fromDegrees(body, -7.5F, 0, 0),
						RotationAngle.fromDegrees(upperPart, 0, 0, 0),
						RotationAngle.fromDegrees(leftArm, -95.32024F, 60.25015F, -77.70242F),
						RotationAngle.fromDegrees(leftForeArm, -29.51816F, 4.75113F, 11.57518F),
						RotationAngle.fromDegrees(rightArm, -76.44906F, -62.3513F, 68.35546F),
						RotationAngle.fromDegrees(rightForeArm, -44.31282F, -8.80348F, -8.90928F),
						RotationAngle.fromDegrees(leftLeg, 15F, 0, -7.5F),
						RotationAngle.fromDegrees(leftLowerLeg, 7.5F, 0, 0),
						RotationAngle.fromDegrees(rightLeg, 12.5F, 0, 10F),
						RotationAngle.fromDegrees(rightLowerLeg, 12.38671F, -1.59356F, 0.39358F)
				},
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 15F, 0, 0),
						RotationAngle.fromDegrees(body, 0, 0, 0),
						RotationAngle.fromDegrees(upperPart, 0, 0, 0),
						RotationAngle.fromDegrees(leftArm, 0, 0, -20F),
						RotationAngle.fromDegrees(leftForeArm, -14.46169F, 30.24394F, 7.03197F),
						RotationAngle.fromDegrees(rightArm, 0, 0, 20F),
						RotationAngle.fromDegrees(rightForeArm, -16.47027F, -24.09293F, -10.6183F),
						RotationAngle.fromDegrees(leftLeg, 0, 0, -5F),
						RotationAngle.fromDegrees(leftLowerLeg, 15F, 0, 0),
						RotationAngle.fromDegrees(rightLeg, 0, 0, 5F),
						RotationAngle.fromDegrees(rightLowerLeg, 12.5F, 0, 0)
				},
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, -27.5F, 0, 0),
						RotationAngle.fromDegrees(body, 5F, -20F, 0),
						RotationAngle.fromDegrees(upperPart, -10, 0, 0),
						RotationAngle.fromDegrees(heartLargeAbdomen, -20F, 0, 0),
						RotationAngle.fromDegrees(leftArm, -43.97549F, -65.19239F, 0.91047F),
						RotationAngle.fromDegrees(leftForeArm, -25F, 0, 0),
						RotationAngle.fromDegrees(rightArm, -44.46244F, 59.75363F, -7.27583F),
						RotationAngle.fromDegrees(rightForeArm, -35F, 0, 0),
						RotationAngle.fromDegrees(leftLeg, -5.67422F, -21.63647F, -11.85891F),
						RotationAngle.fromDegrees(leftLowerLeg, 37.5F, 0, 0),
						RotationAngle.fromDegrees(rightLeg, -2.57561F, 14.76769F, 9.33832F),
						RotationAngle.fromDegrees(rightLowerLeg, 40F, 0, 0)
				}
		};
	}

	@Override
	protected void initActionPoses() {
		ModelPose<TheWorldOvaEntity> heavyPunchPose1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head, 0, 0, 0),
				RotationAngle.fromDegrees(upperPart, 0, 0, 0),
				RotationAngle.fromDegrees(torso, 0, 0, 0),
				RotationAngle.fromDegrees(leftArm, -25.05388F, -65.90872F, -98.34827F),
				RotationAngle.fromDegrees(leftForeArm, 0, 0, 47.5F),
				RotationAngle.fromDegrees(rightArm, -6.19998F, -38.53555F, 29.64428F),
				RotationAngle.fromDegrees(rightForeArm, -29.97748F, 6.22086F, -8.2063F),
				RotationAngle.fromDegrees(leftLeg, 15, 0, -7.5F),
				RotationAngle.fromDegrees(leftLowerLeg, 27.5F, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 0, 10, 5),
				RotationAngle.fromDegrees(rightLowerLeg, 27.5F, 0, 0)
		});

		ModelPose<TheWorldOvaEntity> heavyPunchPose2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,0, 0, 0),
				RotationAngle.fromDegrees(upperPart,-0.74753F, -35.07086F, -3.05215F),
				RotationAngle.fromDegrees(leftArm, -34.24826F, -63.42352F, -88.17762F),
				RotationAngle.fromDegrees(leftForeArm, -30, 0, 75),
				RotationAngle.fromDegrees(rightArm, -53.13117F, 6.27305F, 50.56617F),
				RotationAngle.fromDegrees(rightForeArm,-82.47748F, 6.22086F, -8.2063F),
				RotationAngle.fromDegrees(leftLeg,18.41527F, -19.291F, -12.88152F),
				RotationAngle.fromDegrees(rightLeg,0, -10, 5),
				RotationAngle.fromDegrees(rightLowerLeg,22.5F, 0, 0),

		});
		ModelPose<TheWorldOvaEntity> heavyPunchPose3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head,0, 0, 0),
				RotationAngle.fromDegrees(upperPart, 0, 37.5F, 0),
				RotationAngle.fromDegrees(leftArm, -62.22436F, -20.36472F, -55.76905F),
				RotationAngle.fromDegrees(leftForeArm, -20.65293F, 7.14496F, 15.48416F),
				RotationAngle.fromDegrees(rightArm, -30.73169F, 22.99966F, 58.35394F),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -2.5F),

		});

		actionAnim.put(StandPose.HEAVY_ATTACK, new PosedActionAnimation.Builder<TheWorldOvaEntity>()
				.addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
						.addPose(0.5F, heavyPunchPose1)
						.addPose(0.7F, heavyPunchPose2)
						.addPose(0.8F, heavyPunchPose3)
						.build(heavyPunchPose3))
				.build(idlePose));

		actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<TheWorldOvaEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
						new RotationAngle(body, 0.0F, -0.48F, 0.0F),
						new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F),
						new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
				}))
				.build(idlePose));






		ModelPose<TheWorldOvaEntity> UltraPunchPose1 = new ModelPose<>(new RotationAngle[] {

				RotationAngle.fromDegrees(body, 0, 35, 0),
				RotationAngle.fromDegrees(upperPart, 0, 35, 0),
				RotationAngle.fromDegrees(leftArm, 32.5F, 0, 0),
				RotationAngle.fromDegrees(leftForeArm, -52.5F, 0, 0),
				RotationAngle.fromDegrees(rightArm, 28.88636F, -15.58394F, 25.96295F),
				RotationAngle.fromDegrees(rightForeArm, -60, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 10, 0, -7.5F),
				RotationAngle.fromDegrees(leftLowerLeg, 10, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 25, 0, 10),
				RotationAngle.fromDegrees(rightLowerLeg, 15, 0, 0)

		});
		ModelPose<TheWorldOvaEntity> UltraPunchPose2 = new ModelPose<>(new RotationAngle[] {

				RotationAngle.fromDegrees(body, 0, -20, 0),
				RotationAngle.fromDegrees(upperPart, 0, -30, 0),
				RotationAngle.fromDegrees(leftArm, 0, 0, -20),
				RotationAngle.fromDegrees(leftForeArm, -31.70243F, -15.10504F, 24.93934F),
				RotationAngle.fromDegrees(rightArm, -16.42141F, 25.23304F, 26.12805F),
				RotationAngle.fromDegrees(rightForeArm, -42.5F, 0, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 15, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 10, 0, 10),
				RotationAngle.fromDegrees(rightLowerLeg, 32.5F, 0, 0)

		});

		actionAnim.put(TheWorldOvaUltraPunch.ULTRA_PUNCH, new PosedActionAnimation.Builder<TheWorldOvaEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPoseTransition<>(idlePose, UltraPunchPose1))
				.addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(UltraPunchPose1)
						.addPose(0.95F, UltraPunchPose1)
						.addPose(1F, UltraPunchPose2)
						.build(UltraPunchPose2))
				.build(idlePose));



		actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<TheWorldOvaEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
						new RotationAngle(body, 0.0F, -0.48F, 0.0F),
						new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F),
						new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
				}))
				.build(idlePose));

		super.initActionPoses();
	}


	@Override
	protected ModelPose<TheWorldOvaEntity> initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, 0, 0),
				RotationAngle.fromDegrees(upperPart, 0, 0, 0),
				RotationAngle.fromDegrees(torso, 0, 0, 0),
				RotationAngle.fromDegrees(leftArm, -44.11732F, -52.71561F, 20.41555F),
				RotationAngle.fromDegrees(leftForeArm, -35F, 0, 0),
				RotationAngle.fromDegrees(rightArm, -30F, 47.5F, 0),
				RotationAngle.fromDegrees(rightForeArm, -35F, 0, 0),
				RotationAngle.fromDegrees(leftLeg, 13.80962F, -7.38542F, -10.08453F),
				RotationAngle.fromDegrees(leftLowerLeg, 27.5F, 0, 0),
				RotationAngle.fromDegrees(rightLeg, 1.31845F, 9.91358F, 7.61435F),
				RotationAngle.fromDegrees(rightLowerLeg, 20F, 0, 0)
		});
	}

	@Override
	protected ModelPose<TheWorldOvaEntity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, -45.11732F, -53.71561F, 19.41555F),
				RotationAngle.fromDegrees(leftForeArm, -35F, 0, 0),
				RotationAngle.fromDegrees(rightArm, -31F, 46.5F, -1),
				RotationAngle.fromDegrees(rightForeArm, -35F, 0, 0)
		});
	}



	}