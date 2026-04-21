package com.recordshop;

import com.recordshop.init.ModBlocks;
import com.recordshop.init.ModBlockEntities;
import com.recordshop.init.ModMenuTypes;
import com.recordshop.client.RecordCrateScreen;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@Mod(RecordShopMod.MOD_ID)
public class RecordShopMod {

    public static final String MOD_ID = "recordshop";

    public RecordShopMod(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModMenuTypes.MENUS.register(modEventBus);

        modEventBus.addListener(this::registerScreens);
    }

    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.RECORD_CRATE_MENU.get(), RecordCrateScreen::new);
    }
}
