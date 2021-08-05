package com.louis.mod.Items.Misc;

import com.louis.mod.Food.BreadSliceFood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BreadSlice extends Item {

    public BreadSlice() {
        super(new Item.Settings().group(ItemGroup.FOOD).food(BreadSliceFood.BREAD_SLICE));
    }
    
}
