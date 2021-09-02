
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.techadventure.itemgroup.MagictoolsItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class PinkdiamondhoeItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:pinkdiamondhoe")
	public static final Item block = null;
	public PinkdiamondhoeItem(TechAdventureModElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return -2f;
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
		}, 0, -3f, new Item.Properties().group(MagictoolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("pinkdiamondhoe"));
	}
}
