package com.Pr1tcha.rotp_ova_addon.init;

import java.util.function.Supplier;

import com.Pr1tcha.rotp_ova_addon.RotpOvaAddon;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpOvaAddon.MOD_ID);

    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_SUMMON = SOUNDS.register("the_world_ova_summon",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_summon")));

    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_UNSUMMON = SOUNDS.register("the_world_ova_unsummon",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_unsummon")));
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_HEAVY_PUNCH = SOUNDS.register("the_world_ova_heavy_punch",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_heavy_punch")));
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_BARRAGE = SOUNDS.register("the_world_ova_barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_barrage")));
    public static final Supplier<SoundEvent> THE_WORLD_OVA_ULTRA_PUNCH = SOUNDS.register("the_world_ova_ultra_punch",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_ultra_punch")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_STOP = SOUNDS.register("the_world_ova_time_stop",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_time_stop")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_STOP_BLINK = SOUNDS.register("the_world_ova_ts_blink",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_ts_blink")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_BARRAGE_HIT = SOUNDS.register("the_world_ova_barrage_hit",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_barrage_hit")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_RESUME = SOUNDS.register("the_world_ova_time_resume",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_time_resume")));
    public static final RegistryObject<SoundEvent> DIO_OVA_THE_WORLD = SOUNDS.register("dio_ova_the_world",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_the_world")));
    public static final RegistryObject<SoundEvent> DIO_OVA_TIME_STOP = SOUNDS.register("dio_ova_time_stop",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_time_stop")));
    public static final RegistryObject<SoundEvent> DIO_OVA_CANT_MOVE = SOUNDS.register("dio_ova_cant_move",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_cant_move")));
    public static final RegistryObject<SoundEvent> DIO_OVA_TIME_RESUMES = SOUNDS.register("dio_ova_time_resume",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_time_resume")));
    public static final RegistryObject<SoundEvent> DIO_OVA_APPEAR = SOUNDS.register("dio_ova_appear",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_appear")));
    public static final RegistryObject<SoundEvent> DIO_THE_WORLD_OVA = SOUNDS.register("dio_the_world_ova",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_the_world_ova")));
    public static final RegistryObject<SoundEvent> DIO_OVA_DIE = SOUNDS.register("dio_ova_die",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_die")));
    public static final RegistryObject<SoundEvent> DIO_OVA_BARRAGE = SOUNDS.register("dio_ova_barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_barrage")));

    public static final RegistryObject<SoundEvent> DIO_OVA_TIMES_UP = SOUNDS.register("dio_ova_times_up",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "dio_ova_times_up")));


    static final OstSoundList THE_WORLD_OVA_OST = new OstSoundList(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_ost"), SOUNDS);

}
