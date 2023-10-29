package com.Pr1tcha.rotp_ova_addon.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import net.minecraft.entity.Entity;

public class TheWorldOvaKick extends StandEntityHeavyAttack {

    public TheWorldOvaKick(Builder builder) {
        super(builder);
    }

    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        StandEntityPunch kick = super.punchEntity(stand, target, dmgSource);
        return kick
                .addKnockback(3.5F)
                .knockbackYRotDeg(0)
                .knockbackXRot(-10)
                .disableBlocking((float) stand.getProximityRatio(target) - 0.25F)
                .sweepingAttack(0.5, 0, 0.5, kick.getDamage() * 0.5F);
    }
}
