package co.jaketaylor.testmod.proxy;

import co.jaketaylor.testmod.core.blocks.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    /**
     * Pre-init event handling.
     *
     * @param event
     */
    public void preInit(FMLPreInitializationEvent event)
    {
        // Initiate our blocks
        ModBlocks.init();
    }

    /**
     * Init event handling.
     *
     * @param event
     */
    public void init(FMLInitializationEvent event)
    {
        //
    }

    /**
     * Post init event handling.
     *
     * @param event
     */
    public void postInit(FMLPostInitializationEvent event)
    {
        //
    }
}
