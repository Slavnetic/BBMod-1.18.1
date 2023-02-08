package net.slavnetic.breakingbadrock.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTabs {
    public static final CreativeModeTab BREAKINGBADROCK_TAB = new CreativeModeTab("breakingbadrocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HEISENBURGHAT.get());
        }
    };
    }

//This is for the mod's creative mode tab and so it is usable.