package com.ren.karmaland.common.item.armor;

import com.ren.karmaland.Karmaland;
import com.ren.karmaland.client.model.armor.NightWolfArmorModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.Map;

public class NightWolfArmor extends ArmorItem {

    private static final Map<EquipmentSlotType, BipedModel<?>> nightWolfArmorModel = new EnumMap<>(EquipmentSlotType.class);

    public NightWolfArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) nightWolfArmorModel.get(armorSlot);
    }

    @OnlyIn(Dist.CLIENT)
    public static void initArmorModel() {
        nightWolfArmorModel.put(EquipmentSlotType.HEAD, new NightWolfArmorModel(1.0F, EquipmentSlotType.HEAD));
        nightWolfArmorModel.put(EquipmentSlotType.CHEST, new NightWolfArmorModel(0.75F, EquipmentSlotType.CHEST));
        nightWolfArmorModel.put(EquipmentSlotType.LEGS, new NightWolfArmorModel(0.5F, EquipmentSlotType.LEGS));
        nightWolfArmorModel.put(EquipmentSlotType.FEET, new NightWolfArmorModel(1.0F, EquipmentSlotType.FEET));
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            return Karmaland.ARMOR_DIR + "night_wolf_armor_layer_2.png";
        } else {
            return Karmaland.ARMOR_DIR + "night_wolf_armor_layer_1.png";
        }
    }
}
