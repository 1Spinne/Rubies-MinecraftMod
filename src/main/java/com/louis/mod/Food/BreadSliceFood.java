package com.louis.mod.Food;

import net.minecraft.item.FoodComponent;

public class BreadSliceFood {
    
    public static final FoodComponent BREAD_SLICE = (new FoodComponent.Builder())
        .hunger(1)
        .saturationModifier((float) .2)
        .snack()
        .build();

}
