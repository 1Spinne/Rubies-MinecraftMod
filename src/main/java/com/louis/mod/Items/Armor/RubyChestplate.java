package com.louis.mod.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyChestplate extends ArmorItem {

    public RubyChestplate() {
        super(RubyArmor.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
