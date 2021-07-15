package net.mcreator.techadventure.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.techadventure.TechAdventureModElements;
import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

@TechAdventureModElements.ModElement.Tag
public class HopelessOnPotionActiveTickProcedure extends TechAdventureModElements.ModElement {
	public HopelessOnPotionActiveTickProcedure(TechAdventureModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure HopelessOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 1);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 1);
	}
}
