package com.harby.halocraft.core;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class HaloItemProperties {
    public static void addCustomItemProperties() {
        makeIsCreative(HaloItems.SRS99_sniper_rifle.get());
    }

    public static void makeIsCreative(Item item) {
        ItemProperties.register(item, new ResourceLocation("iscreative"), (pItemStack, pClientLevel, pEntity, pInt) -> {
            return ((pEntity) instanceof Player && ((Player) pEntity).isCreative()) ? 1 : 0;
        });
    }
}
