package co.jaketaylor.testmod.core.blocks;

import co.jaketaylor.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * The base class for any block.
 */
public class BlockBase extends Block
{
    /**
     * Constructs the class.
     *
     * @param material
     * @param name
     */
    public BlockBase(Material material, String name)
    {
        super(material);

        // Set the registry name to the specified name
        setRegistryName(name);
        // Set the unlocalized name too
        setUnlocalizedName(TestMod.MODID + "." + name);

        // Now register the block
        register();
    }

    /**
     * Registers the block without specified item.
     */
    public void register()
    {
        // Pass through to the actual register method with the appropriate Item
        register(new ItemBlock(this).setRegistryName(getRegistryName()));
    }

    /**
     * Registers the block.
     *
     * @param item
     */
    public void register(Item item)
    {
        // Register the instance as a block
        GameRegistry.findRegistry(Block.class).register(this);

        // Register the instance as an item too
        GameRegistry.findRegistry(Item.class).register(item);
    }

    /**
     * Initiates the blocks model.
     */
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(
            Item.getItemFromBlock(this),
            0,
            new ModelResourceLocation(getRegistryName().toString(), "inventory")
        );
    }
}
