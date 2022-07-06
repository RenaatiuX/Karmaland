package com.ren.karmaland.core;

import com.ren.karmaland.Karmaland;
import com.ren.karmaland.common.item.armor.NightWolfArmor;
import com.ren.karmaland.common.tab.KarmalandGroup;
import com.ren.karmaland.common.util.KarmalandArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Karmaland.MOD_ID);

    public static final RegistryObject<Item> NINJA_HELMET =ITEMS.register("ninja_helmet",
            ()-> new NightWolfArmor(KarmalandArmorMaterial.NIGHT_WOLF_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(KarmalandGroup.KARMALAND)));
    public static final RegistryObject<Item> NINJA_CHESTPLATE =ITEMS.register("ninja_chestplate",
            ()-> new NightWolfArmor(KarmalandArmorMaterial.NIGHT_WOLF_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(KarmalandGroup.KARMALAND)));
    public static final RegistryObject<Item> NINJA_LEGGINGS =ITEMS.register("ninja_leggings",
            ()-> new NightWolfArmor(KarmalandArmorMaterial.NIGHT_WOLF_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(KarmalandGroup.KARMALAND)));
    public static final RegistryObject<Item> NINJA_BOOTS =ITEMS.register("ninja_boots",
            ()-> new NightWolfArmor(KarmalandArmorMaterial.NIGHT_WOLF_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(KarmalandGroup.KARMALAND)));
}
