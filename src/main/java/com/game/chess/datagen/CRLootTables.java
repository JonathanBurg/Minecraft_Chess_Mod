package com.game.chess.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class CRLootTables extends BaseLootTableProvider {
    public CRLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    static String[] tables = new String[]{"white_tile_piece", "black_tile_piece",};
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    @Override
    protected void addTables() {
        /*Path outputFolder = this.generator.getOutputFolder();
        for (int i = 0; i < tables.length; i++) {
            Path path = outputFolder.resolve("data/chess/loot_tables/" + tables[i] + ".json");
            try {
                DataProvider.save(GSON, cache, LootTables.serialize(lootTable), path);
            } catch (IOException e) {
                LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });*/
    }
}
