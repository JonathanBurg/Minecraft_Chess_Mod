package com.game.chess.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/* ModSetup
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *      Put mod item into creative inventory
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Modified for chess
 */
public class ModSetup {

    public static final String TAB_NAME = "Chess";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {return  new ItemStack(Items.CLOCK); }
    };

    public static void init(FMLCommonSetupEvent event){

    }
}

