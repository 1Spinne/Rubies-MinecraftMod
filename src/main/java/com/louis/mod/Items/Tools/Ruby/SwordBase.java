package com.louis.mod.Items.Tools.Ruby;

import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial material) {
        super(material, (int) 1.5, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
