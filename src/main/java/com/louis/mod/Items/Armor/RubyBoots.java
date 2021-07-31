package com.louis.mod.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyBoots extends ArmorItem {

    public RubyBoots() {
        super(RubyArmor.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
