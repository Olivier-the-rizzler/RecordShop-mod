package com.recordshop.init;

import com.recordshop.RecordShopMod;
import com.recordshop.menu.RecordCrateMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, RecordShopMod.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<RecordCrateMenu>> RECORD_CRATE_MENU =
            MENUS.register("record_crate", () ->
                    IMenuTypeExtension.create(RecordCrateMenu::new));
}
