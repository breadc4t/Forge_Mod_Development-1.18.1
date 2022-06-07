package com.breadc4t.mccourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("coursemodtab") { // needed for translation
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get()); // display image for tab
        }
    };
}
