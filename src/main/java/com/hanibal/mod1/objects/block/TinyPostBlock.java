package com.hanibal.mod1.objects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TinyPostBlock extends Block {
	public TinyPostBlock(Settings settings) {
		super(settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState staste, BlockView view, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(0.3125f, 0.0f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
	}
}
