package com.game.chess.setup;

import com.game.chess.datagen.Pieces;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

import java.util.function.Supplier;

import static com.game.chess.chess.MODID;
import static com.game.chess.setup.ModSetup.ITEM_GROUP;
import static net.minecraft.world.level.material.PushReaction.PUSH_ONLY;

/* Registration
 * Echo Hickey
 * 18 April 2022
 * Purpose:
 *      Register items to add them into Minecraft
 * Modified 1 December 2022 by Jonathan Burgener:
 *      Added chess pieces
 */
public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        //ENTITIES.register(bus);
    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final BlockBehaviour.Properties PIECES_PROPERTIES = BlockBehaviour.Properties.of(new Material(MaterialColor.SNOW, true, false, false, false, false, false, PUSH_ONLY)).strength(0);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ITEM_GROUP).rarity(Rarity.RARE);

    public static final RegistryObject<Block> GEARBLOCK = BLOCKS.register("gearblock", () -> new Block(ORE_PROPERTIES));
    //public static final RegistryObject<Block> PAWN = ENTITIES.register("pawn", () -> new Entity(ORE_PROPERTIES));
    //public static final RegistryObject<Block> QUEEN = BLOCKS.register("queen", () -> new Block(ORE_PROPERTIES));


    public static final RegistryObject<Item> GEARBLOCK_ITEM = fromBlock(GEARBLOCK);

    //Board Pieces
    //public static final RegistryObject<Block> WHITE_TILE = BLOCKS.register("white_board_piece", () -> new Block(ORE_PROPERTIES));
    //public static final RegistryObject<Block> BLACK_TILE = BLOCKS.register("black_board_piece", () -> new Block(ORE_PROPERTIES));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ITEM_GROUP)));
    }


    public static final RegistryObject<Block> WHITE_TILE = registerBlock("white_board_piece",
            () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Block> BLACK_TILE = registerBlock("black_board_piece",
            () -> new Block(ORE_PROPERTIES));

    //public static final RegistryObject<Item> WHITE_TILE_ITEM = fromBlock(WHITE_TILE);
    //public static final RegistryObject<Item> BLACK_TILE_ITEM = fromBlock(BLACK_TILE);


    //Game Pieces
    public static final RegistryObject<Block> BLACK_PAWN = registerBlock("black_pawn",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_ROOK = registerBlock("black_rook",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_KNIGHT = registerBlock("black_knight",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_BISHOP = registerBlock("black_bishop",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_QUEEN = registerBlock("black_queen",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_KING = registerBlock("black_king",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_PAWN = registerBlock("white_pawn",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_ROOK = registerBlock("white_rook",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_KNIGHT = registerBlock("white_knight",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_BISHOP = registerBlock("white_bishop",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_QUEEN = registerBlock("white_queen",
            () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_KING = registerBlock("white_king",
            () -> new Block(PIECES_PROPERTIES));

    /*
    public static final RegistryObject<Block> BLACK_PAWN = BLOCKS.register("black_pawn", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_ROOK = BLOCKS.register("black_rook", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_KNIGHT = BLOCKS.register("black_knight", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_BISHOP = BLOCKS.register("black_bishop", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_QUEEN = BLOCKS.register("black_queen", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> BLACK_KING = BLOCKS.register("black_king", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_PAWN = BLOCKS.register("white_pawn", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_ROOK = BLOCKS.register("white_rook", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_KNIGHT = BLOCKS.register("white_knight", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_BISHOP = BLOCKS.register("white_bishop", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_QUEEN = BLOCKS.register("white_queen", () -> new Block(PIECES_PROPERTIES));
    public static final RegistryObject<Block> WHITE_KING = BLOCKS.register("white_king", () -> new Block(PIECES_PROPERTIES));

    public static final RegistryObject<Item> BLACK_PAWN_ITEM = fromBlock(BLACK_PAWN);
    public static final RegistryObject<Item> BLACK_ROOK_ITEM = fromBlock(BLACK_ROOK);
    public static final RegistryObject<Item> BLACK_KNIGHT_ITEM = fromBlock(BLACK_KNIGHT);
    public static final RegistryObject<Item> BLACK_BISHOP_ITEM = fromBlock(BLACK_BISHOP);
    public static final RegistryObject<Item> BLACK_QUEEN_ITEM = fromBlock(BLACK_QUEEN);
    public static final RegistryObject<Item> BLACK_KING_ITEM = fromBlock(BLACK_KING);
    public static final RegistryObject<Item> WHITE_PAWN_ITEM = fromBlock(WHITE_PAWN);
    public static final RegistryObject<Item> WHITE_ROOK_ITEM = fromBlock(WHITE_ROOK);
    public static final RegistryObject<Item> WHITE_KNIGHT_ITEM = fromBlock(WHITE_KNIGHT);
    public static final RegistryObject<Item> WHITE_BISHOP_ITEM = fromBlock(WHITE_BISHOP);
    public static final RegistryObject<Item> WHITE_QUEEN_ITEM = fromBlock(WHITE_QUEEN);
    public static final RegistryObject<Item> WHITE_KING_ITEM = fromBlock(WHITE_KING);
     */

    //Below are the brass items registries
    public static final RegistryObject<Item> RAW_BRASS = ITEMS.register("raw_brass", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brassingot", () -> new Item(ITEM_PROPERTIES));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
/*
private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));
    }

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));*/
}
