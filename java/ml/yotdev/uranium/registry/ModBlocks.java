package ml.yotdev.uranium.registry;

import ml.yotdev.uranium.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(7f, 35f).sounds(BlockSoundGroup.METAL).luminance(15));
    public static final Block URANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(5f, 30f).sounds(BlockSoundGroup.STONE).luminance(13));
    //public static final Block URANIUM_EXTRACTOR = new Block(FabricBlockSettings.of(Material.))

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "uranium_ore"), URANIUM_ORE);
    }
}
