package com.game.chess.datagen;

import com.game.chess.chess;
import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRBlockTags extends BlockTagsProvider {
    public CRBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, chess.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.GEARBLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.WHITE_TILE.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.BLACK_TILE.get());
    }

    @Override
    public String getName() {
        return "chess Tags";
    }
}
