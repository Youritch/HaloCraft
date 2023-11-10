package com.harby.halocraft.HaloItems;

import com.harby.halocraft.core.HaloItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block, Properties properties) {
        super(block, properties);
        HaloItems.HALO_ITEMS.add(this);
    }
}
