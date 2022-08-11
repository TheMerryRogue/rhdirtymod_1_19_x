package net.merryrogue.rhdirtymod.item;

import net.merryrogue.rhdirtymod.DirtyMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    // This is the template for all new items
    //public static final Item ITEMNAME = registerItem("name", new Item(new FabricItemSettings().group(ItemGroup.MISC));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(DirtyMod.MOD_ID, name),item);
    }

    public static void registerModItems ()
    {
        System.out.println("Registering Mod Items for " + DirtyMod.MOD_ID);
    }
}
