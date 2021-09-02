
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.techadventure.procedures.AlienMushroomfoodFoodEatenProcedure;
import net.mcreator.techadventure.itemgroup.AbilitytabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

import java.util.Map;
import java.util.HashMap;

@TechAdventureModElements.ModElement.Tag
public class AlienMushroomfoodItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:alien_mushroomfood")
	public static final Item block = null;
	public AlienMushroomfoodItem(TechAdventureModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AbilitytabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(6).saturation(0.6f).setAlwaysEdible().build()));
			setRegistryName("alien_mushroomfood");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				AlienMushroomfoodFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
