package com.Pr1tcha.rotp_ova_addon.client.render.entity.renderer.stand;

import com.Pr1tcha.rotp_ova_addon.RotpOvaAddon;
import com.Pr1tcha.rotp_ova_addon.entity.stand.stands.TheWorldOvaEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.Pr1tcha.rotp_ova_addon.client.render.entity.model.stand.TheWorldOvaModel;


import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class TheWorldOvaRenderer extends StandEntityRenderer<TheWorldOvaEntity,TheWorldOvaModel> {
    
    public TheWorldOvaRenderer(EntityRendererManager renderManager) {
        super(renderManager, new TheWorldOvaModel(), new ResourceLocation(RotpOvaAddon.MOD_ID, "textures/entity/stand/the_world_ova.png"), 0);
    }
}
