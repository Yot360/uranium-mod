package ml.yotdev.uranium.registry.tools.hoe;

import ml.yotdev.uranium.registry.tools.axe.ModAxeTools;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModHoeTools implements ToolMaterial {

    public static final ModHoeTools INSTANCE = new ModHoeTools();

    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
