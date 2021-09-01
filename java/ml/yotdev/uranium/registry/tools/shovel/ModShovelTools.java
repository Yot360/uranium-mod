package ml.yotdev.uranium.registry.tools.shovel;

import ml.yotdev.uranium.registry.ModItems;
import ml.yotdev.uranium.registry.tools.sword.ModSwordTools;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModShovelTools implements ToolMaterial {

    public static final ModShovelTools INSTANCE = new ModShovelTools();

    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 13;
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
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.URANIUM_INGOT);
    }
}
