package ml.yotdev.uranium;

import ml.yotdev.uranium.registry.ModBlocks;
import ml.yotdev.uranium.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class Main implements ModInitializer {

    //MOD_ID and create a group in creative inventory
    public static final String MOD_ID = "uranium";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.URANIUM_INGOT));

    //Uranium Ore Generation
    private static ConfiguredFeature<?, ?> URANIUM_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            ModBlocks.URANIUM_ORE.getDefaultState(), 3)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(0),
            YOffset.fixed(15)))).spreadHorizontally().repeat(1);

    @Override
    public void onInitialize() {
        //Register Items+Blocks
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        //Uranium Ore Registration
        RegistryKey<ConfiguredFeature<?,?>> uraniumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MOD_ID, "uranium_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, uraniumOverworld.getValue(), URANIUM_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,uraniumOverworld);
    }
}
