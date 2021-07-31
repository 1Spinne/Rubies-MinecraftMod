package com.louis.mod.Items.Tools.Ruby;

import com.louis.mod.registry.ModItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyTools implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 5.5f;
    }

    @Override
    public int getDurability() {
        return 1761;
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
    
}
