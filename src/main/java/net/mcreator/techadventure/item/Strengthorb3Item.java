
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.techadventure.procedures.Strengthorb3ItemInInventoryTickProcedure;
import net.mcreator.techadventure.itemgroup.AbilitytabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

import java.util.Map;
import java.util.HashMap;

@TechAdventureModElements.ModElement.Tag
public class Strengthorb3Item extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:strengthorb_3")
	public static final Item block = null;
	public Strengthorb3Item(TechAdventureModElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AbilitytabItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("strengthorb_3");
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
				Strengthorb3ItemInInventoryTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
