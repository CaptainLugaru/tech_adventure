
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techadventure.itemgroup.MagictoolsItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class PinkdiamondshovelItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:pinkdiamondshovel")
	public static final Item block = null;
	public PinkdiamondshovelItem(TechAdventureModElements instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PinkDiamondItem.block));
			}
		}, 1, -2f, new Item.Properties().group(MagictoolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("pinkdiamondshovel"));
	}
}
