package com.louis.mod.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(FabricBlockSettings
        .of(Material.METAL)
        .breakByTool(FabricToolTags.PICKAXES, 2)
        .requiresTool()
        .strength(5f, 6f)
        .sounds(BlockSoundGroup.METAL)
        .mapColor(DyeColor.RED));
    }
    
}
