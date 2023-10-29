package com.Pr1tcha.rotp_ova_addon.client;

import com.Pr1tcha.rotp_ova_addon.RotpOvaAddon;
import com.Pr1tcha.rotp_ova_addon.client.render.entity.renderer.stand.TheWorldOvaRenderer;
import com.Pr1tcha.rotp_ova_addon.init.AddonStands;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RotpOvaAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(AddonStands.THE_WORLD_OVA.getEntityType(), TheWorldOvaRenderer::new);
    }
}
