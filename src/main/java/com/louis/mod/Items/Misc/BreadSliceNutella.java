package com.louis.mod.Items.Misc;

import com.louis.mod.Food.BreadSliceNutellaFood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BreadSliceNutella extends Item {

    public BreadSliceNutella() {
        super(new Item.Settings().group(ItemGroup.FOOD).food(BreadSliceNutellaFood.BREAD_SLICE_NUTELLA));
    }

}
