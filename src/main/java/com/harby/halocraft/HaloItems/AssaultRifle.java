package com.harby.halocraft.HaloItems;

public class AssaultRifle extends Gun{
    public AssaultRifle(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAmmo() {
        return 60;
    }

    @Override
    public int getShootingDelay() {
        return 2;
    }


}
