package com.louis.mod.registry;

import com.louis.mod.RubyMod;
import com.louis.mod.Blocks.RubyBlock;
import com.louis.mod.Blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    
    public static final Block RUBY_BLOCK = new RubyBlock();


    public static final Block RUBY_ORE = new RubyOre();


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RubyMod.MOD_ID, "ruby_block"), RUBY_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
