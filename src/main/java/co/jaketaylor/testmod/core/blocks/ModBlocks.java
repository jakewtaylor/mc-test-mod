package co.jaketaylor.testmod.core.blocks;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static BlockSteel steelBlock;

    /**
     * Initiates all our blocks
     */
    public static void init()
    {
        steelBlock = new BlockSteel();
    }

    /**
     * Initiates the block models on the client side only.
     */
    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        steelBlock.initModel();
    }
}
