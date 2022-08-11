package net.merryrogue.rhdirtymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.merryrogue.rhdirtymod.DirtyMod;
import net.merryrogue.rhdirtymod.block.custom.ModStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    // This is the template for all new blocks
    //public static final Block BLOCK_NAME = registerBlock("block_name",
    //      new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
    //              requiresTool()));

    public static final Block DIRTY_COBBLESTONE = registerBlock("dirty_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block DIRTY_STONE_BRICKS = registerBlock("dirty_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block SANDY_COBBLESTONE = registerBlock("sandy_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block SANDY_STONE_BRICKS = registerBlock("sandy_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.SAND)));


    // This is the template for new stairs
    // For stairs made from vanilla materials:
    //public static final Block STAIRS_NAME = registerBlock("stairs_name",
    //        new ModStairsBlock(Blocks.VANILLA_BASE_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).
    //                hardness(2.0f).resistance(6.0f).requiresTool()));

    // For stairs made from modded materials:
    //public static final Block STAIRS_NAME = registerBlock("stairs_name",
    //        new ModStairsBlock(ModBlocks.BASE_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).
    //                hardness(2.0f).resistance(6.0f).requiresTool()));

    public static final Block DIRTY_COBBLESTONE_STAIRS = registerBlock("dirty_cobblestone_stairs",
            new ModStairsBlock(Blocks.COBBLESTONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block DIRTY_STONE_BRICK_STAIRS = registerBlock("dirty_stone_brick_stairs",
            new ModStairsBlock(Blocks.STONE_BRICK_STAIRS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block SANDY_COBBLESTONE_STAIRS = registerBlock("sandy_cobblestone_stairs",
            new ModStairsBlock(Blocks.COBBLESTONE.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(2.0f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block SANDY_STONE_BRICK_STAIRS = registerBlock("sandy_stone_brick_stairs",
            new ModStairsBlock(Blocks.STONE_BRICK_STAIRS.getDefaultState(), FabricBlockSettings.
                    of(Material.STONE).hardness(1.5f).resistance(6.0f).requiresTool()
                    .sounds(BlockSoundGroup.SAND)));


    // This is the template for all new slabs
    //public static final Block SLAB_NAME = registerBlock("slab_name",
    //        new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
    //                requiresTool()));

    public static final Block DIRTY_COBBLESTONE_SLAB = registerBlock("dirty_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.GRAVEL)));

    public static final Block DIRTY_STONE_BRICK_SLAB = registerBlock("dirty_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.GRAVEL)));

    public static final Block SANDY_COBBLESTONE_SLAB = registerBlock("sandy_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(2.0f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.SAND)));

    public static final Block SANDY_STONE_BRICK_SLAB = registerBlock("sandy_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.5f).resistance(6.0f).
                    requiresTool().sounds(BlockSoundGroup.SAND)));


    // Methods
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(DirtyMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(DirtyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registry.ITEM, new Identifier(DirtyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerModBlocks()
    {
        System.out.println("Registering ModBlocks for " + DirtyMod.MOD_ID);
    }
}
