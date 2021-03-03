package com.hanibal.mod1;

import com.hanibal.mod1.init.MyBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// Ceci est la classe où le mod commence. C'est d'ici que tout (ou presque) va être lancé. Donc on supprime pas !
public class Mod1 implements ModInitializer {
	@Override
	public void onInitialize() {
		MyBlocks.initialize();
	}

	public  static Identifier id(String name) {
		return new Identifier("mod1", name);
	}
}
