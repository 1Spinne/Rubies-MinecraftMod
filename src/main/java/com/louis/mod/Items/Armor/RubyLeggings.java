package com.louis.mod.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyLeggings extends ArmorItem {

    public RubyLeggings() {
        super(RubyArmor.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
