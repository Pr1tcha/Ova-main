package com.Pr1tcha.rotp_ova_addon.init;

import com.Pr1tcha.rotp_ova_addon.RotpOvaAddon;
import com.Pr1tcha.rotp_ova_addon.action.stand.TheWorldOvaKick;
import com.Pr1tcha.rotp_ova_addon.action.stand.TheWorldOvaSmash;
import com.Pr1tcha.rotp_ova_addon.action.stand.TheWorldOvaUltraPunch;
import com.Pr1tcha.rotp_ova_addon.entity.stand.stands.TheWorldOvaEntity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.*;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.github.standobyte.jojo.action.stand.TheWorldTimeStop;
import com.github.standobyte.jojo.action.stand.TimeResume;
import com.github.standobyte.jojo.action.stand.TimeStop;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import static com.Pr1tcha.rotp_ova_addon.init.InitSounds.DIO_THE_WORLD_OVA;
import static com.github.standobyte.jojo.init.power.ModCommonRegisters.ACTIONS;


public class InitStands {

        public static final ITextComponent PART_3_NAME = new TranslationTextComponent("jojo.story_part.3").withStyle(TextFormatting.GRAY);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpOvaAddon.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpOvaAddon.MOD_ID);
    
 // ======================================== The World (Ova) ========================================
    
    public static final RegistryObject<StandEntityAction> THE_WORLD_OVA_PUNCH = ACTIONS.register("the_world_ova_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.THE_WORLD_OVA_PUNCH_LIGHT)));

    
    public static final RegistryObject<StandEntityAction> THE_WORLD_OVA_BARRAGE = ACTIONS.register("the_world_ova_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .standSound(InitSounds.THE_WORLD_OVA_BARRAGE)
                    .barrageHitSound(InitSounds.THE_WORLD_OVA_BARRAGE_HIT)));

    public static final RegistryObject<StandEntityAction> THE_WORLD_OVA_KICK_BARRAGE = ACTIONS.register("the_world_ova_kick_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.THE_WORLD_OVA_BARRAGE)));


    
    public static final RegistryObject<StandEntityHeavyAttack> THE_WORLD_OVA_SMASH = ACTIONS.register("the_world_ova_smash",
            () -> new TheWorldOvaSmash(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.THE_WORLD_OVA_HEAVY_PUNCH)
                    .standOffsetFromUser(0, 0.5, -0.5)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityHeavyAttack> THE_WORLD_OVA_HEAVY_PUNCH = ACTIONS.register("the_world_ova_heavy_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.THE_WORLD_OVA_HEAVY_PUNCH)
                    .standSound(InitSounds.DIO_OVA_DIE)
                    .partsRequired(StandPart.ARMS)
                    .standPose(StandPose.HEAVY_ATTACK)
                    .setFinisherVariation(THE_WORLD_OVA_SMASH)
                    .shiftVariationOf(THE_WORLD_OVA_PUNCH).shiftVariationOf(THE_WORLD_OVA_BARRAGE)));
    public static final RegistryObject<StandEntityHeavyAttack> THE_WORLD_OVA_ULTRA_PUNCH = ACTIONS.register("the_world_ova_ultra_punch",
            () -> new TheWorldOvaUltraPunch(new StandEntityHeavyAttack.Builder().holdToFire(30, false).staminaCost(350)
                    .resolveLevelToUnlock(3)
                    .standOffsetFromUser(-0.15, 0.75, 0)
                    .cooldown(1200)
                    .standPose(TheWorldOvaUltraPunch.ULTRA_PUNCH)
                    .standSound(StandEntityAction.Phase.WINDUP, InitSounds.THE_WORLD_OVA_ULTRA_PUNCH)

                    .partsRequired(StandPart.ARMS)));



    
    public static final RegistryObject<StandEntityAction> THE_WORLD_OVA_BLOCK = ACTIONS.register("the_world_ova_block",
            () -> new StandEntityBlock());

public static final RegistryObject<TimeStop> THE_WORLD_OVA_TIME_STOP = ACTIONS.register("the_world_ova_time_stop",
            () -> new TheWorldTimeStop(new TimeStop.Builder().holdToFire(30, false).staminaCost(250).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .resolveLevelToUnlock(2).isTrained()
                    .ignoresPerformerStun()
                    .shout(InitSounds.DIO_OVA_THE_WORLD)
                    .partsRequired(StandPart.MAIN_BODY)
                    .voiceLineWithStandSummoned(InitSounds.DIO_OVA_TIME_STOP).timeStopSound(InitSounds.THE_WORLD_OVA_TIME_STOP)
                    .addTimeResumeVoiceLine(InitSounds.DIO_OVA_TIME_RESUMES, true).addTimeResumeVoiceLine(InitSounds.DIO_OVA_TIMES_UP, false)
                    .timeResumeSound(InitSounds.THE_WORLD_OVA_TIME_RESUME)));
    public static final RegistryObject<TimeResume> THE_WORLD_OVA_TIME_RESUME = ACTIONS.register("the_world_ova_time_resume",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(THE_WORLD_OVA_TIME_STOP)));
    public static final RegistryObject<TimeStopInstant> THE_WORLD_OVA_TIME_STOP_BLINK = ACTIONS.register("the_world_ova_ts_blink",
            () -> new TheWorldTimeStopInstant(new StandAction.Builder()
                    .resolveLevelToUnlock(2).isTrained()
                    .ignoresPerformerStun()
                    .partsRequired(StandPart.MAIN_BODY),
                    THE_WORLD_OVA_TIME_STOP, InitSounds.THE_WORLD_OVA_TIME_STOP_BLINK));





    public static final EntityStandRegistryObject<EntityStandType<TimeStopperStandStats>, StandEntityType<TheWorldOvaEntity>> STAND_THE_WORLD_OVA =
            new EntityStandRegistryObject<>("the_world_ova",
                    STANDS, 
                    () -> new EntityStandType<TimeStopperStandStats>(
                            0x4d574b, ModStandsInit.PART_3_NAME,

                            new StandAction[] {
                                    THE_WORLD_OVA_PUNCH.get(),
                                    THE_WORLD_OVA_BARRAGE.get(),
                                    THE_WORLD_OVA_ULTRA_PUNCH.get()},
                            new StandAction[] {
                                    THE_WORLD_OVA_BLOCK.get(),
                                    THE_WORLD_OVA_TIME_STOP.get()},

                            TimeStopperStandStats.class, new TimeStopperStandStats.Builder()
                            .tier(6)
                            .power(17.0)
                            .speed(16.0)
                            .range(1.5, 2.0)
                            .durability(16.5)
                            .precision(15.5)
                            .build("The World (Ova)"),

                            new StandType.StandTypeOptionals()
                            .addOst(InitSounds.THE_WORLD_OVA_OST)),

                    InitEntities.ENTITIES, 
                    () -> new StandEntityType<TheWorldOvaEntity>(TheWorldOvaEntity::new, 0.85F, 2.35F)
                    .summonSound(InitSounds.THE_WORLD_OVA_SUMMON)
                    .unsummonSound(InitSounds.THE_WORLD_OVA_UNSUMMON))
            .withDefaultStandAttributes();
}
