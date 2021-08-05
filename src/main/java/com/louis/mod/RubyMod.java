package com.louis.mod;

import com.louis.mod.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "bread_slices";
	
	

    @Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}