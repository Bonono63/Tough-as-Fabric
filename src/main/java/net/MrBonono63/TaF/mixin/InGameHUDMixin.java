package net.MrBonono63.TaF.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.gui.hud.InGameHud.class)
public class InGameHUDMixin extends DrawableHelper {
	private void init(CallbackInfo info) {
		System.out.println("[TaF] - in game HUD mixin");
	}

	private MinecraftClient client;

	private void tempRender() {

	}
	private void thirstRender() {

	}
}
