package net.mcreator.techadventure.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.techadventure.item.DynimiteItem;
import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

public class DynimiteitemRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure DynimiteitemRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DynimiteItem.block)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(DynimiteItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == DynimiteItem.block)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.OFF_HAND, true);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(DynimiteItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
