package com.game.chess.datagen;
import net.minecraft.SharedConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.src.AbstractBlock.Settings;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

/* Pieces
 * Jonathan Burgener
 * 1 December 2022
 * Purpose:
 *      Control chess pieces
 */
public class Pieces extends Block {

    public Pieces(BlockBehaviour.Properties p_49795_) {
        super(p_49795_);
    }
    public static boolean isShapeFullBlock(){return false;}

    public void onBlockActivated(BlockState state, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {


        return ActionResult.SUCCESS;
    }
    @Override
    public void fallOn(Level p_152426_, BlockState p_152427_, BlockPos p_152428_, Entity p_152429_, float p_152430_) {
        p_152429_.causeFallDamage(p_152430_, 1.0F, DamageSource.FALL);
        dropResources(p_152427_,p_152426_,p_152428_);
    }
}
