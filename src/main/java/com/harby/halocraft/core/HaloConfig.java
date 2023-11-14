package com.harby.halocraft.core;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.harby.halocraft.HaloCraft;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.Pair;

import java.io.File;

@Mod.EventBusSubscriber(modid = HaloCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HaloConfig
{
    public static final Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;


    public static class Server{
        public final ForgeConfigSpec.ConfigValue<Double> car_hp;
        public final ForgeConfigSpec.ConfigValue<Double> ghost_hp;

        public Server(ForgeConfigSpec.Builder builder) {
            this.car_hp = builder.define("The Base Hp of the car",70.0);
            this.ghost_hp = builder.define("The Base Hp of the ghost",50.0);
        }

    }

    static {
        Pair<Server, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER = commonSpecPair.getLeft();
        SERVER_SPEC = commonSpecPair.getRight();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}
