package com.hanibal.mod1;

import com.hanibal.mod1.objects.block.InteractiveBlock;
import com.hanibal.mod1.objects.block.TinyPostBlock;
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

	// On initialise une variable pour le nouveau bloc. Il n'existe pas encore aux yeux de Minecraft, c'est uniquement une variable Block avec des données à l'intérieur, rien de plus.
	public static final Block ANGELIC_BRICK = new InteractiveBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).strength(4.0f));
	public static final Block ANGELIC_BRICK_POST = new TinyPostBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).strength(4.0f));

	@Override
	public void onInitialize() {
		// On envoie juste un petit message dans la console
		System.out.println("Coucou ! :o");

		// On dit au jeu de créer un bloc (avec un certain indentifiant) qui correspond à la variable créée plus tôt
		Registry.register(Registry.BLOCK, new Identifier("mod1", "angelic_brick"), ANGELIC_BRICK);

		// On dit au jeu de créer un objet qui correspondra au bloc (avec le même identifiant que le bloc; même si ce n'est pas obligatoire, c'est toujours mieux !)
		// Ici, la classe BlockItem est une extension de la classe Item. Cette classe est très utilisée dans le jeu de base (évidemment...) et permet juste d'avoir le bloc dans notre inventaire et de le placer dans le monde.
		Registry.register(Registry.ITEM, new Identifier("mod1", "angelic_brick"), new BlockItem(ANGELIC_BRICK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.BLOCK, new Identifier("mod1", "angelic_brick_post"), ANGELIC_BRICK_POST);
		Registry.register(Registry.ITEM, new Identifier("mod1", "angelic_brick_post"), new BlockItem(ANGELIC_BRICK_POST, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		/**
		 * Les identifiants (ou ID) permettent au jeu de comprendre à quel bloc on a à faire
		 * Par exemple, cet ID sera utilisé pour sauvegarder les données des mondes, des tronçons, des inventaires
		 * Il sert aussi au jeu de retrouver certaines données (visuelles par exemple), comme celles créées par toi dans les ressources du mod
		 */
	}
}