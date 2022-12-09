package com.game.chess.datagen;

import com.game.chess.chess;
import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRItemModels extends ItemModelProvider {

    public CRItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, chess.MODID, existingFileHelper);
    }

    @Override
    protected  void registerModels() {
        withExistingParent(Registration.GEARBLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/gearblock"));
        //withExistingParent(Objects.requireNonNull(Registration.WHITE_TILE_ITEM.get().getRegistryName()).getPath(), modLoc("block/white_board_piece"));
        //withExistingParent(Registration.BLACK_TILE_ITEM.get().getRegistryName().getPath(), modLoc("block/black_board_piece"));
        singleTexture(Registration.RAW_BRASS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_brass"));
        singleTexture(Registration.BRASS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/brass_ingot"));
    }
}
