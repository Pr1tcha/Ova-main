package com.Pr1tcha.rotp_ova_addon.init;

import com.Pr1tcha.rotp_ova_addon.entity.stand.stands.TheWorldOvaEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<TimeStopperStandStats>, StandEntityType<TheWorldOvaEntity>>
    THE_WORLD_OVA = new EntityStandSupplier<>(InitStands.STAND_THE_WORLD_OVA);
}
