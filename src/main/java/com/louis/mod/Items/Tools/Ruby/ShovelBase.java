package com.louis.mod.Items.Tools.Ruby;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, (int) -0.5, -2.7f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
