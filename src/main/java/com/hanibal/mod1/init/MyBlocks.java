package com.hanibal.mod1.init;

import com.hanibal.mod1.Mod1;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class MyBlocks {
	public static final Block ANGELIC_BRICK = register("angelic_brick", new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(4.0f)), ItemGroup.BUILDING_BLOCKS);
	public static final Block ANGELIC_STONE = register("angelic_stone", new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(4.0f)), ItemGroup.BUILDING_BLOCKS);

	public static final Block ANGELIC_BOARD = register("angelic_board", new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(4.0f)), ItemGroup.BUILDING_BLOCKS);
	public static final Block ANGELIC_WOOD = register("angelic_wood", new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(4.0f)), ItemGroup.BUILDING_BLOCKS);

	public static void initialize() {
	}

	public static Block register(String name, Block block, ItemGroup itemGroup) {
		Registry.register(Registry.BLOCK, Mod1.id(name), block);
		Registry.register(Registry.ITEM, Mod1.id(name), new BlockItem(block, new FabricItemSettings().group(itemGroup)));
		return block;
	}
}
