package com.game.chess.datagen;

import com.game.chess.chess;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import static com.game.chess.chess.*;

/* DataGenerators
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *      Load data for mod
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Modified for chess
 */
@Mod.EventBusSubscriber(modid = chess.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new CRRecipes(generator));
            generator.addProvider(new CRLootTables(generator));
            CRBlockTags blockTags = new CRBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider((DataProvider) blockTags);
            generator.addProvider(new CRItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new CRBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new CRItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new CRLanguageProvider(generator, "en_us"));

        }
    }
}

