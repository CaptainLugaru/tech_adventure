
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.techadventure.procedures.StrengthorbItemInInventoryTickProcedure;
import net.mcreator.techadventure.itemgroup.AbilitytabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

import java.util.Map;
import java.util.HashMap;

@TechAdventureModElements.ModElement.Tag
public class StrengthorbItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:strengthorb")
	public static final Item block = null;
	public StrengthorbItem(TechAdventureModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AbilitytabItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.UNCOMMON));
			setRegistryName("strengthorb");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				StrengthorbItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}