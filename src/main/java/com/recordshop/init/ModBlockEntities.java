package com.recordshop.init;

import com.recordshop.RecordShopMod;
import com.recordshop.blockentity.RecordCrateBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, RecordShopMod.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RecordCrateBlockEntity>> RECORD_CRATE_BE =
            BLOCK_ENTITIES.register("record_crate", () ->
                    BlockEntityType.Builder.of(RecordCrateBlockEntity::new,
                            ModBlocks.RECORD_CRATE.get()).build(null));
}
