package com.game.chess.datagen;

import com.game.chess.chess;
import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRBlockStates extends BlockStateProvider {
    public CRBlockStates(DataGenerator generator, ExistingFileHelper helper) {super(generator, chess.MODID, helper);}

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.GEARBLOCK.get());
        simpleBlock(Registration.WHITE_TILE.get());
        //simpleBlock(Registration.BLACK_TILE.get());
    }
}
