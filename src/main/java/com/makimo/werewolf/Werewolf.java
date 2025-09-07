package com.makimo.werewolf;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Werewolf.MOD_ID)
public class Werewolf {
    public static final String MOD_ID = "werewolf";

    public Werewolf() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
