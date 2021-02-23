package com.hanibal.mod1;

import net.minecraft.block.Block;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import sun.tools.jstat.Literal;

public class angelic_brick extends Block {
    public angelic_brick(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
        if (!world.isClient){
            player.sendMessage(new LiteralText("Hello, world!"), false);
        }
        return ActionResult.SUCCESS;
    }
}
