package ml.yotdev.uranium.registry.tools.hoe;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, ModHoeTools modTools) {
        super(material, attackDamage, attackSpeed, settings);
    }
}