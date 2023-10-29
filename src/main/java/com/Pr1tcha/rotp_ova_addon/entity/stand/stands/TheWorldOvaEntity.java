package com.Pr1tcha.rotp_ova_addon.entity.stand.stands;

import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandRelativeOffset;
import net.minecraft.world.World;

public class TheWorldOvaEntity extends StandEntity {

    public TheWorldOvaEntity(StandEntityType<TheWorldOvaEntity> type, World world) {
        super(type, world);
        unsummonOffset = getDefaultOffsetFromUser().copy();
    }

    private StandRelativeOffset offsetDefault = StandRelativeOffset.withYOffset(0, 0.60, -1);
    private StandRelativeOffset offsetDefaultArmsOnly = StandRelativeOffset.withYOffset(0, 0, 0.15);

    public StandRelativeOffset getDefaultOffsetFromUser() {
        return isArmsOnlyMode() ? offsetDefaultArmsOnly : offsetDefault;
    }
}
