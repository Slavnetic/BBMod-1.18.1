package net.slavnetic.breakingbadrock.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slavnetic.breakingbadrock.Breakingbadrock;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Breakingbadrock.MOD_ID);

    public static final RegistryObject<Item> HEISENBURGHAT = ITEMS.register("heisenburg_hat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.BREAKINGBADROCK_TAB)));
    public static final RegistryObject<Item> HEISENBURGGLASSES = ITEMS.register("heisenburg_glasses",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.BREAKINGBADROCK_TAB)));
    public static final RegistryObject<Item> BOXCUTTER = ITEMS.register("gusboxcutter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.BREAKINGBADROCK_TAB)));
    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
//This class lets us register items into the code so we can then add textures and models so it appears in game.