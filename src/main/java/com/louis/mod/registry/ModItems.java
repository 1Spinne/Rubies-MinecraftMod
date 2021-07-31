package com.louis.mod.registry;

import com.louis.mod.RubyMod;
import com.louis.mod.Items.Armor.RubyBoots;
import com.louis.mod.Items.Armor.RubyChestplate;
import com.louis.mod.Items.Armor.RubyHelmet;
import com.louis.mod.Items.Armor.RubyLeggings;
import com.louis.mod.Items.BlockItems.RubyBlockItem;
import com.louis.mod.Items.BlockItems.RubyOreItem;
import com.louis.mod.Items.Misc.Ruby;
import com.louis.mod.Items.Tools.Ruby.AxeBase;
import com.louis.mod.Items.Tools.Ruby.HoeBase;
import com.louis.mod.Items.Tools.Ruby.PickaxeBase;
import com.louis.mod.Items.Tools.Ruby.RubyTools;
import com.louis.mod.Items.Tools.Ruby.ShovelBase;
import com.louis.mod.Items.Tools.Ruby.SwordBase;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    //Items
    public static final Item RUBY = new Ruby();

    public static final Item RUBY_PICKAXE = new PickaxeBase(new RubyTools());
    public static final Item RUBY_AXE = new AxeBase(new RubyTools());
    public static final Item RUBY_SHOVEL = new ShovelBase(new RubyTools());
    public static final Item RUBY_HOE = new HoeBase(new RubyTools());
    public static final Item RUBY_SWORD = new SwordBase(new RubyTools());

    public static final Item RUBY_HELMET = new RubyHelmet();
    public static final Item RUBY_CHESTPLATE = new RubyChestplate();
    public static final Item RUBY_LEGGINGS = new RubyLeggings();
    public static final Item RUBY_BOOTS = new RubyBoots();
    


    //Block Items
    public static final BlockItem RUBY_BLOCK = new RubyBlockItem();
    public static final BlockItem RUBY_ORE = new RubyOreItem();



    public static void registerItems() {

        //Items
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby"), RUBY);

        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_axe"), RUBY_AXE);
		Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_hoe"), RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_sword"), RUBY_SWORD);

        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_boots"), RUBY_BOOTS);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_block"), RUBY_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);
        
    }
}
