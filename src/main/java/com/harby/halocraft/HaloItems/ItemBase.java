package com.harby.halocraft.HaloItems;

import com.harby.halocraft.core.HaloItems;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {
    public ItemBase(Properties properties) {
        super(properties);
        HaloItems.HALO_ITEMS.add(this);
    }
}
