package com.ren.karmaland.common.tab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class KarmalandGroup {

    public static final ItemGroup KARMALAND = new ItemGroup("karmalandTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.CHAIN);
        }
    };

}
