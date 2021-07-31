package com.louis.mod.Items.BlockItems;

import com.louis.mod.registry.ModBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyOreItem extends BlockItem {

    public RubyOreItem() {
        super(ModBlocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    }
    
}
