package net.mcreator.techadventure.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.techadventure.item.TerainiumThrowingKnifeitemItem;
import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

public class TerainiumThrowingKnifeitemBulletHitsLivingEntityProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency x for procedure TerainiumThrowingKnifeitemBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency y for procedure TerainiumThrowingKnifeitemBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency z for procedure TerainiumThrowingKnifeitemBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency world for procedure TerainiumThrowingKnifeitemBulletHitsLivingEntity!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(TerainiumThrowingKnifeitemItem.block));
			entityToSpawn.setPickupDelay((int) 10);
			entityToSpawn.setNoDespawn();
			world.addEntity(entityToSpawn);
		}
	}
}
