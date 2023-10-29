package com.Pr1tcha.rotp_ova_addon.util.mod;

import com.Pr1tcha.rotp_ova_addon.init.InitSounds;
import com.github.standobyte.jojo.capability.world.WorldUtilCap;
import com.github.standobyte.jojo.capability.world.WorldUtilCapProvider;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.init.ModStatusEffects;
import com.github.standobyte.jojo.init.power.stand.ModStands;
import com.github.standobyte.jojo.network.PacketManager;
import com.github.standobyte.jojo.network.packets.fromserver.RefreshMovementInTimeStopPacket;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.github.standobyte.jojo.util.mod.JojoModUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.ChunkPos;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.github.standobyte.jojo.util.mod.TimeUtil.isTimeStopped;

public class TimeUtil {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onTSEffectExpired(PotionEvent.PotionExpiryEvent event) {
        LivingEntity entity = event.getEntityLiving();
        ChunkPos chunkPos = new ChunkPos(entity.blockPosition());
        if (event.getPotionEffect().getEffect() == ModStatusEffects.TIME_STOP.get() && isTimeStopped(entity.level, chunkPos)) {
            WorldUtilCap worldCap = entity.level.getCapability(WorldUtilCapProvider.CAPABILITY).resolve().get();
            worldCap.getTimeStopHandler().updateEntityTimeStop(entity, false, false);
            if (!entity.level.isClientSide()) {
                PacketManager.sendToClientsTrackingAndSelf(new RefreshMovementInTimeStopPacket(entity.getId(), chunkPos, false), entity);
                if (worldCap.getTimeStopHandler().getTimeStopTicks(new ChunkPos(entity.blockPosition())) >= 40 &&
                        IStandPower.getStandPowerOptional(entity).map(stand ->
                                stand.hasPower() && stand.getType() == ModStands.THE_WORLD.getStandType()).orElse(false)) {
                    JojoModUtil.sayVoiceLine(entity, InitSounds.DIO_OVA_CANT_MOVE.get());
                };
            }
        }
    }
}
