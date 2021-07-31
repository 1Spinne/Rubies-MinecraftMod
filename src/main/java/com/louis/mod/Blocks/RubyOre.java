package com.louis.mod.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class RubyOre extends Block {

    public RubyOre() {
        super(FabricBlockSettings
        .of(Material.STONE)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .requiresTool()
        .strength(3f, 3f)
        .sounds(BlockSoundGroup.STONE)
        .mapColor(DyeColor.GRAY));
    }
    
}
