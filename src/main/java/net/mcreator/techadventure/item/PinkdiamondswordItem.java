
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techadventure.itemgroup.MagictoolsItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class PinkdiamondswordItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:pinkdiamondsword")
	public static final Item block = null;
	public PinkdiamondswordItem(TechAdventureModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PinkDiamondItem.block));
			}
		}, 3, -3f, new Item.Properties().group(MagictoolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("pinkdiamondsword"));
	}
}
