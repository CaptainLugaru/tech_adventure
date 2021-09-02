package net.mcreator.techadventure.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.mcreator.techadventure.TechAdventureMod;

import java.util.Map;

public class StaffofpowerBulletHitsBlock1Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency x for procedure StaffofpowerBulletHitsBlock1!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency y for procedure StaffofpowerBulletHitsBlock1!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency z for procedure StaffofpowerBulletHitsBlock1!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TechAdventureMod.LOGGER.warn("Failed to load dependency world for procedure StaffofpowerBulletHitsBlock1!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
		}
	}
}
