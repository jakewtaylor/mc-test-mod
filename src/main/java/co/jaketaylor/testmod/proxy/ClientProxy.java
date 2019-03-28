package co.jaketaylor.testmod.proxy;

import co.jaketaylor.testmod.core.blocks.ModBlocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    /**
     * Pre-init event handling, overrides Common Proxy handler.
     *
     * @param event
     */
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);

        // Initiate the models.
        ModBlocks.initModels();
    }
}
