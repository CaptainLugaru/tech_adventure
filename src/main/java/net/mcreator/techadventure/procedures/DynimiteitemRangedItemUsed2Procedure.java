package net.mcreator.techadventure.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.techadventure.item.DynimiteitemItem;
import net.mcreator.techadventure.TechAdventureModElements;
import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

@TechAdventureModElements.ModElement.Tag
public class DynimiteitemRangedItemUsed2Procedure extends TechAdventureModElements.ModElement {
	public DynimiteitemRangedItemUsed2Procedure(TechAdventureModElements instance) {
		super(instance, 61);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure DynimiteitemRangedItemUsed2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DynimiteitemItem.block, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(DynimiteitemItem.block, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DynimiteitemItem.block, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.OFF_HAND, true);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(DynimiteitemItem.block, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
