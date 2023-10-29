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

    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_SUMMON = SOUNDS.register("The_World_Ova_Summon",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Summon")));

    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_UNSUMMON = SOUNDS.register("The_World_Ova_Unsummon",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Unsummon")));
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_HEAVY_PUNCH = SOUNDS.register("The_World_Ova_Heavy_Punch",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Heavy_Punch")));
    
    public static final Supplier<SoundEvent> THE_WORLD_OVA_BARRAGE = SOUNDS.register("The_World_Ova_Barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Barrage")));
    public static final Supplier<SoundEvent> THE_WORLD_OVA_ULTRA_PUNCH = SOUNDS.register("The_World_Ova_Ultra_Punch",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Ultra_Punch")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_STOP = SOUNDS.register("The_World_Ova_Time_Stop",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Time_Stop")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_STOP_BLINK = SOUNDS.register("The_World_Ova_Ts_Blink",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Ts_Blink")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_BARRAGE_HIT = SOUNDS.register("The_World_Ova_Barrage_Hit",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Barrage_Hit")));
    public static final RegistryObject<SoundEvent> THE_WORLD_OVA_TIME_RESUME = SOUNDS.register("The_World_Ova_Time_Resume",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "The_World_Ova_Time_Resume")));
    public static final RegistryObject<SoundEvent> DIO_OVA_THE_WORLD = SOUNDS.register("Dio_Ova_The_World",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_The_World")));
    public static final RegistryObject<SoundEvent> DIO_OVA_TIME_STOP = SOUNDS.register("Dio_Ova_Time_Stop",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Time_Stop")));
    public static final RegistryObject<SoundEvent> DIO_OVA_CANT_MOVE = SOUNDS.register("Dio_Ova_Cant_Move",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Cant_Move")));
    public static final RegistryObject<SoundEvent> DIO_OVA_TIME_RESUMES = SOUNDS.register("Dio_Ova_Time_Resume",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Time_Resume")));
    public static final RegistryObject<SoundEvent> DIO_OVA_APPEAR = SOUNDS.register("Dio_Ova_Appear",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Appear")));
    public static final RegistryObject<SoundEvent> DIO_THE_WORLD_OVA = SOUNDS.register("Dio_The_World_Ova",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_The_World_Ova")));
    public static final RegistryObject<SoundEvent> DIO_OVA_DIE = SOUNDS.register("Dio_Ova_Die",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Die")));
    public static final RegistryObject<SoundEvent> DIO_OVA_BARRAGE = SOUNDS.register("Dio_Ova_Barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Barrage")));

    public static final RegistryObject<SoundEvent> DIO_OVA_TIMES_UP = SOUNDS.register("Dio_Ova_Times_Up",
            () -> new SoundEvent(new ResourceLocation(RotpOvaAddon.MOD_ID, "Dio_Ova_Times_Up")));


    static final OstSoundList THE_WORLD_OVA_OST = new OstSoundList(new ResourceLocation(RotpOvaAddon.MOD_ID, "the_world_ova_ost"), SOUNDS);

}
