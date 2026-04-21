package com.recordshop;

import com.recordshop.init.ModBlocks;
import com.recordshop.init.ModBlockEntities;
import com.recordshop.init.ModMenuTypes;
import com.recordshop.client.RecordCrateScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(RecordShopMod.MOD_ID)
public class RecordShopMod {

    public static final String MOD_ID = "recordshop";

    public RecordShopMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);

        modEventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModMenuTypes.RECORD_CRATE_MENU.get(), RecordCrateScreen::new);
        });
    }
}
