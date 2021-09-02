
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.techadventure.itemgroup.MagictoolsItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class PinkDiamondItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:pink_diamond")
	public static final Item block = null;
	public PinkDiamondItem(TechAdventureModElements instance) {
		super(instance, 106);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MagictoolsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("pink_diamond");
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
	}
}
