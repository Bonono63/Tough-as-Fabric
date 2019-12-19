package net.MrBonono63.TaF;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TaF implements ModInitializer {

	public static final Item FILTERED_WATER_BOTTLE = new Item(new Item.Settings().maxCount(1));

	public static final ItemGroup ITEM_GENERAL = FabricItemGroupBuilder.create( new Identifier("taf", "general"))
			.icon(() -> new ItemStack(FILTERED_WATER_BOTTLE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FILTERED_WATER_BOTTLE));
			})
			.build();

	@Override
	public void onInitialize() {
		//registered items
		Registry.register(Registry.ITEM, new Identifier("taf", "filtered_water_bottle"), FILTERED_WATER_BOTTLE);

		//terminal messages
		System.out.println("[TaF] - Main Class Loaded");
	}
}
