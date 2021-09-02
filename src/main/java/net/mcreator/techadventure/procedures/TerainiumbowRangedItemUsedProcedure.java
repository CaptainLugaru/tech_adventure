package net.mcreator.techadventure.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.techadventure.item.IronarrowItem;
import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

public class TerainiumbowRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure TerainiumbowRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(IronarrowItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 0,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
