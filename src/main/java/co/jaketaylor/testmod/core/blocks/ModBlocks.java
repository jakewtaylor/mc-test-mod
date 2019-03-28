package co.jaketaylor.testmod.core.blocks;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static BlockSteel steelBlock;

    public static void init()
    {
        steelBlock = new BlockSteel();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        steelBlock.initModel();
    }
}
