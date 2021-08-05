package com.louis.mod.registry;

import com.louis.mod.RubyMod;
import com.louis.mod.Items.Misc.BreadSlice;
import com.louis.mod.Items.Misc.BreadSliceNutella;
import com.louis.mod.Items.Misc.Nutella;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    //Items
    public static final Item BREAD_SLICE = new BreadSlice();
    public static final Item BREAD_SLICE_NUTELLA = new BreadSliceNutella();

    public static final Item NUTELLA = new Nutella();


    public static void registerItems() {

        //Items
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "bread_slice"), BREAD_SLICE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "bread_slice_nutella"), BREAD_SLICE_NUTELLA);

        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "nutella"), NUTELLA);

    }
}
