package ml.yotdev.uranium.registry.tools.axe;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, ModAxeTools modTools) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
