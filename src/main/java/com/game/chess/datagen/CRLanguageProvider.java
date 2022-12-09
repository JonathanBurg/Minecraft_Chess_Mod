package com.game.chess.datagen;

import com.game.chess.chess;
import com.game.chess.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.data.LanguageProvider;
/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRLanguageProvider extends LanguageProvider {
    public CRLanguageProvider(DataGenerator gen, String locale) {
        super(gen, chess.MODID, locale);
    }

    @Override
    protected void addTranslations(){
        add("itemGroup." + "chess", "Game Pieces");
        add(Registration.GEARBLOCK_ITEM.get(), "Gear Block");
        add(Registration.RAW_BRASS.get(), "Raw Brass");
        add(Registration.BRASS_INGOT.get(), "Brass Ingot");
    }
}
