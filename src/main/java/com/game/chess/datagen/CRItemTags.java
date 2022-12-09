package com.game.chess.datagen;

import com.game.chess.chess;
import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRItemTags extends ItemTagsProvider {
    public CRItemTags(DataGenerator generator, CRBlockTags blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, chess.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.INGOTS)
                .add(Registration.BRASS_INGOT.get());
    }

    @Override
    public String getName() { return  "chess Tags"; };
}
