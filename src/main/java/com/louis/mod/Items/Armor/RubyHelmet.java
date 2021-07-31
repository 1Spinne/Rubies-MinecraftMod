package com.louis.mod.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyHelmet extends ArmorItem {

    public RubyHelmet() {
        super(RubyArmor.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
