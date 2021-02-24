package com.hanibal.mod1.objects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

// On nomme la classe InteractiveBlock car elle nous permet de créer des blocs avec lesquels on peut intéragir au clic-droit.
public class InteractiveBlock extends Block {

	/**
	 * Le corps du bloc se trouve ici, de base c'est le début de la classe, sauf que la classe Block définit également d'autres méthodes supplémentaires que l'on pourra override (= écrire par dessus)
	 * @param settings Variable qui définit certaines propriétés du bloc comme le matériau, la résistance aux explosions, etc...
	 */
	public InteractiveBlock(Settings settings) {
		super(settings);
	}

	/**
	 * Cette méthode s'exécute lorsqu'un joueur fait clic-droit sur le bloc.
	 *
	 * @param state  Le block state du bloc
	 * @param world  Le monde dans lequel le bloc se situe
	 * @param pos    La position du bloc
	 * @param player Le joueur qui a fait clic-droit
	 * @param hand   La main utilisée par le joueur pour faire le clic-droit
	 * @param hit    L'endroit où le joueur a fait clic-droit précisément
	 * @return
	 */
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		// Cette méthode s'éxecute des deux côtés du jeu (client et serveur)
		// Le if juste au-dessous semble explicite, il vérifie qu'on est du côté serveur
		if(!world.isClient) {
			player.sendMessage(new LiteralText("Hello, world!"), false);
		}
		// La donnée renvoyée par la méthode dira si une animation de la main doit être jouée, si une information sera envoyée au serveur pour la retransmettre au client, etc..
		// Il est important d'avoir un retour correct afin de ne causer aucun problème
		return ActionResult.SUCCESS;
	}
}
