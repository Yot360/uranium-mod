package ml.yotdev.uranium.registry.tools.pickaxe;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, ModPickaxeTools modTools) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
