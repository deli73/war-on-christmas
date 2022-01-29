package xyz.sunrose.crimmuswar.mixin;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChestBlockEntityRenderer.class)
public class MixinChestRenderer {
    @Shadow private boolean christmas;

    @Inject(method = "<init>(Lnet/minecraft/client/render/block/entity/BlockEntityRendererFactory$Context;)V", at=@At("TAIL"))
    protected void injectConstructor(BlockEntityRendererFactory.Context ctx, CallbackInfo ci) {
        //it NOT crimmus
        this.christmas = false;
    }

}
