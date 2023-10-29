package com.Pr1tcha.rotp_ova_addon;

import com.Pr1tcha.rotp_ova_addon.init.InitStands;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Pr1tcha.rotp_ova_addon.init.InitEntities;
import com.Pr1tcha.rotp_ova_addon.init.InitSounds;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpOvaAddon.MOD_ID)
public class RotpOvaAddon {
    // The value here should match an entry in the META-INF/mods.toml file
    public static final String MOD_ID = "rotp_ova_addon";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpOvaAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
