package ml.yotdev.uranium.registry;

import ml.yotdev.uranium.Main;
import ml.yotdev.uranium.registry.armor.ModArmorMaterial;
import ml.yotdev.uranium.registry.tools.axe.ModAxeItem;
import ml.yotdev.uranium.registry.tools.axe.ModAxeTools;
import ml.yotdev.uranium.registry.tools.hoe.ModHoeItem;
import ml.yotdev.uranium.registry.tools.hoe.ModHoeTools;
import ml.yotdev.uranium.registry.tools.pickaxe.ModPickaxeItem;
import ml.yotdev.uranium.registry.tools.pickaxe.ModPickaxeTools;
import ml.yotdev.uranium.registry.tools.shovel.ModShovelTools;
import ml.yotdev.uranium.registry.tools.sword.ModSwordTools;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item URANIUM_INGOT = new Item(new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item URANIUM_NUGGET = new Item(new Item.Settings().group(Main.ITEM_GROUP));

    //Tools
    public static final ToolItem URANIUM_PICKAXE = new ModPickaxeItem(ModPickaxeTools.INSTANCE, 4, 0, new Item.Settings().group(Main.ITEM_GROUP), new ModPickaxeTools());
    public static ToolItem URANIUM_SWORD = new SwordItem(ModSwordTools.INSTANCE, 8, -2, new Item.Settings().group(Main.ITEM_GROUP));
    public static ToolItem URANIUM_SHOVEL = new ShovelItem(ModShovelTools.INSTANCE, 5, -3, new Item.Settings().group(Main.ITEM_GROUP));
    public static final ToolItem URANIUM_AXE = new ModAxeItem(ModAxeTools.INSTANCE, 9, -3, new Item.Settings().group(Main.ITEM_GROUP), new ModAxeTools());
    public static final ToolItem URANIUM_HOE = new ModHoeItem(ModHoeTools.INSTANCE, 0, 0, new Item.Settings().group(Main.ITEM_GROUP), new ModHoeTools());

    //Armor
    public static final Item URANIUM_HELMET = new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.HEAD, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item URANIUM_CHESTPLATE = new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.CHEST, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item URANIUM_LEGGINGS = new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.LEGS, new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item URANIUM_BOOTS = new ArmorItem(ModArmorMaterial.URANIUM, EquipmentSlot.FEET, new Item.Settings().group(Main.ITEM_GROUP));

    //Blocks Items
    public static final BlockItem URANIUM_BLOCK = new BlockItem(ModBlocks.URANIUM_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));
    public static final BlockItem URANIUM_ORE = new BlockItem(ModBlocks.URANIUM_ORE, new Item.Settings().group(Main.ITEM_GROUP));

    public static void registerItems(){
        //Ores register
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_ingot"), URANIUM_INGOT);
        //Tools register
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_sword"), URANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_shovel"), URANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_pickaxe"), URANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_axe"), URANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_hoe"), URANIUM_HOE);
        //Armor register
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_helmet"), URANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_chestplate"), URANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_leggings"), URANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_boots"), URANIUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "uranium_nugget"), URANIUM_NUGGET);
    }
}
