package com.ren.karmaland.client.model.armor;

import com.ren.karmaland.client.model.helper.ArmorBaseModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

public class NightWolfArmorModel extends ArmorBaseModel {

    private final EquipmentSlotType slot;

    public NightWolfArmorModel(float modelSize, EquipmentSlotType slot) {
        super(modelSize);
        this.slot = slot;


        bipedHead.setTextureOffset(46, 56).addBox(-1.75F, -1.6892F, -8.7026F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        ModelRenderer SnoutLeft_r1 = new ModelRenderer(this);
        SnoutLeft_r1.setRotationPoint(2.7566F, -1.6142F, -5.7385F);
        bipedHead.addChild(SnoutLeft_r1);
        setRotationAngle(SnoutLeft_r1, 0.1759F, 0.8687F, 0.0692F);
        SnoutLeft_r1.setTextureOffset(47, 33).addBox(-1.6F, -1.5F, -2.7F, 3.0F, 3.0F, 5.0F, 0.0F, false);

        ModelRenderer SnoutRight_r1 = new ModelRenderer(this);
        SnoutRight_r1.setRotationPoint(-2.7566F, -1.6142F, -5.7385F);
        bipedHead.addChild(SnoutRight_r1);
        setRotationAngle(SnoutRight_r1, 0.1759F, -0.8687F, -0.0692F);
        SnoutRight_r1.setTextureOffset(47, 33).addBox(-1.4F, -1.5F, -2.7F, 3.0F, 3.0F, 5.0F, 0.0F, true);

        ModelRenderer SnoutTop_r1 = new ModelRenderer(this);
        SnoutTop_r1.setRotationPoint(0.25F, -2.9392F, -6.2026F);
        bipedHead.addChild(SnoutTop_r1);
        setRotationAngle(SnoutTop_r1, 0.3491F, 0.0F, 0.0F);
        SnoutTop_r1.setTextureOffset(36, 53).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        ModelRenderer LeftTopEar_r1 = new ModelRenderer(this);
        LeftTopEar_r1.setRotationPoint(4.25F, -10.75F, -1.5F);
        bipedHead.addChild(LeftTopEar_r1);
        setRotationAngle(LeftTopEar_r1, 0.0F, -0.3054F, 0.0F);
        LeftTopEar_r1.setTextureOffset(0, 33).addBox(-1.25F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        LeftTopEar_r1.setTextureOffset(0, 38).addBox(-1.25F, -0.25F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);

        ModelRenderer RightBotEar_r1 = new ModelRenderer(this);
        RightBotEar_r1.setRotationPoint(-4.25F, -10.75F, -1.5F);
        bipedHead.addChild(RightBotEar_r1);
        setRotationAngle(RightBotEar_r1, 0.0F, 0.3054F, 0.0F);
        RightBotEar_r1.setTextureOffset(0, 38).addBox(-1.75F, -0.25F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
        RightBotEar_r1.setTextureOffset(0, 33).addBox(-0.75F, -3.25F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        bipedBody.setTextureOffset(23, 37).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 9.0F, 5.0F, 1.01F, false);

        ModelRenderer Rope_r1 = new ModelRenderer(this);
        Rope_r1.setRotationPoint(5.3752F, 12.75F, -0.9108F);
        bipedBody.addChild(Rope_r1);
        setRotationAngle(Rope_r1, 0.0F, 0.1745F, 0.0F);
        Rope_r1.setTextureOffset(17, 53).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, 0.0F, false);

        bipedRightArm.setTextureOffset(4, 39).addBox(-3.5F, -2.1F, -2.5F, 4.0F, 4.0F, 5.0F, 1.0F, false);

        bipedLeftArm.setTextureOffset(4, 39).addBox(-0.5F, -2.1F, -2.5F, 4.0F, 4.0F, 5.0F, 1.0F, true);

        ModelRenderer MidNail_r1 = new ModelRenderer(this);
        MidNail_r1.setRotationPoint(-0.6427F, 11.9F, -5.4547F);
        bipedRightLeg.addChild(MidNail_r1);
        setRotationAngle(MidNail_r1, 0.0F, 0.1309F, 0.0F);
        MidNail_r1.setTextureOffset(45, 33).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);
        MidNail_r1.setTextureOffset(45, 33).addBox(2.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);
        MidNail_r1.setTextureOffset(45, 33).addBox(-2.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);

        ModelRenderer RightFoot_r1 = new ModelRenderer(this);
        RightFoot_r1.setRotationPoint(-0.2F, 11.9F, -4.0F);
        bipedRightLeg.addChild(RightFoot_r1);
        setRotationAngle(RightFoot_r1, 0.0F, 0.1309F, 0.0F);
        RightFoot_r1.setTextureOffset(8, 33).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);

        ModelRenderer MidNail_r2 = new ModelRenderer(this);
        MidNail_r2.setRotationPoint(0.6427F, 11.9F, -5.4547F);
        bipedLeftLeg.addChild(MidNail_r2);
        setRotationAngle(MidNail_r2, 0.0F, -0.1309F, 0.0F);
        MidNail_r2.setTextureOffset(45, 33).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        MidNail_r2.setTextureOffset(45, 33).addBox(-2.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        MidNail_r2.setTextureOffset(45, 33).addBox(2.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        ModelRenderer LeftFoot_r1 = new ModelRenderer(this);
        LeftFoot_r1.setRotationPoint(0.2F, 11.9F, -4.0F);
        bipedLeftLeg.addChild(LeftFoot_r1);
        setRotationAngle(LeftFoot_r1, 0.0F, -0.1309F, 0.0F);
        LeftFoot_r1.setTextureOffset(8, 33).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 2.0F, 0.0F, true);

        ModelRenderer Tail_r1 = new ModelRenderer(this);
        Tail_r1.setRotationPoint(1.9F, -0.9F, 2.8F);
        bipedRightLeg.addChild(Tail_r1);
        setRotationAngle(Tail_r1, 0.1309F, 0.0F, 0.0F);
        Tail_r1.setTextureOffset(0, 51).addBox(-2.0F, -0.1F, 0.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
