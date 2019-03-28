package co.jaketaylor.testmod.proxy;

import co.jaketaylor.testmod.core.blocks.BlockSteel;
import co.jaketaylor.testmod.core.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent event)
    {
        //
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        //
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)
    {
        e.getRegistry().register(new BlockSteel());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {
        e.getRegistry().register(new ItemBlock(ModBlocks.steelBlock).setRegistryName(ModBlocks.steelBlock.getRegistryName()));
    }
}
